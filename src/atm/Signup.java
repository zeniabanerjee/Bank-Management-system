
package atm;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser; 

public class  Signup extends JFrame implements ActionListener {
    
long random;
JTextField nametext,fnametext,emailtext,addresstext,citytext,statetext,pintext;
JRadioButton marry,unmarried,male,female;    
JDateChooser datechooser;
JButton next;

 Signup(){
     setLayout(null);
     Random ran=new Random();
     random =Math.abs(ran.nextLong() % 9000L) +1000L;
    
     JLabel formno = new JLabel ("APPLICATION FORM NO.- "+ random);
     formno.setFont(new Font("ALGERIAN", Font.BOLD,27));
     formno.setBounds(150,20,600,40);
     formno.setForeground(Color.WHITE);
     add(formno);
     
     JLabel personal = new JLabel ("Page 1 : Personal Details");
     personal.setFont(new Font("GARAMOND", Font.BOLD,25));
     personal.setBounds(220,65,410,30);
     personal.setForeground(Color.WHITE);
     add(personal);
     
     JLabel name = new JLabel ("Name : ");
     name.setFont(new Font("GARAMOND", Font.PLAIN,23));
     name.setBounds(80,110,200,30);
     name.setForeground(Color.WHITE);
     add(name);
     
     nametext = new JTextField();
     nametext.setFont(new Font("GARAMOND", Font.PLAIN,16));
     nametext.setBounds(300,110,300,30);
     nametext.setBackground(new Color(255,255,255));
     nametext.setForeground(Color.BLACK);
     add(nametext);
     
     JLabel father = new JLabel ("Father's Name : ");
     father.setFont(new Font("GARAMOND", Font.PLAIN,23));
     father.setBounds(80,150,200,30);
     father.setForeground(Color.WHITE);
     add(father);
     
     fnametext = new JTextField();
     fnametext.setFont(new Font("GARAMOND", Font.PLAIN,16));
     fnametext.setBounds(300,150,300,30);
     fnametext.setBackground(new Color(255,255,255));
     fnametext.setForeground(Color.BLACK);
     add(fnametext);
     
     
     JLabel dob = new JLabel ("Date Of Birth : ");
     dob.setFont(new Font("GARAMOND", Font.PLAIN,23));
     dob.setBounds(80,190,200,30);
     dob.setForeground(Color.WHITE);
     add(dob);
     
     datechooser=new JDateChooser();
     datechooser.setBounds(300, 190, 300, 30);
     datechooser.setForeground(new Color(255,255,255));
     add(datechooser);
    
     
     JLabel gender = new JLabel ("Gender : ");
     gender.setFont(new Font("GARAMOND", Font.PLAIN,23));
     gender.setBounds(80,230,200,30);
     gender.setForeground(Color.WHITE);
     add(gender);
     
     male = new JRadioButton("Male");
     male.setBounds(300,230,60,30);
     male.setBackground(new Color(51,0,25));
     male.setForeground(Color.WHITE);
     add(male);
     
     female = new JRadioButton("Female");
     female.setBounds(400,230,70,30);
     female.setBackground(new Color(51,0,25));
     female.setForeground(Color.WHITE);
     add(female);
     
     ButtonGroup gendergroup=new ButtonGroup();
     gendergroup.add(male);
     gendergroup.add(female);
     
     JLabel email = new JLabel ("Email address :");
     email.setFont(new Font("GARAMOND", Font.PLAIN,23));
     email.setBounds(80,270,200,30);
     email.setForeground(Color.WHITE);
     add(email);
     
     
     emailtext = new JTextField();
     emailtext.setFont(new Font("GARAMOND", Font.PLAIN,16));
     emailtext.setBounds(300,270,300,30);
     emailtext.setBackground(new Color(255,255,255));
     emailtext.setForeground(Color.BLACK);
     add(emailtext);
     

     JLabel married = new JLabel ("Marital Status :");
     married.setFont(new Font("GARAMOND", Font.PLAIN,23));
     married.setBounds(80,310,200,30);
     married.setForeground(Color.WHITE);
     add(married);
     
     marry = new JRadioButton("Married");
     marry.setBounds(300,310,80,30);
     marry.setBackground(Color.WHITE);
     marry.setForeground(Color.BLACK);
     marry.setBackground(new Color(51,0,25));
     marry.setForeground(Color.WHITE);
     add(marry);
     
     unmarried = new JRadioButton("Unmarried");
     unmarried.setBounds(400,310,100,30);
     unmarried.setBackground(Color.WHITE);
     unmarried.setForeground(Color.BLACK);
     unmarried.setBackground(new Color(51,0,25));
     unmarried.setForeground(Color.WHITE);
     add(unmarried);
     
     ButtonGroup maritalgroup=new ButtonGroup();
     maritalgroup.add(marry);
     maritalgroup.add(unmarried);
     
     JLabel address = new JLabel ("Address :");
     address.setFont(new Font("GARAMOND", Font.PLAIN,23));
     address.setBounds(80,350,200,30);
     address.setForeground(Color.WHITE);
     add(address);
     
     addresstext = new JTextField();
     addresstext.setFont(new Font("GARAMOND", Font.PLAIN,16));
     addresstext.setBounds(300,350,300,30);
     addresstext.setBackground(new Color(255,255,255));
     addresstext.setForeground(Color.BLACK);
     add(addresstext);
     
     
     JLabel city = new JLabel ("City :");
     city.setFont(new Font("GARAMOND", Font.PLAIN,23));
     city.setBounds(80,390,200,30);
     city.setForeground(Color.WHITE);
     add(city);
     
     citytext = new JTextField();
     citytext.setFont(new Font("GARAMOND", Font.PLAIN,16));
     citytext.setBounds(300,390,300,30);
     citytext.setBackground(new Color(255,255,255));
     citytext.setForeground(Color.BLACK);
     add(citytext);
     
     
     JLabel state = new JLabel ("State :");
     state.setFont(new Font("GARAMOND", Font.PLAIN,23));
     state.setBounds(80,430,200,30);
     state.setForeground(Color.WHITE);
     add(state);
     
     statetext = new JTextField();
     statetext.setFont(new Font("GARAMOND", Font.PLAIN,16));
     statetext.setBounds(300,430,300,30);
     statetext.setBackground(new Color(255,255,255));
     statetext.setForeground(Color.BLACK);
     add(statetext);
     
     
     JLabel pin = new JLabel ("Pin Code :");
     pin.setFont(new Font("GARAMOND", Font.PLAIN,23));
     pin.setBounds(80,470,200,30);
     pin.setForeground(Color.WHITE);
     add(pin);
     
     pintext = new JTextField();
     pintext.setFont(new Font("GARAMOND", Font.PLAIN,16));
     pintext.setBounds(300,470,300,30);
     pintext.setBackground(new Color(255,255,255));
     pintext.setForeground(Color.BLACK);
     add(pintext);
     
     next = new JButton("NEXT");
     next.setBackground(Color.WHITE);
     next.setForeground(new Color(51,0,25));
     next.setFont(new Font("GARAMOND",Font.BOLD,18));
     next.setBounds(500,550,100,40);
     next.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.green, Color.yellow, Color.blue));
     next.addActionListener(this);
     add(next);
     
     getContentPane().setBackground(new Color(51,0,25));
     
     setSize(700,670);
     setLocation(300,0);
     setVisible(true);
    }
 public void actionPerformed (ActionEvent ae){
     String formno=""+random;//typecast
     String name=nametext.getText();
     String fname=fnametext.getText();
     String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
     String gender = null;
     if(male.isSelected()){
         gender="Male";
     } else if(female.isSelected()){
         gender="Female";
     }
     String email = emailtext.getText();
     String marital="";
     if(marry.isSelected()){
         marital="Married";
     } else if(unmarried.isSelected()){
         marital="Unmarried";
     }
     String address=addresstext.getText();
     String city=citytext.getText();
     String state=statetext.getText();
     String pin=pintext.getText();
     
 
     try{
         if(name.equals("")){
             JOptionPane.showMessageDialog(null, "Name is Required");
         }
         else{
             Conn c=new Conn();
             String query="Insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
             c.s.executeUpdate(query);
             setVisible(false);
              new SignupTwo(formno).setVisible(true);
         }
     }catch(Exception e){
         System.out.print(e);
     }
     
 }
    public static void main(String args[]){
        new Signup();
    }   
}
