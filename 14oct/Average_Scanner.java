/*
Program: To find the average of 3 numbers using Scanner
@author: Ashish Burman
@Date: 14 oct 2022
*/

//importing util package for Scanner class
import java.util.Scanner;

//declaring a class
class Average_Scanner
{
	//main method
	public static void main(String args[])
	{
		//creating object of Scanner class
		Scanner sc = new Scanner(System.in);
		
		//declaring and initializing local variables
		
		System.out.println("Enter 3 numbers:");
		float number1= sc.nextFloat();
        float number2= sc.nextFloat();		
	    float number3= sc.nextFloat();
		float total= number1+number2+number3;
		float average= total/3.0f;
		System.out.println("The average is = "+average);
		
	}
	//end of main
}
//end of class 