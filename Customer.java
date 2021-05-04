/**
 * 
 */
package project1;

/**
 * @author kaitl
 *
 */
public class Customer {  //defining String instance variables


	public static String name, address, city; //defining String instance variables
	public int num;   //defining integer variable

	/* 
    This set method uses if and else statements to define which name, address, and city goes with which customer number is inputted by the user
	*/
		public static void setNameAndAddress(int num)  //setting the NameAndAddress method
		{
			if (num == 1001)
			{
			name = "Barbara White";
			address = "3400 Richmond Parkway #3423";
			city = "Bristol, CT 06010";	
			}	//if number is inputted by user is 1001, the correct personal information is set to the customer number

			else if (num == 1002)
			{
			name = "Karl Vang";
	        address = "327 Franklin Street";
			city = "Edina, MN 55435";
			} //if number inputted by user is not 1001, and it is 1002, the correct personal information for the customer is set to their number
			else if (num == 1003)
			{
		    name = "Ronda Chavan";
			address = "518 Commanche Dr.";
			city = "Greensboro, NC 27410";
			} //if number inputted by user is not 1001 or 1002, but is 1003, the correct personal information for the customer is set to their number
		 }
		
    /*
    This get method returns the setNameAndAddress method and then prints the name, address, and city associated with the customer number inputted
    */

	public static void getNameAndAddress(int num)
	{
		setNameAndAddress(num);
		System.out.println (name + "\n" + address + "\n" + city);	
		// get method that returns customer information and formats it with line breaks
	}
}
