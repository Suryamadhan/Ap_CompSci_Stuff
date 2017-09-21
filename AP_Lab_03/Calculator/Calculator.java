import java.util.Scanner;
public class Calculator
{
	public static void main(String[]args)
	{
		Scanner dataScanner = new Scanner(System.in);
		
		double firstNum, secondNum, product;
		
		System.out.println("Welcome to the Calculator");
		System.out.println("Unfortunately due to some technical difficulties, this Calculator can only multiply 2 numbers.");
		
		System.out.println("What is your First Number?");
		firstNum = dataScanner.nextDouble();
		
		System.out.println("What is your Second Number?");
		secondNum = dataScanner.nextDouble();
		
		product = secondNum * firstNum;
		
		System.out.println("The product of " + firstNum + " and " + secondNum + " is " + product + ".");
	}
}