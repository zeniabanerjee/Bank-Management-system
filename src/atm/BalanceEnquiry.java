
package atm;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;
import java.util.*;

public class BalanceEnquiry extends JFrame implements ActionListener {
    
    JButton change,back;
    String pin;
    BalanceEnquiry(String pin){
        this.pin=pin;
        setLayout(null);
        
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("atm/atm.jpg"));
    Image i2=i1.getImage().getScaledInstance(850,800, Image.SCALE_DEFAULT);   
    ImageIcon i3= new ImageIcon(i2);
    JLabel image = new JLabel (i3);
    image.setBounds(0,0,850,670);
    add(image);
    
       
    ImageIcon rose1=new ImageIcon(ClassLoader.getSystemResource("atm/edit.jpeg"));
    Image rose2=rose1.getImage().getScaledInstance(355,240, Image.SCALE_SMOOTH);   
    ImageIcon rose3= new ImageIcon(rose2);
    JLabel rose = new JLabel (rose3);
    rose.setBounds(143,173,349,266);
    image.add(rose);
    
    back = new JButton ("BACK");
    back.setBounds(180,200,140,35);
    back.setFont(new Font("Garamond", Font.BOLD,14));
    back.setBackground(new Color(15,0,10));
    back.setForeground(Color.white);
    back.addActionListener(this);
    rose.add(back);
    
    
    Conn c = new Conn();
    int balance=0;
    try{
            ResultSet rs=c.s.executeQuery("select * from bank where pin = '"+pin+"'");
            
            while (rs.next()){
                if(rs.getString("type").equals("Deposit"))
                {
                    balance += Integer.parseInt( rs.getString("amount"));
                }else if(rs.getString("type").equals("Withdrawl"))
                {
                    balance -= Integer.parseInt( rs.getString("amount"));
                }
            }
        }catch (Exception e){
            System.out.print(e);
        }
    
        
    JLabel text = new JLabel("Your Account Balance is Rs = "+balance);
    text.setFont(new Font("GARAMOND",  Font.BOLD,20));
    text.setForeground(new Color(15,0,10));
    text.setBounds(20,40,500,40); 
    rose.add(text);
    
    
        setSize(850, 700);
        setUndecorated(true);
        setLocation(200, 0);
        setVisible(true);
    }
    
    public void actionPerformed (ActionEvent ae){
    setVisible(false);
    new Transaction(pin).setVisible(true);
    }
    
    public static void main(String[] args) {
        new BalanceEnquiry("").setVisible(true);
    }
}
