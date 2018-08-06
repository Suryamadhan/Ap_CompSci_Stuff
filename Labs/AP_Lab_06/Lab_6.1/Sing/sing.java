import java.util.Scanner;
public class sing
{
	public static Scanner ds = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		sing("Na", 4);
		sing("Na", 4);
		sing("Hey",3);
		sing("Goodbye!",1);
	}
	
	public static void sing(String word, int times)
	{
		for(int i = 1; i <= times; i++)
		{
			System.out.print(word + " ");
		}
		System.out.println();
	}
}