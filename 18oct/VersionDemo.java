/*
Program: To print version
@author: Ashish Burman
@Date: 18 oct 2022  
*/

//declaring a class
class VersionDemo
{
	//main method
	public static void main(String args[])
	{
		
		System.out.println("The version is :"+System.getProperty("java.version")); // printing the version
		System.out.println("The installation directory is :"+System.getProperty("java.home")); // printing the version
			
	}
	// end of main
}
// end of class