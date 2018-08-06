import java.util.Scanner;
import java.lang.Math;

public class ReturnCircle
{
	public static Scanner dataScanner = new Scanner(System.in);
	
	public static double radius, area;

	public static void main(String[]args)
	{
		System.out.println("What is the radius of the circle: ");
		radius = dataScanner.nextDouble();
		
		System.out.println(print());
	}
	
	public static double calcArea()
	{
		area = Math.PI * radius * radius;
		return area;
	}
	
	public static String print()
	{	
		return ("The area of the circle is " + calcArea() + ".");
	}
}