import java.util.Scanner;
public class reverseNumber
{
	public static Scanner dS = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		int num, rev;
		rev = 0;
		System.out.println("Please enter your number: ");
		num = dS.nextInt();
		rev = getReverse(num, rev);
		System.out.println("The reverse of the digits in " + num + " is " + rev + ".");
	}
	
	public static int getReverse(int n, int r)
	{
		while(n>0)
		{
			r*=10;
			r+=(n%10);
			n/=10;
		}
		return r;
	}
}