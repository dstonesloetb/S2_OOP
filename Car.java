/**
 * Car Class Demo
 * @author DarrenStones
 */

//A Class is a blueprint or a template
//to model real world objects
//Once we have a blueprint we can create
//multiple objects from the blueprint

//Class Declaration 
public class Car {
  //instance variables (fields)
  //describe the properties of the class
  private String brand;
  private String model;
  private int year;

  //Constructor overloading
  //Multiple constructors in the same class
  //with different number of parameters 

  //Constructors - default full constructor
  public Car(String brand, String model, int year)
  {
      this.brand = brand;
      this.model = model;
      this.year = year;
  }

  //Constructor with one argument
  public Car(String brand)
  {
      this.brand = brand;
      this.model = "not specified";
      this.year = 0;
  }

  //Default Constructor with no arguments 
  public Car()
  {
      this.brand = "brand not specified";
      this.model = "model not specified";
      this.year = 0;
  }

  //Setter and Getter Methods
  public void setBrand(String brand)
  {
      this.brand = brand;
  }

  public String getBrand()
  {
      return brand;
  }

  public String getModel() 
  {
    return model;
  }

  public void setModel(String model) 
  {
    this.model = model;
  }

  public void setYear(int year)
  {
    this.year = year;
  }

  public int getYear()
  {
    return year;
  }


  //Additional methods

  //Display Car info
  public void displayInfo()
  {
    System.out.println("Brand: "+brand);
    System.out.println("Model: "+model);
    System.out.println("Year: "+year);
  }

  public String toString()
  {
      return "Brand: " + brand +
              "\nModel: " + model +
              "\nYear: " + year;
  }

  public void start()
  {
      System.out.println("The car is starting...");
  }

  

} //end class 
