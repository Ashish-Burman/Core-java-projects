/*
 * Program - This is demo class to test package
 * @Author - Ashish Burman
 * @Date - 25 Oct 2022
 */

//declaring package
package com.myPack;

//importing the package 
import com.packageTest.Demo;

//declaring a class to test package demo
public class Test1 
{
	//main method
	public static void main(String[] args)
	{
        //creating a object of Demo class	
		Demo obj1 = new Demo();

		//calling the method
		obj1.printValue(); // all method should be public

		//calling static directly with name of class, so no object required
		Demo.printMessage();
    }
    //end of main
}
//end of class