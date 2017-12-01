import java.util.Scanner;

public class Underscores 
{
	public static void main(String[]args)
	{
  		Scanner kb = new Scanner(System.in);
  		System.out.println("Please enter a word: ");
     	String word = kb.nextLine();
  		System.out.println(replace(word));
	}

	public static String replace(String word)
	{
		if(!(word.indexOf(' ') >= 0))
		{
			return word;
		}
		else
		{
			return replace(word.substring(0 , word.indexOf(' ')) + "_" + word.substring(word.indexOf(' ') + 1));
		}
	}
	   
}