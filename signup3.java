package ATM.MANAGMENT.SYSTEM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup3 extends JFrame implements ActionListener {
JRadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8;
JCheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8;
JButton submit,cancel;
String form;
    public signup3(String form){

       super("APPLICATION FORM");

     this.form=form;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICON/bank.png"));
        Image I2= i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(I2);
        JLabel label1 = new JLabel(i2);
        label1.setBounds(150,5,100,100);
        add(label1);

        JLabel label2=new JLabel("Page 3");
        label2.setBounds(420,35,400,40);
        label2.setFont(new Font("Times New Roman",Font.BOLD,22));
        add(label2);

        JLabel label3=new JLabel("ACCOUNT DETAILS");
        label3.setBounds(340,70,400,40);
        label3.setFont(new Font("Times New Roman",Font.BOLD,22));
        add(label3);

        JLabel label4=new JLabel("Account Type :");
        label4.setBounds(100,140,200,30);
        label4.setFont(new Font("Times New Roman",Font.BOLD,22));
        add(label4);
        rb1=new JRadioButton("Saving Account:");
        rb1.setFont(new Font("Times New Roman",Font.BOLD,15));
        rb1.setBounds(130,180,140,30);
        rb1.setBackground( new Color(215,215,215));
        add(rb1);
        rb2=new JRadioButton("Current Account:");
        rb2.setFont(new Font("Times New Roman",Font.BOLD,15));
        rb2.setBounds(350,180,140,30);
        rb2.setBackground( new Color(215,215,215));
        add(rb2);
        rb3=new JRadioButton("Fixed Account:");
        rb3.setFont(new Font("Times New Roman",Font.BOLD,15));
        rb3.setBounds(130,220,140,30);
        rb3.setBackground( new Color(215,215,215));
        add(rb3);
        rb4=new JRadioButton("Deposit Account:");
        rb4.setFont(new Font("Times New Roman",Font.BOLD,15));
        rb4.setBounds(350,220,140,30);
        rb4.setBackground( new Color(215,215,215));
        add(rb4);

        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        bg.add(rb4);

       JLabel label5=new JLabel("Card No:");
        label5.setBounds(100,300,200,30);
        label5.setFont(new Font("Times New Roman",Font.BOLD,22));
       add(label5);

        JLabel label6=new JLabel("Your 16-digit card number:");
        label6.setBounds(100,330,270,30);
        label6.setFont(new Font("Times New Roman",Font.BOLD,16));
        add(label6);

        JLabel label7=new JLabel("(XXXX-XXXX-XXXX-3131)");
        label7.setBounds(460,300,270,30);
        label7.setFont(new Font("Times New Roman",Font.BOLD,18));
        add(label7);

        JLabel label8=new JLabel("(It would appear on atm card cheque Book and statement:)");
        label8.setBounds(460,330,350,30);
        label8.setFont(new Font("Times New Roman",Font.BOLD,13));
        add(label8);

        JLabel label9=new JLabel("XXXX:");
        label9.setBounds(460,380,200,30);
        label9.setFont(new Font("Times New Roman",Font.BOLD,22));
        add(label9);

        JLabel label11=new JLabel("PIN:");
        label11.setBounds(100,380,200,30);
        label11.setFont(new Font("Times New Roman",Font.BOLD,22));
        add(label11);

        JLabel label10=new JLabel("(4-digit password):");
        label10.setBounds(100,400,200,30);
        label10.setFont(new Font("Times New Roman",Font.BOLD,16));
        add(label10);

        JLabel label12=new JLabel("Service Required:");
        label12.setBounds(100,460,200,30);
        label12.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(label12);

        cb1=new JCheckBox("ATM CARD");
        cb1.setFont(new Font("Times New Roman",Font.BOLD,15));
        cb1.setBounds(130,500,120,30);
       cb1.setBackground(new Color(215,215,215));
        add(cb1);

        cb2=new JCheckBox("INTERNET Banking");
        cb2.setFont(new Font("Times New Roman",Font.BOLD,15));
        cb2.setBounds(350,500,190,30);
         cb1.setBackground(new Color(215,215,215));
         cb2.setBackground(new Color(215,215,215));
        add(cb2);

        cb3=new JCheckBox("MOBIL  Banking");
        cb3.setFont(new Font("Times New Roman",Font.BOLD,15));
        cb3.setBounds(130,540,160,30);
         cb3.setBackground(new Color(215,215,215));
        add(cb3);

        cb4=new JCheckBox("EMAIL Alerts");
        cb4.setFont(new Font("Times New Roman",Font.BOLD,15));
        cb4.setBounds(350,540,160,30);
        cb4.setBackground(new Color(215,215,215));
        add(cb4);

        cb5=new JCheckBox("Cheque Book");
        cb5.setFont(new Font("Times New Roman",Font.BOLD,15));
        cb5.setBounds(130,590,160,30);
         cb5.setBackground(new Color(215,215,215));
        add(cb5);

        cb6=new JCheckBox("E-statement");
        cb6.setFont(new Font("Times New Roman",Font.BOLD,15));
        cb6.setBounds(350,590,160,30);
        cb6.setBackground(new Color(215,215,215));
        add(cb6);

        cb7=new JCheckBox("I here by decleares that the above enterd details correct to the best of of my Knowledge.",true);
        cb7.setFont(new Font("Times New Roman",Font.BOLD,12));
        cb7.setBounds(100,645,490,30);
        cb7.setBackground(new Color(215,215,215));
        add(cb7);


        JLabel FORM=new JLabel("FORM NO :");
        FORM.setBounds(630,10,120,20);
        FORM.setFont(new Font("Times New Roman", Font.BOLD, 14));
        add(FORM);

        JLabel FORM1=new JLabel(form);
        FORM1.setBounds(720,9,200,28);
        FORM1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(FORM1);

        submit=new JButton("SUBMIT");
        submit.setFont(new Font("Times New Roman",Font.BOLD,15));
        submit.setBounds(300,720,100,28);
        submit.setForeground(Color.white);
        submit.setBackground(Color.black);
        submit.addActionListener(this);
        add(submit);

        cancel=new JButton("CANCEL");
        cancel.setFont(new Font("Times New Roman",Font.BOLD,15));
        cancel.setBounds(430,720,100,28);
        cancel.setForeground(Color.white);
        cancel.setBackground(Color.black);
        cancel.addActionListener(this);
        add(cancel);


       getContentPane().setBackground(new Color(215,215,215));
       setLayout(null);
       setSize(850,800);
       setLocation(400,20);
       setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
String Atype="";
if(rb1.isSelected()){
    Atype="Saving Account";
}else if(rb2.isSelected()){
    Atype="fixed Deposit Account";
}else if(rb3.isSelected()){
    Atype="Current Account";
}else if(rb4.isSelected()){
    Atype="Deposit Account";
}
        Random ran=new Random();
long first7=(ran.nextLong()%90000000l)+14099630000000l;
String cardno=""+Math.abs(first7);
long first3=(ran.nextLong() % 9000l)+1000l;
String pin="" + Math.abs(first3);
String fac="";
if(cb1.isSelected()){
    fac+="ATM CARD";
}
else if(cb2.isSelected()){
    fac+="INTERNET Banking";
}else if(cb3.isSelected()){
    fac+="MOBIL  Banking";
}
else if(cb4.isSelected()){
    fac+="EMAIL Alerts";
}else if(cb5.isSelected()){
    fac+="Cheque Book";
}else if(cb6.isSelected()){
    fac+="E-statement";
}
try {
    if(ae.getSource() == submit) {
        if (Atype.equals("")) {
            JOptionPane.showMessageDialog(null, "fill all the details");
        } else {
            con c1 = new con();
            String q1 = "insert into signup3 values('"+form+"','"+Atype+"','"+cardno+"','"+pin+"','"+fac+"');";
            String q2="insert into login values('"+form+"','"+cardno+"','"+pin+"');";
            c1.statement.executeUpdate(q1);
            c1.statement.executeUpdate(q2);
            Icon n;
            JOptionPane.showMessageDialog(null, "Card Number:"+cardno+"\n pin:"+pin);
            new Deposit(pin);
            setVisible(false);
        }
    }else if(ae.getSource() == cancel) {
        System.exit(0);
    }
}catch(Exception e){
    e.printStackTrace();
}

    }
    public static void main(String[] args) {
        new signup3("");
    }
}
