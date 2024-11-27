package ATM.MANAGMENT.SYSTEM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    TextField text1;
    JButton b1,b2;
    Deposit(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICON/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1550, 830);
        add(l1);

        JLabel l2 = new JLabel("Enter your Amount you want to Deposit");
        l2.setForeground(Color.white);
        l2.setBounds(460, 180, 400, 35);
        l2.setFont(new Font("System",Font.BOLD,16));
        l1.add(l2);

        text1 = new TextField();
        text1.setForeground(Color.WHITE);
        text1.setBackground(new Color(65,125,128));
        text1.setFont(new Font("System",Font.BOLD,22));
        text1.setBounds(460, 230, 320, 25);
        l1.add(text1);

        b1 = new JButton("Deposit");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65,125,128));
        b1.setFont(new Font("System",Font.BOLD,22));
        b1.setBounds(700,362,150,35);
        b1.addActionListener(this);
        l1.add(b1);

        b2 = new JButton("Cancel");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65,125,128));
        b2.setFont(new Font("System",Font.BOLD,22));
        b2.setBounds(700,406,150,35);
        b2.addActionListener(this);
        l1.add(b2);




        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
try {
    String Amount = text1.getText();
    Date date = new Date();
    if (e.getSource() == b1) {
        if (text1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Amount to Deposit");
        } else {
            con c = new con();
            c.statement.executeUpdate("insert into bank values ('" + pin + "','" + date + "','Deposit','" + Amount + "');");
            JOptionPane.showMessageDialog(null, "Rs." + Amount +" "+ "Deposited Successfully");
        }
    }
    else if (e.getSource() == b2) {
        setVisible(false);
    }
}catch (Exception E){
    E.printStackTrace();
}
    }

    public static void main(String[] args) {
        new Deposit("");
    }
}
