/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.in;
import java.util.Scanner;
import javax.swing.text.html.HTML;
import org.omg.CORBA.portable.InputStream;

/**
 *
 * @author Darshanvyadav
 */
public class NewClass1 {

    public static void main(String[] args) throws java.lang.Exception {
// 		BufferedReader r = new BufferedReader (new InputStreamReader (System.in));
// 		String s;
// 		while (!(s=r.readLine()).startsWith("42")) System.out.println(s);

       // Scanner sc = new Scanner(System.in);
       // String s = sc.nextLine();
        int totalCount = 0;
        int[] intarray = new int[100];
        char[] chararray = new char[100];

       Scanner sc = new Scanner(in);
      
       
            
             while (sc.hasNext())              
                 
                 
                 
{               String s = sc.nextLine();
                if (s.equals("exit")) break;
                 // System.out.println(s);
            for (int i = 0; i < s.length(); i++) {
                chararray[i] = s.charAt(i);
            }
            // System.out.println(chararray);
            for (int j = 0; j < s.length(); j++) {
               // System.out.println("insider char to int for loop");
                String s1 = String.valueOf(chararray[j]);
                intarray[j] = Integer.parseInt(s1);
            }
           
           
            for (int k = 0; k < s.length(); k++) {
                
             // System.out.println("int array number = "+ intarray[k]);
                switch (intarray[k]) {
                    
                    case 0:
                    totalCount = totalCount + 6;
                        // System.out.println("6 added");
                      break;
                    case 1:
                    totalCount = totalCount + 2;
                        // System.out.println("2 added");
                       break;

                    case 2:
                        totalCount = totalCount + 5;
                     //  System.out.println("5 added");
                        break;
                    case 3:
                        totalCount = totalCount + 5;
                        //System.out.println("5 added");
                        
                    case 4:
                        totalCount = totalCount + 4;
                       // System.out.println("4 added");
                          break;
                    case 5:
                        totalCount = totalCount + 5;
                       //  System.out.println("5 added");
                           break;
                    case 6:
                        totalCount = totalCount + 6;
                       //  System.out.println("6 added");
                          break;
                    case 7:
                        totalCount = totalCount + 4;
                        // System.out.println("4 added");
                         break;
                    case 8:
                        totalCount = totalCount + 7;
                        // System.out.println("7 added");
                          break;
                    case 9:
                        totalCount = totalCount + 6;
                        // System.out.println("6 added");
                } 
                
                }
System.out.println(totalCount);
            }
        
      System.out.println("Out of loop");
       
      
        
    }

}
