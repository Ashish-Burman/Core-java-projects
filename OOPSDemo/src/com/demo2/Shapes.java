/*
 * Program - To perform abstraction, encapsulation and polymorphism
 * @Author - Ashish Burman
 * @Date - 01 Nov 2022
 */

//declaring package
package com.demo2;

//declaring class
public class Shapes
{
	//instance variables
	double area;

	// polymorphsm with number of arguments
	
	//method to calculate area of rectangle
	void calculateArea(float length, float breadth)
	{
		//calculating area of rectangle
		area = length * breadth;
		System.out.println("The area of rectangle is:" + area);
	}
	//end of method

	//method to calculate area of square
	void calculateArea(float side) 
	{
		//calculating area of square
		area = side * side;
		System.out.println("The area of square is:" + area);
    }
	//end of method

	// polymorphsm with number of type
	
	//method to calculate area of circle
	void calculateArea(double radius) 
	{
		//calculating area of circle
		area = 3.14 * radius * radius;
		System.out.println("The area of circle is:" + area);
    }
    //end of method 
}
//end of class