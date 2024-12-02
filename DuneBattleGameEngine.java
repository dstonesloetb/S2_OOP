// DuneUniverse
// Main Game Engine to Create Characters,
// Play battle
// Output list of characters at end of the battle

public class DuneBattleGameEngine {
    public static void main(String[] args) {
        DuneCharacter[] atreides = {
                new DuneCharacter("Paul Atreides", "Atreides", "Duke", 100),
                new DuneCharacter("Lady Jessica", "Atreides", "Bene Gesserit", 80),
                new DuneCharacter("Duncan Idaho", "Atreides", "Swordmaster", 90)
        };

        DuneCharacter[] harkonnens = {
                new Harkonnen("Baron Vladimir Harkonnen", 120),
                new Harkonnen("Feyd-Rautha Harkonnen", 100),
                new Harkonnen("Piter De Vries", 80)
        };

      /*
      //Display characters before battle

      for (DuneCharacter atreide : atreides)
      {
          System.out.println(atreide);
      }

      System.out.println("\n");


      for (DuneCharacter harkonnen : harkonnens)
      {
        System.out.println(harkonnen);
      }

      */

      //Play game
      
      DuneBattle battle = new DuneBattle(atreides, harkonnens);
      battle.startBattle();

      //Display characters after battle

      /*
      
      for (DuneCharacter atreide : atreides)
      {
          System.out.println(atreide);
      }

      System.out.println("\n");


      for (DuneCharacter harkonnen : harkonnens)
      {
        System.out.println(harkonnen);
      }

      */
      
      
      
    }
}
