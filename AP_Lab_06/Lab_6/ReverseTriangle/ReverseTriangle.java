import java.util.Scanner;

public class ReverseTriangle
{
	public static Scanner dS = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		System.out.println("Enter your String: ");
		String string = dS.next();
		
		for(int i = (string.length()); i>=1; i--)
		{
			System.out.println(string.substring(0, i));
		}
	}
}