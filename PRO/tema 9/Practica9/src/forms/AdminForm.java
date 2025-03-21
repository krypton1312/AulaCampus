package forms;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Predicate;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import objects.Account;

public class AdminForm extends JFrame implements ActionListener{
    private JPanel panel;
    private DefaultTableModel model;
    private String[] header;
    private Object[][] data;
    private JTable table;
    private JScrollPane scroll;
    private JComboBox<String> selectTable;
    private JButton promoteB;
    private String promoteButtonText;
    private Account selectedAccount;
    private ObjectContainer users;
    
    public AdminForm(Account selectedAccount){
        this.selectedAccount = selectedAccount;
        this.users = Db4oEmbedded.openFile("users.db4o");;
        this.setTitle("Admin");
        this.setResizable(false);
        getDataByPermissions();
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setPreferredSize(new Dimension(700,500));
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
        panel.add(scroll);
        
        promoteB = new JButton(promoteButtonText);
        promoteB.setBounds(420, 10, 200, 40);
        promoteB.setBackground(Color.WHITE);
        promoteB.setFocusable(false);
        panel.add(promoteB);
        promoteB.addActionListener(this);
        
        String[] optionsComboBox = new String[]{"Users", "Admins"};
        selectTable = new JComboBox<>(optionsComboBox);
        selectTable.setBounds(420, 60, 200, 40);
        selectTable.setSelectedIndex(1);
        selectTable.setBackground(Color.WHITE);
        selectTable.setFocusable(false);
        panel.add(selectTable);
        selectTable.addActionListener(this);
        
        
        this.pack();
        this.setLocationRelativeTo(null);
    }
    private void getDataByPermissions(){
        if(selectedAccount.isSuperAdmin()){
            promoteButtonText = "Promote";
            data = new Object[0][3];
            header = new String[]{"Type", "UserName", "Requested to promote"};
            
        }else if(selectedAccount.isAdmin()){
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
            if (selectedAccount.isSuperAdmin()) {
                String promotionStatus = user.isIsPromotionRequest() ? "Pending" : "None";
                dataUser = new String[]{"User", user.getLogin(), promotionStatus};
            } else if (selectedAccount.isAdmin()) {
                dataUser = new String[]{"User", user.getLogin()};
            }
            model.addRow(dataUser);
        }
    }
    
    private void showAdmins() {
        ObjectSet<Account> result = users.query(new Predicate<Account>() {
            @Override
            public boolean match(Account acc) {
                return Boolean.TRUE.equals(acc.isAdmin());
            }
        });
        if (result.isEmpty()) {
            System.out.println("No admin accounts found.");
            return;
        }
        while (result.hasNext()) {
            Account user = (Account) result.next();
            System.out.println(user);
            String[] dataUser = {"Admin", user.getLogin(), "null"};
            model.addRow(dataUser);
        }

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == selectTable) {
            
            switch (selectTable.getSelectedIndex()) {
                case 0:
                    showUsers();
                    break;
                case 1:
                    showAdmins();
                    break;
            }
        }
        if(e.getSource() == promoteB){
            ObjectSet result = users.queryByExample(new Account(null, null, null, null, null));
            while (result.hasNext()) {
                Account user = (Account) result.next();
                System.out.println(user);
            }
        }
    }
}

