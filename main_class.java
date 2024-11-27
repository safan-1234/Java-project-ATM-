package ATM.MANAGMENT.SYSTEM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener {
    JLabel l2,l3,l4,l5,l6;
    JButton b1,b2,b3,b4,b5,b6,b7;
    main_class(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICON/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1550, 830);
        add(l1);

        l2 = new JLabel("Select your Transaction");
        l2.setBounds(470, 180, 700, 35);
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        l2.setForeground(Color.white);
        l1.add(l2);

        b1=new JButton("DEPOSIT");
        b1.setBounds(410, 274, 150, 35);
       // b1.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        b1.setBackground(new Color(65,125,128));
        l1.add(b1);

        b2=new JButton("CASH WITHDRAW");
        b2.setBounds(700, 274, 150, 35);
        // b1.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        b2.setBackground(new Color(65,125,128));
        l1.add(b2);

        b3=new JButton("FAST CASH");
        b3.setBounds(410, 318, 150, 35);
        // b1.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        b3.setForeground(Color.white);
        b3.addActionListener(this);
        b3.setBackground(new Color(65,125,128));
        l1.add(b3);

        b3=new JButton("MINI STATEMENT");
        b3.setBounds(700, 318, 150, 35);
        // b1.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        b3.setForeground(Color.white);
        b3.addActionListener(this);
        b3.setBackground(new Color(65,125,128));
        l1.add(b3);


        b4=new JButton("PIN CHANGE");
        b4.setBounds(410, 362, 150, 35);
        // b1.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        b4.setForeground(Color.white);
        b4.addActionListener(this);
        b4.setBackground(new Color(65,125,128));
        l1.add(b4);


        b5=new JButton("BALANCE ENQUIRY");
        b5.setBounds(700, 362, 150, 35);
        // b1.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        b5.setForeground(Color.white);
        b5.addActionListener(this);
        b5.setBackground(new Color(65,125,128));
        l1.add(b5);

        b6=new JButton("EXIT");
        b6.setBounds(700, 406, 150, 35);
        // b1.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        b6.setForeground(Color.white);
        b6.addActionListener(this);
        b6.setBackground(new Color(65,125,128));
        l1.add(b6);


        














        setLayout(null);
        setVisible(true);
        setSize(1550,1080);
        setLocation(0,0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new main_class();
    }
}
