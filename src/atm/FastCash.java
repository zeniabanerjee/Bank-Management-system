package atm;
import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.sql.*;
import java.awt.event.*;


public class FastCash extends JFrame implements ActionListener{
    
    JButton hundred,fivehundred,thousand,twothousand,fivethousand,tenthousand,Back;
    String pinno;
    
    FastCash(String pinno){
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
    
    
    JLabel text = new JLabel ("Select Withdrawl Amount");
    text.setFont(new Font("GARAMOND",  Font.BOLD,28));
    text.setForeground(Color.black);
    text.setBounds(25,50,500,40);
    rose.add(text);
    
    hundred = new JButton ("Rs 100");
    hundred.setBounds(5,135,160,27);
    hundred.setFont(new Font("Garamond", Font.BOLD,14));
    hundred.setBackground(new Color(15,0,10));
    hundred.setForeground(Color.white);
    hundred.addActionListener(this);
    rose.add(hundred);
    
    fivehundred = new JButton ("Rs 500");
    fivehundred.setBounds(185,135,160,27);
    fivehundred.setFont(new Font("Garamond", Font.BOLD,14));
    fivehundred.setBackground(new Color(15,0,10));
    fivehundred.setForeground(Color.white);
    fivehundred.addActionListener(this);
    rose.add(fivehundred);
    
    thousand = new JButton ("Rs 1000");
    thousand.setBounds(5,165,160,27);
    thousand.setFont(new Font("Garamond", Font.BOLD,14));
    thousand.setBackground(new Color(15,0,10));
    thousand.setForeground(Color.white);
    thousand.addActionListener(this);
    rose.add(thousand);
    
    twothousand = new JButton ("Rs 2000");
    twothousand.setBounds(185,165,160,27);
    twothousand.setFont(new Font("Garamond", Font.BOLD,14));
    twothousand.setBackground(new Color(15,0,10));
    twothousand.setForeground(Color.white);
    twothousand.addActionListener(this);
    rose.add(twothousand);
    
    fivethousand = new JButton ("Rs 5000");
    fivethousand.setBounds(5,195,160,27);
    fivethousand.setFont(new Font("Garamond", Font.BOLD,14));
    fivethousand.setBackground(new Color(15,0,10));
    fivethousand.setForeground(Color.white);
    fivethousand.addActionListener(this);
    rose.add(fivethousand);
    
    tenthousand = new JButton ("Rs 10,000");
    tenthousand.setBounds(185,195,160,27);
    tenthousand.setFont(new Font("Garamond", Font.BOLD,14));
    tenthousand.setBackground(new Color(15,0,10));
    tenthousand.setForeground(Color.white);
    tenthousand.addActionListener(this);
    rose.add(tenthousand);
    
    Back = new JButton ("BACK");
    Back.setBounds(90,225,160,27);
    Back.setFont(new Font("Garamond", Font.BOLD,14));
    Back.setBackground(new Color(15,0,10));
    Back.setForeground(Color.white);
    Back.addActionListener(this);
    rose.add(Back);
    
    setSize(850,700);
    setLocation(200,0);
    setUndecorated(true);
    setVisible(true);
}
    public void actionPerformed (ActionEvent ae){
        if(ae.getSource()==Back){
            setVisible(false);
            new Transaction(pinno).setVisible(true);
        } else {
            
            try{
            String amount = ((JButton)ae.getSource()).getText().substring(3);
            Conn c = new Conn();
            ResultSet rs=c.s.executeQuery("select * from bank where pin = '"+pinno+"'");
            int balance=0;
            while (rs.next()){
                if(rs.getString("type").equals("Deposit"))
                {
                    balance += Integer.parseInt( rs.getString("amount"));
                }else if(rs.getString("type").equals("Withdrawl"))
                {
                    balance -= Integer.parseInt( rs.getString("amount"));
                } 
            }
            if(ae.getSource()!= Back && balance < Integer.parseInt(amount)){
            JOptionPane.showMessageDialog(null, "Insufficient Balance");
            return;
            
            }
            Date date = new Date();
            c.s.executeUpdate("insert into bank values('"+pinno+"', '"+date+"', 'Withdrawl', '"+amount+"')");
            JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
            setVisible(false);
            new Transaction(pinno).setVisible(true);
                 
            }catch (Exception e){
                System.out.print(e);
            }
        }
    }
    
public static void main(String[] args){
        new FastCash("");
    }
}
