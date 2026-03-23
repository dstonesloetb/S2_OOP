package com.mycompany.s2oopexamples;

/**
 *
 * @author Student
 */
public class MainGameCharacter {

    public static void main(String[] args) {

        // Create game characters
        GameCharacter character1 =
            new GameCharacter("Paul", "Atreides", 100);

        GameCharacter character2 =
            new GameCharacter("Stilgar", "Fremen", 120);

        // Display status
        character1.displayStatus();
        character2.displayStatus();

        // Character takes damage
        character1.setHealth(75);

        // Display updated status
        System.out.println("After battle:");
        character1.displayStatus();
    }
}
