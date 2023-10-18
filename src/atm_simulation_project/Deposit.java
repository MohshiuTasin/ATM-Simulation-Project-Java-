package atm_simulation_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class Deposit extends JFrame implements ActionListener {

    JTextField t1;
    JButton b1, b2, b3;
    JLabel l1, l2;

    Deposit() {
        super("DEPOSIT");

        l1 = new JLabel("ENTER AMOUNT YOU WANT");
        l1.setFont(new Font("System", Font.BOLD, 35));

        l2 = new JLabel("TO DEPOSIT");
        l2.setFont(new Font("System", Font.BOLD, 35));

        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 22));

        b1 = new JButton("DEPOSIT");
        b1.setFont(new Font("System", Font.BOLD, 18));
        b1.setBackground(Color.blue);
        b1.setForeground(Color.WHITE);

        b2 = new JButton("BACK");
        b2.setFont(new Font("System", Font.BOLD, 18));
        b2.setBackground(Color.blue);
        b2.setForeground(Color.WHITE);

        b3 = new JButton("EXIT");
        b3.setFont(new Font("System", Font.BOLD, 18));
        b3.setBackground(Color.blue);
        b3.setForeground(Color.WHITE);

        setLayout(null);

        l1.setBounds(150, 150, 800, 60);
        add(l1);

        l2.setBounds(290, 210, 800, 60);
        add(l2);

        t1.setBounds(250, 300, 300, 50);
        add(t1);

        b1.setBounds(260, 380, 125, 50);
        add(b1);

        b2.setBounds(415, 380, 125, 50);
        add(b2);

        b3.setBounds(300, 550, 200, 50);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 800);
        setLocation(500, 90);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {

            String a = t1.getText();

            File file1 = new File("G:/ATM_Simulation_Project/balance.txt");

            Scanner obj = new Scanner(file1);

            String value = obj.nextLine();
            int taka = Integer.parseInt(value);

            File file2 = new File("G:/ATM_Simulation_Project/balance.txt");

            if (ae.getSource() == b1) {
                if (t1.getText().equals("")) {

                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Deposit");

                } else {

                    int balance = 0;

                    FileWriter file3 = new FileWriter(file2);
                    int d = Integer.parseInt(a);
                    int y = d + taka;
                    balance = balance + y;
                    file3.write("" + balance);
                    JOptionPane.showMessageDialog(null, a + " BDT Deposited Successfully");

                    file3.close();

                }

                new Transactions().setVisible(true);
                setVisible(false);

            } else if (ae.getSource() == b2) {

                new Transactions().setVisible(true);
                setVisible(false);

            } else if (ae.getSource() == b3) {

                System.exit(0);

            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error: " + e);
        }

    }

    public static void main(String[] args) {
        new Deposit().setVisible(true);
    }

}
