
package atm;


import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class MiniStatement extends JFrame implements ActionListener{
    
    String pin;
    JButton b1;
    
    MiniStatement(String pin){
    this.pin=pin;
    
    setLayout(null);
    setTitle("Mini Statement");
    
    JLabel bank = new JLabel("STATE BANK OF INDIA");
    bank.setFont(new Font("GARAMOND",  Font.BOLD,20));
    bank.setForeground(Color.white);
    bank.setBounds(150,40,500,40); 
    add(bank);
    
    JLabel mini = new JLabel();
    mini.setFont(new Font("GARAMOND",  Font.PLAIN,20));
    mini.setForeground(Color.white);
    mini.setBounds(35,150,600,200); 
    add(mini);
    
    JLabel card = new JLabel();
    card.setFont(new Font("GARAMOND",  Font.BOLD,20));
    card.setForeground(Color.white);
    card.setBounds(35,100,600,40); 
    add(card);
    
    JLabel balance = new JLabel();
    balance.setFont(new Font("GARAMOND",  Font.PLAIN,18));
    balance.setForeground(Color.white);
    balance.setBounds(35,400,600,40); 
    add(balance);
    
    try{
        Conn c = new Conn();
        ResultSet rs = c.s.executeQuery("select * from login where pin = '"+pin+"'");
        while(rs.next()){
        card.setText("Card Number:   " + rs.getString("cardno").substring(0, 4) + "XXXXXXXX" + rs.getString("cardno").substring(12));
        }  
    }catch(Exception e){
        System.out.print(e);
    }
    
        try{
            int balance2 = 0;
            Conn c1  = new Conn();
            ResultSet rs = c1.s.executeQuery("SELECT * FROM bank where pin = '"+pin+"'");
            while(rs.next()){
                mini.setText(mini.getText() +"<html>"+rs.getString("date")+ "&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount")+ "<br><html>" );
                if(rs.getString("type").equals("Deposit")){
                    balance2 += Integer.parseInt(rs.getString("amount"));
                }else{
                    balance2 -= Integer.parseInt(rs.getString("amount"));
                }
            }
            balance.setText("Your total Balance is Rs "+balance2);
        }catch(Exception e){
        System.out.print(e);
        }

        b1 = new JButton("Exit");
        add(b1);
        b1.addActionListener(this);
        b1.setBounds(200, 440, 100, 25);
        b1.setBackground( Color.white);
        b1.setForeground(new Color(0,0,0));
    
    
    
    getContentPane().setBackground(new Color(98,0,15));
    setSize(550,550);
    setLocation(350,50);
    setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }
    
    public static void main(String[] args) {
        new MiniStatement("").setVisible(true);
    }
    
}
