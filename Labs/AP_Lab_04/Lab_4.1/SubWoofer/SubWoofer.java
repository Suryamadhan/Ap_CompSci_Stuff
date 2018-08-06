import java.util.Scanner;

public class SubWoofer
{
	public static Scanner dataScanner = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		double height, length, width, volume;
	
		System.out.println("What is the height of the object in inches: ");
		height = dataScanner.nextDouble();
	
		System.out.println("What is the length of the object in inches: ");
		length = dataScanner.nextDouble();
		
		System.out.println("What is the width of the object in inches: ");
		width = dataScanner.nextDouble();
		
		volume = calcCubicFeet(height, length, width);
		
		System.out.println("The volume of the object in cubic feet is " + volume + ".");
	}
	
	public static double calcCubicFeet(double h, double l, double w)
	{
		double number;
		number = (h * l * w)/1728;
		return number;
	} 
}