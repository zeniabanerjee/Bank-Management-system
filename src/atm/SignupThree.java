
package atm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener {
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton cancel,submit;
    String formno;
    
    SignupThree(String formno){
        this.formno = formno;
        
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
        
        JLabel l1=new JLabel("Page 3 : Account Details");
        l1.setFont(new Font("Garamond", Font.BOLD,28));
        l1.setForeground(Color.white);
        l1.setBounds(220,30,400,40);
        add(l1);
        
        JLabel type=new JLabel("Account Type");
        type.setFont(new Font("Garamond", Font.PLAIN,22));
        type.setForeground(Color.white);
        type.setBounds(80,110,300,40);
        add(type);
        
        r1 = new JRadioButton("Savings Account");
        r1.setBounds(300,110,200,30);
        r1.setForeground(Color.WHITE);
        r1.setFont(new Font("Garamond",Font.PLAIN,18));
        r1.setBackground(new Color(51,0,10));
        add(r1);
     
        r2 = new JRadioButton("Current Account");
        r2.setBounds(500,110,200,30);
        r2.setForeground(Color.WHITE);
        r2.setFont(new Font("Garamond",Font.PLAIN,18));
        r2.setBackground(new Color(51,0,10));
        add(r2);
        
        r3 = new JRadioButton("Recurring Account");
        r3.setBounds(300,140,200,30);
        r3.setForeground(Color.WHITE);
        r3.setFont(new Font("Garamond",Font.PLAIN,18));
        r3.setBackground(new Color(51,0,10));
        add(r3);
        
        r4 = new JRadioButton("Fixed Deposit");
        r4.setBounds(500,140,200,30);
        r4.setForeground(Color.WHITE);
        r4.setFont(new Font("Garamond",Font.PLAIN,18));
        r4.setBackground(new Color(51,0,10));
        add(r4);
     
        ButtonGroup r=new ButtonGroup();
        r.add(r1);
        r.add(r2);
        r.add(r3);
        r.add(r4);
     
        JLabel cno=new JLabel("Card No. :");
        cno.setFont(new Font("Garamond", Font.PLAIN,22));
        cno.setForeground(Color.white);
        cno.setBounds(80,170,200,40);
        add(cno);
        
        JLabel cd=new JLabel("Your 16 digit Card No.");
        cd.setFont(new Font("Garamond", Font.PLAIN,14));
        cd.setForeground(Color.white);
        cd.setBounds(80,200,200,20);
        add(cd);

     
        JLabel no=new JLabel("XXXX - XXXX - XXXX - 4184");
        no.setFont(new Font("RALEWAY", Font.PLAIN,16));
        no.setForeground(Color.white);
        no.setBounds(300,170,400,40);
        add(no);
        
        JLabel pin=new JLabel("PIN :");
        pin.setFont(new Font("Garamond", Font.PLAIN,22));
        pin.setForeground(Color.white);
        pin.setBounds(80,240,200,40);
        add(pin);
        
        JLabel pno=new JLabel("....");
        pno.setFont(new Font("RALEWAY", Font.BOLD,28));
        pno.setForeground(Color.white);
        pno.setBounds(300,233,200,40);
        add(pno);
        
        JLabel pd=new JLabel("Your 4 digit PIN No.");
        pd.setFont(new Font("Garamond", Font.PLAIN,14));
        pd.setForeground(Color.white);
        pd.setBounds(80,270,200,20);
        add(pd);
        
        JLabel service=new JLabel("Services required :");
        service.setFont(new Font("Garamond", Font.PLAIN,22));
        service.setForeground(Color.white);
        service.setBounds(80,330,200,20);
        add(service);
        
        c1=new JCheckBox("ATM Card");
        c1.setFont(new Font("Garamond",Font.PLAIN,16));
        c1.setBounds(80,360,150,30);
        c1.setBackground(new Color(51,0,10));
        c1.setForeground(Color.white);
        add(c1);
        
        c2=new JCheckBox("Email alerts");
        c2.setFont(new Font("Garamond",Font.PLAIN,16));
        c2.setBounds(300,360,200,30);
        c2.setBackground(new Color(51,0,10));
        c2.setForeground(Color.white);
        add(c2);
        
        c3=new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Garamond",Font.PLAIN,16));
        c3.setBounds(80,400,200,30);
        c3.setBackground(new Color(51,0,10));
        c3.setForeground(Color.white);
        add(c3);
        
        c4=new JCheckBox("Internet Banking");
        c4.setFont(new Font("Garamond",Font.PLAIN,16));
        c4.setBounds(300,400,200,30);
        c4.setBackground(new Color(51,0,10));
        c4.setForeground(Color.white);
        add(c4);
        
        c5=new JCheckBox("E - Statement");
        c5.setFont(new Font("Garamond",Font.PLAIN,18));
        c5.setBounds(500,360,200,30);
        c5.setBackground(new Color(51,0,10));
        c5.setForeground(Color.white);
        add(c5);
        
        c6=new JCheckBox("Cheque Book");
        c6.setFont(new Font("Garamond",Font.PLAIN,16));
        c6.setBounds(500,400,200,30);
        c6.setBackground(new Color(51,0,10));
        c6.setForeground(Color.white);
        add(c6);
        
        c7=new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge.");
        c7.setFont(new Font("Garamond",Font.PLAIN,16));
        c7.setBounds(80,450,600,30);
        c7.setBackground(new Color(51,0,10));
        c7.setForeground(Color.white);
        add(c7);
        
        cancel = new JButton("CANCEL");
        cancel.setBackground(Color.WHITE);
        cancel.setForeground(new Color(51,0,10));
        cancel.setFont(new Font("GARAMOND",Font.BOLD,18));
        cancel.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.green, Color.yellow, Color.blue));
        cancel.setBounds(230,520,100,50);
        cancel.addActionListener(this);
        add(cancel);
        
        
        submit = new JButton("SUBMIT");
        submit.setBackground(Color.WHITE);
        submit.setForeground(new Color(51,0,10));
        submit.setFont(new Font("GARAMOND",Font.BOLD,18));
        submit.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.green, Color.yellow, Color.blue));
        submit.setBounds(420,520,100,50);
        submit.addActionListener(this);
        add(submit);
        
        setSize(750,650);
        setLocation(300,10);
        setVisible(true);
         getContentPane().setBackground(new Color(51,0,10));
    }
    
    public void actionPerformed (ActionEvent ae){
      String accounttype = null;
      String facility="";
      Random random=new Random();
      String cardno="" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
      String pinno="" + Math.abs((random.nextLong() % 9000L) + 1000L);
      String term="";
     if(ae.getSource()==submit){
         if(c7.isSelected()){
           term=""+true;
         }
     
     if(c1.isSelected()){
         facility= facility + " ATM Card";
     } else if(c2.isSelected()){
         facility= facility + " Email & SMS Alerts";
     }else if(c3.isSelected()){
         facility= facility + " Mobile Banking";
     }else if(c4.isSelected()){
         facility= facility + " Internet Banking";
     }else if(c5.isSelected()){
         facility= facility + " E - statement";
     }else if(c6.isSelected()){
         facility= facility + " Cheque Book";
     }
     
     
    
     if(r1.isSelected()){
         accounttype="Savings Account";
     } else if(r2.isSelected()){
         accounttype="Current Account";
     }else if(r3.isSelected()){
         accounttype="Recurring Deposit Account";
     }else if(r4.isSelected()){
         accounttype="Fixed Deposit";
     }
    }
     else if(ae.getSource()==cancel){
         setVisible(false);
         new Login().setVisible(true);
     } 
     try{
         if(term.equals("")) {
             JOptionPane.showMessageDialog(null, "Please agree to the terms and conditions");
         }
         else{
        Conn c=new Conn();
        String query1="insert into Signup3 values('"+formno+"','"+accounttype+"','"+facility+"','"+cardno+"','"+pinno+"')";
        String query2 = "insert into login values('"+formno+"','"+cardno+"','"+pinno+"')";
        c.s.executeUpdate(query1);
        c.s.executeUpdate(query2);
        JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\n Pin:"+ pinno);
        setVisible(false);
        new SignupThree(formno).setVisible(true);
        
        new Deposit(pinno).setVisible(true);
        setVisible(false);
         }
         
     }catch(Exception e){
         System.out.print(e);
     }
     
    }
    
    public static void main(String args[]){
        new SignupThree(""); 
    }
}
