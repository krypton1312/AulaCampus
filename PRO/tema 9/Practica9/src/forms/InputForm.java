package forms;

import com.db4o.ObjectContainer;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.stream.Stream;
import javax.imageio.ImageIO;
import javax.swing.*;
import objects.Description;
import objects.Gear;
import objects.Grenade;
import objects.Weapon;

public class InputForm extends JFrame implements ActionListener {

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
    JLabel descT;
    JLabel imagePreview;
    JTextArea descTF;
    JTextField nameTF;
    JTextField typeTF;
    JTextField priceTF;
    JTextField damageTF;
    JTextField armorPenTF;
    JTextField fireTF;
    JTextField magazineTF;
    JTextField effectTF;
    JTextField armorValueTF;
    JComboBox helmetTF;
    JTextField defuseTF;
    JComboBox categoryCB;
    JButton inputB;
    JButton uploadB;
    File selectedImage;
    static final String IMAGE_PATH = "src/images/equipphoto/";
    private ObjectContainer gearDataBase;
    private ObjectContainer weaponDataBase;
    private ObjectContainer grenadeDataBase;
    private ObjectContainer descriptionDataBase;

    public InputForm(ObjectContainer gearDataBase, ObjectContainer weaponDataBase, ObjectContainer grenadeDataBase, ObjectContainer descriptionDataBase) {
        this.gearDataBase = gearDataBase;
        this.weaponDataBase = weaponDataBase;
        this.grenadeDataBase = grenadeDataBase;
        this.descriptionDataBase = descriptionDataBase;
        this.setTitle("Input new item");
        this.setResizable(false);
   
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(620, 500));
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
        categoryCB.addActionListener(this);
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

        helmetTF = new JComboBox<>(new String[]{"true", "false"});
        helmetTF.setBounds(fieldX1, y, width, height);
        helmetTF.setBackground(Color.WHITE);
        helmetTF.setFocusable(false);
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
        
        y += gap;
        
        descT = new JLabel("Description:");
        descT.setBounds(30, y, 560, 30);
        descT.setOpaque(true);
        descT.setBackground(Color.WHITE);
        descT.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(descT);

        y += 35;

        descTF = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(descTF);
        scrollPane.setBounds(30, y, 560, 80);
        panel.add(scrollPane);

        y += 90;

        uploadB = new JButton("Upload Image");
        uploadB.setBounds(labelX1, y, width, height);
        uploadB.addActionListener(this);
        panel.add(uploadB);

        imagePreview = new JLabel();
        imagePreview.setBounds(fieldX1, y, 400, height);
        imagePreview.setOpaque(true);
        imagePreview.setBackground(Color.LIGHT_GRAY);
        panel.add(imagePreview);

        y += 50;

        inputB = new JButton("Submit");
        inputB.setBounds(240, y, 120, 40);
        inputB.setBackground(Color.WHITE);
        inputB.setFocusable(false);
        inputB.addActionListener(this);
        panel.add(inputB);

        this.pack();
        this.setLocationRelativeTo(null);
        selectedItem();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (categoryCB == e.getSource()) {
            selectedItem();
        }
        if (inputB == e.getSource()){
            insertToDataBase();
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
            this.dispose();
        }
        if (e.getSource() == uploadB) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("PNG Images", "png"));
            int returnValue = fileChooser.showOpenDialog(this);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                selectedImage = fileChooser.getSelectedFile();
                imagePreview.setText(selectedImage.getName());
            }
        }
    }

    public void selectedItem() {
        Component[] components = panel.getComponents();

        for (Component comp : components) {
            if (comp instanceof JTextField) {
                comp.setEnabled(true);
                comp.setBackground(Color.WHITE);
            }
        }
        switch (categoryCB.getSelectedIndex()) {
            case 0:
                Stream.of(effectTF, armorValueTF, helmetTF, defuseTF)
                        .forEach(tf -> {
                            tf.setEnabled(false);
                            tf.setBackground(Color.LIGHT_GRAY);
                        });
                break;
            case 1:
                Stream.of(damageTF, armorPenTF, fireTF, magazineTF, armorValueTF, helmetTF, defuseTF)
                        .forEach(tf -> {
                            tf.setEnabled(false);
                            tf.setBackground(Color.LIGHT_GRAY);
                        });
                break;
            case 2:
                Stream.of(damageTF, armorPenTF, fireTF, magazineTF, effectTF)
                        .forEach(tf -> {
                            tf.setEnabled(false);
                            tf.setBackground(Color.LIGHT_GRAY);
                        });
                helmetTF.setEnabled(true);
                helmetTF.setBackground(Color.WHITE);
                break;

        }
    }
    //Gear(String name, String type, double price, int armourValue, boolean hasHelmet, int defuseTime)

//Weapons(String name, String type, double price, int damage, double armourPenetration, int fireRate, int magazineSize)

//Grenade(String name, String type, double price, String effect
    public void insertToDataBase(){
        switch(categoryCB.getSelectedIndex()){
            case 0:
                Weapon wep = new Weapon(nameTF.getText(), typeTF.getText(), 
                    Double.parseDouble(priceTF.getText()), 
                    Integer.parseInt(damageTF.getText()), 
                    Double.parseDouble(armorPenTF.getText()),
                    Integer.parseInt(fireTF.getText()), 
                    Integer.parseInt(magazineTF.getText()));
                weaponDataBase.store(wep);
                weaponDataBase.commit();
                break;
            case 1:
                Grenade gren = new Grenade(nameTF.getText(), typeTF.getText(), Double.parseDouble(priceTF.getText()), effectTF.getText());
                grenadeDataBase.store(gren);
                grenadeDataBase.commit();
                break;
            case 2:
                Gear gear = new Gear(nameTF.getText(), typeTF.getText(), Double.parseDouble(priceTF.getText()), Integer.parseInt(armorValueTF.getText()), Boolean.parseBoolean(helmetTF.getSelectedItem().toString()),Integer.parseInt(defuseTF.getText()));
                gearDataBase.store(gear);
                gearDataBase.commit();
                break;
        }
        if (selectedImage != null) {
            saveImage(selectedImage);
        }
        Description desc = new Description(nameTF.getText(), descTF.getText(), saveImage(selectedImage));
        descriptionDataBase.store(desc);
        descriptionDataBase.commit();
    }
    private String saveImage(File imageFile) {
        File dest = null;
        try {
            dest = new File(IMAGE_PATH + imageFile.getName());
            ImageIO.write(ImageIO.read(imageFile), "png", dest);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error saving image", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return dest.getPath();
    }
    
}


