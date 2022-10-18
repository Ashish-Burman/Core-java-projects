 /*
Program: To check a number for even or odd
@author: Ashish Burman
@Date: 18 oct 2022  
*/
//importing packages
import java.util.*;

//declaring a class
class EvenOddDemo
{
	public static void main(String args[])
	{
		//creating Scanner object
		Scanner sc= new Scanner(System.in);

		// creating variables
		System.out.println("Enter number:");
		int num= sc.nextInt();

		if((num%2)==0)
			System.out.println("The number "+num+" is even");
		else
		   System.out.println("The number "+num+" is odd");

    }
    // end of main
}
// end of class 