/*
 * Program - To make pattern using for loop
 * @Author - Ashish Burman
 * @Date - 28 Oct 2022
 */

//declaring package
package com.pattern;

//declaring class
public class Pyramid1
{
	//method to create first pattern
	static void pattern1(int num)
	{
		//outer loop
		for(int i=1; i<=num; i++)
		{
			System.out.println();
			
			//inner loop
			for(int j=1; j<=i; j++)
				System.out.print(j+" ");   //end of inner loop
		}
		//end of outer loop
	}
	//end of method
	
	//method to create second pattern
	static void pattern2(int num)
	{
		//outer loop
		for(int i=num; i>=1; i--)
		{
			//inner loop
			System.out.println();
			for(int j=1; j<=i; j++)
				System.out.print(j+" ");  //end of inner loop
		}
		//end of outer loop
	}
	//end of method
	
	//main method
	public static void main(String[] args)
    {
	    //calling methods
		pattern1(8);
        pattern2(7);
    }
	//end of main
}
//end of class