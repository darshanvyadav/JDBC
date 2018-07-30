/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author Darshanvyadav
 * 
 * 
 */

// class name :- sun.jdbs.odbc.JdbcOdbcDriver
// url :- jdbc:odbc:dsn-name
//use for name method to load .class file in to memory
// Class.forName("class-name");
// Class.forName("JdbcOdbcDriver");

public class JdbcFirstApplication {
    public static void main (String[] args) throws ClassNotFoundException,SQLException, InterruptedException
    {
        // loading driver 
      // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
       
      // creating connection
     //  Connection con =DriverManager.getConnection("jdbc:odbc:dns-darshan", "system","darshan");
        
        
        Class.forName("oracle.jdbc.driver.OracleDriver");
       Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:darshan","JdbcConnection","darshan");
      Statement st = con.createStatement();
       
       
       // write the query
       String query = "CREATE TABLE Yadav ( EID NUMBER , ENAME VARCHAR2(20) , ESAL NUMBER )" ; 
       //execute the query using statement object
     
      
      int b = st.executeUpdate(query);
        System.out.println("Table is created successfully="+ b );
      // three methods 
      
      // executeUpdated method
      // ExecuteQuery method only for selection group
      // Execute  method for both selectiona nd updated group of sql queries 
      
      String S1 = "insert into Yadav values(111,'ratan',10000)"; // return type of ExecuteUpdate method is int 
      String S2 = "insert into Yadav values(222,'darshan',20000)";
      String S4 = "insert into Yadav values(333,'yadav',30000)";
      
     int x =  st.executeUpdate(S1);
     int y =  st.executeUpdate(S2); 
     int z = st.executeUpdate(S4);
        System.out.println("Values are inserted successfully");
        
      // retrive the values
      String s3 = "select * FROM Yadav";
      ResultSet set =  st.executeQuery(s3);// to store the result of execute query jbdc used result set object thats the reason 
                           // ute query methos return type is result set object
     
                           
     while (set.next()) 
     {            
           System.out.println( set.getInt(1) +"   "+ set.getString(2) +"   "+set.getInt(3));    
     }
        System.out.println("Data printing is completed");
        
        String S5 = "update Yadav set esal=esal+200 where esal>10000";
        
        int s = st.executeUpdate(S5);
        System.out.println("number of records updated = " + s);
        
        Thread.sleep(2000);
        //drop the table 

//       String S7 = "drop table Yadav";
//        int f =  st.executeUpdate(S7);
//        System.out.println( " table dropped successfully =  "+f);
//        
       // con.close();
       
        

// execute method for both selection and updation group of sql group - return type boolean
     
    // boolean b1 = st.execute(s3); // true or false to check the command 
    // boolean b2 = st.execute(S2);
     
     // close the connection, it make result set object and connection  object will be closed
     
     // doing this application in eclips is very easy.  
     con.close();
     
     
      System.out.println("Cnnection closed successfully");
              
     // path for jdbc
     
     // C:\app\darshan\product\12.2.0\dbhome_1\inventory\backup\2018-06-14_04-39-40PM\Scripts\ext\jlib
     
      
    }
    
}
