/*
 * Program - Student class
 * @Author - Ashish Burman
 * @Date - 26 Oct 2022
 */

//declaring packages
package com.student;

//declaring class
public class Student 
{

	//instance variables
	int sid;
	String name;
	String course;
	
	//method to get the details
	public void getDetails(int id,String n, String c)
	{
		
		sid = id;
		name = n;
		course = c;
		
	}
	//end of method
	
	//method to print details
	public void printDetails()
	{
		
	    System.out.println("Student Details are:-");
	    System.out.println("Student ID: "+sid);
	    System.out.println("Student Name: "+name);
	    System.out.println("Student Course: "+course);
	    
	}
	//end of method
	
}
//end of class