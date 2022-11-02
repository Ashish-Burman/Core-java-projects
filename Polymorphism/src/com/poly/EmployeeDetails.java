/*
 * Program - To understand abstraction, encapsulation and polymorphism
 * @Author - Ashish Burman
 * @Date - 02 Nov 2022
 */

//declaring package
package com.poly;

public class EmployeeDetails 
{
	//instance variables
    private int empID;
    private String empName;
    private double salary;
	float rate = 5.0f;
    
	//method to enter employee's details
		void enterDetails(int id, String name, double sal)
		{
			empID = id;
			empName = name;
			salary = sal;
		}
		//end of method
		void printDetails()
		{
			System.out.println("Employee Name: " + empName);
			System.out.println("Employee ID: " + empID);
			System.out.println("Salary: " + salary);
		}
		void hikesalary()
		{
			salary = salary + ((rate/100) * salary);
		}
		void hikesalary(float hikeRate)
		{
			salary = salary + ((hikeRate/100) * salary);
		}
}
