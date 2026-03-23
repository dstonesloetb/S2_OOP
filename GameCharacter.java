package com.mycompany.s2oopexamples;

/**
 *
 * @author Student
 */
public class GameCharacter {

    // Private instance variables
    private String name;
    private String faction;
    private int health;

    // Constructor
    public GameCharacter(String name, String faction, int health) {
        this.name = name;
        this.faction = faction;
        this.health = health;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getFaction() {
        return faction;
    }

    public int getHealth() {
        return health;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // Display character info
    public void displayStatus() {
        System.out.println("Character: " + name);
        System.out.println("Faction: " + faction);
        System.out.println("Health: " + health);
        System.out.println("----------------------");
    }
}
