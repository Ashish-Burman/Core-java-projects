/*
 * Program - To understand loop
 * @Author - Ashish Burman
 * @Date - 28 Oct 2022
 */

//declaring package
package com.loop;

public class Example 
{
	// infinite for loop
	static void infiniteLoop() 
	{	
		for (;;) 
		{
			System.out.println("Hello");
		}
		//end of loop
	}
	//end of method
	
	//method to print table of any number
	private static void printTable(int num)
	{
		//loop to print table
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(num + " X " + i + " = " + (num * i));
	    }
        //end of loop
	}
	//end of method
	
	//main method
	public static void main(String[] args)
	{
		// for loop to print 1 to 10
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(i);
		}
		//end of loop

		// for loop to print horizontally
		for (int i = 1; i <= 5; i++) 
		{
			System.out.print(i + "  ");
		}
		//end of loop
		
		//calling method with arguements 
		printTable(Integer.parseInt(args[0]));
		
		//calling infinite loop
        infiniteLoop();
	}
    //end main
}
//end class