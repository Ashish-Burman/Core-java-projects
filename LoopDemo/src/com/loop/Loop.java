/*
 * Program - To understand loop
 * @Author - Ashish Burman
 * @Date - 28 Oct 2022
 */

//declaring package
package com.loop;

//importing packages
import java.util.Scanner;

//declaring class
public class Loop
{

	//instance variables
	int number;
	
	//method to print even and odd numbers
	public void evenOdd()
	{
		
		//printing even numbers
		System.out.println("First 10 Even numbers are:");	
		//loop start
		for(int i=1;i<=20;i++)
		{
			if((i%2)==0)
			System.out.println(i);
		}
		//end of loop
		
		//printing odd numbers
		System.out.println("First 10 Odd numbers are:");	
		//loop start
		for(int i=1;i<=20;i++)
		{
			if((i%2)!=0)
			System.out.println(i);
		}
		//end of loop
	}
	//end of method
	
	// method to print table of a number
	public void table(int num)
	{
		number = num;
		//printing table
		//loop start
		for(int i=1;i<=10;i++)
			{
			System.out.println(number+" x "+i+" = "+(number*i));
			}
	        //end of loop
	}
	
	//method to print pattern
	public void pattern1()
	{
		
		System.out.println("The pattern is:");	
		//outer loop start
		for(int i=1;i<=5;i++)
		{
			//inner loop start
			for(int j=1;j<=i;j++)
				System.out.print(j);
			//end of inner loop
			System.out.println();
		}
		//end of outer loop
	}
	
	//main method start
		public static void main(String args[])
		{
			//creating Scanner object
			Scanner sc= new Scanner(System.in);

			//creating object of class
					Loop l = new Loop();
					
			// taking input
			System.out.println("Enter the number whose table is to be printed:");
			int n = sc.nextInt();
			
			//calling the method 
					l.evenOdd();
					System.out.println("---------------------------------");
					l.table(n);
					System.out.println("---------------------------------");
					l.pattern1();
					sc.close();
				
	    }
	    // end of main
}
//end of class