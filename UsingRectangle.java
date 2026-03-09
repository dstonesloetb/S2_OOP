package com.mycompany.s2oopexamples;

import java.util.Scanner;

public class UsingRectangle {

    public static void main(String[] args) {
        
        //Create scanner object
        Scanner in = new Scanner(System.in);
        
        // Create an array to store 3 rectangles
        Rectangle[] rects = new Rectangle[3];
        
        // Read in data for 3 rectangles
        // Create the 3 rectangles and store the 
        // rectangles in an array 
        float width=0.0f;
        float length = 0.0f;
        
        //Program Header
        System.out.println("Rectangles Program");
        System.out.println("------------------");
        
        //Read in data for 3 rectangles and store each
        //rectangle in an array
        
        for(int i=0; i< rects.length; i++)
        {
            System.out.print("Please enter length for rect "+(i+1)+" : ");
            length = in.nextFloat();
            
            System.out.print("Please enter width for rect "+(i+1)+" : ");
            width = in.nextFloat();
            
            //Create and store the next rectangle in the array
            rects[i] = new Rectangle(length, width);
            
            System.out.println();
        } //end for
            
            
        //Output the 3 rectangles stored in the array
        int count = 1;
        for (Rectangle rect : rects)
        {
            System.out.println("\nRectangle "+count);
            System.out.println("---------------");
            System.out.println(rect.toString());
            System.out.println("Area : "+rect.getArea());
            count++;  //update rectangle number
        }
        
        System.out.println("\n");
        
        //Calculate and display the area of the
        //second rectangle 
        float area = rects[1].getArea();
        System.out.println("Area rect 2: "+area);
                
    } //end main 
    
} //end class  
