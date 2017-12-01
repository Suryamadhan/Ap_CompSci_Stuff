import java.util.Scanner;

public class TreeDeg60 
{
	public static void main(String[]args)
	{
  		Scanner kb = new Scanner(System.in);
  		System.out.println("Please enter a word: ");
     	String word = kb.nextLine();
     	int start = 0;
     	int stop = word.length();
  		System.out.println(tree(word, start, stop));
	}

	public static String tree(String w, int strt, int stp)
	{
		if(strt<=stp)
		{
			
			System.out.printf("%10s\n", w.substring(0,strt));
			strt+=1;
			
			return tree(w, strt, stp);
		}
		return "";
	}
	   
}