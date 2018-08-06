import java.util.Scanner;

public class password
{
	public static Scanner dS = new Scanner(System.in);
	
	public static String password = "Password";
	public static String username = "DaUserName";
	
	public static String passwordEntry, usernameEntry;
	
	public static void main(String[]args)
	{
		passCheck();
	}
	
	public static void passCheck()
	{
		
		System.out.println("Username: ");
		usernameEntry = dS.next();
		System.out.println("Password: ");
		passwordEntry = dS.next();
		if(usernameEntry.equals(username) && passwordEntry.equals(password))
		{
			System.out.println("You are granted access!");
		}
		else
		{
			if(usernameEntry.equals(username) == false && passwordEntry.equals(password))
			{
				System.out.println("The username you have entered is incorrect");
				System.out.println("Please try again");
				passCheck();
			}
			if(usernameEntry.equals(username) && passwordEntry.equals(password) == false)
			{
				System.out.println("The password you have entered is incorrect");
				System.out.println("Please try again");
				passCheck();
			}
			if(usernameEntry.equals(username) == false && passwordEntry.equals(password) == false)
			{
				System.out.println("The username and password you have entered are incorrect");
				System.out.println("Please try again");
				passCheck();
			}
			
		}
	}
}