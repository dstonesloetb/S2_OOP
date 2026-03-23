package com.mycompany.s2oopexamples;

/**
 * A class is also known as a blueprint 
 * Create an OOP Blueprint or template
 * 
 */

//Class declaration 
public class Widget {
    //Instance variables (fields)
    //Describe the properties of the object 
    private int idNo; 
    private String description;
    private float price; 
    
    //Constructors
    public Widget(int idNo, String description, float price){
        //set the idNo for this object to 
        //idNo parameter variable 
        this.idNo = idNo;
        this.description = description;
        this.price = price; 
    }
    
    //Constructor overloading is having multiple
    //constructors in the same class with different
    //number of parameters 
    
    //1 argument constructor 
    public Widget(int idNo){
        this.idNo = idNo;
        this.description = "Unspecified widget";
        this.price = 0.0f;
    }
    
    //no args constructor
    public Widget()
    {
        this.idNo = -1;
        this.description = "Unspecified widget";
        this.price = 0.0f;
    }
    
    //Setter and getter methods
    //public interface to allow
    //external classes access our private
    //instance variables 
    public void setIdNo(int idNo)
    {
        this.idNo = idNo; 
    }
    
    public void setDescription(String description)
    {
        this.description = description; 
    }
    
    public void setPrice(float price)
    {
        this.price = price; 
    }
    
    
    public int getIdNo()
    {
        return idNo;
    }
    
    public String getDescription()
    {
        return this.description;
    }
    
    public float getPrice()
    {
        return this.price;
    }
        
    
    //Additional methods - optional 
    public String displayInstructions()
    {
        return "Instructions are now online...";
    }
        
    //toString method 
    public String toString()
    {
        return "idNo: "+idNo +
                "\nDescription: " + description +
                "\nPrice: " + price;
    }
    
} //end class 
