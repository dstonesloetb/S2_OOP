/**
 * Test Car Class
 * @author DarrenStones
 */

import java.util.Scanner;

public class TestCarClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create objects of the Car Class
        Car car1 = 
            new Car("Toyota","Camry",2020);

        Car car2 = new Car("Honda");
        car2.setModel("Civic");
        car2.setYear(2008);

        Car car3 = new Car();
        car3.setBrand("Tesla");
        car3.setModel("S");
        car3.setYear(2024);


        Car car4 = 
            new Car("Hyundai","i40",2024);

        //Display info about car1
        System.out.println("\nInformation about Car 1");
        car1.displayInfo();
        System.out.println();

        //Display info about car2
        System.out.println("\nInformation about Car 2");
        car2.displayInfo();
        System.out.println();

        //Display car3
        System.out.println("Info about Car 3:");
        System.out.println("Brand: "+car3.getBrand());
        System.out.println("Model: "+car3.getModel());
        System.out.println("Year: "+car3.getYear());

        //Display info about car4
        System.out.println("\nInformation about Car 4");
        System.out.println(car4.toString());
        System.out.println(); 


        //Scanner for user input
        Scanner input = new Scanner(System.in);


        //Local variables to store user input car info
        String brand;
        String model;
        int year;


        //Create an array to store a list of car objects
        //String[] myStrings = new String[10];
        Car[] cars = new Car[3];



        //Program Output Heading
        System.out.println("Car List Program:");
        System.out.println("-----------------");




        //Read in info for car 1 from user
        System.out.print("Please input brand for Car 1: ");
        brand = input.nextLine();

        System.out.print("Please input model for Car 1: ");
        model = input.nextLine();

        System.out.print("Please input year for Car 1: ");
        year = input.nextInt();

        input.nextLine();  // Consume the newline character

        //Create car 1 
        //Car car5 = new Car("Toyota","Corolla",2024);
        cars[0] = new Car(brand, model, year);        


        System.out.println("");







        //Read in info for car 2 from user

        System.out.print("Please input brand for Car 2: ");
        brand = input.nextLine();
        System.out.print("Please input model for Car 2: ");
        model = input.nextLine();
        System.out.print("Please input year for Car 2: ");
        year = input.nextInt();
        input.nextLine();  // Consume the newline character

        //Create car 2 
        cars[1] = new Car(brand, model, year);  

        System.out.println("");







        //Read in info for car 3 from user
        System.out.print("Please input brand for Car 3: ");
        brand = input.nextLine();
        System.out.print("Please input model for Car 3: ");
        model = input.nextLine();
        System.out.print("Please input year for Car 3: ");
        year = input.nextInt();
        input.nextLine();  // Consume the newline character

        //Create car 3 
        cars[2] = new Car(brand, model, year);  





        System.out.println("\nOur car list includes:");

        //Display cars in array 
        for (Car car : cars)
        {
            car.displayInfo();
        }


        //Close scanner object
        input.close();
      


      
    } //end main

} //end class
