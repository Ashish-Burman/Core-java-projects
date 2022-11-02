/*
 * Program - To understand palindrome number
 * @Author - Ashish Burman
 * @Date - 01 Nov 2022
 */

//declaring package
package com.demo;

//importing packages
import java.util.Scanner;

//declaring class
public class PallindromeExample
{
    //method to check for Palindrome number
	static void checkPalindrome(int number)
    {
        //declaring variables	 
		int remainder = 0;
		int reversedNumber = 0;  //to store the reverse of the given number
		int temp = number;  //to store the copy of the original number
		
		//while loop start
		while(number>0)
		{
			//to extract the last digit
			remainder = number%10;
			
			//to find the reverse of the number
			reversedNumber = (reversedNumber*10)+remainder;
			
			//to remove the last digit
			number = number/10;
		}
		//end of while loop
		
		//to check that the number is same with reversed number or not
		if(reversedNumber == temp)
	        System.out.println(temp + " is a palindrome number.");
		else
			System.out.println(temp + " is not a palindrome number.");
    }
	//end of method
	
	//main method
	public static void main(String[] args)
	{
		//creating object for Scanner
		Scanner sc = new Scanner(System.in);
		
		//declaring local variable
		int originalNumber = 0;
		
		//taking input
		System.out.println("Enter a number:");
		originalNumber = sc.nextInt();
		
		//calling the method
		checkPalindrome(originalNumber);
		
		//to close the program
		sc.close();
	}
	//end of main 
}	
//end of class