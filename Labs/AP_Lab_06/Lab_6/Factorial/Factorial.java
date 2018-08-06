import java.util.Scanner;

public class Factorial
{
	public static Scanner dS = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		System.out.println("Enter your number: ");
		int num = dS.nextInt();
		int factorial = 1;
		for(int i =1; i<=num;i++)
		{
			factorial *= i; 
		}
		System.out.println("The factorial of " + num + " is " + factorial + ".");
	}
}