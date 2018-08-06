import java.util.Scanner;

public class Cube
{
	public static Scanner dataScanner = new Scanner(System.in);
	
	public static double sa, side;

	public static void main(String[]args)
	{
		System.out.println("What is the size of the side of the cube: ");
		side = dataScanner.nextDouble();
		
		calcSurfaceArea();
		print();
	}
	
	public static void calcSurfaceArea()
	{
		sa = 6 * side * side;
	}
	
	public static void print()
	{	
		System.out.println("The surface area of the whole cube is " + sa + ".");
	}
}