package ATM.MANAGMENT.SYSTEM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATM extends JFrame implements ActionListener {
    JLabel label313,label314,label315;
JTextField text1,text2;
JPasswordField p1,p2;
JButton button1,button2,button3,button4;
    ATM(){
        super("ATM Management System");
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("ICON/bank.png"));
        Image I2= icon1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon icon2 = new ImageIcon(I2);
        JLabel label1 = new JLabel(icon2);
        label1.setBounds(350,10,100,100);
        add(label1);

        ImageIcon icon12 = new ImageIcon(ClassLoader.getSystemResource("ICON/card.png"));
        Image I3= icon12.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon icon21 = new ImageIcon(I3);
        JLabel label12 = new JLabel(icon21);
        label12.setBounds(630,350,100,100);
        add(label12);


        label313 =new JLabel("WELCOME TO  ATM");
        label313.setForeground(Color.white);
        label313.setFont(new Font("AvantGard",Font.BOLD,35));
        label313.setBounds(230,125,450,40);
        add(label313);

        text1 =new JTextField(15);
        text1.setBounds(325,190,230,30);
        text1.setFont(new Font("AvantGard",Font.BOLD,14));
        add(text1);

        label314 =new JLabel("Card No");
        label314.setForeground(Color.white);
        label314.setFont(new Font("AvantGard",Font.BOLD,28));
        label314.setBounds(150,190,375,30);
        add(label314);

        label315 =new JLabel("PIN");
        label315.setForeground(Color.white);
        label315.setFont(new Font("AvantGard",Font.BOLD,28));
        label315.setBounds(150,250,375,30);
        add(label315);

        p1=new JPasswordField(15);
        p1.setBounds(325,250,230,30);
        p1.setFont(new Font("AvantGard",Font.BOLD,14));
        add(p1);


        button1=new JButton("SIGN IN");
        button1.setBounds(300,300,100,30);
        button1.setFont(new Font("AvantGard",Font.BOLD,14));
        button1.setForeground(Color.blue);
        button1.setBackground(Color.white);
        add(button1);

        button2=new JButton("CLEAR");
        button2.setBounds(430,300,100,30);
        button2.setFont(new Font("AvantGard",Font.BOLD,14));
        button2.setForeground(Color.blue);
        button2.setBackground(Color.white);
        button2.addActionListener(this);
        add(button2);

        button3=new JButton("SIGN UP");
        button3.setBounds(300,350,230,30);
        button3.setFont(new Font("AvantGard",Font.BOLD,14));
        button3.setForeground(Color.blue);
        button3.setBackground(Color.white);
        button3.addActionListener(this);
        add(button3);




        ImageIcon icon13 = new ImageIcon(ClassLoader.getSystemResource("ICON/backbg.png"));
        Image I4= icon13.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon icon22 = new ImageIcon(I4);
        JLabel label13 = new JLabel(icon22);
        label13.setBounds(0,0,850,480);
        add(label13);



        setLayout(null);
setSize(850,480);
setVisible(true);
setLocation(450,200);



    }
    public void actionPerformed(ActionEvent e) {
        try{
if(e.getSource()==button1){

}else if(e.getSource()==button2){
    text1.setText("");
    p1.setText("");
}else if(e.getSource()==button3){
new Sign();
setVisible(false);

}
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new ATM();
    }
}
