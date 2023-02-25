
package bank.management.system;

import javax.swing.*;
import java.awt.*;//for image
import java.awt.event.*;//action listenner is in event



public class Login  extends JFrame implements ActionListener{
    //now for button action we need to define them globally because their static in login constructor
      JButton signin,clr,signup;//global defined buttons!
       JTextField cardtxtf;
       JPasswordField pswdtxtf;//,pswdtxtf;
       //to hide the passowrd field well use JPasswordField therefore will init with
      
       
    Login(){//login cnstructor
        setTitle("A-T-M");//title function
        setLayout(null);//for icon setting swings set the layout null
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));//function to set the logo from the system
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);//to scale and place it in jlael
        JLabel lbel=new JLabel(i3);//makes object of the img
        lbel.setBounds(70,10,100,100);//4 arguments left to align the img a corect possition
       add(lbel);//adds label on the frame
       getContentPane().setBackground(Color.GRAY);//gets the frame then sets the bg as black.
        //now we need to set the label for welcome!
        //now well use jabel for this
        JLabel txt=new JLabel("WELCOME TO TCSC BANK!");//txt is added
        //now to make it visible on the frame
        txt.setFont(new Font("Osward",Font.BOLD,38));//here we set the font and size by creating object of th font
        txt.setBounds(200,40,600,40);//setting the bound on the frame
        add(txt);
        ///////CARD NO TEXT///////////////
         JLabel cardno=new JLabel("CARD NO:");//txt is added
        //now to make it visible on the frame
        cardno.setFont(new Font("Raleway",Font.BOLD,28));//here we set the font and size by creating object of th font
        cardno.setBounds(130,150,150,40);//setting the bound on the frame
        add(cardno);
        
        ///////////cardno textfield/////////////
        cardtxtf=new JTextField();
        cardtxtf.setBounds(300,150,250,30);  
        cardtxtf.setFont(new Font("arieal",Font.PLAIN,20));
        add(cardtxtf);
        
        //////////////PIN TEXT///////////////////
         JLabel pswd=new JLabel("PIN:");//txt is added
        //now to make it visible on the frame
        pswd.setFont(new Font("Raleway",Font.BOLD,28));//here we set the font and size by creating object of th font
        pswd.setBounds(130,220,150,40);//setting the bound on the frame
        add(pswd);
        //j is used at start because it is wing framework!
        
         ///////////pswd textfield/////////////
       pswdtxtf=new JPasswordField();
       pswdtxtf.setBounds(300,220,250,30);  
        pswdtxtf.setFont(new Font("arieal",Font.PLAIN,20));
        add(pswdtxtf);
        
        //////now we'll create signin buttons////////////////
        signin=new JButton("SIGN-IN");
        signin.setBounds(300,300,100,30);
        signin.setFont(new Font("ariel",Font.BOLD,10));
        signin.setBackground(Color.black);
        signin.setForeground(Color.YELLOW);
        signin.addActionListener(this);//event listener fn or button
        add(signin);
        
         //////now we'll create  clear buttons////////////////
        clr=new JButton("CLEAR");
        clr.setBounds(450,300,100,30);
        clr.setFont(new Font("ariel",Font.BOLD,10));
        clr.setBackground(Color.black);
        clr.setForeground(Color.YELLOW);
        clr.addActionListener(this);//event listener fn or button
        add(clr);
        
          //////now we'll create SIGNUP clear buttons////////////////
       signup=new JButton("SIGN-UP");
        signup.setBounds(300,345,250,30);
        signup.setFont(new Font("ariel",Font.BOLD,10));
        signup.setBackground(Color.black);
        signup.setForeground(Color.YELLOW);
        signup.addActionListener(this);//event listener fn or button
        add(signup);
        
        
        
        //now we wiil add action listenner from awt which is a interface
 //in event fucntion in awt class         
        
        


        setSize(800,480);   //sets size of the frame
        setVisible(true);//shows the frame
        setLocation(150,100);//changes the location of frame openning
  }//constructor end

    
    //now we ned to override the method event listenner define in event.actiolisttenner
    public void actionPerformed(ActionEvent ae){//because we need to override abstratc classes in the interface
     //now what we need to as action well define this what the buttons will do as their action
    //now we need to define function of the buttons but we need to know which button has been clicked for that we ACTION EVENT CLASS!
    if(ae.getSource()==clr){
        cardtxtf.setText("");//here whatever we enter it will write tht but since its clear button well leave it as empty
        pswdtxtf.setText("");
    
    
    }//source like which button
    else if(ae.getSource()==signin){
    }
    else if(ae.getSource()==signup){
    }//inside this conditions we can work on every button action but before that we need to make the text field global
    //now for sigin first we need to create user for tht we nedd to create frame of signup!
    
    
    }
    public static void main(String[] args) {
        new Login();}}


