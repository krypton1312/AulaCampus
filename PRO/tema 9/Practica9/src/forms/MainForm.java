package forms;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import objects.*;

public class MainForm extends JFrame implements ActionListener, MouseListener {
    private JPanel panel;
    private JTable table;
    private DefaultTableModel model;
    private JScrollPane scroll;
    private String[] header;
    private Object[][] data;
    private JButton addB;
    private JButton delB;
    private JComboBox<String> selectTableCB;
    private JButton closeB;
    private ObjectContainer gearDataBase;
    private ObjectContainer weaponDataBase;
    private ObjectContainer grenadeDataBase;
    private InputForm inputForm;
    private Account selectedAccount;
    private JButton adminFormB;
    
    
    public MainForm(ObjectContainer gearDataBase, ObjectContainer weaponDataBase, ObjectContainer grenadeDataBase, Account selectedAccount){
        this.gearDataBase = gearDataBase;
        this.weaponDataBase = weaponDataBase;
        this.grenadeDataBase = grenadeDataBase;
        this.selectedAccount = selectedAccount;
        this.inputForm = new InputForm(gearDataBase, weaponDataBase, grenadeDataBase);
        this.setTitle("CS2 Equipment List");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(1250, 500));
        this.add(panel);

        header = new String[]{"Name", "Type", "Price", "Damage", "Armor penetration", "Fire rate", "Magazine size", "Effect", "Armor value", "Has helmet", "Defuse time"};
        data = new Object[0][7];

