import java.util.Scanner;

public class ReturnCube
{
	public static Scanner dataScanner = new Scanner(System.in);
	
	public static double sa, side;

	public static void main(String[]args)
	{
		System.out.println("What is the size of the side of the cube: ");
		side = dataScanner.nextDouble();
		
		System.out.println(print());
	}
	
	public static double calcSurfaceArea()
	{
		sa = 6 * side * side;
		return sa;
	}
	
	public static String print()
	{	
		return ("The surface area of the whole cube is " + calcSurfaceArea() + ".");
	}
}