import java.util.Scanner;

public class ReturnAverage
{
	public static Scanner dataScanner = new Scanner(System.in);
	
	public static double numOne, numTwo, numThree, avg, prints, number;
	
	public static String string;


	public static void main(String[]args)
	{	
		System.out.println("What is your first number");
		numOne = dataScanner.nextDouble();
		
		System.out.println("What is your second number");
		numTwo = dataScanner.nextDouble();
		
		System.out.println("What is your third number");
		numThree = dataScanner.nextDouble();
		
		
		System.out.println(printIt());
		
	}
	
	public static double calcAvg()
	{
		avg = (numOne + numTwo + numThree)/3;
		return avg;
	}
	
	public static String printIt()
	{
		number = calcAvg();
		prints = (double)Math.round(avg * 100000d)/ 100000d;
		string =  "The average of " + numOne + ", " + numTwo + ", and " + numThree + " is " + prints + ".";
		return string;
	}
}