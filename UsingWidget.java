package com.mycompany.s2oopexamples;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class UsingWidget {

    public static void main(String[] args) {

        //Create a scanner object
        //Scanner input = new Scanner(System.in);
        
        //Create a widget object int,String,float
        //Widget w1 = new Widget();
        Widget w1 = new Widget(1, "Globe", 5.50f);
        
        //Show Widget 1 
        System.out.println("Widget 1");
        System.out.println("--------");
        System.out.println(w1.toString());
        
        System.out.println("\n"+w1.displayInstructions());
        
        //w1.idNo = -1;  //set a bad data value 
        
        //Create a second widget with just the idNo 
        Widget w2 = new Widget(2);
        
        System.out.println("\nWidget 2");
        System.out.println("--------");
        System.out.println(w2.toString());
        
        //update widget 2 using the setter methods
        w2.setDescription("Mug");
        w2.setPrice(12.50f);
        
        System.out.println("\nUpdated Widget 2");
        System.out.println("------------------");
        System.out.println(w2.toString());
        
        //Create a third widget using the no args constructor
        Widget w3 = new Widget();
        
        System.out.println("\nWidget 3");
        System.out.println("--------");
        System.out.println(w3.getIdNo());
        System.out.println(w3.getDescription());
        System.out.println(w3.getPrice());
        
        float price = w3.getPrice(); //store the price 
                
    }//end main 
} //end class 
