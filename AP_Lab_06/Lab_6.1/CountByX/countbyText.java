import java.util.Scanner;
public class countbyText
{
	public static Scanner ds = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		System.out.println("In this program we will create a pattern.");
		
		System.out.println("What is your first number in the pattern:");
		int firstNum = ds.nextInt();
		
		System.out.println("What is your last number in the pattern:");
		int secondNum = ds.nextInt();
		
		for(int i = firstNum; i <= secondNum;)
		{
			System.out.print(i);
			System.out.print("\t");
			i+=2;
		}
		System.out.println();
	}
}