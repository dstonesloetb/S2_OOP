package com.mycompany.s2oopexamples;

//Blueprint for a rectangle 

public class Rectangle {
    //instance variables 
    private float length;
    private float width;
    
    //Constructors 
    public Rectangle(float length, float width)
    {
        this.length = length;
        this.width = width;
    }
    
    //Setter and getter methods - skip 
    
    //toString()
    public String toString()
    {
        return "\nLength: "+length +
                "\nWidth: "+width;
    }
    
    //calculate the area of the rectangle
    public float getArea()
    {
        return length * width;
    }

} //end class 
