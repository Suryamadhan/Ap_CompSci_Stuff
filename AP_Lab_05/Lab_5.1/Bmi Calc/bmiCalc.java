import java.util.Scanner;

public class bmiCalc
{	
	public static Scanner dS = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		double weight, height, bmi;
		
		System.out.println("Enter your weight in pounds: ");
		weight = dS.nextDouble();
		
		System.out.println("Enter your height in inches: ");
		height = dS.nextDouble();
		
		bmi = (weight * 703)/(height*height);
		
		System.out.println("Your BMI is " + bmi);
		System.out.println(returnFeedback(bmi));
	}
	
	public static String returnFeedback(double n)
	{	
		String output;
		
		if(n < 18.5)
		{
			output = "You are underweight";
		}
		else if(n >= 18.5 && n < 25)
		{
			output = "You are normal";
		}
		else if(n >= 25 && n < 30)
		{
			output = "You are overweight";
		}
		else if(n >= 30 && n < 35)
		{
			output = "You are obese";
		}
		else if(n >= 35 && n < 40)
		{
			output = "You are very obese";
		}
		else
		{
			output = "You are morbidly obese";
		}
		
		return output;
	}
}