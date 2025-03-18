package com.mycompany.oopexamples;

import java.util.Scanner;

/**
 * Using Car Class 
 * Reading in data to create multiple car objects (without loop*)
 * and storing the car objects in an array 
 * @author DarrenStones
 */
public class UsingCarClass {

    public static void main(String[] args) {
        
        //Scanner for user input
        Scanner input = new Scanner(System.in);
            
                
        //Local variables to store user input car info
        String brand;
        String model;
        int year;
              
                
        //Create an array to store a list of car objects
        //String[] myStrings = new String[10];
        Car[] cars = new Car[3];
        
                
        
        //Program Output Heading
        System.out.println("Car List Program:");
        System.out.println("-----------------");
        
        
        
                
        //Read in info for car 1 from user
        System.out.print("Please input brand for Car 1: ");
        brand = input.nextLine();
        
        System.out.print("Please input model for Car 1: ");
        model = input.nextLine();
        
        System.out.print("Please input year for Car 1: ");
        year = input.nextInt();
        
        input.nextLine();  // Consume the newline character
        
        //Create car 1 
        //Car car5 = new Car("Toyota","Corolla",2024);
        cars[0] = new Car(brand, model, year);        
        
        
        System.out.println("");
        
        
        
        
        
        
        
        //Read in info for car 2 from user

        System.out.print("Please input brand for Car 2: ");
        brand = input.nextLine();
        System.out.print("Please input model for Car 2: ");
        model = input.nextLine();
        System.out.print("Please input year for Car 2: ");
        year = input.nextInt();
        input.nextLine();  // Consume the newline character
        
        //Create car 2 
        cars[1] = new Car(brand, model, year);  
        
        System.out.println("");

        
        
        
        
        
        
        //Read in info for car 3 from user
        System.out.print("Please input brand for Car 3: ");
        brand = input.nextLine();
        System.out.print("Please input model for Car 3: ");
        model = input.nextLine();
        System.out.print("Please input year for Car 3: ");
        year = input.nextInt();
        input.nextLine();  // Consume the newline character
        
        //Create car 3 
        cars[2] = new Car(brand, model, year);  
        
        
        
        
        
        System.out.println("\nOur car list includes:");
        
        //Display cars in array 
        for (Car car : cars)
        {
            car.displayInfo();
        }
                
        
        //Close scanner object
        input.close();
        
    } //end main
} //end class
