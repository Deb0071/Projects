
package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;//to import jrame 3
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{// 4
    
    
    JTextField pan,adhar,pinTextField,stateTextField;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion, category,income,education,occupation;
    String formno;
    SignupTwo(String formno){
        this.formno=formno;
        
        setLayout(null);// to put it on centre
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        
        JLabel AdditionalDetails = new JLabel("Page 2: Additional Details");// to write the application form font
        AdditionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        AdditionalDetails.setBounds(290, 80, 400, 30);
        add(AdditionalDetails);
        
        JLabel Religion = new JLabel("Religion");// to write the application form font
        Religion.setFont(new Font("Raleway", Font.BOLD, 20));
        Religion.setBounds(100, 140, 100, 30);
        add(Religion);
        
        String valreligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        religion = new JComboBox(valreligion);
        religion.setBackground(Color.WHITE);
        religion.setFont(new Font("Raleway", Font.BOLD, 14));
        religion.setBounds(300,140,400,30);
        add(religion);
        
        
        JLabel Category = new JLabel(" Category");// to write the application form font
        Category.setFont(new Font("Raleway", Font.BOLD, 20));
        Category.setBounds(100, 190, 200, 30);
        add(Category);
        
        String valcategory[] = {"General","OBC","SC","ST","Other"};
        category = new JComboBox(valcategory);
        category.setBackground(Color.WHITE);
        category.setFont(new Font("Raleway", Font.BOLD, 14));
        category.setBounds(300,190,400,30);
        add(category);
        
        JLabel Income = new JLabel(" Income");// to write the application form font
        Income.setFont(new Font("Raleway", Font.BOLD, 20));
        Income.setBounds(100, 240, 200, 30);
        add(Income);
        
        String valincome[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        income = new JComboBox(valincome);
        income.setBackground(Color.WHITE);
        income.setFont(new Font("Raleway", Font.BOLD, 14));
        income.setBounds(300,240,400,30);
        add(income);
        
        
        JLabel Education = new JLabel("Education");// to write the application form font
        Education.setFont(new Font("Raleway", Font.BOLD, 20));
        Education.setBounds(100, 290, 200, 30);
        add(Education);
        
        JLabel Qualification = new JLabel("Qualification:");// to write the application form font
        Qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        Qualification.setBounds(100, 326, 200, 30);
        add(Qualification);
        
        
        String valeducation[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        education = new JComboBox(valeducation);
        education.setBackground(Color.WHITE);
        education.setFont(new Font("Raleway", Font.BOLD, 14));
        education.setBounds(300,315,400,30);
        add(education);
        
        
        
        JLabel Occupation = new JLabel("Occupation:");// to write the application form font
        Occupation .setFont(new Font("Raleway", Font.BOLD, 20));
        Occupation .setBounds(100, 390, 200, 30);
        add(Occupation );
        
        String valoccupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        occupation = new JComboBox(valoccupation);
        occupation.setBackground(Color.WHITE);
        occupation.setFont(new Font("Raleway", Font.BOLD, 14));
        occupation.setBounds(300,390,400,30);
        add(occupation);
        
        
        JLabel address = new JLabel("PAN Number:");// to write the application form font
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300,440,400,30);
        add(pan);
        
        
        
        JLabel city = new JLabel("Aadhar Number:");// to write the application form font
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);
        
        
        adhar = new JTextField();
        adhar.setFont(new Font("Raleway", Font.BOLD, 14));
        adhar.setBounds(300,490,400,30);
        add(adhar);
        
        
        JLabel SeniorCitizen = new JLabel("Senior Citizen:");// to write the application form font
        SeniorCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        SeniorCitizen.setBounds(100, 540, 200, 30);
        add(SeniorCitizen);
            
        
        syes= new JRadioButton("Yes");
        syes.setFont(new Font("Raleway", Font.BOLD, 14));
        syes.setBackground(Color.WHITE);
        syes.setBounds(300,540,100,30);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setFont(new Font("Raleway", Font.BOLD, 14));
        sno.setBackground(Color.WHITE);
        sno.setBounds(420,540,100,30);
        add(sno);
         
        
        ButtonGroup smaritalgroup = new ButtonGroup();
        smaritalgroup.add(syes);
        smaritalgroup.add(sno);
        
        
        
        JLabel ExistingAccount = new JLabel("Existing Account:");// to write the application form font
        ExistingAccount.setFont(new Font("Raleway", Font.BOLD, 20));
        ExistingAccount.setBounds(100, 590, 200, 30);
        add(ExistingAccount);
        
        eyes= new JRadioButton("Yes");
        eyes.setFont(new Font("Raleway", Font.BOLD, 14));
        eyes.setBackground(Color.WHITE);
        eyes.setBounds(300,590,100,30);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setFont(new Font("Raleway", Font.BOLD, 14));
        eno.setBackground(Color.WHITE);
        eno.setBounds(420,590,100,30);
        add(eno);
         
        
        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);
        
        
       
        
        

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
        String Religion=(String) religion.getSelectedItem();//set text
        String Category = (String) category.getSelectedItem();
        String Income = (String) income.getSelectedItem();
        String Education = (String) education.getSelectedItem();
        String Occupation = (String) occupation.getSelectedItem();
        String Seniorcitizen=null;
          if(syes.isSelected()){ 
            Seniorcitizen = "Male";
        }else if(sno.isSelected()){ 
            Seniorcitizen = "Female";
        }
          
        String ExistingAccount = null;
        if(eyes.isSelected()){ 
            ExistingAccount = "Yes";
        }else if(eno.isSelected()){ 
            ExistingAccount = "No";
        }
        
        
        String Pan = pan.getText();
        String Adhar = adhar.getText();
        
        
         try {
                Conn c= new Conn();
                String query = "insert into signuptwo values('"+formno+"','"+Religion+"','"+Category+"','"+Income+"','"+Education+"','"+Occupation+"','"+Pan+"','"+Adhar+"','"+Seniorcitizen+"','"+ExistingAccount+"')";
                c.s.executeUpdate(query);
                
                
                //signupthree object
                
                setVisible(false);
                new SignupThree(formno).setVisible(true);
                
                
                
            }
            catch(Exception e)
            {
             System.out.println(e);
             }
        
    }
        
        
        
    
    
  public static void main(String[] args){
        
        
        new SignupTwo(""); //create object 1
    }
}
    
