/*
 * Program - To understand abstraction, encapsulation and polymorphism
 * @Author - Ashish Burman
 * @Date - 02 Nov 2022
 */

//declaring package
package com.poly;

public class MyCompany
{
	public static void main(String[] args)
	{
		EmployeeDetails e1 = new EmployeeDetails();
		e1.enterDetails(101, "Ashish", 98765.50);
		e1.hikesalary();
		EmployeeDetails e2 = new EmployeeDetails();
		e2.enterDetails(102, "Rounak", 67765.50);
		e2.hikesalary(20);
		System.out.println("***********************************");
		e1.printDetails();
		System.out.println("***********************************");
		e2.printDetails();
		System.out.println("***********************************");
	}

}
