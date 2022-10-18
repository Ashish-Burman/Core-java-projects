 /*
Program: To understand IF-ELSE
@author: Ashish Burman
@Date: 18 oct 2022  
*/
//importing packages
import java.util.*;

//declaring a class
class IfElseDemo
{
	public static void main(String args[])
	{
		//creating Scanner object
		Scanner sc= new Scanner(System.in);

		// creating variables
		System.out.println("Enter first number:");
		int num1= sc.nextInt();
		System.out.println("Enter second number:");
		int num2= sc.nextInt();

		if(num1>num2)
			System.out.println("The greater number is :"+num1);
		else
		   System.out.println("The greater number is :"+num2);	


	}


	// end of main
}
// end of class 