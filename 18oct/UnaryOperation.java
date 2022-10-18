/*
Program: To understand unary operators
@author: Ashish Burman
@Date: 18 oct 2022  
*/

//import packages
import java.util.Scanner;

//declaring a class
class UnaryOperation
{
	//main method
	public static void main(String args[])
	{
		//creating Scanner object
		Scanner sc =  new Scanner(System.in);
		
		//taking input of 3 number
		System.out.println("Enter first number");
		int number1 = sc.nextInt();
		System.out.println("Enter second number");
		int number2 = sc.nextInt();
		System.out.println("Enter third number");
		int number3 = sc.nextInt();
		int sum = 0;
		
		//operations for prefix operator 
		System.out.println("The given number is: " + number1);
		sum = ++number1; 
		System.out.println("Value of sum is: " + sum);
		System.out.println("New value of number1 is:" + number1);
		 
		System.out.println("The given number is: " + number1);
		sum = --number1; 
		System.out.println("Value of sum is: " + sum);
		System.out.println("New value of number1 is:" + number1);
		 
		//operations for postfix operator 
		System.out.println("The given number is: " + number2);
		sum = number2++; 
		System.out.println("Value of sum is: " + sum);
		System.out.println("New value of number2 is:" + number2);
		 
		System.out.println("The given number is: " + number2);
		sum = number2--; 
		System.out.println("Value of sum is: " + sum);
		System.out.println("New value of number2 is:" + number2);
		
		//operations for not operator 
		System.out.println("The given number is: " + number3);
		sum = ~number3; 
		System.out.println("Value of sum is: " + sum);
			
	}
	// end of main
}
// end of class