/**
 * 
 */
package project1;
/**
 * @author kaitl
 *
 */
import java.util.Scanner;  //import scanner class so information can be inputted by user 


public class CustomerDB {

	public static void main(String[] args)
	{
		int num;  //defines integer variable
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Customer Viewer.");
		System.out.println("Please enter the customer number:");
		num = input.nextInt();
		
		getCustomer(num);  //returns the getCustomer method
		
     /* 
     This while loop contains a nested if else statement. This allows the user to input additional customer numbers. 
     If they choose not to display another customer, the loop will end
    */
		
	while (num == 1001 || num == 1002 || num == 1003 || num != 1001 || num != 1002 || num != 1003) 
	{
		System.out.println("Would you like to display another customer? Yes or No?");
		Scanner input2 = new Scanner(System.in); //scanner object so user can answer the yes or no question
		String yn = input2.next(); //assigns string yn to what is inputted into scanner object input2 

		if (yn.startsWith("y")) //if the answer inputted into yn starts with the letter y, it will print a question asking user to enter a new customer number
		{
			System.out.print("Enter new customer number: ");
			num = input.nextInt();
			
			getCustomer(num);  //returns the getCustomer method
		}
		else  //if the answer inputted into yn does not start with y, it will print a statement saying thanks
		{   
		  
			System.out.print("Thank you! Come back soon!");
			break;
		}
	}
}
	
	/*
	This get method returns the getNameAndAddress method from the Customer class
	*/
	
	public static int getCustomer(int num)
	{
		if (num == 1001 || num == 1002 || num == 1003)
		{
	        Customer.getNameAndAddress(num);  //this returns the method getNameAndAddress from the Customer class if the numbers equal 1001, 1002, 1003
		}
		else
		{
			System.out.println("There is no customer " + num + " in our records"); //this prints when the number inputted is not equal to 1001, 1002, 1003
		}
		return(num);
	}
}   