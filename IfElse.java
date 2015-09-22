/**
* 
*If Username and Password are correct then display "Welcome, Username!" message.
* Else display "Wrong Username or Password!" message.
* @authour Tristan
*
*/

import java.util.Scanner;

public class IfElse {

	public static void main (String[] args) {
		String corusername = "Tristan";
		String corpassword = "CSC200";

		String username = "";
		String password = "";
		

		System.out.println("Enter your Username:");
			Scanner keyboard = new Scanner(System.in);
			username = keyboard.nextLine();
		System.out.println("Enter your Password:");
			password = keyboard.nextLine();


		if(corusername.equals(username)&& corpassword.equals(password))
		{
			System.out.println("Welcome, Tristan!");

		}
		else
		{
			System.out.println("Wrong Username or Password!");
		}

	}

}
