package forms;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import objects.Account;

public class LoginForm extends JFrame implements ActionListener {

    private BackgroundPanel panel;
    private JLabel textLoginL;
    private JLabel loginL;
    private JLabel passwordL;
    private JTextField loginTF;
    private JPasswordField passwordTF;
    private JButton loginB;
    private ObjectContainer user;
    private Account selectedAccount;
    public boolean isLoginSuccessfull = false;

    public LoginForm(ObjectContainer user) {
        this.user = user;
        this.setTitle("Login");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        panel = new BackgroundPanel("src/images/output.png");
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(400, 500));
        this.setContentPane(panel);

        textLoginL = new JLabel("Welcome");
        textLoginL.setFont(new Font("Arial", Font.BOLD, 28));
        textLoginL.setForeground(Color.BLACK);
        textLoginL.setBounds(140, 20, 150, 50);
        panel.add(textLoginL);

        loginL = new JLabel("Login:");
        loginL.setFont(new Font("Arial", Font.BOLD, 16));
        loginL.setForeground(Color.WHITE);
        loginL.setBounds(50, 200, 100, 30);
        panel.add(loginL);

        loginTF = new JTextField();
        loginTF.setBounds(150, 200, 200, 30);
        panel.add(loginTF);

        passwordL = new JLabel("Password:");
        passwordL.setFont(new Font("Arial", Font.BOLD, 16));
        passwordL.setForeground(Color.WHITE);
        passwordL.setBounds(50, 250, 100, 30);
        panel.add(passwordL);

        passwordTF = new JPasswordField();
        passwordTF.setBounds(150, 250, 200, 30);
        panel.add(passwordTF);

        loginB = new JButton("Sign in");
        loginB.setFont(new Font("Arial", Font.BOLD, 18));
        loginB.setBounds(135, 300, 130, 45);
        loginB.setBackground(Color.WHITE);
        loginB.setForeground(Color.BLACK);
        loginB.addActionListener(this);
        loginB.setFocusable(false);
        panel.add(loginB);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginB) {
            if ((loginTF.getText()).equals("")) {
                handleError("login");
            } else {
                Account getAccount = new Account(loginTF.getText(), null, null, null);
                try {
                    ObjectSet result = user.queryByExample(getAccount);
                    if (result.hasNext()) {
                        selectedAccount = (Account) result.next();
                        if ((selectedAccount.getPassword()).equals(new String(passwordTF.getPassword()))) {
                            isLoginSuccessfull = true;
                            this.dispose();
                        } else {
                            incorrectLoginAndPasswordPane();
                        }
                    } else {
                        if (createNewAccPane() == JOptionPane.YES_OPTION) {
                            if (new String(passwordTF.getPassword()).equals("")) {
                                handleError("password");
                            } else {
                                user.store(new Account(loginTF.getText(), new String(passwordTF.getPassword()), false, false));
                            }
                        }
                    }
                } catch (IllegalStateException a) {
                    System.out.println("Not found");
                }

            }
        }
    }

    public Account getSelectedAccount() {
        return selectedAccount;
    }

    class BackgroundPanel extends JPanel {

        private Image backgroundImage;

        public BackgroundPanel(String filePath) {
            backgroundImage = new ImageIcon(filePath).getImage();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }

    public void incorrectLoginAndPasswordPane() {
        JOptionPane optionPane = new JOptionPane("Error: Incorrect login or password.",
                JOptionPane.ERROR_MESSAGE);
        JDialog dialog = optionPane.createDialog("Error");
        JButton okButton = (JButton) dialog.getRootPane().getDefaultButton();
        okButton.setFocusable(false);
        dialog.setVisible(true);
    }

    public int createNewAccPane() {
        int option = JOptionPane.showOptionDialog(null,
                "This username doesn't exist.\nWould you like to create it?",
                "Confirmation",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Yes", "No"},
                "No");
        return option;
    }

    private void showErrorDialog(String message) {
        JOptionPane optionPane = new JOptionPane(message, JOptionPane.ERROR_MESSAGE);
        JDialog dialog = optionPane.createDialog("Error");
        JButton okButton = (JButton) dialog.getRootPane().getDefaultButton();
        okButton.setFocusable(false);
        dialog.setVisible(true);
    }

    public void handleError(String choose) {
        switch (choose) {
            case "password":
                showErrorDialog("Error: password can not be empty.");
                break;
            case "login":
                showErrorDialog("Error: login can not be empty.");
                break;
        }
    }

}
