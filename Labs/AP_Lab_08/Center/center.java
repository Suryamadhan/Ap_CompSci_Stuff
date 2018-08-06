import java.util.Scanner;

public class center 
{
	public static void main(String[]args)
	{
  		Scanner kb = new Scanner(System.in);
  		System.out.println("Please enter your 1st word: ");
     	String wordOne = kb.nextLine();
     	System.out.println("Please enter your 2nd word: ");
     	String wordTwo = kb.nextLine();
     	System.out.println("Please enter your 3rd word: ");
     	String wordThree = kb.nextLine();
  		System.out.println(makeCenter(wordOne));
  		System.out.println(makeCenter(wordTwo));
  		System.out.println(makeCenter(wordThree));
	}

	public static String makeCenter(String word)
	{
		if(word.length() >= 20)
		{
			return word;
		}
		else
		{
			return makeCenter(" " + word + " ");
		}
	}
	   
}