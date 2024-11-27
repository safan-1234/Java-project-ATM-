package ATM.MANAGMENT.SYSTEM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
public class Sign extends JFrame implements ActionListener {
    JRadioButton R1,R2,M1,M2,M3;
    JButton next;
    JTextField text1,text2,emailtext,mstext,textadd,tetxcity,textpin,textstate;
   JDateChooser DataChoose;
    Random ran=new Random();
    long first3=(ran.nextLong()%9000l)+1000l;
String first=" " + Math.abs(first3);
    Sign(){
           super("APPLICATION FORM");


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICON/bank.png"));
        Image I2= i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(I2);
        JLabel label1 = new JLabel(i2);
        label1.setBounds(25,10,100,100);
        add(label1);

       JLabel label2 = new JLabel("APPLICATION FORM NO"+first);
       label2.setBounds(200,20,600,40);
       label2.setFont(new Font("Times New Roman",Font.BOLD,32));
       add(label2);

       JLabel label3=new JLabel("Personel Details");
       label3.setBounds(325,105,600,30);
       label3.setFont(new Font("Times New Roman",Font.BOLD,22));
       add(label3);

       JLabel label4=new JLabel("Page 1");
       label4.setBounds(370,60,600,30);
       label4.setFont(new Font("Times New Roman",Font.BOLD,22));
       add(label4);

       JLabel labelname=new JLabel("NAME");
       labelname.setBounds(100,190,100,30);
       labelname.setFont(new Font("Times New Roman",Font.BOLD,20));
       add(labelname);

       text1=new JTextField();
        text1.setBounds(300,190,400,30);
        text1.setFont(new Font("Times New Roman",Font.BOLD,14));
        add(text1);


        JLabel fatherName=new JLabel("FATHER NAME");
        fatherName.setBounds(100,240,200,30);
        fatherName.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(fatherName);

        text2=new JTextField();
        text2.setBounds(300,240,400,30);
        text2.setFont(new Font("Times New Roman",Font.BOLD,14));
        add(text2);


        JLabel DOB=new JLabel("Date of Birth");
        DOB.setBounds(100,340,200,30);
        DOB.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(DOB);

        DataChoose=new JDateChooser();
        DataChoose.setForeground(new Color(105,105,105));
        DataChoose.setBounds(300,340,400,30);
        add(DataChoose);

        JLabel lebelG=new JLabel("Gender");
        lebelG.setBounds(100,290,200,20);
        lebelG.setFont(new Font("Times New Roman",Font.BOLD,25));
        add(lebelG);

        R1=new JRadioButton("Male");
        R1.setBounds(300,290,60,30);
        R1.setFont(new Font("Times New Roman",Font.BOLD,14));
        add(R1);


        R2=new JRadioButton("Female");
        R2.setBounds(450,290,90,30);
        R2.setFont(new Font("Times New Roman",Font.BOLD,14));
        add(R2);

        ButtonGroup bg=new ButtonGroup();
        bg.add(R1);
        bg.add(R2);

        JLabel email=new JLabel("Email");
        email.setBounds(100,390,200,20);
        email.setFont(new Font("Times New Roman",Font.BOLD,25));
        add(email);

        emailtext =new JTextField();
        emailtext.setBounds(300,390,400,30);
        emailtext.setFont(new Font("Times New Roman",Font.BOLD,14));
        add(emailtext);

        JLabel lebelMS=new JLabel("Marital Status");
        lebelMS.setBounds(100,440,200,20);
        lebelMS.setFont(new Font("Times New Roman",Font.BOLD,25));
        add(lebelMS);

        M1=new JRadioButton("Married");
        M1.setBounds(300,440,80,30);
        M1.setFont(new Font("Times New Roman",Font.BOLD,16));
        add(M1);

        M2=new JRadioButton("Unmarried");
        M2.setBounds(450,440,105,30);
        M2.setFont(new Font("Times New Roman",Font.BOLD,16));
        add(M2);

        M3=new JRadioButton("Other");
        M3.setBounds(635,440,90,30);
        M3.setFont(new Font("Times New Roman",Font.BOLD,16));
        add(M3);

        ButtonGroup bg2=new ButtonGroup();
        bg2.add(M1);
        bg2.add(M2);
        bg2.add(M3);


        JLabel address=new JLabel("Address");
        address.setBounds(100,490,200,30);
        address.setFont(new Font("Times New Roman",Font.BOLD,25));
        add(address);


        textadd =new JTextField();
        textadd.setBounds(300,490,400,30);
        textadd.setFont(new Font("Times New Roman",Font.BOLD,14));
        add(textadd);

        JLabel City=new JLabel("City");
        City.setBounds(100,540,200,30);
        City.setFont(new Font("Times New Roman",Font.BOLD,25));
        add(City);

        tetxcity=new JTextField();
        tetxcity.setBounds(300,540,400,30);
        tetxcity.setFont(new Font("Times New Roman",Font.BOLD,14));
        add(tetxcity);

        JLabel pincode=new JLabel("Pincode");
        pincode.setBounds(100,590,200,30);
        pincode.setFont(new Font("Times New Roman",Font.BOLD,25));
        add(pincode);

        textpin=new JTextField();
        textpin.setBounds(300,590,400,30);
        textpin.setFont(new Font("Times New Roman",Font.BOLD,14));
        add(textpin);

        JLabel State=new JLabel("State");
        State.setBounds(100,640,200,30);
        State.setFont(new Font("Times New Roman",Font.BOLD,30));
        add(State);

        textstate=new JTextField();
        textstate.setBounds(300,640,400,30);
        textstate.setFont(new Font("Times New Roman",Font.BOLD,14));
        add(textstate);


        next=new JButton("Next");
        next.setFont(new Font("Times New Roman",Font.BOLD,15));
        next.setBounds(620,710,80,30);
        next.setForeground(Color.white);
        next.setBackground(Color.black);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,225,228,0));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
    String form=first;
    String name=text1.getText();
    String fathername=text2.getText();
   String dob=((JTextField)DataChoose.getDateEditor().getUiComponent()).getText();
    String gender=null;
    if(R1.isSelected()){
        gender="Male";
    }
    else if(R2.isSelected()){
        gender="Female";
    }
    String email=emailtext.getText();
    String martialStatus=null;
    if(M1.isSelected()){
        martialStatus="Married";
    } else if (M2.isSelected()) {
        martialStatus="Unmarried";
    }else if (M3.isSelected()) {
        martialStatus="Other";
    }
    String address=textadd.getText();
    String city=tetxcity.getText();
     String pincode=textpin.getText();
     String state=textstate.getText();

     try{
        if(text1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter your name");
        } else if (text2.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Please enter your fathername");
        } else if (emailtext.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Please enter your email");
        } else if (textadd.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Please enter your address");
        }else if (tetxcity.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Please enter your city");
        }else if (textpin.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Please enter your pincode");
        }
        else if (textstate.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Please enter your state");
        }
       // else if(((JTextField)DataChoose.getDateEditor().getUiComponent()).getText().equals("")){
           // JOptionPane.showMessageDialog(null,"Please enter your date of birth");
       // }

        else{
            con conn=new con();
            String q = "insert into signup values('"+form+"','"+name+"','"+fathername+"','"+dob+"','"+gender+"','"+email+"','"+martialStatus+"','"+address+"','"+city+"','"+pincode+"','"+state+"');";

            conn.statement.executeUpdate(q);
           new signup2(form);
            setVisible(false);
        }
     }catch(Exception ex){
         ex.printStackTrace();
     }


    }
    public static void main(String[] args) {
        new Sign();
    }

}
