/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.Scanner;

/**
 *
 * @author Darshanvyadav
 */
public class NewClass {
    
    
   

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int [] myArray = new int[n];
        
        for (int y = 0; y<n;y++)
        {
            myArray[y] = scan.nextInt();
        }
    
}

}