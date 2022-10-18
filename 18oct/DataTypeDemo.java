/*
Program: To understand data types
@author: Ashish Burman
@Date: 18 oct 2022  
*/

//import packages
import java.util.Scanner;

//declaring a class
class DataTypeDemo
{
	//main method
	public static void main(String args[])
	{
		//creating Scanner object
		Scanner sc =  new Scanner(System.in);
		
		//taking input as character
		System.out.println("Enter a character");
		char charValue = sc.next().charAt(0);
		
		//converting char value to ascii value
		int asciiValue = charValue;
		
		System.out.println("The ASCII value of :" + charValue + " is: "+ asciiValue); // printing the ascii value
			
	}
	// end of main
}
// end of class