/*

Animal is the superclass with a constructor to set the name of the animal and a getter method to retrieve the name.
  
Dog is a subclass of Animal with a constructor to set the dog's name and a method chaseAndEat to chase and eat a Cat.

Cat is also a subclass of Animal with a constructor to set the cat's name and a method runAwayFrom to run away from a Dog.

In the Main class, we create instances of Dog and Cat, then demonstrate the Dog chasing and eating the Cat, and the Cat running away from the Dog.

*/






// Animal superclass
class Animal {
    // Common properties and methods for all animals
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Dog subclass
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Method for dog to chase and eat the cat
    public void chaseAndEat(Cat cat) {
        System.out.println(getName() + " is chasing and eating " + cat.getName() + "!");
    }
}

// Cat subclass
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    // Method for cat to run away from the dog
    public void runAwayFrom(Dog dog) {
        System.out.println(getName() + " is running away from " + dog.getName() + "!");
    }
}

public class UsingCatAndDog {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex");
        Cat cat = new Cat("Whiskers");

        // Dog chasing and eating the cat
        dog.chaseAndEat(cat);

        // Cat running away from the dog
        cat.runAwayFrom(dog);
    }
}
