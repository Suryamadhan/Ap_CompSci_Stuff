import java.util.Scanner;
public class averageDigits
{
	public static Scanner dS = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		int num, average;
		average = 0;
		System.out.println("Please enter your number: ");
		num = dS.nextInt();
		average = avDigits(num, average);
		System.out.println("The average of the digits in " + num + " is " + average + ".");
	}
	
	public static int avDigits(int n, int s)
	{
		int digits = 0;
		while(n>0)
		{
			s+=(n%10);
			n /=10;
			digits++;
		}
		return (s/digits);
	}
}