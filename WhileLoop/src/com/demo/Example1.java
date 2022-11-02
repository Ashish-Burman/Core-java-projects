/*
 * Program - To understand while loop and do-while loop
 * @Author - Ashish Burman
 * @Date - 28 Oct 2022
 */

//declaring package
package com.demo;

//importing packages
import java.util.Scanner;

//declaring class
public class Example1 
{
	//instance variables
	private static String fruit;

	//main method
	public static void main(String[] args)
	{
		//local variables
		int i = 0;
		boolean ch = false;
		//while loop
		while (i <= 10)
		{
		System.out.println(i);
    	i++;
	    }
		//end of loop

		//Creating Scanner object
		Scanner sc = new Scanner(System.in);
		
		//do-while loop
		do   // ch==true
		{
			//taking input
			System.out.println("Enter a fruit:");
			fruit = sc.next();
			
			//asking user's choice
			System.out.println("Do you want to enter more (true/false):");
			ch = sc.nextBoolean();
		}
		//end of do part
		while (ch);
		//end of do-while
		System.out.println("!!Thank You!!");

		sc.close();
	}
    //end of main
}
//end of class