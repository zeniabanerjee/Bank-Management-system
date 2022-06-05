package atm;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;


public class PinChange extends JFrame implements ActionListener{
    
    JButton change,back;
    String pinno;
    JPasswordField t1,t2;
    
    PinChange(String pinno){
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
    
    
    JLabel text = new JLabel ("CHANGE YOUR PIN");
    text.setFont(new Font("GARAMOND",  Font.BOLD,24));
    text.setForeground(new Color(15,0,10));
    text.setBounds(40,40,500,40);
    rose.add(text);
    
    
    JLabel npin = new JLabel ("New Pin :");
    npin.setFont(new Font("GARAMOND",  Font.BOLD,20));
    npin.setForeground(new Color(15,0,10));
    npin.setBounds(20,90,200,35);
    rose.add(npin);
    
    t1 = new JPasswordField();
    t1.setFont(new Font("Garamond", Font.BOLD, 22));
    t1.setBackground(new Color(15,0,10));
    t1.setForeground(Color.white);
    t1.setBounds(170,90,150,35);
    rose.add(t1);
    
    JLabel cpin = new JLabel ("Re-Enter Pin :");
    cpin.setFont(new Font("GARAMOND",  Font.BOLD,20));
    cpin.setForeground(new Color(15,0,10));
    cpin.setBounds(20,130,200,35);
    rose.add(cpin);
    
    t2 = new JPasswordField();
    t2.setFont(new Font("Garamond", Font.BOLD, 22));
    t2.setBackground(new Color(15,0,10));
    t2.setForeground(Color.white);
    t2.setBounds(170,130,150,35);
    rose.add(t2);
    
    change = new JButton ("CHANGE");
    change.setBounds(20,200,140,35);
    change.setFont(new Font("Garamond", Font.BOLD,14));
    change.setBackground(new Color(15,0,10));
    change.setForeground(Color.white);
    change.addActionListener(this);
    rose.add(change);
    
    back = new JButton ("BACK");
    back.setBounds(180,200,140,35);
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
    public void actionPerformed (ActionEvent ae){
        if(ae.getSource()==change){
        try{        
            String npin = t1.getText();
            String rpin = t2.getText();
            
            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                return;
            }
            
            
                if (t1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                }
                if (t2.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
                }
                
                Conn c1 = new Conn();
                String q1 = "update bank set pin = '"+rpin+"' where pin = '"+pinno+"' ";
                String q2 = "update login set pin = '"+rpin+"' where pin = '"+pinno+"' ";
                String q3 = "update Signup3 set pin = '"+rpin+"' where pin = '"+pinno+"' ";

                c1.s.executeUpdate(q1);
                c1.s.executeUpdate(q2);
                c1.s.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                setVisible(false);
                new Transaction(rpin).setVisible(true);
            
                 }catch(Exception e){
                 System.out.print(e);
            }
            }else if(ae.getSource()==back){
                new Transaction(pinno).setVisible(true);
                setVisible(false);
            }
        
    }
    public static void main(String args[]){
        new PinChange("").setVisible(true);
    }
}