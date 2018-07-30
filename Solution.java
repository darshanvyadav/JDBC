/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;
   import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 *
 * @author Darshanvyadav
 */
class Food {
     public  void serveFood()
   {
       System.out.println("");
   }
}

class FastFood extends Food{
   
    
   public  void serveFood()
   {
       System.out.println("I'm serving ff");
   }
}

class Fruit extends Food{
     
    public  void  serveFood()
   {
      System.out.println("I'm serving fruit");
   }
}


class FoodFactory extends Food {
   public  Food getFood(String s1)
   { 
       if (s1.equals("FastFood"))
       {
           return new FastFood();
       }
       else if (s1.equals("Fruit"))
       {
           return new Fruit();
       }
       
       else return new FastFood();
   }
    
}

public class Solution {
    public static void main(String[] args) {
        FoodFactory myFoods = new FoodFactory();
        Food food1 = myFoods.getFood("FastFood");
        Food food2 = myFoods.getFood("Fruit");	
        System.out.println("My name is: " + food1.getClass().getName());
        System.out.println("My name is: " + food2.getClass().getName());
        System.out.println("Our superclass is: " 
                            + food1.getClass().getSuperclass().getName());
        food1.serveFood();
        food2.serveFood();
        
    }
}
    

