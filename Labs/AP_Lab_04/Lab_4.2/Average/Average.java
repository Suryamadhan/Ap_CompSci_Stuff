import java.util.Scanner;

public class Average
{
	public static Scanner dataScanner = new Scanner(System.in);
	
	public static double numOne, numTwo, numThree, avg, prints;


	public static void main(String[]args)
	{	
		System.out.println("What is your first number");
		numOne = dataScanner.nextDouble();
		
		System.out.println("What is your second number");
		numTwo = dataScanner.nextDouble();
		
		System.out.println("What is your third number");
		numThree = dataScanner.nextDouble();
		
		calcAvg();
		print();
		
	}
	
	public static void calcAvg()
	{
		avg = (numOne + numTwo + numThree)/3;
	}
	
	public static void print()
	{
		prints = (double)Math.round(avg * 100000d)/ 100000d;
		System.out.println("The average of " + numOne + ", " + numTwo + ", and " + numThree + " is " + prints + ".");
	}
}