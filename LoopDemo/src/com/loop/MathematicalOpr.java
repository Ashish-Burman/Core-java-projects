/*
 * Program - To print factorial and prime number
 * @Author - Ashish Burman
 * @Date - 28 Oct 2022
 */

//declaring package
package com.loop;

//importing packages
import java.util.Scanner;

//declaring class
public class MathematicalOpr 
{

	//method to print factorial of a number
	private static void printFactorial(int num)
	{
	    //declaring variables
		long fact = 1;
		//loop start
		for(int i = 1; i <= num; i++)
		{
			//printing factorial
			fact = fact*i;
			System.out.print(fact + " ");
			System.out.println();
		}
		System.out.println("The Factorial is: " + fact);
	}
	//end of method 
	
	//method to check for prime number
	private static void checkPrime(int num)
	{
		boolean flag = false;
		//0 and 1 are neither prime, nor composite
		if(num==0||num==1)
		{
			System.out.println(num + " is not a prime number.");
		}
		else
		{
			//loop start
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					System.out.println(num + " is not a prime number.");
                    flag = true;
                    break;
				}
			}//end of loop
			if(!flag)
			{
				System.out.println(num + " is a prime number.");
			}
		}
	}
	
	//main method
	public static void main(String[] args)
	{
		
		//creating Scanner object
		Scanner sc = new Scanner(System.in);
		//taking input
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		//calling method
		printFactorial(number);
		checkPrime(number);
		sc.close();
	}
	//end of main
}
//end of class