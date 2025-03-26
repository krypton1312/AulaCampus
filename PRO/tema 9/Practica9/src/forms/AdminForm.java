package forms;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Predicate;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import objects.Account;

public class AdminForm extends JFrame implements ActionListener {

    private JPanel panel;
    private DefaultTableModel model;
    private String[] header;
    private Object[][] data;
    private JTable table;
    private JScrollPane scroll;
    private JComboBox<String> selectTable;
    private JButton promoteB;
    private JButton demoteB;
    private JButton deleteB;
    private String promoteButtonText;
    private Account selectedAccount;
    private ObjectContainer users;

    public AdminForm(Account selectedAccount, ObjectContainer users) {
        this.selectedAccount = selectedAccount;
        this.users = users;
        this.setTitle("Admin");
        this.setResizable(false);
        getDataByPermissions();

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setPreferredSize(new Dimension(640, 420));
        this.add(panel);

        model = new DefaultTableModel(data, header);

        table = new JTable(model) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table.setBackground(Color.WHITE);
        table.setGridColor(Color.BLACK);
        scroll = new JScrollPane(table);
        scroll.setBounds(10, 10, 400, 400);
        scroll.getViewport().setBackground(Color.WHITE);
        showUsers();
        panel.add(scroll);

        promoteB = new JButton(promoteButtonText);
        promoteB.setBounds(420, 10, 200, 40);
        promoteB.setBackground(Color.WHITE);
        promoteB.setFocusable(false);
        panel.add(promoteB);
        promoteB.addActionListener(this);
        
        demoteB = new JButton("Demote");
        demoteB.setBounds(420, 110, 200, 40);
        demoteB.setBackground(Color.WHITE);
        demoteB.setFocusable(false);
        demoteB.setEnabled(false);
        demoteB.setVisible(false);
        panel.add(demoteB);
        demoteB.addActionListener(this);

        deleteB = new JButton("Delete");
        deleteB.setBounds(420, 160, 200, 40);
        deleteB.setBackground(Color.WHITE);
        deleteB.setVisible(false);
        deleteB.setFocusable(false);
        panel.add(deleteB);
        deleteB.addActionListener(this);
        
        if (selectedAccount.isSuperAdmin()) {
            demoteB.setVisible(true);
            deleteB.setVisible(true);
        }

        String[] optionsComboBox = new String[]{"Users", "Admins"};
        selectTable = new JComboBox<>(optionsComboBox);
        selectTable.setBounds(420, 60, 200, 40);
        selectTable.setSelectedIndex(0);
        selectTable.setBackground(Color.WHITE);
        selectTable.setFocusable(false);
        panel.add(selectTable);
        selectTable.addActionListener(this);
        selectTable.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                label.setHorizontalAlignment(SwingConstants.CENTER);
                return label;
            }
        });

        this.pack();
        this.setLocationRelativeTo(null);
    }

    private void getDataByPermissions() {
        if (selectedAccount.isSuperAdmin()) {
            promoteButtonText = "Promote";
            data = new Object[0][3];
            header = new String[]{"Type", "UserName", "Requested to promote"};

        } else if (selectedAccount.isAdmin()) {
            promoteButtonText = "Ask to promote";
            data = new Object[0][2];
            header = new String[]{"Type", "UserName"};
        }
    }

    private void showUsers() {
        ObjectSet result = users.queryByExample(new Account(null, null, false, false, null));
        while (result.hasNext()) {
            String[] dataUser = null;
            Account user = (Account) result.next();
            String promotionStatus = user.isIsPromotionRequest() ? "Pending" : "None";
            dataUser = new String[]{"User", user.getLogin(), promotionStatus};
            model.addRow(dataUser);
        }
    }

    private void showAdmins() {
        ObjectSet<Account> result = users.query(new Predicate<Account>() {
            @Override
            public boolean match(Account acc) {
                return Boolean.TRUE.equals(acc.isAdmin()) && Boolean.FALSE.equals(acc.isSuperAdmin());
            }
        });
        if (result.isEmpty()) {
            System.out.println("No admin accounts found.");
            return;
        }
        while (result.hasNext()) {
            Account user = (Account) result.next();
            String[] dataUser = {"Admin", user.getLogin(), "null"};
            model.addRow(dataUser);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == selectTable) {
            updateTable();
            if (selectTable.getSelectedIndex() == 0) {
                demoteB.setEnabled(false);
            } else {
                demoteB.setEnabled(true);
            }
        }
        if (e.getSource() == promoteB) {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                String login = (String) model.getValueAt(selectedRow, 1);
                if (selectedAccount.isSuperAdmin()) {
                    promoteDirectly(login);
                } else if (selectedAccount.isAdmin()) {
                    askToPromote(login);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select a user.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource() == demoteB) {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                String login = (String) model.getValueAt(selectedRow, 1);
                demote(login);
            } else {
                JOptionPane.showMessageDialog(this, "Please select a user.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource() == deleteB) {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                String login = (String) model.getValueAt(selectedRow, 1);
                delete(login);
            } else {
                JOptionPane.showMessageDialog(this, "Please select a user.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void updateTable() {
        model.setRowCount(0);
        switch (selectTable.getSelectedIndex()) {
            case 0:
                showUsers();
                break;
            case 1:
                showAdmins();
                break;
        }
    }

    public void promoteDirectly(String login) {
        ObjectSet result = users.queryByExample(new Account(login, null, null, null, null));
        while (result.hasNext()) {
            Account user = (Account) result.next();
            user.setAdmin(true);
            users.store(user);
            users.commit();
            updateTable();
        }
    }

    public void askToPromote(String login) {
        ObjectSet result = users.queryByExample(new Account(login, null, null, null, null));
        while (result.hasNext()) {
            Account user = (Account) result.next();
            if (user.isIsPromotionRequest()) {
                JOptionPane.showMessageDialog(this, "User is alredy requested to promote.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                user.setIsPromotionRequest(true);
                users.store(user);
                users.commit();
                updateTable();
            }
        }
    }

    public void demote(String login) {
        ObjectSet result = users.queryByExample(new Account(login, null, null, null, null));
        while (result.hasNext()) {
            Account user = (Account) result.next();
            user.setAdmin(false);
            user.setIsPromotionRequest(false);
            users.store(user);
            users.commit();
            updateTable();
        }
    }

    public void delete(String login) {
        ObjectSet result = users.queryByExample(new Account(login, null, null, null, null));
        while (result.hasNext()) {
            Account user = (Account) result.next();
            users.delete(user);
            users.commit();
            updateTable();
        }
    }
}
