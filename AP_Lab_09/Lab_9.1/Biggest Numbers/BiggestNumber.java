import java.util.Scanner;

public class BiggestNumber
{	
	public static int[] array;
	
	public static void main(String[]args)
	{
		array = new int[10];
		fillArray();
		printArray();
		getBiggest();
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
	
	public static void getBiggest()
	{
		int max = 0;
		for(int num: array)
		{
			if(num>max)
			{
				max = num;
			}
		}
		System.out.println("The biggest number is " + max);
	}
}