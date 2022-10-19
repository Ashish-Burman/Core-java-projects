/*
Program: To print report card of a student
@author: Ashish Burman
@Date: 19 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class StudentReportCard
{

	static void calcPercentage(float m1,float m2, float m3) //formal parameter
	{
		float percentage; //declaring variable
		//calculating percentage
		percentage = ((m1+m2+m3)/300)*100;
		
		//To print the percentage
		System.out.println("Overall percentage is: "+percentage+"%");

		//calling method calcGrade
		calcGrade(percentage);

	}
	//end of calcPercentage

	// method to calculate grade
	static void calcGrade(float percentage) // formal arguments
	{	
	  char grade;
		//checking percentage to cal grade
		if(percentage>=85)
	     	 grade='A';
		 else if(percentage>=70)
			  grade='B';
		      else if(percentage>=55)
				    grade='C';
	                 else if(percentage>=40)
                           grade='D';
                           else
                             grade='F';
		//end of ifelse	

        //printing grade
		if(grade=='F') 
	      System.out.println("Sorry!! You have failed..");
	   else
            System.out.println("You have cleared the exam with grade:"+grade);		

        //calling method to print remarks
		printRemarks(grade);

	}
	//end of method calcGrade

	// method to print the remarks
	static void printRemarks(char gr) // formal arguments
	{	

	   //switch case
	   switch(gr)
	   {
		   case 'A':System.out.println("~~~~Excellent performance!!!~~~~");
		          break;
		   case 'B':System.out.println("~~~~Very Good!!!~~~~");
		          break;
		   case 'C':System.out.println("~~~~Good!!! Can do better.~~~~");
		          break;
		   case 'D':System.out.println("~~~~Fair!!! Need to work very hard.~~~~");
		          break;
		   case 'F':System.out.println("~~~~Fail.. Work hard for next time.~~~~");
		          break;
		  default: System.out.println("Invalid grade");

	   }
	// end of switchcase


	}
	//end of method printRemarks

	//main method
	public static void main(String args[])
	{
		//declaring the object of scanner
		Scanner sc = new Scanner(System.in);

		//declaring 3 variables to store marks 
		float marks1,marks2,marks3;

		//taking input of marks
		System.out.println("Enter the marks of subject 1:");
		marks1= sc.nextFloat();
		System.out.println("Enter the marks of subject 2:");
		marks2= sc.nextFloat();
		System.out.println("Enter the marks of subject 3:");
		marks3= sc.nextFloat();

		//calling method to calculate Percentage
		calcPercentage(marks1,marks2,marks3);
	}
    // end of main

}
// end of class 