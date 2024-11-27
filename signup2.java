package ATM.MANAGMENT.SYSTEM;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup2 extends JFrame implements ActionListener {
    JTextField PANtext,Adhartext,SCtext;
    String form;
    JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9;
    JButton next;
    JComboBox comboBox,Combo2,Combo3,Combo4,combo5,Combo6,Combo7,Combo8,Combo9;
    public signup2(String form){
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICON/bank.png"));
        Image I2= i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(I2);
        JLabel label1 = new JLabel(i2);
        label1.setBounds(150,5,100,100);
        add(label1);
        this.form = form;

        JLabel label2 = new JLabel("Page 2");
        label2.setBounds(300,30,600,40);
        label2.setFont(new Font("Times New Roman", Font.BOLD, 22));
        add(label2);

        JLabel label3 = new JLabel("ADDITIONAL DETAILS");
        label3.setBounds(300,60,600,40);
        label3.setFont(new Font("Times New Roman", Font.BOLD, 22));
        add(label3);

        JLabel label4= new JLabel("Religion");
        label4.setBounds(160,150,600,40);
        label4.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(label4);
        
        String religion[]={"HINDU","MUSLIM","Sikh","Christian","other"};
         comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(230,230,230));
        comboBox.setBounds(350,150,320,30);
        comboBox.setFont(new Font("Times New Roman", Font.BOLD, 16));
        add(comboBox);

        JLabel label5=new JLabel("Category");
        label5.setBounds(160,210,100,30);
        label5.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(label5);

        String[]Category={"General","OBC","SC","ST","other"};
         Combo2 = new JComboBox(Category);
        Combo2.setBackground(new Color(230,230,230));
       Combo2.setBounds(350,210,320,30);
        Combo2.setFont(new Font("Times New Roman", Font.BOLD, 16));
        add(Combo2);

        JLabel label6=new JLabel("Income");
        label6.setBounds(160,270,100,30);
        label6.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(label6);

        String income[]={"null","<1,50,000","<2,50,000","5,00,000","Upto 10,00,000","Above 10,00,000"};
         Combo3 = new JComboBox(income);
        Combo3.setBackground(new Color(230,230,230));
        Combo3.setBounds(350,270,320,30);
        Combo3.setFont(new Font("Times New Roman", Font.BOLD, 16));
        add(Combo3);

        JLabel label7=new JLabel("Education");
        label7.setBounds(160,330,100,30);
        label7.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(label7);

        String Education[]={"Non-Graduate","Graduate","post-Graduate","Doctorate","Other"};
         Combo4 = new JComboBox(Education);
        Combo4.setBackground(new Color(230,230,230));
        Combo4.setBounds(350,330,320,30);
        Combo4.setFont(new Font("Times New Roman", Font.BOLD, 16));
        add(Combo4);


        JLabel label8=new JLabel("Occupation");
        label8.setBounds(160,390,100,30);
        label8.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(label8);

        String Occupation[]={"Salaried","Self-employed","Business","Retired","Other"};
         combo5 = new JComboBox(Occupation);
        combo5.setBackground(new Color(230,230,230));
        combo5.setBounds(350,390,320,30);
        combo5.setFont(new Font("Times New Roman", Font.BOLD, 16));
        add(combo5);

        JLabel PAN=new JLabel("Pan Number");
        PAN.setBounds(160,450,150,30);
        PAN.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(PAN);

        PANtext=new JTextField();
        PANtext.setBounds(350,450,320,30);
        PANtext.setFont(new Font("Times New Roman", Font.BOLD, 16));
        add(PANtext);

        JLabel AdharNO=new JLabel("Adhar No");
        AdharNO.setBounds(160,510,150,30);
        AdharNO.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(AdharNO);

        Adhartext=new JTextField();
        Adhartext.setBounds(350,510,320,30);
        Adhartext.setFont(new Font("Times New Roman", Font.BOLD, 16));
        add(Adhartext);

        JLabel SeniorCitizen=new JLabel("Senior Citizen");
        SeniorCitizen.setBounds(160,570,150,30);
        SeniorCitizen.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(SeniorCitizen);

        r1=new JRadioButton("yes");
        r1.setBounds(350,570,50,30);
        r1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(r1);
        r2=new JRadioButton("no");
        r2.setBounds(510,570,50,30);
        r2.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(r2);

        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JLabel ExistingAccount=new JLabel("Existing Account");
        ExistingAccount.setBounds(160,630,150,30);
        ExistingAccount.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(ExistingAccount);

        r3=new JRadioButton("yes");
        r3.setBounds(350,630,50,30);
        r3.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(r3);
        r4=new JRadioButton("no");
        r4.setBounds(510,630,50,30);
        r4.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(r4);

        ButtonGroup bG=new ButtonGroup();
        bg.add(r3);
        bg.add(r4);

        JLabel FORM=new JLabel("FORM NO :");
        FORM.setBounds(650,10,160,28);
        FORM.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(FORM);

        JLabel FORM1=new JLabel(form);
        FORM1.setBounds(760,12,180,20);
        FORM1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(FORM1);

        next=new JButton("NEXT");
        next.addActionListener(this);
        next.setFont(new Font("Times New Roman", Font.BOLD, 18));
        next.setForeground(Color.BLACK);
        next.setBackground(new Color(230,230,230));
        next.setBounds(640,650,100,30);
        add(next);

    setLayout(null);
    setSize(850,750);
    setLocation(450,80);
    getContentPane().setBackground(new Color(252,208,76));
    setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String rel=(String)comboBox.getSelectedItem();
        String cate=(String)Combo2.getSelectedItem();
        String income=(String)Combo3.getSelectedItem();
        String education=(String)Combo4.getSelectedItem();
        String occ=(String)combo5.getSelectedItem();
        String pan=PANtext.getText();
        String Adhar=Adhartext.getText();
        String Citizen=null;
        if(r1.isSelected()){
            Citizen="yes";
        }
        else if(r2.isSelected()){
            Citizen="no";
        }
        String eAccount=" ";
        if(r3.isSelected()){
            eAccount="yes";
        }else if(r4.isSelected()){
            eAccount="no";
        }
        try {
            if (PANtext.getText().equals("") || Adhartext.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter All Fields");
            } else {
              con c1=new con();
              String q="insert into Signup2 values('"+form+"','"+rel+"','"+cate+"','"+income+"','"+education+"','"+occ+"','"+ pan+"','"+Adhar+"','"+Citizen+"','"+eAccount+"');";
              c1.statement.executeUpdate(q);
              new signup3(form);
              setVisible(false);
            }
        }catch (Exception e1) {
            e1.printStackTrace();

        }
    }
    public static void main(String[] args) {
    new signup2("");
    }
}
