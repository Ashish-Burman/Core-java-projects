/*
Program: To perform basic calculations
@author: Ashish Burman
@date: 14 oct 2022
*/
class Calculator
{
	public static void main(String args[])
	{
		//declaring two numbers
		int number1= 34;
		int number2= 16;
		//calculating sum
		int sum= number1+number2;
		//calculating difference
		int difference= number1-number2;
		//calculating product
		int product= number1*number2;
		//calculating quotient
		int quotient= number1/number2;
		//calculating remainder
		int remainder= number1%number2;
		
		//printing the sum
		System.out.println("The sum is="+sum);
		//printing the difference
		System.out.println("The difference is="+difference);
		//printing the product
		System.out.println("The product is="+product);
		//printing the quotient
		System.out.println("The quotient is="+quotient);
		//printing the remainder
		System.out.println("The remainder is="+remainder);
	
	}
	//end of main
}
//end of class