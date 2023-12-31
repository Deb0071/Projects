
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{
    
    JLabel text;
    JButton deposit,withdrawl,fastcash,mini,pch,be,exit;
    String pin;
    
    FastCash(String pin){
        
        this.pin=pin;
        
        setLayout(null);
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        
        
        text = new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
        
        
        deposit = new JButton("Rs 100");
     
        deposit.setBounds(170, 415, 150, 30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl = new JButton("Rs 500");
  
        withdrawl.setBounds(355, 415, 150, 30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastcash = new JButton("Rs 1000");
        
        fastcash.setBounds(170, 450, 150, 30);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        mini = new JButton("Rs 2000");
     
        mini.setBounds(355, 450, 150, 30);
        mini.addActionListener(this);
        image.add(mini);
        
        pch = new JButton("Rs 5000");
        
        pch.setBounds(170, 485, 150, 30);
        pch.addActionListener(this);
        image.add(pch);
        
        be = new JButton("Rs 10000");
        
        be.setBounds(355, 485, 150, 30);
        be.addActionListener(this);
        image.add(be);
        
        exit = new JButton("BACK");
        
        exit.setBounds(355, 520, 150, 30);
        exit.addActionListener(this);
        image.add(exit);
        
        
        
        
        
        setSize(900,900);//set jframe 2
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
    }
    
    
     public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==exit){ 
            setVisible(false);
            new Transactions(pin).setVisible(true);
        }else {
                String amount = ((JButton)ae.getSource()).getText().substring(3);
                Conn c = new Conn();
                try {
                    ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pin+"'");
                       int balance=0;
                       while (rs.next()) {
                       if (rs.getString("type").equals("Deposit")) {
                       balance += Integer.parseInt(rs.getString("amount"));
                }      else {
                       balance -= Integer.parseInt(rs.getString("amount"));
                }
               
                 } 
                  if (ae.getSource() != exit && balance < Integer.parseInt(amount)) {
                JOptionPane.showMessageDialog(null, "Insuffient Balance");
                return;
                  }
                 Date date = new Date();
                String query="insert into bank values('"+pin+"', '"+date+"', 'Withdrawl', '"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
                
                setVisible(false);
                new Transactions(pin).setVisible(true);
                
                    
                }catch (Exception e) {
                 System.out.println(e);
            }
        
    } 
  }
    
    
    
    public static void main(String[] args)
    {
        new FastCash("");
    }
    
    
}
