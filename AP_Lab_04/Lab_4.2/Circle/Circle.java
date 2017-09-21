import java.util.Scanner;
import java.lang.Math;

public class Circle
{
	public static Scanner dataScanner = new Scanner(System.in);
	
	public static double radius, area;

	public static void main(String[]args)
	{
		System.out.println("What is the radius of the circle: ");
		radius = dataScanner.nextDouble();
		
		calcArea();
		print();
	}
	
	public static void calcArea()
	{
		area = Math.PI * radius * radius;
	}
	
	public static void print()
	{	
		System.out.println("The area of the circle is " + area + ".");
	}
}