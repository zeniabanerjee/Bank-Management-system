
package atm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class  Login extends JFrame implements ActionListener{
    
    JButton login,signup,clear;
    JTextField cardtextfield;
    JPasswordField pintextfield;
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        /*ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("atm/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);*/
        
        JLabel text = new JLabel("Welcome to A.T.M");
        text.setFont(new Font("MONOTYPE CORSIVA", Font.BOLD, 47));
        text.setForeground(new Color(255,255,255));
        text.setBounds(170, 50, 600, 40);
        add(text);
         JLabel cardno = new JLabel("Card No. :");
        cardno.setFont(new Font("Garamond", Font.PLAIN, 28));
        cardno.setForeground(new Color(255,255,255));
        cardno.setBounds(80, 140, 150, 30);
        add(cardno);
        
        cardtextfield = new JTextField();
        cardtextfield.setBounds(300,140,330,35);
        cardtextfield.setFont(new Font("Garamond", Font.BOLD, 18));
        cardtextfield.setBackground(new Color(229,204,255));
        add(cardtextfield);
        
        JLabel pin = new JLabel("PIN :");
        pin.setFont(new Font("Garamond", Font.PLAIN, 26));
        pin.setBounds(80, 210, 150, 30);
        pin.setForeground(new Color(255,255,255));
        add(pin);
        
        pintextfield = new JPasswordField();
        pintextfield.setBounds(300,210,330,35);
        pintextfield.setFont(new Font("Garamond", Font.BOLD, 18));
        pintextfield.setBackground(new Color(229,204,255));
        add(pintextfield);
        
       
        login=new JButton("LOG-IN");
        login.setBounds(300,300,130,30);
        login.setBackground(new Color(229,204,255));
        login.setForeground(Color.BLACK);
        login.setFont(new Font("Garamond", Font.PLAIN, 18));
        login.addActionListener(this);
        add(login);
        
        
        clear=new JButton("CLEAR");
        clear.setBounds(500,300,130,30);
        clear.setBackground(new Color(229,204,255));
        clear.setForeground(Color.BLACK);
        clear.setFont(new Font("Garamond", Font.PLAIN, 18));
        clear.addActionListener(this);
        add(clear);
        
        signup=new JButton("SIGN-UP");
        signup.setBounds(375,370,170,30);
        signup.setBackground(new Color(229,204,255));
        signup.setForeground(Color.BLACK);
        signup.setFont(new Font("Garamond", Font.PLAIN, 18));
        signup.addActionListener(this);
        add(signup);
        
        getContentPane().setBackground(new Color(51,0,51));
        setSize(700,500);
        setVisible(true);
        setLocation(300,100);
           
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==clear){
            cardtextfield.setText("");
            pintextfield.setText("");
        }
        else if(ae.getSource()==login){
            Conn conn=new Conn();
            String cardno=cardtextfield.getText();
            String pinno=pintextfield.getText();
            String query="select * from login where cardno = '"+cardno+"' and pin = '"+pinno+"' ";
            try{
                ResultSet rs= conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transaction(pinno).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card no or Pin");
                }
            } catch (Exception e){
                System.out.print(e);
            }
            
        }
        else if(ae.getSource()==signup){
            setVisible(false);
            new Signup().setVisible(true);
        }
    }
    
    public static void main (String args[]){
        new Login();
    }
    
}
