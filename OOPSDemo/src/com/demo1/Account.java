/*
 * Program - To understand abstraction, encapsulation and polymorphism
 * @Author - Ashish Burman
 * @Date - 01 Nov 2022
 */

//declaring package
package com.demo1;

//declaring a account class
public class Account 
{
	//instance variables
    private int accID;
    private String accName;
    private double balance;
	private String panNumber;
    
	//method to enter bank details
	void enterBankDetails(int id, String name, double bal, String pan)
	{
		accID = id;
		accName = name;
		balance = bal;
		panNumber = pan;
	}
	//end of method
	
	//method to enter bank details
	void enterBankDetails(int id, String name, double bal)
	{
		accID = id;
		accName = name;
		balance = bal;
	}
	//end of method
	
	//method to deposit
	double depositMoney(double amount)
	{
		balance += amount;
		System.out.println("Your amount has been successfully deposited...");
		return balance;
	}
	//end of method
	
	//method to withdraw
	double withdrawMoney(double amount)
	{
		double tempBalance = balance;
		tempBalance = tempBalance - amount;
		if(tempBalance >= 500)
		{
			balance = tempBalance;
			System.out.println("!!! Withdrawal Successful....!!!");	
		}
		else
			System.out.println("!! Your balance is insufficient.!! ");
		return balance;
	}
	//end of method
	
	//method to print details
	void printBankDetails() {
		System.out.println("Account ID:" + accID);
		System.out.println("Account Holder's Name:" + accName);
		System.out.println("Balance :" + balance);
	}
	//end of method

	// to get Pan Number
    String getPanNumber()
    {

    	return panNumber;

	}
  //end of method
}
//end of class