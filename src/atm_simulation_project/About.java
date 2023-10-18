package atm_simulation_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class About extends JFrame implements ActionListener {

    JButton b;
    JLabel l1, l2;
    JTextArea t;

    About() {
        super("NOTICE");

        l1 = new JLabel("Electronic Banking Security Notice");
        l1.setFont(new Font("Times New Roman", Font.BOLD, 22));

        t = new JTextArea("Keep your Account Number / Username and Password secure and confidential\n"
                + "\n"
                + "    [Not applicable to Public Bank (Hong Kong) Pay] Upon receipt of your PIN mailer, you should change the Password immediately and destroy the original PIN mailer.\n"
                + "    Please inform us immediately to suspend the services if you find or believe that your Password is stolen, compromised or lost.\n"
                + "    Do not furnish your Account Number, Username and / or Password to any third parties. Our Bank staff will never ask you to provide sensitive account information (such as passwords) by e-mail, SMS or telephone.\n"
                + "    Avoid using the same details that you use to access different electronic banking services and other services such as email, other Internet sites/ISPs, Net Banking, Public Bank (Hong Kong) Pay, ATM, or Phone Banking.\n"
                + "    Do not use easy-to-guess (e.g. Identity Card number, telephone number or similar numbers) or repetitive alphabets or numbers as your Password.\n"
                + "    Avoid using part of your Account Number / Username as your Password.\n"
                + "    Always memorize your Password. Never write it down or store on computers / mobile phones / place in plain sight or reveal it to anyone. If you cannot remember the Password, you should always disguise the Password and keep it in a safe place separate from where you keep your Account Number / Username, your computer and bank account details.\n"
                + "    Change your Password regularly.\n"
                + "    Please beware of any unusual login screen or process (e.g. a suspicious pop-up window or request for providing additional personal information) and ensure that your entry of Account Number / Username and Password cannot be watched by someone standing around or behind you when you login. Log out immediately after use.\n"
                + "    Do not allow anybody else to operate your Net Banking account / Public Bank (Hong Kong) Pay mobile application / Phone Banking account / ATM account.\n"
                + "\n"
                + " \n"
                + "Always log out your online session\n"
                + "\n"
                + "    Once you have finished conducting your transaction on the Internet, always use the “logout” button to exit the Net Banking and close the browser after a logout confirmation had been displayed. Please do not exit the system via other ways.\n"
                + "    Never walk away from your computer with your account information on the screen.\n"
                + "    Do not access third-party websites within the same internet browser session when using Net Banking.\n"
                + "\n"
                + " \n"
                + "Do not store your Net Banking Account Number / Username / Password in the browsers\n"
                + "\n"
                + "    Remember to disable the “auto-complete” function on your browser, as this will make your Net Banking Account Number / Username and Password automatically available to anyone having access to your system. To turn this function off in Internet Explorer browser, click the “Tools” menu, click “Internet Options”, click the “Content” tab, and click the “Auto Complete” button. Then disable the “User names and passwords on forms”.\n");

        t.setFont(new Font("Italic", Font.BOLD, 12));

        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.blue);
        b.setForeground(Color.black);

        setLayout(null);

        l1.setBounds(280, 30, 600, 40);
        add(l1);

        t.setBounds(20, 80, 800, 500);
        add(t);

        b.setBounds(650, 600, 100, 30);
        add(b);

        b.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 850);
        setLocation(500, 90);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        new Transactions().setVisible(true);
        setVisible(false);
    }

    public static void main(String[] args) {
        new About().setVisible(true);
    }
}
