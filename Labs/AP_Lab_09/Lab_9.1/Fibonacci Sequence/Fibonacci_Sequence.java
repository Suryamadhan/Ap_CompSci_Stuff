import java.util.Scanner;

public class Fibonacci_Sequence 
{
	public static Scanner dS = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		System.out.println("Please enter your starting number: ");
     	int start = dS.nextInt();
     	
     	System.out.println("Please enter your sequence size: ");
     	int size = dS.nextInt();
     	
     	int[] seq = new int[size];
     	
     	for(int i = 0; i< seq.length; i++)
     	{
     		if(i==0 || i==1)
     		{
     			seq[i] = start;
     		}
     		else
     		{
     			seq[i] = seq[i-1] + seq[i-2];
     		}
     		System.out.print(seq[i] + " ");
     	}
	}
}