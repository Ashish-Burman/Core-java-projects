/*
 * Program - To understand nested for loop
 * @Author - Ashish Burman
 * @Date - 28 Oct 2022
 */

//declaring package
package com.loop;

//declaring class
public class NestedFor 
{
	//main method
	public static void main(String[] args) 
	{
		// outer for loop
		outer: for (int i = 1; i <= 3; i++) 
		{
			System.out.println();
			
			// inner for loop
			for (int j = 1; j <= 3; j++) 
			{
				//condition
				if (i == j)
					continue outer;  // labelled break
				System.out.print(j + " ");
		    }
		    // end of inner loop
        }
	    // end of outer loop
    }
    //end of main
}
//end of class