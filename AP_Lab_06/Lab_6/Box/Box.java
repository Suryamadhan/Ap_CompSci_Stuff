import java.util.Scanner;

public class Box
{
	public static Scanner dS = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		System.out.println("Enter your String: ");
		String string = dS.next();
		
		for(int i =1; i <=string.length(); i++)
		{
			System.out.println(string);
		}
		
	}
}