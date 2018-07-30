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
import java.util.Scanner;

/**
 *
 * @author Darshanvyadav
 */
public class JdbcBatchUpdation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
    
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:darshan", "JdbcConnection","darshan");
        
        Statement st = con.createStatement();
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the values ");
        String Table = sc.next();
        
        
//        String Q0 = "drop table priyanka";
//        String q1 = "create table priyanka(age number, marks number , school varchar2(30), friendsname varchar2(50) )";
//        String q2 = "insert into priyanka  values(17,90,'sarvodaya','chornika')";
//        String q3 = "insert into priyanka values(15,80,'kendriya Vidayalaya','chornika')";
//         String q4 = "insert into priyanka values(16,88,'sarvodaya','none')";
//         String q5 = "update priyanka set marks=marks+2 where marks<90";
//         String q6 = "drop table priyanka";
//         String q7 = "select * from priyanka";
         //st.addBatch("drop table priyanka");
         st.addBatch("create table "+ Table + "age number, marks number , school varchar2(30), friendsname varchar2(50) )");
         
           st.addBatch("insert into "+Table + "  values(17,90,'sarvodaya','chornika')");
             st.addBatch("insert into "+ Table + " values(15,80,'kendriya Vidayalaya','chornika')");
               st.addBatch("insert into "+ Table + " values(16,88,'sarvodaya','none')");
                 st.addBatch("update"+ Table + "set marks=marks+2 where marks<90");
                   st.addBatch("drop table "+ Table );
                   
                    
                    
                    
                   
           //    b = new int[30];     
          int[]     b = st.executeBatch();
         for (int uservariable: b){
             System.out.println(uservariable);
         }
         
         con.close();
    }
    
    
}
