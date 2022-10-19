 /*
Program: To check that the person is eligible to donate blood or not
@author: Ashish Burman
@Date: 19 oct 2022  
*/
//importing packages
import java.util.*;

//declaring a class
class EligibleBloodDonor
{
	public static void main(String args[])
	{
		//creating Scanner object
		Scanner sc= new Scanner(System.in);

		// taking input of age, weight and gender
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		System.out.println("Enter your weight:");
		float weight = sc.nextFloat();
		System.out.println("Enter your gender:");
		char gender = sc.next().charAt(0);
		
		//comparing the age
		if(age>=18)
		{
			//checking the gender and comparing the weight
			if((gender=='m')&&(weight>=60))
				System.out.println("***You can donate blood***");
		    else if((gender=='f')&&(weight>=50))
				System.out.println("***You can donate blood***");
			else
			    System.out.println("You are underweight to donate blood!!!! Have healthy foods.");	
		}
		else
		   System.out.println("You are too young to donate blood...... Please wait!");
        //end of IfElse
			
    }
    // end of main
}
// end of class 