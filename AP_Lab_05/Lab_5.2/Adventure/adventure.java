import java.util.Scanner;

public class adventure
{
	public static Scanner dS = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		String typeOfAdventure, theChoice, deathChoice;
		System.out.println("What setting do you want your adventure to take place in?");
		System.out.println("1. A Jungle");
		System.out.println("2. In the Mountains");
		typeOfAdventure = dS.next();
		if(typeOfAdventure.equals("1"))
		{
			System.out.println("You are about to be teleported to a random Jungle.");
			System.out.println("Pick one of the 2 options you would like to take to the Jungle before you get teleported");
			System.out.println("1. My nintendo DS and a sleeping bag");
			System.out.println("2. Some food and a rifle");
			theChoice = dS.next();
			if(theChoice.equals("1"))
			{
				System.out.println("Now you have been teleported to the Jungle");
				System.out.println("Would you like to:");
				System.out.println("1. Find a safe place, so animals don't eat you");
				System.out.println("2. Just play videogames in the middle of the Jungle.");
				deathChoice = dS.next();
				if(deathChoice.equals("1"))
				{
					System.out.println("This is a very smart choice");
					System.out.println("But you forgot to pack some food, and you can't go hunting because you have no weapons");
					System.out.println("So you die, RIP you.");
				}
				else
				{
					System.out.println("Well...");
					System.out.println("Since you are in the middle of nowhere, a lion just decided to eat you for breakfast. ");
					System.out.println("RIP you.");
				}
			}
			else
			{
				System.out.println("Now you have been teleported to the Jungle");
				System.out.println("Would you like to:");
				System.out.println("1. Find a safe place, just to shelter");
				System.out.println("2. Too bored, lets go hunting");
				deathChoice = dS.next();
				if(deathChoice.equals("1"))
				{
					System.out.println("You are very smart individual for selecting this option");
					System.out.println("You survive the adventure.");
				}
				else
				{
					System.out.println("You have killed some animals...");
					System.out.println("But at last, you have been outnumbered.");
					System.out.println("So you die, RIP you.");
				}
			}
		}
		else
		{
			System.out.println("You are about to be teleported to a random place in the Himalayas.");
			System.out.println("Pick one of the 2 options you would like to take to the mountains before you get teleported");
			System.out.println("1. Some clothing to keep myself warm and some stuff to survive in the mountains including food");
			System.out.println("2. Some shirts, shorts, 2 boxes of pizza, and my iPad");
			theChoice = dS.next();
			if(theChoice.equals("1"))
			{
				System.out.println("Now you have been teleported to the Himalayas");
				System.out.println("Would you like to:");
				System.out.println("1. Find a safe place, to take shelter");
				System.out.println("2. Hike the mountain");
				deathChoice = dS.next();
				if(deathChoice.equals("1"))
				{
					System.out.println("You are very smart individual for selecting this option");
					System.out.println("You survive the adventure.");
				}
				else
				{
					System.out.println("You could try to hike but...");
					System.out.println("You have not brought the necessary stuff to hike in the Himalayas");
					System.out.println("So you die, RIP you.");
				}
			}
			else
			{
				System.out.println("Now you have been teleported to the Himalayas");
				System.out.println("Would you like to:");
				System.out.println("1. Enjoy playing with snowballs because I know I'm going to die.");
				System.out.println("2. Check my email in my iPad");
				deathChoice = dS.next();
				if(deathChoice.equals("1"))
				{
					System.out.println("Well, you had fun...");

				}
				else
				{
					System.out.println("You are trying to load the Gmail app");
					System.out.println("But theres no wifi...");
					System.out.println("And you kept standing there for so long that you die.");
					System.out.println("RIP you.");
				}
			}
		}
	}
}