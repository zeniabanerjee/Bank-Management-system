
package atm;
 
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class Deposit extends JFrame implements ActionListener{
    JTextField t1,t2;
    JButton deposit,back;
    String pin;
    Deposit(String pin){
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
    rose.setBounds(143,171,349,269);
    image.add(rose);
        
    JLabel text = new JLabel ("Enter the Deposit Amount");
    text.setFont(new Font("GARAMOND",  Font.BOLD,25));
    text.setForeground(Color.black);
    text.setBounds(30,45,500,40);
    rose.add(text);    
    
    t1 = new JTextField();
    t1.setFont(new Font("Garamond", Font.BOLD, 22));
    t1.setBackground(new Color(15,0,10));
    t1.setForeground(Color.white);
    t1.setBounds(30,100,290,35);
    rose.add(t1);
    
    deposit = new JButton ("DEPOSIT");
    deposit.setBounds(30,180,130,35);
    deposit.setFont(new Font("Garamond", Font.BOLD,14));
    deposit.setBackground(new Color(15,0,10));
    deposit.setForeground(Color.white);
    deposit.addActionListener(this);
    rose.add(deposit);
    
    back = new JButton ("BACK");
    back.setBounds(190,180,130,35);
    back.setFont(new Font("Garamond", Font.BOLD,14));
    back.setBackground(new Color(15,0,10));
    back.setForeground(Color.white);
    back.addActionListener(this);
    rose.add(back);
    
    
    setSize(850,700);
    setLocation(200,0);
    setUndecorated(true);
    setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        try{        
            String amount = t1.getText();
            Date date = new Date();
            if(ae.getSource()==deposit){
                if(t1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Deposit");
                }else{
                    Conn c1 = new Conn();
                    c1.s.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Deposit', '"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Deposited Successfully.");
                    setVisible(false);
                    new Transaction(pin).setVisible(true);
                }
            }else if(ae.getSource()==back){
                setVisible(false);
                new Transaction(pin).setVisible(true);
            }
        }catch(Exception e){
            System.out.print(e);
        }
            
    }
    
    
    public static void main(String args[]){
        new Deposit("").setVisible(true);
    }
}

