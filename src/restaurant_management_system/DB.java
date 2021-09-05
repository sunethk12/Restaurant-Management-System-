
package restaurant_management_system;

import java.sql.Connection;
import java.sql.DriverManager;


public class DB {
     private static Connection con;
    
public static Connection connect()throws Exception{
Class.forName("com.mysql.jdbc.Driver" ).newInstance();
String url="jdbc:mysql://localhost:3306/restaurant";
con=DriverManager.getConnection(url,"root","");
return con;


}   

    static Connection conect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
