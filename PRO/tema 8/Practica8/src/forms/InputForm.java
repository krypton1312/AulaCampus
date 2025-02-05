package forms;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;
// "Name", "Type", "Price", "Damage", "Armor penetration", "Fire rate", "Magazine size", "Effect", "Armor value", "Has helmet", "Defuse time"
public class InputForm extends JFrame implements ActionListener{
    protected static String[] datos;
    JPanel panel;
    JLabel nameT;
    JLabel typeT;
    JLabel priceT;
    JLabel damageT;
    JLabel armorPenT;
    JLabel fireT;
    JLabel magazineT;
    JLabel effectT;
    JLabel armorValueT;
    JLabel helmet;
    JLabel defuseT;
    JLabel categoryT;
    JTextField nameTF;
    JTextField typeTF;
    JTextField priceTF;
    JTextField damageTF;
    JTextField armorPenTF;
    JTextField fireTF;
    JTextField magazineTF;
    JTextField effectTF;
    JTextField armorValueTF;
    JTextField helmetTF;
    JTextField defuseTF;
    JComboBox categoryCB;
    JButton inputB;

    
    public InputForm(){
        this.setTitle("Input new item");
        this.setResizable(false);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(620,350));
        this.add(panel);
        
        int labelX1 = 30, fieldX1 = 160, labelX2 = 340, fieldX2 = 470;
        int y = 30, width = 120, height = 25, gap = 40;

        categoryT = new JLabel("Category:");
        categoryT.setBounds(labelX1, y, width, height);
        categoryT.setOpaque(true);
        categoryT.setBackground(Color.WHITE);
        panel.add(categoryT);

        categoryCB = new JComboBox<>(new String[]{"Weapons", "Grenades", "Gear"});
        categoryCB.setBounds(fieldX1, y, width, height);
        categoryCB.setBackground(Color.WHITE);
        categoryCB.setFocusable(false);
        panel.add(categoryCB);

        nameT = new JLabel("Name:");
        nameT.setBounds(labelX2, y, width, height);
        nameT.setOpaque(true);
        nameT.setBackground(Color.WHITE);
        panel.add(nameT);

        nameTF = new JTextField();
        nameTF.setBounds(fieldX2, y, width, height);
        nameTF.setBackground(Color.WHITE);
        panel.add(nameTF);

        y += gap;

        typeT = new JLabel("Type:");
        typeT.setBounds(labelX1, y, width, height);
        typeT.setOpaque(true);
        typeT.setBackground(Color.WHITE);
        panel.add(typeT);

        typeTF = new JTextField();
        typeTF.setBounds(fieldX1, y, width, height);
        typeTF.setBackground(Color.WHITE);
        panel.add(typeTF);

        priceT = new JLabel("Price:");
        priceT.setBounds(labelX2, y, width, height);
        priceT.setOpaque(true);
        priceT.setBackground(Color.WHITE);
        panel.add(priceT);

        priceTF = new JTextField();
        priceTF.setBounds(fieldX2, y, width, height);
        priceTF.setBackground(Color.WHITE);
        panel.add(priceTF);

        y += gap;

        damageT = new JLabel("Damage:");
        damageT.setBounds(labelX1, y, width, height);
        damageT.setOpaque(true);
        damageT.setBackground(Color.WHITE);
        panel.add(damageT);

        damageTF = new JTextField();
        damageTF.setBounds(fieldX1, y, width, height);
        damageTF.setBackground(Color.WHITE);
        panel.add(damageTF);

        armorPenT = new JLabel("Armor Pen:");
        armorPenT.setBounds(labelX2, y, width, height);
        armorPenT.setOpaque(true);
        armorPenT.setBackground(Color.WHITE);
        panel.add(armorPenT);

        armorPenTF = new JTextField();
        armorPenTF.setBounds(fieldX2, y, width, height);
        armorPenTF.setBackground(Color.WHITE);
        panel.add(armorPenTF);

        y += gap;

        fireT = new JLabel("Fire Rate:");
        fireT.setBounds(labelX1, y, width, height);
        fireT.setOpaque(true);
        fireT.setBackground(Color.WHITE);
        panel.add(fireT);

        fireTF = new JTextField();
        fireTF.setBounds(fieldX1, y, width, height);
        fireTF.setBackground(Color.WHITE);
        panel.add(fireTF);

        magazineT = new JLabel("Magazine:");
        magazineT.setBounds(labelX2, y, width, height);
        magazineT.setOpaque(true);
        magazineT.setBackground(Color.WHITE);
        panel.add(magazineT);

        magazineTF = new JTextField();
        magazineTF.setBounds(fieldX2, y, width, height);
        magazineTF.setBackground(Color.WHITE);
        panel.add(magazineTF);

        y += gap;

        effectT = new JLabel("Effect:");
        effectT.setBounds(labelX1, y, width, height);
        effectT.setOpaque(true);
        effectT.setBackground(Color.WHITE);
        panel.add(effectT);

        effectTF = new JTextField();
        effectTF.setBounds(fieldX1, y, width, height);
        effectTF.setBackground(Color.WHITE);
        panel.add(effectTF);

        armorValueT = new JLabel("Armor Value:");
        armorValueT.setBounds(labelX2, y, width, height);
        armorValueT.setOpaque(true);
        armorValueT.setBackground(Color.WHITE);
        panel.add(armorValueT);

        armorValueTF = new JTextField();
        armorValueTF.setBounds(fieldX2, y, width, height);
        armorValueTF.setBackground(Color.WHITE);
        panel.add(armorValueTF);

        y += gap;

        helmet = new JLabel("Has Helmet:");
        helmet.setBounds(labelX1, y, width, height);
        helmet.setOpaque(true);
        helmet.setBackground(Color.WHITE);
        panel.add(helmet);

        helmetTF = new JTextField();
        helmetTF.setBounds(fieldX1, y, width, height);
        helmetTF.setBackground(Color.WHITE);
        panel.add(helmetTF);

        defuseT = new JLabel("Defuse Time:");
        defuseT.setBounds(labelX2, y, width, height);
        defuseT.setOpaque(true);
        defuseT.setBackground(Color.WHITE);
        panel.add(defuseT);

        defuseTF = new JTextField();
        defuseTF.setBounds(fieldX2, y, width, height);
        defuseTF.setBackground(Color.WHITE);
        panel.add(defuseTF);

        inputB = new JButton("Submit");
        inputB.setBounds(240, y + 50, 120, 40);
        inputB.setBackground(Color.WHITE);
        inputB.setFocusable(false);
        inputB.addActionListener(this);
        panel.add(inputB);
        
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
}
