import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ATM extends JFrame {
    private JLabel label;
    private JTextField textField;
    private JButton withdrawButton;
    private JButton depositButton;
    private JButton balanceButton;
    private double balance = 1000.00; 

    public ATM() {
        setTitle("ATM Machine");
        setSize(800, 500);
        setLocation(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("IMAGE/atm image.jpg"));
        JLabel image= new JLabel(i1);
        add(image);

        label = new JLabel("Enter amount:");
        textField = new JTextField(10);
        withdrawButton = new JButton("Withdraw");
        depositButton = new JButton("Deposit");
        balanceButton = new JButton("Check Balance");

        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(textField.getText());
                if (amount > 0 && amount <= balance) {
                    balance -= amount;
                    JOptionPane.showMessageDialog(null, "Withdrawn: $" + amount + "\nNew Balance: $" + balance);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid amount or insufficient funds!");
                }
            }
        });

        depositButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(textField.getText());
                if (amount > 0) {
                    balance += amount;
                    JOptionPane.showMessageDialog(null, "Deposited: $" + amount + "\nNew Balance: $" + balance);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid amount!");
                }
            }
        });

        balanceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Your Balance: $" + balance);
            }
        });

        add(label);
        add(textField);
        add(withdrawButton);
        add(depositButton);
        add(balanceButton);
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.setVisible(true);
    }
}

