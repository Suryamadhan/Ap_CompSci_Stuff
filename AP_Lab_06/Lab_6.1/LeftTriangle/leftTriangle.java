import java.util.Scanner;
public class leftTriangle
{
	public static Scanner ds = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		System.out.println("Please enter your String.");
		String string = ds.next();
		
		for(int i = string.length(); i>=0; i--)
		{
			System.out.println(string.substring(0, i));
		}
	}
}