/*
 * Program - Student class
 * @Author - Ashish Burman
 * @Date - 26 Oct 2022
 */

//declaring packages
package com.test;

import java.util.Scanner;

//importing Student packages
import com.student.Student;

//declaring class
public class StudentTest 
{

	//main method
	public static void main(String args[])
	{
		
		//creating object of Student class
		Student s1 = new Student();
		Student s2 = new Student();
		
		//declaring an object of Scanner
		Scanner sc = new Scanner(System.in);
		
		//declaring variables
		int id;
		String name, course;
		
		//taking input for first student
		System.out.println("Enter the details of first student:");
		System.out.println("Enter the Student ID:");
		id = sc.nextInt();
		System.out.println("Enter the Student Name:");
		name = sc.next();
		System.out.println("Enter the Student Course:");
		course = sc.next();
		
		//calling the method getDetails
		s1.getDetails(id, name, course);
		
		//calling the method printDetails
		System.out.println("---------------------------------");
		s1.printDetails();
		System.out.println("---------------------------------");
		
		//taking input for second student
		System.out.println("Enter the details of second student:");
		System.out.println("Enter the Student ID:");
		id = sc.nextInt();
		System.out.println("Enter the Student Name:");
		name = sc.next();
		System.out.println("Enter the Student Course:");
		course = sc.next();
				
		//calling the method getDetails
		s2.getDetails(id, name, course);
				
		//calling the method printDetails
		System.out.println("---------------------------------");
		s2.printDetails();
		System.out.println("---------------------------------");
		sc.close();
		
	}
	//end of main
	
}
//end of class
