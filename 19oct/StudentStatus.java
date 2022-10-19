 /*
Program: To check the status of student (pass/fail)
@author: Ashish Burman
@Date: 19 oct 2022  
*/
//importing packages
import java.util.*;

//declaring a class
class StudentStatus
{
	public static void main(String args[])
	{
		//creating Scanner object
		Scanner sc= new Scanner(System.in);

		// taking input of marks
		System.out.println("Enter the marks of three subjects:");
		float marks1 = sc.nextFloat();
		float marks2 = sc.nextFloat();
        float marks3 = sc.nextFloat();
		
		float total = marks1+marks2+marks3;
	    float percentage = (total/300)*100;
		
		//comparing the percent
		if(percentage>=40)
			System.out.println("Congratulations!!! You have passed with "+percent+"%");
		else
		   System.out.println("Sorry!!! You have failed with "+percent+"%");
        //end of IfElse
			
    }
    // end of main
}
// end of class 