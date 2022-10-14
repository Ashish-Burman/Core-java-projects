/*
Program: To find average of 3 numbers using command line
@author: Ashish Burman
@Date: 14 oct 2022  
*/

//declaring a class
class Average_Commandline
{
	//main method
	public static void main(String args[])
	{
		//declaring local variables
		
		// parsing String to Float
		float number1= Float.parseFloat(args[0]);
		float number2= Float.parseFloat(args[1]);
		float number3= Float.parseFloat(args[2]);
		
		//calculating the average 
		float total = number1+ number2+number3;
		float average = total/3.0f;
		System.out.println("The average is :"+average); // printing the value of average
		
	}
	// end of main
}
// end of class