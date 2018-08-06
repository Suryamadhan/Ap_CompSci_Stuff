import java.util.Scanner;

public class ReturnRectangle
{
	static double length, width, perimeter, number;
	static String string;
	
	public static Scanner dataScanner = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		System.out.println("What is the length of the rectangle: ");
		length = dataScanner.nextDouble();
		
		System.out.println("What is the width of the rectangle: ");
		width = dataScanner.nextDouble();
		
		System.out.println(printIt());
		
	}
	
	public static double calcPerim()
	{
		perimeter = 2 * (length + width);
		return perimeter;
	}
	
	public static String printIt()
	{
		number = calcPerim();
		string = "The perimeter of the rectangle is " + number + ".";
		return string;
	}
	
}