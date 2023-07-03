
package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;//to import jrame 3
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener{// 4
    
    
    long random;
    JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,pinTextField,stateTextField;
    JButton next;
    JRadioButton male,female,married,unmarried,other;
    JDateChooser dateChooser ;
    SignupOne(){
        
        setLayout(null);// to put it on centre
        
        Random ran=new Random();// to generate random no.
        random = Math.abs((ran.nextLong() % 9000L) + 1000L); //used math abs to avoid nagtive no. get a long number of 4 digit and divide to get small
        
        JLabel formno = new JLabel("APPLICATION FORM NO. "+random);// to write the application form font
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        JLabel personalDetails = new JLabel("Page 1: Personal Details");// to write the application form font
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);
        
        JLabel Name = new JLabel("Name:");// to write the application form font
        Name.setFont(new Font("Raleway", Font.BOLD, 20));
        Name.setBounds(110, 140, 100, 30);
        add(Name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        
        JLabel fName = new JLabel(" Father's Name:");// to write the application form font
        fName.setFont(new Font("Raleway", Font.BOLD, 20));
        fName.setBounds(100, 190, 200, 30);
        add(fName);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        JLabel Dob = new JLabel(" Date of Birth:");// to write the application form font
        Dob.setFont(new Font("Raleway", Font.BOLD, 20));
        Dob.setBounds(100, 240, 200, 30);
        add(Dob);
        
        
        
        
        dateChooser = new JDateChooser();//dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
	dateChooser.setForeground(new Color(105, 105, 105));
	dateChooser.setBounds(300, 240, 200, 30);
	add(dateChooser);
        
        
        
        JLabel gender = new JLabel(" Gender:");// to write the application form font
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        
        male = new JRadioButton("Male");
        male.setFont(new Font("Raleway", Font.BOLD, 14));
        male.setBackground(Color.WHITE);
        male.setBounds(300,290,60,30);
        add(male);
        
        female = new JRadioButton("Female");
        female.setFont(new Font("Raleway", Font.BOLD, 14));
        female.setBackground(Color.WHITE);
        female.setBounds(490,290,100,30);
        add(female);
        
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        
        JLabel email = new JLabel(" Email Address:");// to write the application form font
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        
        JLabel marital = new JLabel(" Marital Status:");// to write the application form font
        marital .setFont(new Font("Raleway", Font.BOLD, 20));
        marital .setBounds(100, 390, 200, 30);
        add(marital );
        
        married = new JRadioButton("Married");
        married.setFont(new Font("Raleway", Font.BOLD, 14));
        married.setBackground(Color.WHITE);
        married.setBounds(300,390,100,30);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setFont(new Font("Raleway", Font.BOLD, 14));
        unmarried.setBackground(Color.WHITE);
        unmarried.setBounds(420,390,100,30);
        add(unmarried);
        
        other = new JRadioButton("Other");
        other.setFont(new Font("Raleway", Font.BOLD, 14));
        other.setBackground(Color.WHITE);
        other.setBounds(560,390,100,30);
        add(other);
         
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
        
        
        
        JLabel address = new JLabel(" Address:");// to write the application form font
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        
        
        JLabel city = new JLabel("City:");// to write the application form font
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 100, 30);
        add(city);
        
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        
        JLabel pin = new JLabel("Pin Code:");// to write the application form font
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        pin.setBounds(100, 540, 200, 30);
        add(pin);
        
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pinTextField.setBounds(300,540,400,30);
        add(pinTextField);
        
        
        JLabel state = new JLabel("State:");// to write the application form font
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 590, 200, 30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300,590,400,30);
        add(stateTextField);
        
        
        
        
        
        

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);

        
        
        
        
        
        
        
        
        
        getContentPane().setBackground(Color.WHITE);// to set background color white phase 5
        
        setSize(850,800);//set jframe 2
        setLocation(350,10);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno="" +random;//long 
        String name=nameTextField.getText();//set text
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
          if(male.isSelected()){ 
            gender = "Male";
        }else if(female.isSelected()){ 
            gender = "Female";
        }
        String email = emailTextField.getText();
        String marital = null;
        if(married.isSelected()){ 
            marital = "Married";
        }else if(unmarried.isSelected()){ 
            marital = "Unmarried";
        }else if(other.isSelected()){ 
            marital = "Other";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String pincode = pinTextField.getText();
        String state = stateTextField.getText();
        
        
         try{
           
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }
            else{
                Conn c= new Conn();
                String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
                
                
            }
            
        }
        catch(Exception e){
             System.out.println(e);
        }
        
    }
        
        
        
    
    
  public static void main(String[] args){
        
        
        new SignupOne(); //create object 1
    }
}
    
