/*
 * Program - To perform abstraction, encapsulation and polymorphism
 * @Author - Ashish Burman
 * @Date - 01 Nov 2022
 */

//declaring package
package com.demo2;

//declaring class
public class PolyDemo 
{
	//main method
	public static void main(String[] args)
	{
		//creating object for Shapes class for Square
		Shapes square = new Shapes();
		//calling method for area of Square
		square.calculateArea(89.7f);

		//creating object for Shapes class for Rectangle
		Shapes rectangle = new Shapes();
		//calling method for area of Rectangle
		rectangle.calculateArea(54.3f, 67.5f);

		//creating object for Shapes class for Circle
		Shapes circle = new Shapes();
		//calling method for area of Circle
		circle.calculateArea(5.4);
	}
    //end of main
}
//end of class