import java.util.Scanner;

public class Average_Numbers 
{
	public static Scanner dS = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		int[] nums = new int[10];

		for(int i = 0; i < nums.length; i++) 
		{
  		 	nums[i] = (int)(Math.random()*100)+1;
		}
		
		System.out.println("Numbers..");
		
		for(int num : nums)
		{
  		 	System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("The average of the above numbers is... " + average(nums));
	}
	
	public static double average(int[] numbers)
	{
		int sum = 0;
		
		for(int i = 0; i < numbers.length; i++) 
		{
  		 	sum += numbers[i];
		}
		
		return (double) sum/numbers.length;
	}	
}