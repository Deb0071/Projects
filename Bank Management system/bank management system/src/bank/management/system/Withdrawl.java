
package bank.management.system;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;



public class Withdrawl extends JFrame implements ActionListener {
    
    JLabel text,image;
    JTextField amount;
    JButton Withdraw,back;
    String pin;
    
    Withdrawl(String pin)
    
    {
        this.pin=pin;
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        image= new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        
        
        text = new JLabel("ENTER AMOUNT YOU WANT TO Withdraw");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(170, 300, 400, 20);
        image.add(text);
        
        
        
        
        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 22));
        amount.setBounds(170, 350, 320, 25);
        image.add(amount);
        
        
        Withdraw= new JButton("Withdraw");
        Withdraw.setBounds(355, 485, 150, 30);
        Withdraw.addActionListener(this);
        image.add(Withdraw);
        
        
        back = new JButton("BACK");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);

        
        
        
        setSize(900,900);
        setUndecorated(true);
        setLocation(100,0);
        setVisible(true);
        
        
        
        
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==Withdraw)
        {
            String number = amount.getText();
            Date date = new Date();
            if(number.equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Withdraw");
                }
            else
            {
                try {
                Conn conn = new Conn();
                String query="insert into bank values('"+pin+"', '"+date+"', 'Withdrawl', '"+number+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs. "+number+" Withdrawl Successfully");
                setVisible(false);
                new Transactions(pin).setVisible(true);
               }catch(Exception e){
                   System.exit(0);
        }
                
                new Transactions(pin).setVisible(true);
            }
        }
        else if(ae.getSource()==back)
        {
            setVisible(false);
             new Transactions(pin).setVisible(true);
        }
        
    
    
    
    
    
    
    }
    
    
    
    public static void main(String[] args)
    {
        new Withdrawl("");
    }
    
}
