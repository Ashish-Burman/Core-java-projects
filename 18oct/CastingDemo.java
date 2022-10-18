/*
Program: To understand Type casting
@author: Ashish Burman
@Date: 18 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class CastingDemo
{
	public static void main(String args[])
	{
       
		//declaring short data type
		short s1= 65;
		short s2= 98;

		//calculating the sum
		short sum;
		sum= (short)(s1+s2); 

		//printing the sum
		System.out.println("The sum is :"+sum);

		byte b1= 76;
		byte b2 =61;

         byte cal= (byte)(b1+b2);
	     //printing the sum
		System.out.println("The calc is :"+cal);

		double d1= 89.5;
		double d2= 67.4;
		float dd= (float)(d1+d2);
		System.out.println("The dd is :"+dd);

		// to omit type casting 

		byte b3=8;
		byte b4=9;
		//b3 = (byte)(b3+b4);

		b3+=b4; // auto type casting b3 = b3+b4

		System.out.println("The b3  :"+b3);
    
	}
     // end of main
}
// end of class 
// short is of 2 bytes  -32768 to 32767
//byte -128 to 127 