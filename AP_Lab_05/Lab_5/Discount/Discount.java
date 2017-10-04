import java.util.Scanner;

public class Discount
{	
	public static Scanner dS = new Scanner(System.in);
	
	public static void main(String[]args)
	{	
		double priceOne, priceTwo, priceThree, priceFour, subTotal, tax, total;
		String itemOne, itemTwo, itemThree, itemFour;
	
		System.out.println("Please enter item 1: ");
		itemOne = dS.next();
		System.out.println("Please enter the price of item 1: ");
		priceOne = dS.nextDouble();
		
		System.out.println("Please enter item 2: ");
		itemTwo = dS.next();
		System.out.println("Please enter the price of item 2: ");
		priceTwo = dS.nextDouble();
		
		System.out.println("Please enter item 3: ");
		itemThree = dS.next();
		System.out.println("Please enter the price of item 3: ");
		priceThree = dS.nextDouble();
		
		System.out.println("Please enter item 4: ");
		itemFour = dS.next();
		System.out.println("Please enter the price of item 4: ");
		priceFour = dS.nextDouble();
		
		subTotal = priceOne + priceTwo + priceThree + priceFour;
		subTotal = checkDiscount(subTotal);
		tax = subTotal * .08;
		total = subTotal + tax;
		
		System.out.println("<<<<<<<<<< -Receipt- >>>>>>>>>>");
		format(itemOne, priceOne);
		format(itemTwo, priceTwo);
		format(itemThree, priceThree);
		format(itemFour, priceFour);
		format("Subtotal", subTotal);
		format("Tax", tax);
		format("Total", total);
		System.out.println("_______________________________");
		System.out.println("*Thank you for purchasing stuff*");
	}
	
	public static void format(String itemName, double itemPrice)
	{
		System.out.printf("%12s %10.2f", itemName, itemPrice);
		System.out.println("");
	}
	
	public static double checkDiscount(double number)
	{
		if(number >= 2000)
		{
			return (number * .85);
		}
		else
		{
			return number;
		}
	}
}