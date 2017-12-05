import java.util.Scanner;

public class First_Letter 
{
	public static Scanner dS = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		String[] words = new String[5];

		System.out.println("Please enter 5 words: ");

		for(int i = 0; i < words.length; i++) 
		{
  		 	words[i] = dS.next();
		}
		
		System.out.println("");
		
		System.out.println("First Letter...");
		
		first(words);
	}
	
	public static void first(String[] strings)
	{
		String[] returnString = new String[5];
		
		for(int i = 0; i < strings.length; i++) 
		{
  		 	returnString[i] = strings[i].substring(0,1);
		}
		
		for(String str : returnString)
		{
  		 	System.out.println(str);
		}
	}
}