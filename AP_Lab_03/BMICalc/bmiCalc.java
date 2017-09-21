import java.util.Scanner;
public class bmiCalc
{
	public static void main(String[]args)
	{
		Scanner dataScanner = new Scanner(System.in);
		
		double height, weight, bmi;
		
		System.out.println("Hello there... I am a BMI Calculator");
		
		System.out.println("Please enter your height in inches: ");
		height = dataScanner.nextDouble();
		
		System.out.println("Please enter your weight in lbs: ");
		weight = dataScanner.nextDouble();
		
		bmi = ((703 * height)/(weight*weight));
		
		System.out.println("Your BMI is: " + bmi);
		System.out.println("Thank you for using the BMI Calculator.");
		
	}
}