/*
Program: To understand data types
@author: Ashish Burman
@Date: 18 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class Operators
{
	//main method
	public static void main(String args[])
	{
	  //declaring variables
	  int number1 = 92;
	  int number2 = 6;

	  //Arithmetic operators
	  System.out.println("Addition: "+(number1+number2));
	  System.out.println("Difference: "+(number1-number2));
	  System.out.println("Product: "+(number1*number2));
	  System.out.println("Quotient: "+(number1/number2));
	  System.out.println("Remainder: "+(number1%number2));
      System.out.println("****************************************************");
	  
	  //Comparison operators
	  System.out.println(number1>number2);
	  System.out.println(number1<number2);
	  System.out.println(number1==number2);
	  System.out.println(number1!=number2);
	  System.out.println("****************************************************");

	  //Bitwise operators
	 int x=6,y=8; //Declaring new variables
	 System.out.println("Value for And:"+ (x&y));
	 System.out.println("Value for OR:"+ (x|y));
	 System.out.println("Value for Not:"+ (~x));
	 System.out.println("Value for XOR:"+ (x^y));
	 System.out.println(20<<3);                     // left shift(20 *(2^3)) 
	 System.out.println(20>>3);                     // right shift(20/ (2^3))
	 System.out.println("****************************************************");

	 //Boolean operators
	 boolean status;
	 System.out.println(status= (true&&false));
     System.out.println( (x>=5)||(y>=10));

	}
    // end of main
}
// end of class 