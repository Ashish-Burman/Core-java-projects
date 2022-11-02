/*
 * Program - This is demo class to test package
 * @Author - Ashish Burman
 * @Date - 25 Oct 2022
 */

//declaring package
package com.packageTest;

//declaring class
public class Test
{
	//main method
	public static void main(String[] args) 
	{
        //creating a object of Demo class	
		Demo obj1 = new Demo();

		//calling the method
		obj1.printValue();

		//calling static directly with name of class, so no object required
		Demo.printMessage();
    }
    //end of main
}
//end of class