package com.mycompany.s2oopexamples;

import java.util.Scanner;

public class UsingGameCharacter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an array to store Game Character objects
        GameCharacter[] listChars = new GameCharacter[10];
        
        //Create a scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input characters details from the user
        for (int i = 0; i < 3; i++) {
          System.out.print("Enter Name of Character [" + (i + 1) + "]: ");
          String name = scanner.nextLine();
            
        System.out.print("Enter Faction of Character [" + (i + 1) + "]: ");
        String faction = scanner.nextLine();
                        
        System.out.print("Enter Health of Character [" + (i + 1) + "]: ");
        int health = scanner.nextInt();

          scanner.nextLine();  // Consume the newline character
           
          // Create an Employee object and store it in the array
          listChars[i] = new GameCharacter(name, faction, health);
        } //end for        
        
        System.out.println("\nList of characters:");
        
        //Display cars in array 
        for (GameCharacter character : listChars)
        {
            if (character!=null){
                character.displayStatus();
            }         
        } //end for      
    } //end main    
} //end class
