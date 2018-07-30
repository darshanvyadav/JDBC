/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Darshanvyadav
 */
public class JdbcKeyboardValues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:darshan", "JdbcConnection","darshan");
        
        Statement st = con.createStatement();
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the Table Name ");
        String Table = sc.next();
        
         st.executeUpdate("create table "+ Table + "(age number, marks number , school varchar2(30), friendsname varchar2(50) )");
         System.out.println("table created with the value");
//           st.addBatch("insert into "+Table + "  values(17,90,'sarvodaya','chornika')");
//             st.addBatch("insert into "+ Table + " values(15,80,'kendriya Vidayalaya','chornika')");
//               st.addBatch("insert into "+ Table + " values(16,88,'sarvodaya','none')");
//                 st.addBatch("update"+ Table + "set marks=marks+2 where marks<90");
//                   st.addBatch("drop table "+ Table );

           while (true)
           {
               System.out.println("Enter age");
               int age = sc.nextInt();
               System.out.println("Enter marks");
               int marks = sc.nextInt();
               System.out.println("Enter school");
               String school = sc.next();
               System.out.println("Enter friends ");
               String friendsname = sc.next();
               String query = " insert into "+Table + "  values("+age+","+ marks +",  ' " +school + "','" + friendsname+ "') ";
               System.out.println(query);
               st.executeUpdate(query);
               System.out.println("Values entered successfully");
               System.out.println("do you want to enter more records say yes/no");
               String loop = sc.next();
             if (loop.equals("No"))   
             {
                 
                 break;
             }
           }
         
           System.out.println("enter the table name you want to drop ");
           String dropTable = sc.next();
           String DropQuery = "drop table" + dropTable ;
           st.executeUpdate(DropQuery);
           System.out.println("Table dropped successfully");
           con.close();
        System.out.println("connection is closed successfuly ");           
                    
    }
    
         
         
    }
    
