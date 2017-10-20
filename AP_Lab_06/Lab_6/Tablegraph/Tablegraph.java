import java.util.Scanner;

public class Tablegraph
{
	public static Scanner dS = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		System.out.println("Enter your number: ");
		int num = dS.nextInt();
		
		System.out.println("Enter the number of rows in your table: ");
		int rows = dS.nextInt();
		
		System.out.println("_______");
		for(int i = 1; i <=rows;)
		{	
			System.out.printf("%2d | %2d ", i, (i*num));
			System.out.println();
			i++;
		}
		System.out.println("_______");
	}
}