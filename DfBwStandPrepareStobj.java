/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Darshanvyadav
 */
public class DfBwStandPrepareStobj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
    
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:darshan", "JdbcConnection","darshan");
        
        Statement st = con.createStatement();
        st.executeUpdate("drop table GYadav");
        String query = "CREATE TABLE GYadav ( EID NUMBER , ENAME VARCHAR2(20) , ESAL NUMBER )" ; 
        st.executeUpdate(query);
        // need insert query and i need to run it many times then use prepare statement
        PreparedStatement ps = con.prepareStatement("insert into GYadav values(?,?,?)");
        Scanner sc = new Scanner(System.in);
        
        while(true)
                {
                    System.out.println("Enter employ ID");
                    int Id = sc.nextInt();
                    System.out.println("Enter Ename");
                    String Ename = sc.next();
                    System.out.println("Enter Esal");
                    float Esal = sc.nextInt();
                    
                    // here we are not executing the query we are just setting the values means at the run time only directly values are written in to db 
                    // no more query execution
                    
                    ps.setInt(1, Id);
                    ps.setString(2, Ename);
                    ps.setFloat(3, Esal);
                    ps.executeUpdate();
                    
                    System.out.println("do you want to insert one more record ");
                  String loop =   sc.next();
                    
                    if (loop.equals("No"))
                    {
                        break;
                    }
                    
                 }
        
        con.close();
        System.out.println("connection is closed successfully");
        
    }
    
}
