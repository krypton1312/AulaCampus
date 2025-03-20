package forms;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import objects.Account;

public class AdminForm extends JFrame{
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
    private String[] optionsComboBox;
    
    public AdminForm(Account selectedAccount){
        this.selectedAccount = selectedAccount;
        this.setTitle("Admin");
        this.setResizable(false);
        getDataByPermissions();
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setPreferredSize(new Dimension(700,500));
        this.add(panel);
        
        header = new String[]{"Type", "UserName"};
        data = new Object[0][2];
        
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
        panel.add(promoteB);
        
        
        selectTable = new JComboBox<>(optionsComboBox);
        
        this.pack();
        this.setLocationRelativeTo(null);
    }
    private void getDataByPermissions(){
        if(selectedAccount.isSuperAdmin()){
            promoteButtonText = "Promote";
            optionsComboBox = new String[]{"Promote asks", "Users", "Admins"};
        }else if(selectedAccount.isAdmin()){
            promoteButtonText = "Ask to promote";
            optionsComboBox = new String[]{"Users", "Admins"};
        }
    }
}
