package atm_simulation_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class Pin extends JFrame implements ActionListener {

    JPasswordField t1, t3;
    JTextField t2;
    JButton b1, b2;
    JLabel l1, l2, l3, l4;

    Pin() {

        super("Change UserName PIN");

        l1 = new JLabel("CHANGE YOUR PIN");
        l1.setFont(new Font("System", Font.BOLD, 35));

        l2 = new JLabel("Current PIN:");
        l2.setFont(new Font("System", Font.BOLD, 22));

        l3 = new JLabel("UserName:");
        l3.setFont(new Font("System", Font.BOLD, 22));

        l4 = new JLabel("New PIN: ");
        l4.setFont(new Font("System", Font.BOLD, 22));

        t1 = new JPasswordField();
        t1.setFont(new Font("Raleway", Font.BOLD, 22));

        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 22));

        t3 = new JPasswordField();
        t3.setFont(new Font("Raleway", Font.BOLD, 22));

        b1 = new JButton("SAVE");
        b1.setFont(new Font("System", Font.BOLD, 18));
        b1.setBackground(Color.blue);
        b1.setForeground(Color.WHITE);

        b2 = new JButton("BACK");
        b2.setFont(new Font("System", Font.BOLD, 18));
        b2.setBackground(Color.blue);
        b2.setForeground(Color.WHITE);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setLayout(null);

        l1.setBounds(220, 130, 800, 60);
        add(l1);

        l2.setBounds(100, 240, 150, 40);
        add(l2);

        l3.setBounds(100, 300, 150, 40);
        add(l3);

        l4.setBounds(100, 360, 200, 40);
        add(l4);

        t1.setBounds(310, 240, 360, 40);
        add(t1);

        t2.setBounds(310, 300, 360, 40);
        add(t2);

        t3.setBounds(310, 360, 360, 40);
        add(t3);

        b1.setBounds(220, 460, 160, 50);
        add(b1);

        b2.setBounds(400, 460, 160, 50);
        add(b2);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 800);
        setLocation(500, 90);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        try {

            String a = t1.getText();
            String b = t2.getText();
            String c = t3.getText();

            File file1 = new File("G:/ATM_Simulation_Project/username.txt");
            FileWriter file2 = new FileWriter(file1);
            if (ae.getSource() == b1) {

                String q1 = b + " " + c;

                file2.write(q1);

                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                file2.close();
                new Transactions().setVisible(true);
                setVisible(false);

            } else {

                JOptionPane.showMessageDialog(null, "PIN entered doesn't match");
            }
            if (ae.getSource() == b2) {

                new Transactions().setVisible(true);
                setVisible(false);

            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error: " + e);
        }
    }

    public static void main(String[] args) {
        new Pin().setVisible(true);
    }
}
