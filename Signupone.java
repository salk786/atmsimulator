package bank.management.system;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
public class Signupone extends JFrame implements ActionListener{

 JLabel apform,pd,nm,fatnm,dobi,gende,mail,marr,add,ct,pinc,stat,dat,mon,yr
         ;
 JTextField nmtxf,ftnmtzxf,dobtxf,mailtxf,adtxf,cttxtf,pinctxf,sttxf;
 JRadioButton r1,r2,r3,r4,r5;
 JButton b;
 JDateChooser dateChooser;


 Random ran = new Random();
 long first4 = (ran.nextLong() % 9000L) + 1000L;
 String first = "" + Math.abs(first4);

 Signupone(){

 setTitle("NEW ACCOUNT APPLICATION FORM");

 
 apform= new JLabel("APPLICATION FORM NO. "+first);
 apform.setFont(new Font("Raleway", Font.BOLD, 38));

  pd= new JLabel("Page 1: Personal Details");
 pd.setFont(new Font("Raleway", Font.BOLD, 22));

 nm = new JLabel("Name:");
 nm.setFont(new Font("Raleway", Font.BOLD, 20));

 fatnm = new JLabel("Father's Name:");
 fatnm.setFont(new Font("Raleway", Font.BOLD, 20));

 dobi = new JLabel("Date of Birth:");
 dobi.setFont(new Font("Raleway", Font.BOLD, 20));

 gende = new JLabel("Gender:");
 gende.setFont(new Font("Raleway", Font.BOLD, 20));

 mail = new JLabel("Email Address:");
 mail.setFont(new Font("Raleway", Font.BOLD, 20));

 marr = new JLabel("Marital Status:");
 marr.setFont(new Font("Raleway", Font.BOLD, 20));

 add = new JLabel("Address:");
 add.setFont(new Font("Raleway", Font.BOLD, 20));

 ct = new JLabel("City:");
 ct.setFont(new Font("Raleway", Font.BOLD, 20));

 pinc = new JLabel("Pin Code:");
 pinc.setFont(new Font("Raleway", Font.BOLD, 20));

 stat = new JLabel("State:");
 stat.setFont(new Font("Raleway", Font.BOLD, 20));

 dat = new JLabel("Date");
 dat.setFont(new Font("Raleway", Font.BOLD, 14));

 mon = new JLabel("Month");
 mon.setFont(new Font("Raleway", Font.BOLD, 14));

 yr = new JLabel("Year");
 yr.setFont(new Font("Raleway", Font.BOLD, 14));


 nmtxf = new JTextField();
 nmtxf.setFont(new Font("Raleway", Font.BOLD, 14));

 ftnmtzxf = new JTextField();
 ftnmtzxf.setFont(new Font("Raleway", Font.BOLD, 14));

 dobtxf = new JTextField();
 dobtxf.setFont(new Font("Raleway", Font.BOLD, 14));

 mailtxf = new JTextField();
 mailtxf.setFont(new Font("Raleway", Font.BOLD, 14));

 adtxf= new JTextField();
 adtxf.setFont(new Font("Raleway", Font.BOLD, 14));

 cttxtf = new JTextField();
 cttxtf.setFont(new Font("Raleway", Font.BOLD, 14));

 pinctxf = new JTextField();
 pinctxf.setFont(new Font("Raleway", Font.BOLD, 14));



 b = new JButton("Next");
 b.setFont(new Font("Raleway", Font.BOLD, 14));
 b.setBackground(Color.BLACK);
 b.setForeground(Color.WHITE);

 r1 = new JRadioButton("Male");
 r1.setFont(new Font("Raleway", Font.BOLD, 14));
 r1.setBackground(Color.WHITE);

 r2 = new JRadioButton("Female");
 r2.setFont(new Font("Raleway", Font.BOLD, 14));
 r2.setBackground(Color.WHITE);

 ButtonGroup groupgender = new ButtonGroup();
 groupgender.add(r1);
 groupgender.add(r2);

 r3 = new JRadioButton("Married");
 r3.setFont(new Font("Raleway", Font.BOLD, 14));
 r3.setBackground(Color.WHITE);

 r4 = new JRadioButton("Unmarried");
 r4.setFont(new Font("Raleway", Font.BOLD, 14));
 r4.setBackground(Color.WHITE);

 r5 = new JRadioButton("Other");
 r5.setFont(new Font("Raleway", Font.BOLD, 14));
 r5.setBackground(Color.WHITE);

 ButtonGroup groupstatus = new ButtonGroup();
 groupstatus.add(r3);
 groupstatus.add(r4);
 groupstatus.add(r5);

 dateChooser = new JDateChooser();
//dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
dateChooser.setForeground(new Color(105, 105, 105));
dateChooser.setBounds(137, 337, 200, 29);
add(dateChooser);

 setLayout(null);
 apform.setBounds(140,20,600,40);
 add(apform);

 pd.setBounds(290,80,600,30);
 add(pd);

 nm.setBounds(100,140,100,30);
 add(nm);

 nmtxf.setBounds(300,140,400,30);
 add(nmtxf);

 fatnm.setBounds(100,190,200,30);
 add(fatnm);

 ftnmtzxf.setBounds(300,190,400,30);
 add(ftnmtzxf);

 dobi.setBounds(100,240,200,30);
 add(dobi);

 dateChooser.setBounds(300, 240, 400, 30);

 gende.setBounds(100,290,200,30);
 add(gende);

 r1.setBounds(300,290,60,30);
 add(r1);

 r2.setBounds(450,290,90,30);
 add(r2);

 mail.setBounds(100,340,200,30);
 add(mail);

 dobtxf.setBounds(300,340,400,30);
 add(dobtxf);

 marr.setBounds(100,390,200,30);
 add(marr);

 r3.setBounds(300,390,100,30);
 add(r3);

 r4.setBounds(450,390,100,30);
 add(r4);

 r5.setBounds(635,390,100,30);
 add(r5);



 add.setBounds(100,440,200,30);
 add(add);

 mailtxf.setBounds(300,440,400,30);
 add(mailtxf);

 ct.setBounds(100,490,200,30);
 add(ct);

 adtxf.setBounds(300,490,400,30);
 add(adtxf);

 pinc.setBounds(100,540,200,30);
 add(pinc);

 cttxtf.setBounds(300,540,400,30);
 add(cttxtf);

 stat.setBounds(100,590,200,30);
 add(stat);

 pinctxf.setBounds(300,590,400,30);
 add(pinctxf);
 
 sttxf.setBounds(300,590,400,30);
 add(sttxf);


 b.setBounds(620,660,80,30);
 add(b);

 b.addActionListener(this);

 getContentPane().setBackground(Color.WHITE);

 setSize(1000,1500);
 setLocation(200,220);
 setVisible(true);
 }

 public void actionPerformed(ActionEvent ae){

 String formno = first;
 String name = nmtxf.getText();
 String fname = ftnmtzxf.getText();
 String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
 String gender = null;
 if(r1.isSelected()){
 gender = "Male";
 }else if(r2.isSelected()){
 gender = "Female";
 }

 String email = dobtxf.getText();
 String marital = null;
 if(r3.isSelected()){
 marital = "Married";
 }else if(r4.isSelected()){
 marital = "Unmarried";
 }else if(r5.isSelected()){
 marital = "Other";
 }

 String address = mailtxf.getText();
 String city = t5.getText();
 String pincode = cttxtf.getText();
 String state = pinctxf.getText();

 try{

 if(cttxtf.getText().equals("")){
 JOptionPane.showMessageDialog(null, "Fill all the required fields");
 }else{
 Conn c1 = new Conn();
 String q1 = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+
address+"','"+city+"','"+pincode+"','"+state+"')";
 c1.s.executeUpdate(q1);

 }

 }catch(Exception e){
     System.out.println(e);
 }

 }


 public static void main(String[] args){
 new Signupone().setVisible(true);
 }
}
