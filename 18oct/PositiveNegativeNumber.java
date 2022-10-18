 /*
Program: To check a number for positive or negative
@author: Ashish Burman
@Date: 18 oct 2022  
*/
//importing packages
import java.util.*;

//declaring a class
class PositiveNegativeNumber
{
	public static void main(String args[])
	{
		//creating Scanner object
		Scanner sc= new Scanner(System.in);

		//Taking a number as input
		System.out.println("Enter a number:");
		int num= sc.nextInt();

		if(num>0)
			System.out.println("The number "+num+" is positive");
		else
		   System.out.println("The number "+num+" is negative");

	}

	// end of main
}
// end of class 