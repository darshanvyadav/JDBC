/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Types;

/**
 *
 * @author Darshanvyadav
 */
public class JdbcSavePointandProcedure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:darshan", "JdbcConnection","darshan");
        con.setAutoCommit(false);
        Statement st = con.createStatement();
     //   st.executeUpdate("drop table Yadav");
        String query = "CREATE TABLE Yadav ( EID NUMBER , ENAME VARCHAR2(20) , ESAL NUMBER )" ; 
       // int b = st.executeUpdate(query);
      String S1 = "insert into Yadav values(111,'ratan',10000)"; // return type of ExecuteUpdate method is int 
      String S2 = "insert into Yadav values(222,'darshan',20000)";
      String S4 = "insert into Yadav values(333,'yadav',30000)";
      String S5 = "insert into Yadav values(444,'priya',80000)";
      
     int x =  st.executeUpdate(S1);
     Savepoint sav1 =  con.setSavepoint();
     int y =  st.executeUpdate(S2); 
     Savepoint sav2 =  con.setSavepoint();
     int z = st.executeUpdate(S4);
     con.rollback(sav2);
     int w = st.executeUpdate(S5);
     con.commit();
     System.out.println("Operation are completed");
     
//     ResultSet rs = st.executeQuery("select * from yadav");
//     
//        System.out.println(rs);
//        ResultSetMetaData rm = rs.getMetaData();
        
//        System.out.println(rm.getColumnCount());
//        System.out.println(rm.getColumnName(1));
//        System.out.println(rm.getColumnName(2));
//        System.out.println(rm.getColumnType(1));
        
    
        CallableStatement cl = con.prepareCall("{call getSal1(?,?)}");
        cl.setInt(1,111);
        cl.registerOutParameter(2, Types.FLOAT);
        //System.out.println("procedure output" + cl.getInt());
                cl.execute();
        System.out.println("procedure output "+cl.getFloat(2));
    }
    
}
