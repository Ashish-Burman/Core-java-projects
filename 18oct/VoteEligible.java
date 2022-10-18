 /*
Program: To check age for voting
@author: Ashish Burman
@Date: 18 oct 2022  
*/
//importing packages
import java.util.*;

//declaring a class
class VoteEligible
{
	public static void main(String args[])
	{
		//creating Scanner object
		Scanner sc= new Scanner(System.in);

		//Taking age as input
		System.out.println("Enter the age:");
		int age = sc.nextInt();

		//comparing the age
		if(age>=18)
			System.out.println("The person is eligible to vote.");
		else
		   System.out.println("The person is not eligible to vote.");

	}

	// end of main
}
// end of class 