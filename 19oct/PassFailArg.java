/*
Program: To print pass/fail according to the marks using arguements
@author: Ashish Burman
@Date: 19 oct 2022  
*/

//declaring a class
class PassFailArg
{
	//main method
	public static void main(String args[])
	{
		float marks1,marks2,marks3,percentage;

		//taking input of marks
		marks1= Float.parseFloat(args[0]);
		marks2= Float.parseFloat(args[1]);
		marks3= Float.parseFloat(args[2]);

		//calculating percentage
		percentage= ((marks1+marks2+marks3)/300)*100;

		//checking the student has cleared the exam or not

		if(percentage>=40)
			System.out.println("Congratulations!!!!!! You have cleared the exam with "+percentage+"%");
		else
			System.out.println("Sorry!!!!!You have failed. Your percentage is "+percentage+"%");

		//end of ifelse

	}

	// end of main
}
// end of class 