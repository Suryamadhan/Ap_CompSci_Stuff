import java.util.Scanner;

public class Receipt
{
	public static Scanner dataScanner;
	
	
	public static void main(String[]args)
	{
		Receipt object = new Receipt();
		
		dataScanner = new Scanner(System.in);
		String itemOne, itemTwo, itemThree;
		double priceOne, priceTwo, priceThree;
		double total, subtotal, tax;
			
		System.out.println("Please enter the name of item 1: ");
		itemOne = dataScanner.next();
		
		System.out.println("What is the price of " + itemOne + ": ");
		priceOne = dataScanner.nextDouble();
		
		System.out.println("Please enter the name of item 2: ");
		itemTwo = dataScanner.next();
		
		System.out.println("What is the price of " + itemTwo + ": ");
		priceTwo = dataScanner.nextFloat();
		
		System.out.println("Please enter the name of item 3: ");
		itemThree = dataScanner.next();
		
		System.out.println("What is the price of " + itemThree + ": ");
		priceThree = dataScanner.nextFloat();
		
		subtotal = priceOne + priceTwo + priceThree;
		tax = .07 * subtotal;
		total = subtotal + tax;
		
		System.out.println("<<<<<<<<<< -Receipt- >>>>>>>>>>");
		
		object.printIt(itemOne, priceOne);
		object.printIt(itemTwo, priceTwo);
		object.printIt(itemThree, priceThree);
		
		System.out.println("");
		
		object.printIt("Subtotal:", subtotal);
		object.printIt("Tax:", tax);
		object.printIt("Total:", total);
		
		System.out.println("_______________________________");
		System.out.println("*Thank you for purchasing stuff*");
		
	}
	
	public static void printIt(String string, double number)
	{
		System.out.printf("%12s %10.2f", string, number);	
		System.out.println("");
	}
}