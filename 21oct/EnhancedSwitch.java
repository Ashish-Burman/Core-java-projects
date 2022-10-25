 /*
Program: To implement enhanced switch case
@author: Ashish Burman
@Date: 21 oct 2022  
*/

/*
//importing packages
import java.util.*;

//declaring a class
class EnhancedSwitch
{
	
	//main method
	public static void main(String args[])
	{

        //switch case with string
		String inputAbbr = lol;
		
		//switch case
		switch(inputAbbr)
		{
			
			case "lol": System.out.println("Lots of Laugh");
			            break;
			case "ttyl": System.out.println("Talk to you later");
			            break;
			case "asap": System.out.println("As soon as possible");
			            break; 
			default: System.out.println("Wrong input provided");
			
		}
			
    }
    // end of main
}
// end of class 
*/

//import packages 

import java.util.Scanner;
//declaring a class
class EnhancedSwitch
{
	//method to print full form of abbreviation
	static void printAbbr(String abbr)
	{
		 switch(abbr)
	   {
		   //expression level
		   case "lol" ->System.out.println("Lots of laugh");		               
           case "ttyl" ->System.out.println("Talk to you later");		              		
           case "asap"-> System.out.println("As soon as possible");		               	
           default-> System.out.println("Wrong input");						
	   } 

	}	


	//main started
	public static void main(String args[])
	{
       // switch case with string
	   String inputAbbr;

	    //declaring the object of scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an abbreviation (lol,asap,ttyl):");
		inputAbbr= sc.next().toLowerCase();
		// converting the input to lowercase

	   //calling method
	  printAbbr(inputAbbr);

	}

	// end of main
}
// end of class 