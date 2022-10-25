/*
Program: To understand variable
@author: Ashish Burman
@Date: 21 oct 2022  
*/

//import packages 
import java.util.Scanner;

//declaring a class
class Variable
{
	// instance variable
	int age ;  
	String name;
	//static variable
	static int year; 
	
	//main method started
	public static void main(String args[])
	{
     
	 System.out.println(year);

	 int local;   //local variable

	 // to call non-static
	 Variable v1= new Variable();  //creating object
	 System.out.println(v1.age);
	 System.out.println(v1.name);

	  //System.out.println(local); has to be intialized

	}
	// end of main

}
// end of class 