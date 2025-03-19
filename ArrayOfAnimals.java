// Array of Cat and Dog Objects

/* 
In this example, Animal is a superclass that is extended by Cat and Dog classes. The array animals is declared to store Animal objects. You can then add both Cat and Dog objects to this array and perform operations on them based on their respective types.

*/

//Class Blue Prints first 


class Animal {
    // Common properties and methods for both Cat and Dog can be defined here
}

class Cat extends Animal {
    // Cat-specific properties and methods
}

class Dog extends Animal {
    // Dog-specific properties and methods
}


// Main method to create an array of Animal Objects
// Create 2 Cats
// Create 2 Dogs
// Add Cat and Dog objects to the array
// Access elements in the array 

public class ArrayOfAnimals {
    public static void main(String[] args) {
        // Create an array to store both Cat and Dog objects
        Animal[] animals = new Animal[5];

        // Adding Cat objects to the array
        animals[0] = new Cat();
        animals[1] = new Cat();

        // Adding Dog objects to the array
        animals[2] = new Dog();
        animals[3] = new Dog();
        animals[4] = new Dog();

        // Accessing elements of the array
        for (Animal animal : animals) {
            // Perform actions based on the type of the animal
            if (animal instanceof Cat) {
                System.out.println("This is a Cat");
            } else if (animal instanceof Dog) {
                System.out.println("This is a Dog");
            }
        }
    }
}
