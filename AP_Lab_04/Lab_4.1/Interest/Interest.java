import java.util.Scanner;
import java.lang.Math;

public class Interest
{
	public static Scanner dataScanner = new Scanner(System.in);

	public static void main(String[]args)
	{
		double rate, principal, number, time, monthlyPayment;
	
		System.out.println("");
		System.out.println("Please enter the interest rate: ");
		rate = dataScanner.nextDouble();
		
		System.out.println("");
		System.out.println("Please enter the original amount you intend to borrow (principal): ");
		principal = dataScanner.nextDouble();
		
		System.out.println("");
		System.out.println("How many times will loan be compounded per year: ");
		number = dataScanner.nextDouble();
		
		System.out.println("");
		System.out.println("What is the life of the loan in years: ");
		time = dataScanner.nextDouble();
		
		monthlyPayment = calcPayment(rate, principal, number, time);
		
		System.out.println("");
		System.out.println("Your total monthly payment will be " + monthlyPayment + ". Thank you for using this software!!");
		System.out.println("");
	}
	
	public static double calcPayment(double r, double p, double n, double t)
	{	
		double variableOne, variableTwo, variableThree, variableFour, variableFive;;
		variableOne = r/n;
		variableTwo = variableOne + 1;
		variableThree = n * t;
		variableFour = Math.pow(variableTwo, variableThree);
		variableFive = p * variableFour;
		
		return variableFive;
	}
}