 /*
Program: To print the day according to the day number
@author: Ashish Burman
@Date: 19 oct 2022  
*/
//importing packages
import java.util.*;

//declaring a class
class SwitchDemo
{
	//defining a method
	static void printDay(int d)     //formal parameter
	{
	    //switch case
	   switch(d)
	   {
		   case 1:System.out.println("Monday");
		          break;
		   case 2:System.out.println("Tuesday");
		          break;
		   case 3:System.out.println("Wednesday");
		          break;
		   case 4:System.out.println("Thursday");
		          break;
		   case 5:System.out.println("Friday");
		          break;
		  case 6:System.out.println("Saturday");
		          break;
		  case 7:System.out.println("Sunday");
		          break;
		  default: System.out.println("Wrong input provided");

	   }
	// end of switchcase

	}
	public static void main(String args[])
	{
		//creating Scanner object
		Scanner sc= new Scanner(System.in);
        
		//declaring variables
		int day;
		
		// taking input of day number
		System.out.println("Enter the day number:");
		day = sc.nextInt();
		
		//calling method printDay
		printDay(day);    //actual parameter
		
    }
    // end of main
}
// end of class 