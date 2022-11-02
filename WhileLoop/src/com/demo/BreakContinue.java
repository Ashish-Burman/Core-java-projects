/*
 * Program - To understand 'break' and 'continue' keywords
 * @Author - Ashish Burman
 * @Date - 28 Oct 2022
 */

//declaring package
package com.demo;

//declaring class
public class BreakContinue 
{
	// main method
	public static void main(String args[])
	{
		// break : this keyword is used to come out of the loop

		System.out.println("-------With Break------");
		for (int i = 0; i <= 10; i++) 
		{
			if (i == 5)
				break;
			System.out.println(i);
		}
		//end of loop
		
		// continue : this keyword skips the iteration for that
		//            particular value or condition
		
		System.out.println("-------With continue-------");
		for (int i = 0; i <= 10; i++) 
		{
			if (i == 5)
				continue; 
			System.out.println(i); // these statements are skipped
		}
		//end of loop
	}
    //end of main
}
//end of class