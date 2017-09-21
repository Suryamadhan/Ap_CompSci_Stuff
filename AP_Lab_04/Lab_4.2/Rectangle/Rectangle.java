import java.util.Scanner;

public class Rectangle
{
	static double length, width, perimeter;
	
	public static Scanner dataScanner = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		System.out.println("What is the length of the rectangle: ");
		length = dataScanner.nextDouble();
		
		System.out.println("What is the width of the rectangle: ");
		width = dataScanner.nextDouble();
		
		calcPerim();
		print();
		
	}
	
	public static void calcPerim()
	{
		perimeter = 2 * (length + width);
	}
	
	public static void print()
	{
		System.out.println("The perimeter of the rectangle is " + perimeter);
	}
	
}