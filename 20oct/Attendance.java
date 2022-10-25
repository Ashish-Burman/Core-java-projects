 /*
Program: To check attendance
@author: Ashish Burman
@Date: 20 oct 2022  
*/
//importing packages
import java.util.*;

//declaring a class
class Attendance
{
	static void calcAttendance(float nac, float tnc)
	{
		
		//declaring variables
		float percentage;
		
		//calculating attendance
		percentage = (nac/tnc)*100;
		
		//checking the eligibility for the exam
		if(percentage>=75)
           	System.out.println("Congratulations!!! You are eligible to give the exam with percentage: "+percentage);
   
        else
	        System.out.println("Sorry!!! You are not eligible to give the exam as your percentage is: "+percentage);
        //end of IfElse			 
	
	}
	//end of calcAttendance
	
	//main method
	public static void main(String args[])
	{
		//creating Scanner object
		Scanner sc= new Scanner(System.in);

		// taking input of marks
		System.out.println("Enter the total number of classes been held:");
		float total_class = sc.nextFloat();
		System.out.println("Enter the number of classes you have attended:");
		float attended_class = sc.nextFloat();
		calcAttendance(attended_class,total_class);
			
    }
    // end of main
}
// end of class 