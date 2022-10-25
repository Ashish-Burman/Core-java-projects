/*
Program: To understand the concept of variable
@author: Ashish Burman
@Date: 21 oct 2022  
*/

//import packages 
import java.util.Scanner;

//declaring a class
class VariableDemo
{
	int age ;     // instance variable
	static int year;   //static variable

	//main started
	public static void main(String args[])
	{
     
	 // System.out.println(age); 
	 //we cannot call a non static member from static method

	 System.out.println(year);  // static can be called from static method
	}

	// end of main
}
// end of class 
