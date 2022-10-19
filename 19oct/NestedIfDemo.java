/*
Program: To understand Nested-If 
@author: Ashish Burman
@Date: 19 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class NestedIfDemo
{
	//main method
	public static void main(String args[])
	{
		//declaring the object of scanner
		Scanner sc = new Scanner(System.in);

		//declaring variables
		int age;
		float weight;

		//Taking input of age 
		System.out.println("Enter your age:");
		age= sc.nextInt();

		//Checking age criteria
		if(age>=18)
		{
			//Taking input of weight
			System.out.println("Enter your weight:");
		    weight= sc.nextFloat();

			//checking weight criteria
			if(weight>=50)
				System.out.println("!!!!!!You can donate the blood!!!!!!");
		    else
				System.out.println("!!!You are underweight... Please start eating healthy foods!!!");
			//end of nested ifelse

		}
		else
			System.out.println("!!!You are too young to donate blood... Please wait!!!" );
		//end of outer ifelse	


	}

	// end of main
}
// end of class 