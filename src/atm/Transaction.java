package atm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Transaction extends JFrame implements ActionListener{
    
    JButton deposit,withdraw,balance,cash,mini,pin,exit;
    String pinno;
    
    Transaction(String pinno){
        this.pinno=pinno;
        
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
    
    
    JLabel text = new JLabel ("TRANSACTIONS");
    text.setFont(new Font("GARAMOND",  Font.BOLD,22));
    text.setForeground(Color.black);
    text.setBounds(90,50,500,40);
    rose.add(text);
    
    deposit = new JButton ("DEPOSIT");
    deposit.setBounds(5,135,160,27);
    deposit.setFont(new Font("Garamond", Font.BOLD,12));
    deposit.setBackground(new Color(15,0,10));
    deposit.setForeground(Color.white);
    deposit.addActionListener(this);
    rose.add(deposit);
    
    withdraw = new JButton ("CASH WITHDRAWL");
    withdraw.setBounds(185,135,160,27);
    withdraw.setFont(new Font("Garamond", Font.BOLD,12));
    withdraw.setBackground(new Color(15,0,10));
    withdraw.setForeground(Color.white);
    withdraw.addActionListener(this);
    rose.add(withdraw);
    
    balance = new JButton ("BALANCE ENQUIRY");
    balance.setBounds(5,165,160,27);
    balance.setFont(new Font("Garamond", Font.BOLD,12));
    balance.setBackground(new Color(15,0,10));
    balance.setForeground(Color.white);
    balance.addActionListener(this);
    rose.add(balance);
    
    cash = new JButton ("FAST CASH");
    cash.setBounds(185,165,160,27);
    cash.setFont(new Font("Garamond", Font.BOLD,12));
    cash.setBackground(new Color(15,0,10));
    cash.setForeground(Color.white);
    cash.addActionListener(this);
    rose.add(cash);
    
    mini = new JButton ("MINI STATEMENT");
    mini.setBounds(5,195,160,27);
    mini.setFont(new Font("Garamond", Font.BOLD,12));
    mini.setBackground(new Color(15,0,10));
    mini.setForeground(Color.white);
    mini.addActionListener(this);
    rose.add(mini);
    
    pin = new JButton ("CHANGE PIN");
    pin.setBounds(185,195,160,27);
    pin.setFont(new Font("Garamond", Font.BOLD,12));
    pin.setBackground(new Color(15,0,10));
    pin.setForeground(Color.white);
    pin.addActionListener(this);
    rose.add(pin);
    
    exit = new JButton ("EXIT");
    exit.setBounds(90,225,160,27);
    exit.setFont(new Font("Garamond", Font.BOLD,12));
    exit.setBackground(new Color(15,0,10));
    exit.setForeground(Color.white);
    exit.addActionListener(this);
    rose.add(exit);
    
    setSize(850,700);
    setLocation(200,0);
    setUndecorated(true);
    setVisible(true);
}
    
    public void actionPerformed (ActionEvent ae){
        if(ae.getSource()==exit){
            System.exit(0);
        } else if(ae.getSource()==deposit){ 
            setVisible(false);
            new Deposit(pinno).setVisible(true);
        } else if(ae.getSource()==withdraw){ 
            setVisible(false);
            new Withdraw(pinno).setVisible(true);
        } else if(ae.getSource()==cash){ 
            setVisible(false);
            new FastCash(pinno).setVisible(true);
        } else if(ae.getSource()==pin){ 
            setVisible(false);
            new PinChange(pinno).setVisible(true);
        } else if(ae.getSource()==balance){ 
            setVisible(false);
            new BalanceEnquiry(pinno).setVisible(true);
        } else if(ae.getSource()==mini){ 
            new MiniStatement(pinno).setVisible(true);
        }
    }
    
public static void main(String[] args){
        new Transaction("");
    }
}
