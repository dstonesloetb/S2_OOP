package com.mycompany.oopexamples;

import java.util.Scanner;

/**
 * Read in data to create multiple products (using a for loop)
 * store products in an array
 * @author DarrenStones
 */
public class TestProduct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of 3 Employee objects
        Product[] products = new Product[3];

        // Input employee details from the user
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter id of Product [" + (i + 1) + "]: ");
            int id = scanner.nextInt();

            scanner.nextLine();  // Consume the newline character
            
            System.out.print("Enter name of Product [" + (i + 1) + "]: ");
            String name = scanner.nextLine();


            // Create an Employee object and store it in the array
            products[i] = new Product(id, name);
        }

        // Display the details of each employee using the displayDetails() method
        System.out.println("\nOur products include:");
    
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + "\t");
      
            products[i].displayDetails();
            
        }

        
        
        scanner.close();
   }
}
