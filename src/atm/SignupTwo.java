package atm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class  SignupTwo extends JFrame implements ActionListener {
    

JTextField pantext,aadhartext;
JRadioButton yes,no,has,doesnt;   
JButton next;
JComboBox reli,cat,inc,edu,occupation;
String formno;
        
 SignupTwo(String formno){
     this.formno=formno;
     setLayout(null);
     
     setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
    
     
     JLabel addition = new JLabel ("Page 2 : Additional Details");
     addition.setFont(new Font("GARAMOND", Font.BOLD,25));
     addition.setBounds(220,30,410,30);
     addition.setForeground(Color.WHITE);
     add(addition);
     
     JLabel religion = new JLabel ("Religion : ");
     religion.setFont(new Font("GARAMOND", Font.PLAIN,23));
     religion.setBounds(80,110,200,30);
     religion.setForeground(Color.WHITE);
     add(religion);
     
     String rel[]={"Hindu","Islam","Christian","Sikh","Other"};
     reli = new JComboBox(rel);
     reli.setFont(new Font("GARAMOND", Font.PLAIN,16));
     reli.setBounds(300,110,300,30);
     reli.setBackground(new Color(255,255,255));
     reli.setForeground(Color.BLACK);
     add(reli);
     
     JLabel category = new JLabel ("Category : ");
     category.setFont(new Font("GARAMOND", Font.PLAIN,23));
     category.setBounds(80,150,200,30);
     category.setForeground(Color.WHITE);
     add(category);
     
     String valcategory []={"General","SC","ST","OBC","Others"};
     cat = new JComboBox(valcategory);
     cat.setFont(new Font("GARAMOND", Font.PLAIN,16));
     cat.setBounds(300,150,300,30);
     cat.setBackground(new Color(255,255,255));
     cat.setForeground(Color.BLACK);
     add(cat);
     
     
     
     JLabel income = new JLabel ("Income : ");
     income.setFont(new Font("GARAMOND", Font.PLAIN,23));
     income.setBounds(80,190,200,30);
     income.setForeground(Color.WHITE);
     add(income);
     
    
     String incomeval []={"Null","< 2,00,000","2,00,000 - 4,00,000","4,00,000 - 6,00,000","< 10,00,000"};
     inc = new JComboBox(incomeval);
     inc.setFont(new Font("GARAMOND", Font.PLAIN,16));
     inc.setBounds(300,190,300,30);
     inc.setBackground(new Color(255,255,255));
     inc.setForeground(Color.BLACK);
     add(inc);
    
     
     JLabel education = new JLabel ("Educational  ");
     education.setFont(new Font("GARAMOND", Font.PLAIN,23));
     education.setBounds(80,230,200,30);
     education.setForeground(Color.WHITE);
     add(education);
     
     
     String eduval []={"Non-Graduate","Graduate","Post-Graduate","Doctorate","Others"};
     edu = new JComboBox(eduval);
     edu.setFont(new Font("GARAMOND", Font.PLAIN,16));
     edu.setBounds(300,260,300,30);
     edu.setBackground(new Color(255,255,255));
     edu.setForeground(Color.BLACK);
     add(edu);
     
     
     JLabel qualification = new JLabel ("Qualification :");
     qualification.setFont(new Font("GARAMOND", Font.PLAIN,23));
     qualification.setBounds(80,260,200,30);
     qualification.setForeground(Color.WHITE);
     add(qualification);
     
     
     JLabel o = new JLabel ("Occupation :");
     o.setFont(new Font("GARAMOND", Font.PLAIN,23));
     o.setBounds(80,310,200,30);
     o.setForeground(Color.WHITE);
     add(o);
     
      
     String occu []={"Student","Service","Self-Employed","Business","Retired","Others"};
     occupation = new JComboBox(occu);
     occupation.setFont(new Font("GARAMOND", Font.PLAIN,16));
     occupation.setBounds(300,310,300,30);
     occupation.setBackground(new Color(255,255,255));
     occupation.setForeground(Color.BLACK);
     add(occupation);
     
     
     JLabel pan = new JLabel ("PAN No. :");
     pan.setFont(new Font("GARAMOND", Font.PLAIN,23));
     pan.setBounds(80,350,200,30);
     pan.setForeground(Color.WHITE);
     add(pan);
     
     pantext = new JTextField();
     pantext.setFont(new Font("GARAMOND", Font.PLAIN,16));
     pantext.setBounds(300,350,300,30);
     pantext.setBackground(new Color(255,255,255));
     pantext.setForeground(Color.BLACK);
     add(pantext);
     
     
     JLabel aadhar = new JLabel ("Aadhar No. :");
     aadhar.setFont(new Font("GARAMOND", Font.PLAIN,23));
     aadhar.setBounds(80,390,200,30);
     aadhar.setForeground(Color.WHITE);
     add(aadhar);
     
     aadhartext = new JTextField();
     aadhartext.setFont(new Font("GARAMOND", Font.PLAIN,16));
     aadhartext.setBounds(300,390,300,30);
     aadhartext.setBackground(new Color(255,255,255));
     aadhartext.setForeground(Color.BLACK);
     add(aadhartext);
     
     
     JLabel seniorcitizen = new JLabel ("Senior Citizen :");
     seniorcitizen.setFont(new Font("GARAMOND", Font.PLAIN,23));
     seniorcitizen.setBounds(80,430,200,30);
     seniorcitizen.setForeground(Color.WHITE);
     add(seniorcitizen);
     
     
     yes = new JRadioButton("YES");
     yes.setBounds(300,430,80,30);
     yes.setBackground(new Color(16,0,10));
     yes.setForeground(Color.WHITE);
     add(yes);
     
     no = new JRadioButton("NO");
     no.setBounds(450,430,100,30);
     no.setBackground(new Color(16,0,10));
     no.setForeground(Color.WHITE);
     add(no);
     
     ButtonGroup sr=new ButtonGroup();
     sr.add(yes);
     sr.add(no);
     
     
     
     JLabel exist = new JLabel ("Existing Account :");
     exist.setFont(new Font("GARAMOND", Font.PLAIN,23));
     exist.setBounds(80,470,200,30);
     exist.setForeground(Color.WHITE);
     add(exist);
     
     
     
     has = new JRadioButton("YES");
     has.setBounds(300,470,80,30);
     has.setBackground(new Color(16,0,10));
     has.setForeground(Color.WHITE);
     add(has);
     
     doesnt = new JRadioButton("NO");
     doesnt.setBounds(450,470,100,30);
     
     doesnt.setBackground(new Color(16,0,10));
     doesnt.setForeground(Color.WHITE);
     add(doesnt);
     
     ButtonGroup ea=new ButtonGroup();
     ea.add(has);
     ea.add(doesnt);
     
     
     
     next = new JButton("NEXT");
     next.setBackground(Color.WHITE);
     next.setForeground(new Color(51,0,25));
     next.setFont(new Font("GARAMOND",Font.BOLD,18));
     next.setBorder(BorderFactory.createBevelBorder(1, Color.red, Color.green, Color.yellow, Color.blue));
     next.setBounds(500,550,100,40);
     next.addActionListener(this);
     add(next);
     
     getContentPane().setBackground(new Color(16,0,10));
     
     setSize(700,670);
     setLocation(300,0);
     setVisible(true);
    }
 public void actionPerformed (ActionEvent ae){
     
     String religion=(String)reli.getSelectedItem();
     String category=(String)cat.getSelectedItem();
     String income=(String)inc.getSelectedItem();
     String education=(String)edu.getSelectedItem();
     String occupation=(String)cat.getSelectedItem();
     String aadhar=aadhartext.getText();
     String pan=pantext.getText();
     String sr = null;
     if(yes.isSelected()){
         sr="yes";
     } else if(no.isSelected()){
         sr="No";
     }
     String ex="";
     if(has.isSelected()){
         ex="Yes";
     } else if(doesnt.isSelected()){
         ex="No";
     }
 
     try{
        Conn c=new Conn();
        String query="insert into signuptwo values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+sr+"','"+ex+"','"+aadhar+"','"+pan+"')";
        c.s.executeUpdate(query);
             setVisible(false);
             new SignupThree(formno).setVisible(true);
         
     }catch(Exception e){
         System.out.print(e);
     }
     
 }
    public static void main(String args[]){
        new SignupTwo("");
    }   
}
