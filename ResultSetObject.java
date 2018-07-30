/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Darshanvyadav
 */
public class ResultSetObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:darshan", "JdbcConnection","darshan");
        
        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs  = st.executeQuery("select * from GYadav");
        rs.afterLast();
          while (rs.previous()) 
          {
              System.out.println(rs.getInt(1)+ "   "+  rs.getString(2) + "    " + rs.getInt(3));
              
          }
          
          System.out.println("printing last record");
          rs.last();
          System.out.println(rs.getInt(1)+ "   "+  rs.getString(2) + "    " + rs.getInt(3));
          System.out.println("printing absolute recored ");
          rs.absolute(1);
          
         
System.out.println(rs.getInt(1)+ "   "+  rs.getString(2) + "    " + rs.getInt(3));
              
              }
    
}
