/*
Program: To print the remarks according to grade
@author: Ashish Burman
@Date: 19 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class Remarks
{
	// method to print the remarks
	static void printRemarks(char g) // formal arguments
	{	

	   //switch case
	   switch(g)
	   {
		   case 'A':System.out.println("~~~~Excellent performance!!!~~~~");
		          break;
		   case 'B':System.out.println("~~~~Very Good!!!~~~~");
		          break;
		   case 'C':System.out.println("~~~~Good!!! Can do better.~~~~");
		          break;
		   case 'D':System.out.println("~~~~Fair!!! Need to work very hard.~~~~");
		          break;
		   case 'F':System.out.println("~~~~Fail.. Work hard for next time.~~~~");
		          break;
		  default: System.out.println("Invalid grade");

	   }
	// end of switchcase


	}
	//end of method printRemarks

	//main method
	public static void main(String args[])
	{

	   //declaring the object of scanner
		Scanner sc = new Scanner(System.in);

		//declaring variables
		char grade;
		System.out.println("Enter the grade:");
		grade= sc.next().charAt(0);

		//calling method printRemarks
		printRemarks(grade);	

	}

	// end of main
}
// end of class 