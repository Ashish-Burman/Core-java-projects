 /*
Program: To generate bill for a vegetable store and give discount as per the amount
@author: Ashish Burman
@Date: 21 oct 2022  
*/
//importing packages
import java.util.*;

//declaring a class
class VegetableBill
{
	static void bill()
	{
		
		//creating Scanner object
		Scanner sc= new Scanner(System.in);
		
		//declaring variables
		float amount=0, totalbill=0, discount = 0.0f, quantity;
		int choice;
		
		// menu avaliable items in the shop
		System.out.println("!!! WELCOME TO VEGETABLE STORE !!!");
		System.out.println("Please select the item you want to buy from the below list.");
		System.out.println("Option           Item          Rate (per Kg)");
		System.out.println("   1             Onion              40 ");
		System.out.println("   2             Potato             20 ");
		System.out.println("   3            Pumpkin            200 ");
		System.out.println("   4             Carrot             50 ");
		System.out.println("   5           Cauliflower         250 ");
		System.out.println("Press 6 to Exit.");
		System.out.println("Enter the option according to your choice :");
		choice = sc.nextInt();
		
		// taking input of quantity
		System.out.println("Enter the quantity (in Kgs.): ");
		quantity = sc.nextFloat();
		
		//switch case
	   switch(choice)
	   {
		   case 1: amount = quantity*40;
		          break;
		   case 2: amount = quantity*20;
		          break;
		   case 3: amount = quantity*200;
		          break;
		   case 4: amount = quantity*50;
		          break;
		   case 5: amount = quantity*250;
		          break;
		  case 6: System.out.println("Sorry for the inconvenience. !!!!!!");
		          System.exit(0);
		          break;
		  default: System.out.println("Wrong input provided");

	   }
	// end of switchcase
	
		//calculation for discount and total bill
		if(amount>2000)
        {
			System.out.println("You are eligible for 20% discount");
			discount = (amount/100)*20;
			totalbill = amount-discount;
        }
		
        else if((amount>=500)&&(amount<2000))
        {
			System.out.println("You are eligible for 10% discount");
			discount = (amount/100)*10;
			totalbill = amount-discount;
        }
		
		else 
        {
			System.out.println("You are eligible for 5% discount");
			discount = (amount/100)*5;
			totalbill = amount-discount;
        }    
		
        //end of IfElse	Ladder		 
         
        System.out.println("*******************************************************");	 
        System.out.println("               Total Bill                              ");	 
        System.out.println("Quantity          Amount         Discount         Total");	 
        System.out.println(quantity+"               "+amount+"          "+discount+"            "+totalbill);	
        System.out.println("*******************************************************");
		System.out.println("             THANK YOU !! VISIT AGAIN !!!!!!!          ");		
	}
	//end of bill
	
	//main method
	public static void main(String args[])
	{

        //calling the method to calculate bill
		bill();
			
    }
    // end of main
}
// end of class 