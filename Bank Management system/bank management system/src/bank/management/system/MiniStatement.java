
package bank.management.system;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;



public class MiniStatement extends JFrame  {
    
    
    JLabel bank,mini,card,balance;
    String pin;
    
    MiniStatement(String pin)
    {
        this.pin=pin;
        
        setTitle("Mini Statement");
        
        setLayout(null);
        
        
        
        mini = new JLabel();
        add(mini);
        
        
        bank= new JLabel("Indian Bank");//13 to write heading or content
        bank.setBounds(150,20,100,20); //to show the content 14
        add(bank);
        
         
        card= new JLabel();//13 to write heading or content
        card.setBounds(20,80,300,20); //to show the content 14
        add(card);
        
        balance= new JLabel();//13 to write heading or content
        balance.setBounds(20,400,300,20); //to show the content 14
        add(balance);
        
        
        try{
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from login where pin = '"+pin+"'");
            while(rs.next()){
                card.setText("Card Number:    " + rs.getString("cardno").substring(0, 4) + "XXXXXXXX" + rs.getString("cardno").substring(12));
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
        
        try{
            int bal = 0;
            Conn conn  = new Conn();
            ResultSet rs = conn.s.executeQuery("SELECT * FROM bank where pin = '"+pin+"'");
            while(rs.next()){
                mini.setText(mini.getText() + "<html>"+rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                if(rs.getString("type").equals("Deposit")){
                    bal += Integer.parseInt(rs.getString("amount"));
                }else{
                    bal -= Integer.parseInt(rs.getString("amount"));
                }
            }
            balance.setText("Your total Balance is Rs "+bal);
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        mini.setBounds(20, 140, 400, 200);
        
        
       
      
        
        
        
        
        setSize(400,600);//create frame 1
        setLocation(20,20);//bring the frame to middle 3
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    
    
    
     public static void main(String[] args){
        new MiniStatement("");
    }
}
