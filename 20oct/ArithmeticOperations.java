 /*
Program: To perform arithmetic operations according to user's choice
@author: Ashish Burman
@Date: 20 oct 2022  
*/
//importing packages
import java.util.*;

//declaring a class
class ArithmeticOperations
{
	//defining a method for addition
	static void add(int n1, int n2)     //formal parameter
	{
	 
	int result;
    result = n1+n2; 
 	//printing the result	
    System.out.println("The result is: "+result);
	
	}
	
	//defining a method for subtraction
	static void sub(int n1, int n2)     //formal parameter
	{
	 
	int result;
    result = n1-n2;      
	//printing the result	
    System.out.println("The result is: "+result);

	}
	
    //defining a method for multiplication
	static void multiply(int n1, int n2)     //formal parameter
	{
	 
	int result;
    result = n1*n2;     
    //printing the result	
    System.out.println("The result is: "+result);	

	}
	
	//defining a method for division
	static void divide(int n1, int n2)     //formal parameter
	{
	 
	int quotient, remainder;
    quotient = n1/n2;      	
    remainder = n1%n2;      
    //printing the result	
    System.out.println("The results are:");	
    System.out.println("Quotient is: "+quotient);	
    System.out.println("Remainder is: "+remainder);	

	}
	
	
	public static void main(String args[])
	{
		//creating Scanner object
		Scanner sc= new Scanner(System.in);
        
		//declaring variables
		int choice, num1, num2;
		
		// menu for operations
		System.out.println("Press 1 for Addition");
		System.out.println("Press 2 for Subtraction");
		System.out.println("Press 3 for Multiplication");
		System.out.println("Press 4 for Division");
		System.out.println("Press 5 to Exit");
		System.out.println("Enter your choice:");
		choice = sc.nextInt();
		
		//asking numbers
		System.out.println("Enter two numbers:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		//calling method using switch 
		 //switch case
	   switch(choice)
	   {
		   case 1:add(num1,num2);
		          break;
		   case 2:sub(num1,num2);
		          break;
		   case 3:multiply(num1,num2);
		          break;
		   case 4:divide(num1,num2);
		          break;
		   case 5:System.exit(0);
		          break;
		  default: System.out.println("Wrong input provided");

	   }
	// end of switchcase
		
    }
    // end of main
}
// end of class 