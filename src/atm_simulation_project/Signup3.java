package atm_simulation_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.FileWriter;
import java.util.*;

public class Signup3 extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l5, l7, l9, l10;
    JRadioButton r1, r2, r3, r4;
    JButton b1, b2;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JTextField tf1, tf2;

    Signup3() {

        super("NEW ACCOUNT APPLICATION FORM - PAGE 3");

        l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));

        l2 = new JLabel("Account Type:");
        l2.setFont(new Font("Raleway", Font.BOLD, 18));

        l3 = new JLabel("User Name:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));

        tf1 = new JTextField(14);
        tf1.setFont(new Font("Arial", Font.BOLD, 14));

        l5 = new JLabel("(12-character username)");
        l5.setFont(new Font("Raleway", Font.BOLD, 12));

        l7 = new JLabel("PIN:");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));

        tf2 = new JPasswordField(4);
        tf2.setFont(new Font("Arial", Font.BOLD, 14));

        l9 = new JLabel("(4-digit password)");
        l9.setFont(new Font("Raleway", Font.BOLD, 12));

        l10 = new JLabel("Services Required:");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));

        b1 = new JButton("Submit");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.blue);
        b1.setForeground(Color.WHITE);

        b2 = new JButton("Cancel");
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
        b2.setBackground(Color.blue);
        b2.setForeground(Color.WHITE);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));

        c7 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.", true);
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);

        setLayout(null);

        l1.setBounds(280, 50, 400, 40);
        add(l1);

        l2.setBounds(100, 140, 200, 30);
        add(l2);

        r1.setBounds(100, 180, 150, 30);
        add(r1);

        r2.setBounds(350, 180, 300, 30);
        add(r2);

        r3.setBounds(100, 220, 250, 30);
        add(r3);

        r4.setBounds(350, 220, 250, 30);
        add(r4);

        l3.setBounds(100, 300, 200, 30);
        add(l3);

        tf1.setBounds(330, 300, 250, 30);
        add(tf1);

        l5.setBounds(100, 330, 200, 20);
        add(l5);

        l7.setBounds(100, 370, 200, 30);
        add(l7);

        tf2.setBounds(330, 370, 250, 30);
        add(tf2);

        l9.setBounds(100, 400, 200, 20);
        add(l9);

        l10.setBounds(100, 450, 200, 30);
        add(l10);

        c1.setBounds(100, 500, 200, 30);
        add(c1);

        c2.setBounds(350, 500, 200, 30);
        add(c2);

        c3.setBounds(100, 550, 200, 30);
        add(c3);

        c4.setBounds(350, 550, 200, 30);
        add(c4);

        c5.setBounds(100, 600, 200, 30);
        add(c5);

        c6.setBounds(350, 600, 200, 30);
        add(c6);

        c7.setBounds(100, 680, 600, 20);
        add(c7);

        b1.setBounds(300, 720, 100, 30);
        add(b1);

        b2.setBounds(420, 720, 100, 30);
        add(b2);

        getContentPane().setBackground(Color.white);

        setSize(850, 850);
        setLocation(500, 90);
        setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {

        String a = null;
        if (r1.isSelected()) {
            a = "Saving Account";
        } else if (r2.isSelected()) {
            a = "Fixed Deposit Account";
        } else if (r3.isSelected()) {
            a = "Current Account";
        } else if (r4.isSelected()) {
            a = "Recurring Deposit Account";
        }

        String b = "";
        if (c1.isSelected()) {
            b = b + " ATM Card";
        }
        if (c2.isSelected()) {
            b = b + " Internet Banking";
        }
        if (c3.isSelected()) {
            b = b + " Mobile Banking";
        }
        if (c4.isSelected()) {
            b = b + " EMAIL Alerts";
        }
        if (c5.isSelected()) {
            b = b + " Cheque Book";
        }
        if (c6.isSelected()) {
            b = b + " E-Statement";
        }

        try {
            FileWriter fileWriter = new FileWriter("G:/ATM_Simulation_Project/username.txt");
            FileWriter fileWriter2 = new FileWriter("G:/ATM_Simulation_Project/Signup3.txt");

            if (ae.getSource() == b1) {

                if (b.equals("")) {

                    JOptionPane.showMessageDialog(null, "Fill all the required fields");

                } else {

                    String user = tf1.getText();
                    String pass = tf2.getText();

                    String q1 = user + " " + pass;
                    String q2 = "insert into signup3 values('" + a + " " + b + ")";
                    fileWriter.write(q1);
                    fileWriter2.write(q2);
                    JOptionPane.showMessageDialog(null, "UserName: " + tf1.getText() + "\n Pin:" + tf2.getText());
                    fileWriter.close();
                    fileWriter2.close();
                    new Deposit().setVisible(true);
                    setVisible(false);
                }

            } else if (ae.getSource() == b2) {
                System.exit(0);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup3().setVisible(true);
    }

}
