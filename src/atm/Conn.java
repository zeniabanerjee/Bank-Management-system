
package atm;
import java.sql.*;
public class Conn {
    Connection c;//class object (global)
    Statement s;
    public Conn(){
        try{
            //Class.forName(com.mysql.cj.jdbc.Driver);//class with statis method and driver name
            //we dont need to write it explicitly as java automatically connects the classoath
            c=DriverManager.getConnection("jdbc:mysql:///atm", "root","Zenia*Banerjee10*");//Dr..-class get-func url-string
            //jdbc connected with mysql runs on local host by default port no 3306
            //atm - database root-path password
            s=c.createStatement();
        }catch (Exception e){
            System.out.println(e);
        }
}
}
