/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Darshanvyadav
 */
public class JdbcUpdateRunTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
         Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:darshan", "JdbcConnection","darshan");
        
        Statement st = con.createStatement();
        //String query = "CREATE TABLE GYadav ( EID NUMBER , ENAME VARCHAR2(20) , ESAL NUMBER )" ; 
    //  st.executeUpdate("drop table PriyankaYadav");
//        String query = "CREATE TABLE PriyankaYadav ( EID NUMBER , ENAME VARCHAR2(20) , ESAL NUMBER )" ; 
//        st.executeUpdate(query);
        
//        st.executeUpdate("insert into PriyankaYadav values (111,'geetha',100)");
//        
//        st.executeUpdate("insert into PriyankaYadav values (222,'darshan',200)");
        
        
        PreparedStatement ps = 
                
                con.prepareStatement("update GYadav set ename=? where ename = ?  ");
        
        ps.setString(1, "xxxx");
        ps.setString(2, "geetha");
        ps.executeUpdate();
        
           
        ps.setString(1, "priya");
        ps.setString(2, "darshan");
        ps.executeUpdate();
        
        System.out.println("updation is successfull ");
        
        PreparedStatement ps1 = 
                
           con.prepareStatement("update GYadav set esal=? where ename = ? ");
        ps1.setInt(1, 1234);
        ps1.setString(2, "xxxx");
        ps1.executeUpdate();
        
        ps1.setInt(1, 4321);
        ps1.setString(2, "priya");
        ps1.executeUpdate();
        
        System.out.println("Salary updation successful ");
        
        
        PreparedStatement ps2 = 
                
           con.prepareStatement("delete from PriyankaYadav where EID = ? ");
       
        ps1.setInt(1, 111);
        ps1.executeUpdate();
        System.out.println("Deletion operation is completed");
        
        
        // error is there need to solve 
    }
    
}
