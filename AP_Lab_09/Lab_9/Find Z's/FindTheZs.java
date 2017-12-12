import java.util.Scanner;

public class FindTheZs
{	
	public static String[] array;
	public static Scanner dS = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		array = new String[5];
		fillArray();
		printArray();
		hasZs();
	}
	
	public static void fillArray()
	{	
		for(int i = 0; i < array.length; i++) 
		{
  		 	array[i] = dS.next();;
		}
	}
	
	public static void printArray()
	{
		System.out.print("For the words...");
		for(String str: array)
		{
			System.out.print(" " + str);
		}
		System.out.println();
	}
	
	public static void hasZs()
	{
		String zs = "";
		for(String str: array)
		{
			if(str.indexOf("z")>=0)
			{
				zs += (str + " ");
			}
		}
		System.out.println("Only " + zs + "contain(s) the letter z.");
	}
}