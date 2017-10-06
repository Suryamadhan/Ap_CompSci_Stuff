import java.util.Scanner;

public class gpaCalc
{	
	public static Scanner dS = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		String gradeOne, gradeTwo, gradeThree, gradeFour, gradeFive, gradeSix, gradeSeven;
		double gpaOne, gpaTwo, gpaThree, gpaFour, gpaFive, gpaSix, gpaSeven, totalGPA;
		String string;
		
		System.out.println("What grade do you have in your first period class?");
		gradeOne = dS.next();
		
		System.out.println("What grade do you have in your second period class?");
		gradeTwo = dS.next();
		
		System.out.println("What grade do you have in your third period class?");
		gradeThree = dS.next();
		
		System.out.println("What grade do you have in your fourth period class?");
		gradeFour = dS.next();
		
		System.out.println("What grade do you have in your fifth period class?");
		gradeFive = dS.next();
		
		System.out.println("What grade do you have in your sixth period class?");
		gradeSix = dS.next();
		
		System.out.println("What grade do you have in your seventh period class?");
		gradeSeven = dS.next();
		
		gpaOne = calcGPA(gradeOne);
		gpaTwo = calcGPA(gradeTwo);
		gpaThree = calcGPA(gradeThree);
		gpaFour = calcGPA(gradeFour);
		gpaFive = calcGPA(gradeFive);
		gpaSix = calcGPA(gradeSix);
		gpaSeven = calcGPA(gradeSeven);
		
		totalGPA = (gpaOne + gpaTwo + gpaThree + gpaFour + gpaFive + gpaSix + gpaSeven)/7;
		string = "Your total unweighted GPA is..... ";
		
		System.out.printf("%34s %1.2f", string, totalGPA);
		System.out.println("");
		
	}
	
	public static  double calcGPA(String grade)
	{
		if(grade.equals("A")||grade.equals("a"))
		{
			return 4.0;
		}
		if(grade.equals("B")||grade.equals("b"))
		{
			return 3.0;
		}
		if(grade.equals("C")||grade.equals("c"))
		{
			return 2.0;
		}
		if(grade.equals("D")||grade.equals("d"))
		{
			return 1.0;
		}
		else
		{
			return 0.0;
		}
	}
}