        model = new DefaultTableModel(data, header);
        showWeapons(weaponDataBase);
        table = new JTable(model) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table.addMouseListener(this);
        table.setBackground(Color.WHITE);
        table.setGridColor(Color.BLACK);
        scroll = new JScrollPane(table);
        scroll.setBounds(10, 10, 1000, 480);
        scroll.getViewport().setBackground(Color.WHITE);
        panel.add(scroll);
        if(selectedAccount.isAdmin()|| selectedAccount.isSuperAdmin()){
            addB = new JButton("Add");
            addB.addActionListener(this);
            addB.setBounds(1020, 60, 220, 40);
            addB.setBackground(Color.WHITE);
            addB.setFocusable(false);
            panel.add(addB);

            delB = new JButton("Delete");
            delB.addActionListener(this);
            delB.setBounds(1020, 110, 220, 40);
            delB.setBackground(Color.WHITE);
            delB.setFocusable(false);
            panel.add(delB);
        }
        String[] options = {"All", "Weapons", "Grenades", "Gear"};
        selectTableCB = new JComboBox<>(options);
        selectTableCB.setBounds(1020, 10, 220, 40);
        selectTableCB.setSelectedIndex(1);
        selectTableCB.setBackground(Color.WHITE);
        selectTableCB.setFocusable(false);
        selectTableCB.addActionListener(this);
        // Center text
        selectTableCB.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                label.setHorizontalAlignment(SwingConstants.CENTER);
                return label;
            }
        });
        panel.add(selectTableCB);
        
        if(selectedAccount.isAdmin()){
            adminFormB = new JButton("AdminPanel");
            adminFormB.addActionListener(this);
            adminFormB.setBounds(1020, 400, 220, 40);
            adminFormB.setBackground(Color.WHITE);
            adminFormB.setFocusable(false);
            panel.add(adminFormB);
        }
        closeB = new JButton("Close");
        closeB.addActionListener(this);
        closeB.setBounds(1020, 450, 220, 40);
        closeB.setBackground(Color.WHITE);
        closeB.setFocusable(false);
        panel.add(closeB);
        
        inputForm.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.out.println("InputForm was closed!");
                showUpdateTable();
            }
        });
        
        this.setVisible(true);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == selectTableCB){
            showUpdateTable();
        }
        if(e.getSource() == delB){
            delSelectedItem(table.getSelectedRow());
        }
        if(e.getSource() == addB){
            inputForm.setVisible(true);
        }
        if(e.getSource() == closeB){
            gearDataBase.close();
            weaponDataBase.close();
            grenadeDataBase.close();
            System.exit(0);
        }
        if(e.getSource() == adminFormB){
            AdminForm adminForm = new AdminForm(selectedAccount);
            adminForm.setVisible(true);
        }
    }
    
    private void showWeapons(ObjectContainer weaponDataBase) {
        ObjectSet weaponR = weaponDataBase.queryByExample(new Weapon(null, null, 0, 0, 0, 0, 0));
        while (weaponR.hasNext()) {
            Weapon weapon = (Weapon) weaponR.next();
            Object[] dataW = {
                weapon.getName(), weapon.getType(), weapon.getPrice(),
                weapon.getDamage(), weapon.getArmourPenetration(), weapon.getFireRate(),
                weapon.getMagazineSize(), "-", "-", "-", "-"
            };
            model.addRow(dataW);
        }
    }
    
    private void showGrenades(ObjectContainer grenadeDataBase){
        ObjectSet grenadeDataBaseR = grenadeDataBase.queryByExample(new Grenade(null, null, 0, null));
        while(grenadeDataBaseR.hasNext()){
            Grenade grenade = (Grenade) grenadeDataBaseR.next();
            Object[] dataG = {
                grenade.getName(), grenade.getType(), grenade.getPrice(), 
                "-", "-", "-", "-", grenade.getEffect(), "-", "-", "-", "-"};
            model.addRow(dataG);
        }
    }
    
    private void showGear(ObjectContainer gearDataBase){
        ObjectSet gearsResult = gearDataBase.queryByExample(new Gear(null, null, 0, 0, null, 0));
        while(gearsResult.hasNext()){
            Gear gear = (Gear) gearsResult.next();
            Object[] dataGear = {gear.getName(), gear.getType(), gear.getPrice(), "-", "-", "-", "-", "-", gear.getArmourValue(), gear.isHasHelmet(), gear.getDefuseTime()};
            model.addRow(dataGear);
        }
    }
    private void delSelectedItem(int item) {
        if (item < 0) {
            JOptionPane.showMessageDialog(this, "Please select an item to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        ObjectSet itemToDelete = getItemToDelete(item);
        ObjectContainer tableDB = getNameOfDataBase(item);


        if (itemToDelete == null) {
            JOptionPane.showMessageDialog(this, "Could not determine the table for deletion.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        tableDB.delete(itemToDelete.next());

        model.removeRow(item);
    }
    private void showUpdateTable() {
        model.setRowCount(0);
        switch (selectTableCB.getSelectedIndex()) {
            case 0:
                showWeapons(weaponDataBase);
                showGrenades(grenadeDataBase);
                showGear(gearDataBase);
                break;
            case 1:
                showWeapons(weaponDataBase);
                break;
            case 2:
                showGrenades(grenadeDataBase);
                break;
            case 3:
                showGear(gearDataBase);
                break;
        }
    }
    
    private ObjectContainer getNameOfDataBase(int item){
        if (model.getValueAt(item, 3).equals("-") && model.getValueAt(item, 9).equals("-")) {
            return grenadeDataBase;
        } else if (model.getValueAt(item, 7).equals("-") && model.getValueAt(item, 9).equals("-")) {
            return weaponDataBase;
        } else if (model.getValueAt(item, 3).equals("-") && model.getValueAt(item, 7).equals("-")) {
            return gearDataBase;
        }
        return null;
    }
    
    private ObjectSet getItemToDelete(int item){
        if (model.getValueAt(item, 3).equals("-") && model.getValueAt(item, 9).equals("-")) {
            return grenadeDataBase.queryByExample(new Grenade((String)model.getValueAt(item, 0), null, 0, null));
        } else if (model.getValueAt(item, 7).equals("-") && model.getValueAt(item, 9).equals("-")) {
            return weaponDataBase.queryByExample(new Weapon((String)model.getValueAt(item, 0), null, 0, 0, 0, 0, 0));
        } else if (model.getValueAt(item, 3).equals("-") && model.getValueAt(item, 7).equals("-")) {
            return gearDataBase.queryByExample(new Gear((String)model.getValueAt(item, 0), null, 0, 0, null, 0));
        }
        return null;
    }
    private void updateObjectField(Object obj, int column, String newValue) {
        if (obj instanceof Weapon) {
            Weapon weapon = (Weapon) obj;
            switch (column) {
                case 0:
                    weapon.setName(newValue);
                    return;
                case 1:
                    weapon.setType(newValue);
                    return;
                case 2:
                    weapon.setPrice(Double.parseDouble(newValue));
                    return;
                case 3:
                    weapon.setDamage(Integer.parseInt(newValue));
                    return;
                case 4:
                    weapon.setArmourPenetration(Double.parseDouble(newValue));
                    return;
                case 5:
                    weapon.setFireRate(Integer.parseInt(newValue));
                    return;
                case 6:
                    weapon.setMagazineSize(Integer.parseInt(newValue));
            }
        } else if (obj instanceof Grenade) {
            Grenade grenade = (Grenade) obj;
            switch (column) {
                case 0:
                    grenade.setName(newValue);
                    return;
                case 1:
                    grenade.setType(newValue);
                    return;
                case 2:
                    grenade.setPrice(Double.parseDouble(newValue));
                    return;
                case 7:
                    grenade.setEffect(newValue);
            }
        } else if (obj instanceof Gear) {
            Gear gear = (Gear) obj;
            switch (column) {
                case 0:
                    gear.setName(newValue);
                    return;
                case 1:
                    gear.setType(newValue);
                    return;
                case 2:
                    gear.setPrice(Double.parseDouble(newValue));
                    return;
                case 8:
                    gear.setArmourValue(Integer.parseInt(newValue));
                    return;
                case 9:
                    gear.setHasHelmet(Boolean.parseBoolean(newValue));
                    return;
                case 10:
                    gear.setDefuseTime(Integer.parseInt(newValue));
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if (me.getClickCount() == 3) {
            if (this.selectedAccount.isAdmin()) {
                int row = table.rowAtPoint(me.getPoint());
                int col = table.columnAtPoint(me.getPoint());

                Object oldValue = model.getValueAt(row, col);
                String input = JOptionPane.showInputDialog(null, "Enter a new value:", oldValue);

                if (input != null) {
                    ObjectContainer dataBase = getNameOfDataBase(row);
                    if (dataBase == null) {
                        JOptionPane.showMessageDialog(null, "Database not found for this row.");
                        return;
                    }
                    ObjectSet<?> result = getItemToDelete(row);

                    if (result.hasNext()) {
                        Object obj = result.next();
                        updateObjectField(obj, col, input);
                        dataBase.store(obj);
                        dataBase.commit();
                    }
                    showUpdateTable();
                }
            }else{
                JOptionPane.showMessageDialog(null, "You dont have permission to modificate.");
            }
        }
        if(me.getClickCount() == 2){
            
        }
    }

    @Override
    public void mousePressed(MouseEvent me){}

    @Override
    public void mouseReleased(MouseEvent me){}

    @Override
    public void mouseEntered(MouseEvent me){}

    @Override
    public void mouseExited(MouseEvent me){}
}
