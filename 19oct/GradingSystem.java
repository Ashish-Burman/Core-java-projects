 /*
Program: To print the grade according to the percentage
@author: Ashish Burman
@Date: 19 oct 2022  
*/
//importing packages
import java.util.*;

//declaring a class
class GradingSystem
{
	public static void main(String args[])
	{
		//creating Scanner object
		Scanner sc= new Scanner(System.in);
        
		//declaring variables
		float percentage;
		char grade;
		
		// taking input of percentage
		System.out.println("Enter the percentage:");
		percentage = sc.nextFloat();
		
		//comparing the percentage to calculate grade
		if(percentage>=85)
			grade = 'A';
         else if((percentage>=70)&&(percentage<85))
			 grade = 'B';
		    else if((percentage>=55)&&(percentage<70))
				grade = 'C';
			    else if((percentage>=40)&&(percentage<55))
					grade = 'D';
		else
			grade = 'F';
		//end of ifelse ladder
		
		//To print the grade
		if(grade=='F')
		   System.out.println("Sorry!!! You are failed in exam. Work hard next time.");
		else
		   System.out.println("Congratulations!!!!!! You have passed your exam with grade: "+grade);
			
    }
    // end of main
}
// end of class 