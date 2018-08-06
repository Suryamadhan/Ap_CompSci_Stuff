import java.util.Scanner;
public class digitAdder
{
	public static Scanner dS = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		int num, sum;
		sum = 0;
		System.out.println("Please enter your number: ");
		num = dS.nextInt();
		sum = sumDigits(num, sum);
		System.out.println("The sum of the digits in " + num + " is " + sum + ".");
	}
	
	public static int sumDigits(int n, int s)
	{
		int newInt;
		while(n>0)
		{
			s+=(n%10);
			n /=10;
		}
		return s;
	}
}