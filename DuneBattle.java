import java.util.Random;

// Class representing a battle between two factions
class DuneBattle {
    private DuneCharacter[] faction1;
    private DuneCharacter[] faction2;

    public DuneBattle(DuneCharacter[] faction1, DuneCharacter[] faction2) {
        this.faction1 = faction1;
        this.faction2 = faction2;
    }

    public void startBattle() {
        Random random = new Random();
        System.out.println("Battle Begins!");
        while (anyFactionAlive(faction1) && anyFactionAlive(faction2)) {
            DuneCharacter attacker = getRandomCharacter(faction1, random);
            DuneCharacter defender = getRandomCharacter(faction2, random);
            int damage = random.nextInt(20) + 1; // Random damage between 1 and 20
            defender.takeDamage(damage);
            System.out.println(attacker.getName() + " attacks " + defender.getName() + " for " + damage + " damage.");
        }
        System.out.println("Battle Ended!");
    }

    private boolean anyFactionAlive(DuneCharacter[] faction) {
        for (DuneCharacter character : faction) {
            if (character.isAlive()) {
                return true;
            }
        }
        return false;
    }

    private DuneCharacter getRandomCharacter(DuneCharacter[] faction, Random random) {
        int index;
        do {
            index = random.nextInt(faction.length);
        } while (!faction[index].isAlive());
        return faction[index];
    }
}
