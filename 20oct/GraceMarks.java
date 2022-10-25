 /*
Program: To give grace marks
@author: Ashish Burman
@Date: 20 oct 2022  
*/
//importing packages
import java.util.*;

//declaring a class
class GraceMarks
{
	static void ExtraMarks(float m)
	{
		
		//checking marks and printing the final marks
		if((m>=35)&&(m<=37))
           	System.out.println("Final marks obtained is: "+(m+5));
           else if((m>=38)&&(m<=39))
               System.out.println("Final marks obtained is: "+(m+2));
               else 
                 System.out.println("Final marks obtained is: "+m);
        //end of IfElse Ladder			 
	
	}
	//end of ExtraMarks
	
	//main method
	public static void main(String args[])
	{
		//creating Scanner object
		Scanner sc= new Scanner(System.in);

		// taking input of marks
		System.out.println("Enter the marks the obtained:");
		float marks = sc.nextFloat();
		ExtraMarks(marks);
			
    }
    // end of main
}
// end of class 