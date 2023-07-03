package bank.management.system;

import javax.swing.*;//to import jrame
import java.awt.*;// to import image class
import java.awt.event.*;// to remove the error of action listner
import java.awt.event.ActionListener;
import java.sql.*;


public class Login extends JFrame implements ActionListener {
    
    JTextField cardTextField;   // all these to create outside the object get the scope of it
    JPasswordField pinTextField;
    JButton login,signup,clear;
    
    Login(){
        
        
        
        setTitle("ATM");//giving tittle to the Frame 4
        
        
        setLayout(null);// to change the default grid to custom grid 11
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));//  5 adding image to code
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);//scale image 7
        ImageIcon i3=new ImageIcon(i2);//to again convert image to image icon 8
        
        JLabel label=new JLabel(i3);//cant place icon directly on jframe so we use jlabel 6
        add(label);//to add jlabel we have to add the object to add to see it 9
        label.setBounds(70,10,100,100);//to change the positon of the image 10
        
        
        JLabel text= new JLabel("WELCOME TO ATM");//13 to write heading or content
        text.setFont(new Font("Osward", Font.BOLD, 38));// to wchnage the fonts and size 15
        text.setBounds(200,40,450,40); //to show the content 14
        add(text);
        
        JLabel cardno= new JLabel("Card No:");//13 to write heading or content//repeat
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));// to wchnage the fonts and size 14
        cardno.setBounds(120,150,400,40); //to show the content
        add(cardno);
        
        
        cardTextField = new JTextField();//craeting texfield 16
        cardTextField.setBounds(300,150,250,30);//to show content and its height and all 17
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));// to cange fonts
        add(cardTextField);
        
        JLabel pin = new JLabel("PIN:");//13 to write heading or content //reepear
        pin.setFont(new Font("Raleway", Font.BOLD, 28));// to wchnage the fonts and size 14
        pin.setBounds(120,220,250,30); //to show the content
        add(pin);
        
        pinTextField  = new JPasswordField();//craeting texfield 16
        pinTextField.setBounds(300,220,250,30);//to show content and its height and all 17
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));// to cange fonts
        add(pinTextField);
        
        
        login = new JButton("Login");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);// to provide action on clicking it
        add(login);
        
        clear = new JButton("Clear");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("Sign up");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        
        
        getContentPane().setBackground(Color.WHITE);// to set background color white 12
       
        
        
        
        
        setSize(800,500);//create frame 1
        setVisible(true);//to see the frame its hidden from user 2
        setLocation(350,200);//bring the frame to middle 3
        
        
        
        
        
    }
    
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==clear)
        {
         cardTextField.setText("");
         pinTextField.setText("");   
        }
        else if(ae.getSource()==login)
        {
            Conn conn = new Conn();
            String cardno  = cardTextField.getText();
            String pin  = pinTextField.getText();
            String query  = "select * from login where cardno = '"+cardno+"' and pin = '"+pin+"'";
            
            try{
              ResultSet rs =  conn.s.executeQuery(query);
              if(rs.next())
              {
                  setVisible(false);
                  new Transactions(pin).setVisible(true);
              }
              else{
                  JOptionPane.showMessageDialog(null, "Incorrect Card Number or pin");
              }
            }
            catch (Exception e)
            {
                System.out.println(e);
                
            }
            
        }
        else if(ae.getSource()==signup)
        {
            setVisible(false);
            new SignupOne().setVisible(true);
        }
        
    }
    
    public static void main(String[] args){
        new Login();
    }
}
