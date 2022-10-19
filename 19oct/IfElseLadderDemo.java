 /*
Program: To check greatest number among three numbers
@author: Ashish Burman
@Date: 19 oct 2022  
*/
//importing packages
import java.util.*;

//declaring a class
class IfElseLadderDemo
{
	public static void main(String args[])
	{
		//creating Scanner object
		Scanner sc= new Scanner(System.in);

		// taking input of three numbers
		System.out.println("Enter three numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		//comparing the numbers
		if((num1>num2)&&(num1>num3))
			System.out.println("The greatest number is: "+num1);
        else if(num2>num3)
			System.out.println("The greatest number is: "+num2);
		else
		   System.out.println("The greatest number is: "+num3);
        //end of IfElse Ladder
			
    }
    // end of main
}
// end of class 