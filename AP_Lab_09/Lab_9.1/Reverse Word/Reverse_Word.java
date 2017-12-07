import java.util.Scanner;

public class Reverse_Word 
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
		
		System.out.println("In order...");
		
		for(String str : words)
		{
  		 	System.out.println(str);
		}

		System.out.println("");
		
		System.out.println("Reversed order...");
		
		reverse(words);
		
	}
	
	public static void reverse(String[] strings)
	{
		String[] returnString = new String[5];
		
		for(int i = 0; i < returnString.length; i++) 
		{
  		 	returnString[i] = strings[4-i];
		}
		
		for(String str : returnString)
		{
  		 	System.out.println(str);
		}
	}
}