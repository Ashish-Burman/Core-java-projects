/*
Program: To understand instanceof operator
@author: Ashish Burman
@Date: 18 oct 2022  
*/

//declaring a class
class Car
{
	public static void main(String args[])
	{
		//creating car object
		Car BMWCar = new Car();
		Car Maruti = null;     //dangle object
		//Maruti = new Car();

		//checking whether it is an instanceof or not
		System.out.println(BMWCar instanceof Car);
		System.out.println(Maruti instanceof Car);

	}
	// end of main
}
// end of class 