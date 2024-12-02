/*
This code defines a DuneCharacter class as the main class representing characters in the Dune universe. It also provides subclasses like Fremen and BeneGesserit which represent specific groups in the Dune universe. The main method in DuneCharactersDemo demonstrates how you might create instances of these classes and print out their details.

You can extend this code by adding more classes for other characters or concepts in the Dune universe, and defining additional properties and methods as needed.

*/

// Main class representing a character in the Dune universe
// Class is a blueprint or a template
// to model real world objects 

//Super class 

class DuneCharacter {
  //instance variables - properties 
  private String name;
  private String affiliation;
  private String role;

  //Constructor
  public DuneCharacter(String name, String affiliation, String role) {
    this.name = name;
    this.affiliation = affiliation;
    this.role = role;
    }

  //Setter and getter methods
  //Used to interact with the private instance variables 
    public String getName() {
        return name;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public String getRole() {
        return role;
    }

  //Method to properly display the object
  @Override
  public String toString() {
        return "Name: " + name + ", Affiliation: " + affiliation + ", Role: " + role;
    }
}

//Example of inheritance 

// Example of subclass: Fremen
class Fremen extends DuneCharacter {

  //instance variables - unique properties of the fremen
  private String tribe;

  //Constructor
  public Fremen(String name, String tribe) {
    super(name, "Fremen", "Warrior");
    this.tribe = tribe;
  }

  //Setter and Getter methods
  public void setTribe(String tribe)
  {
    this.tribe = tribe;
  }
  
  public String getTribe() {
        return tribe;
  }


  //Method to display the fremen 
  @Override
    public String toString() {
        return super.toString() + ", Tribe: " + tribe;
    }
}

//Example of inheritance 

//Subclass 

// Example of subclass: Bene Gesserit
class BeneGesserit extends DuneCharacter {

  //instance variable 
  private String sisterhoodRank;

  //Constructor 
  public BeneGesserit(String name, String sisterhoodRank) {
        super(name, "Bene Gesserit", "Reverend Mother");
        this.sisterhoodRank = sisterhoodRank;
    }

  //Setter and getter methods
    public String getSisterhoodRank() {
        return sisterhoodRank;
    }

  public void setSisterhoodRand(String sisterhoodRank)
  {
      this.sisterhoodRank = sisterhoodRank;
  }

  //Method to display the BeneGesserit
  @Override
  public String toString() {
        return super.toString() + ", Sisterhood Rank: " + sisterhoodRank;
    }
}

// Example of usage - DuneCharactersDemo
public class Main {
  public static void main(String[] args) {

    //Create a Fremen object
    Fremen paul = new Fremen("Paul Atreides", "Sietch Tabr");

    //Create a BeneGesserit object   
    BeneGesserit jessica = new BeneGesserit("Lady Jessica", "Reverend Mother");

    //Display both objects
    System.out.println(paul.toString());

    System.out.println("\n");
    
    System.out.println(jessica);
  }
}
