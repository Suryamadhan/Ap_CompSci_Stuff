import java.util.Scanner;

public class GetOdds
{	
	public static int[] array;
	
	public static void main(String[]args)
	{
		array = new int[10];
		fillArray();
		printArray();
		getOdds();
	}
	
	public static void fillArray()
	{	
		for(int i = 0; i < array.length; i++) 
		{
  		 	array[i] = (int)(Math.random()*100)+1;
		}
	}
	
	public static void printArray()
	{
		System.out.print("For the following numbers...");
		for(int num: array)
		{
			System.out.print(" " + num);
		}
		System.out.println();
	}
	
	public static void getOdds()
	{
		String odds = "";
		for(int num: array)
		{
			if(num%2 == 1)
			{
				odds+=(num + " ");
			}
		}
		System.out.println("The "+ odds + "are odd numbers in the array.");
	}
}