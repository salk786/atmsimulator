
package bank.management.system;
import java.sql.*;

public class Conn {// 5 steps of jdbc
//    1.REGISTER THE DRIVER
//    2.CREATE CONNECTION
//    3.CREATE STATTEMENT
//    4.XECUTE QUERY
//    5.CONNECTION CLOSE.
    Connection c1;
    Statement s;
    public Conn(){
 
        //now we need to do exception handling because mysql is aa extenal entity so therefor there are high chances of runtime error
        try{//now to register the driver we have a static class named as Class in that we have a method for.nam
         //create connection 2nd step
         //now we class connection for that which ill make a object for that!
           c1=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","shizu0410");
          //crete statement 3rd step
          s=c1.createStatement();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
