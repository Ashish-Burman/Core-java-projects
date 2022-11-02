/*
 * Program - To make diamond shape using for loop
 * @Author - Ashish Burman
 * @Date - 28 Oct 2022
 */

//declaring package
package com.pattern;

//declaring class
public class Star 
{
	//method to create the diamond shape
	static void starPattern(int rows)
	{
		//declaring variables
		int i,j;
		
		//method to create upper part of the shape
		//loop start
		for(i=1; i<=5; i++)
		{
			System.out.println();
			
			//loop start
			for(j=5; j>=i; j--)
			{
				System.out.print(" ");
			}
			//end of loop
			
			//loop start
			for(j=1; j<=i; j++)
			{
				System.out.print(" *");
			}
			//end of loop
		}
		//end of loop
		
		//method to create lower part of the shape
		//loop start
		for(i=5; i>=1; i--)
		{
			System.out.println();
			
			//loop start
			for(j=i; j<=5; j++)
			{
				System.out.print(" ");
			}
			//end of loop
			
			//loop start
			for(j=i; j>=1; j--)
			{
				System.out.print(" *");
			}
			//end of loop
		}
		//end of loop
	}
	//end of method
	
	//main method
	public static void main(String[] args)
    {
        //calling method
		starPattern(9);
    }
    //end of main
}
//end of class