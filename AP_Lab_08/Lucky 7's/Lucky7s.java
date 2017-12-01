import java.util.Scanner;

public class Lucky7s 
{
	public static void main(String[]args)
	{
  		Scanner kb = new Scanner(System.in);
  		System.out.println("Please enter a number: ");
     	int num = kb.nextInt();
  		System.out.println("There are " + luck(num) + " 7's in " + num);
	}

	public static int luck(int n)
	{
		if(n>0)
		{
			if(n%10 == 7)
			{
				return 1 + luck(n/10);
			}
			else
			{
				return 0 + luck(n/10);
			}
		}
		else
		{
			return 0;
		}
	}
	   
}