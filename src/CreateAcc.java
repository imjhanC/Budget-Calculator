import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CreateAcc {
    JFrame frame = new JFrame("Account Creation");
    JLabel label = new JLabel("Create Account");
    JLabel labelusernameNew = new JLabel("New Username        :");
    JLabel labelpasswordNew = new JLabel("New Password        :");
    JLabel labelreenterPass = new JLabel("Reenter Password :");

    JPasswordField usernameNewField = new JPasswordField();
    JPasswordField passwordNewField = new JPasswordField();
    JPasswordField reenterpassNewField = new JPasswordField();  

    JButton loginBttn = new JButton("Create Account");

    public CreateAcc(){
        label.setLocation(190,10);
        label.setSize(140,30);

        labelusernameNew.setLocation(40,80);
        labelusernameNew.setSize(160,30);
        labelpasswordNew.setLocation(40,160);
        labelpasswordNew.setSize(160,30);
        labelreenterPass.setLocation(40,240);
        labelreenterPass.setSize(160,30);

        usernameNewField.setLocation(170,70);
        usernameNewField.setSize(200,50);
        passwordNewField.setLocation(170,150);
        passwordNewField.setSize(200,50);
        reenterpassNewField.setLocation(170,230);
        reenterpassNewField.setSize(200,50);

        loginBttn.setLocation(240,310);
        loginBttn.setSize(200,50);

        loginBttn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameNewField.getText();
                char[] password = passwordNewField.getPassword();

                if (isValidPassword(password)) {
                    // Process the valid password, e.g., create the account
                    // For now, let's just print a message
                    System.out.println("Account created successfully!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Password! Please follow the password criteria.");
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(labelusernameNew);
        panel.add(labelpasswordNew);
        panel.add(labelreenterPass);
        panel.add(usernameNewField);
        panel.add(passwordNewField);
        panel.add(reenterpassNewField);
        panel.add(loginBttn);
        panel.setLayout(null);
        frame.add(panel);
        frame.setSize(500,450);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }

    private boolean isValidPassword(char[] password) {
        // Convert the password character array to a string for easier manipulation
        String pass = new String(password);

        // Criteria 1: Password should have more than 4 characters
        if (pass.length() <= 4) {
            return false;
        }

        // Criteria 2: Password should not include specific characters
        String invalidCharacters = "></\\[]{}()=-_";
        for (char c : invalidCharacters.toCharArray()) {
            if (pass.indexOf(c) != -1) {
                return false;
            }
        }

        // Criteria 3: Password cannot be "1234567890" or "987654321"
        if (pass.equals("1234567890") || pass.equals("987654321")) {
            return false;
        }

        // Criteria 4: Password should not contain spaces
        if (pass.contains(" ")) {
            return false;
        }

        return true; // Password passes all criteria
    }

    public static void main(String[] args){
        new CreateAcc();
    }
}
