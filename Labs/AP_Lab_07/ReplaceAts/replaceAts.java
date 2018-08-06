import java.util.Scanner;
public class replaceAts
{
	public static Scanner dS = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		System.out.println("Please enter your sentence: ");
		String input = dS.nextLine();
		System.out.println(replace(input));
	}
	
	public static String replace(String s)
	{
		while(s.indexOf("a") >=0)
		{
   			s = s.replace('a', '@');
		}
		return s;
	}
}
