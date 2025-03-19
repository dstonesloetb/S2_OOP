//S2_SampleWeek12

import java.util.Scanner;

class Employee {
    // Instance variables
    String name;
    int age;

    // Constructor
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name + "\t\tAge: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of 3 Employee objects
        Employee[] employees = new Employee[3];

        // Input employee details from the user
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name of Employee [" + (i + 1) + "]: ");
            String name = scanner.nextLine();
            System.out.print("Enter age of Employee [" + (i + 1) + "]: ");
            int age = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            // Create an Employee object and store it in the array
            employees[i] = new Employee(name, age);
        }

        // Display the details of each employee using the displayDetails() method
        System.out.println("\nThe Employees in our company include:");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + "\t");
            employees[i].displayDetails();
        }

        scanner.close();
    }
}
