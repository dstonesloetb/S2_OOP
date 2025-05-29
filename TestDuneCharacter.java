// Example of usage - DuneCharactersDemo
public class TestDuneCharacter {
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