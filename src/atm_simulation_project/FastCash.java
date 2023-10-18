package atm_simulation_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class FastCash extends JFrame implements ActionListener {

    JLabel l1, l2;
    JButton b1, b2, b3, b4, b5, b6, b7, b8;

    FastCash() {

        super("FAST CASH");

        l1 = new JLabel("SELECT WITHDRAWL AMOUNT");
        l1.setFont(new Font("System", Font.BOLD, 38));

        b1 = new JButton("100 BDT");
        b1.setFont(new Font("System", Font.BOLD, 18));
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);

        b2 = new JButton("500 BDT");
        b2.setFont(new Font("System", Font.BOLD, 18));
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);

        b3 = new JButton("1000 BDT");
        b3.setFont(new Font("System", Font.BOLD, 18));
        b3.setBackground(Color.BLUE);
        b3.setForeground(Color.WHITE);

        b4 = new JButton("2000 BDT");
        b4.setFont(new Font("System", Font.BOLD, 18));
        b4.setBackground(Color.BLUE);
        b4.setForeground(Color.WHITE);

        b5 = new JButton("5000 BDT");
        b5.setFont(new Font("System", Font.BOLD, 18));
        b5.setBackground(Color.BLUE);
        b5.setForeground(Color.WHITE);

        b6 = new JButton("10000 BDT");
        b6.setFont(new Font("System", Font.BOLD, 18));
        b6.setBackground(Color.BLUE);
        b6.setForeground(Color.WHITE);

        b7 = new JButton("BACK");
        b7.setFont(new Font("System", Font.BOLD, 18));
        b7.setBackground(Color.BLUE);
        b7.setForeground(Color.WHITE);

        b7 = new JButton("EXIT");
        b7.setFont(new Font("System", Font.BOLD, 18));
        b7.setBackground(Color.BLUE);
        b7.setForeground(Color.WHITE);

        setLayout(null);

        l1.setBounds(100, 100, 700, 40);
        add(l1);

        b1.setBounds(40, 250, 300, 60);
        add(b1);

        b2.setBounds(440, 250, 300, 60);
        add(b2);

        b3.setBounds(40, 360, 300, 60);
        add(b3);

        b4.setBounds(440, 360, 300, 60);
        add(b4);

        b5.setBounds(40, 470, 300, 60);
        add(b5);

        b6.setBounds(440, 470, 300, 60);
        add(b6);

        b7.setBounds(240, 600, 300, 60);
        add(b7);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 800);
        setLocation(500, 90);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        try {
            File file1 = new File("G:/ATM_Simulation_Project/balance.txt");
            Scanner obj = new Scanner(file1);
            String value = obj.nextLine();
            int y = Integer.parseInt(value);
            int balance = y;

            File file2 = new File("G:/ATM_Simulation_Project/balance.txt");
            FileWriter file3 = new FileWriter(file2);

            if (ae.getSource() == b1) {
                balance = balance - 100;
                String q1 = "" + balance;
                file3.write(q1);

                JOptionPane.showMessageDialog(null, "" + 100 + " BDT Debited Successfully");

                file3.close();
                new Transactions().setVisible(true);
                setVisible(false);
            } else if (ae.getSource() == b2) {

                balance -= 500;
                String q1 = "" + balance;
                file3.write(q1);
                file3.close();

                JOptionPane.showMessageDialog(null, "" + 500 + "BDT Debited Successfully");

                new Transactions().setVisible(true);
                setVisible(false);

            } else if (ae.getSource() == b3) {

                balance -= 1000;
                String q1 = "" + balance;
                file3.write(q1);
                file3.close();

                JOptionPane.showMessageDialog(null, "" + 1000 + "BDT Debited Successfully");

                new Transactions().setVisible(true);
                setVisible(false);
            } else if (ae.getSource() == b4) {

                balance -= 2000;
                String q1 = "" + balance;
                file3.write(q1);
                file3.close();
                JOptionPane.showMessageDialog(null, "" + 2000 + "BDT Debited Successfully");

                new Transactions().setVisible(true);
                setVisible(false);

            } else if (ae.getSource() == b5) {
                balance -= 5000;
                String q1 = "" + balance;
                file3.write(q1);
                file3.close();

                JOptionPane.showMessageDialog(null, "" + 5000 + "BDT Debited Successfully");

                new Transactions().setVisible(true);
                setVisible(false);

            } else if (ae.getSource() == b6) {
                balance -= 10000;
                String q1 = "" + balance;
                file3.write(q1);
                file3.close();

                JOptionPane.showMessageDialog(null, "" + 10000 + " Debited Successfully");

                new Transactions().setVisible(true);
                setVisible(false);

            } else if (ae.getSource() == b7) {

                System.exit(0);

            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error: " + e);
        }

    }

    public static void main(String[] args) {
        new FastCash().setVisible(true);
    }
}
