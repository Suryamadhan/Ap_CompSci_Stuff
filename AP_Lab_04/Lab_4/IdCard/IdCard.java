import java.util.Scanner;

public class IdCard
{
	public static Scanner dataScanner = new Scanner(System.in);
	
	public static void main(String[]args)
	{	
		IdCard object = new IdCard();
		String fName, lName, schoolYear, subject, school, profession;
		
		System.out.println("Hello There. Today we are going to create your school ID card");
		
		System.out.println("");
		System.out.println("Enter your first name: ");
		fName = dataScanner.nextLine();
		
		System.out.println("");
		System.out.println("Enter your last name: ");
		lName = dataScanner.nextLine();
		
		System.out.println("");
		System.out.println("Enter your profession at school: ");
		profession = dataScanner.nextLine();
		
		System.out.println("");
		System.out.println("Enter the school name: ");
		school = dataScanner.nextLine();
		
		System.out.println("");
		System.out.println("Enter your school year: ");
		schoolYear = dataScanner.nextLine();
		
		System.out.println("");
		System.out.println("Enter the subject you teach: ");
		subject = dataScanner.nextLine(); 
		
		System.out.println("");
		System.out.println("Here is your ID Card!!!");
		
		System.out.println("");
		System.out.println("*********************************");
		object.printIt(school, schoolYear);
		object.printIt(fName, lName);
		object.printIt(profession, subject);
		System.out.println("*********************************");
		System.out.println("");
		
	}
	
	public static void printIt(String firstString, String secondString)
	{
		System.out.printf("*");
		System.out.printf("%15s %15s", firstString, secondString);	
		System.out.printf("*");
		System.out.println("");
	}
}