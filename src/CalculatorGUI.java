import javax.swing.*;

public class CalculatorGUI {
    JFrame frame = new JFrame("Budget Calculator");
    JButton settingButton = new JButton("Setting");
    JButton historyButton = new JButton("Transaction History");
    JButton homeButton = new JButton("Home");

    public CalculatorGUI(){
        homeButton.setLocation(0,0);
        homeButton.setSize(160,60);
        historyButton.setLocation(0,60);
        historyButton.setSize(160,60);
        settingButton.setLocation(0,600);
        settingButton.setSize(160,60);

        
        JPanel panel = new JPanel();
        panel.add(homeButton);
        panel.add(historyButton);
        panel.add(settingButton);
        panel.setLayout(null);
        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(1000,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args){
        new CalculatorGUI();
    }
}
