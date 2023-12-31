import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class LoginGUI{
    Icon originalIcon = new ImageIcon("C:\\Users\\cheng\\Documents\\Test\\test\\65000.png");
    ImageIcon scaledIcon = getScaledIcon(originalIcon, 40, 40);
    JFrame frame = new JFrame("Login");
    JLabel userlabel = new JLabel("Username :");
    JLabel passlabel = new JLabel("Password :");
    JLabel userForgot = new JLabel("<html><u>Need Help/Forgot Password?</u></html>");
    JTextField usernameField = new JTextField("Your username here..."); 
    JPasswordField passwordField = new JPasswordField("Your password here..."); 
    JButton eyeImg1 = new JButton(scaledIcon);
    JButton eyeImg2 = new JButton(scaledIcon);
    JButton LoginBttn = new JButton("Login");

    public LoginGUI(){
        userlabel.setLocation(20, 30);
        userlabel.setSize(70,40);
        usernameField.setLocation(100,30);
        usernameField.setSize(180,40);

        passlabel.setLocation(20,80);
        passlabel.setSize(70,40);
        passwordField.setLocation(100,80);
        passwordField.setSize(180,40);

        eyeImg1.setLocation(300,30);
        eyeImg1.setSize(40,40);

        eyeImg2.setLocation(300,80);
        eyeImg2.setSize(40,40);

        LoginBttn.setLocation(280,130);
        LoginBttn.setSize(90,40);
        userForgot.setLocation(170,130);
        userForgot.setSize(120,30);
        userForgot.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        userForgot.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Perform your action here when the label is clicked
                // For example, open a new window or perform some action
                JOptionPane.showMessageDialog(frame, "Forgot Password clicked!");
            }
        });

        FocusAdapter focusAdapter = new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (usernameField.getText().equals("Your username here...")) {
                    usernameField.setText("");
                }
                if (passwordField.getText().equals("Your password here...")) {
                    passwordField.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (usernameField.getText().isEmpty()) {
                    usernameField.setText("Your username here...");
                }
                if (passwordField.getText().isEmpty()) {
                    passwordField.setText("Your password here...");
                }
            }
        };

        usernameField.addFocusListener(focusAdapter);
        passwordField.addFocusListener(focusAdapter);

        JPanel panel = new JPanel();
        panel.add(userlabel);
        panel.add(passlabel);
        panel.add(usernameField);
        panel.add(passwordField);
        panel.add(eyeImg1);
        panel.add(eyeImg2);
        panel.add(LoginBttn);
        panel.add(userForgot);
        panel.setLayout(null);
        frame.add(panel);
        frame.setSize(400,230);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        //frame.getContentPane().setBackground(new java.awt.Color(11, 13, 12));
    }

    private ImageIcon getScaledIcon(Icon icon, int width, int height) { //Scale image to 40 x 40
        Image image = ((ImageIcon) icon).getImage();
        Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }

    public static void main(String[] args){
       new LoginGUI();
    }
}
