package com.mycompany.oopexamples;

/**
 * Blueprint to represent a product
 * @author DarrenStones
 */
class Product {
  // Instance variables
  int productId;
  String name;
  
    // Constructor
  public Product(int productId, String name) {
    this.productId = productId;
    this.name = name;
  }
  
  
  //Setter methods - not implemented here
  
  
  //Getter methods

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }
    
  // Method to display product details
  public void displayDetails() {
    System.out.println("Id: " + productId + "\t\tName: " + name);
  }
}
