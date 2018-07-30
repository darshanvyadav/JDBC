/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

/**
 *
 * @author Darshanvyadav
 */
public class Function {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
         Class.forName("oracle.jdbc.driver.OracleDriver");
       Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:darshan","JdbcConnection","darshan");
      Statement st = con.createStatement();
      st.executeUpdate("drop table bangari");
      String query = "CREATE TABLE bangari ( EID NUMBER , ENAME VARCHAR2(20) , ESAL NUMBER )" ; 
      st.executeUpdate(query);
      
       String S1 = "insert into bangari values(111,'ratan',10000)"; // return type of ExecuteUpdate method is int 
      String S2 = "insert into bangari values(222,'darshan',20000)";
      String S4 = "insert into bangari values(333,'yadav',30000)";
      String S5 = "insert into bangari values(444,'priya',80000)";
      
     int x =  st.executeUpdate(S1);
    // Savepoint sav1 =  con.setSavepoint();
     int y =  st.executeUpdate(S2); 
   //  Savepoint sav2 =  con.setSavepoint();
     int z = st.executeUpdate(S4);
    // con.rollback(sav2);
     int w = st.executeUpdate(S5);
     
     // first question mark is return value and next two question mark is output input position parameter
        CallableStatement cl = con.prepareCall("{?=call bangariyadav(?,?)}");
      cl.setInt(2, 111);
      cl.setInt(3, 222);
      cl.registerOutParameter(1, java.sql.Types.FLOAT);
      cl.execute();
        System.out.println("Function output "+ cl.getFloat(1));
        
      
    }
    
}
