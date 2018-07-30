/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.ArrayList;
import java.util.LinkedList;


/**
 *
 * @author Darshanvyadav
 */
public class Collection  {

    /**
     * @param args the command line arguments
     */
    
   
    
   
    
    public static void main(String[] args) {
     
        
      ArrayList<String> i = new ArrayList<String>();
      i.add("String");
      i.add("2335243");
      i.add("jhgfhgfj");
      i.add(null);
      System.out.println(i);
      
      LinkedList<String> k = new LinkedList<>();
      k.add("Linked List first String");
      k.add("Linked list second String");
      k.add("Linked list 3rd string");
      
        System.out.println(k);
        
        ArrayList<String> n = new ArrayList<String>();
        
        Object [] b;
       b  = k.toArray();
       
        System.out.println(b[0]);
       
        
        
      
         
        
    }
    
}
