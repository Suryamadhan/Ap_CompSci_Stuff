import java.util.Random;

public class diceRoll
{
	static int player, comp;
	
	static String winner;
	
	static Random randomInts = new Random();
	
	public static void main(String[]args)
	{
		player = (randomInts.nextInt(6)+1);
		comp =  (randomInts.nextInt(6)+1);
		
		System.out.println("You rolled: " + player);
		System.out.println("Computer rolled: " + comp);
		System.out.println(rollDaDice(player, comp));
	}
	
	public static String rollDaDice(int user, int AI)
	{
		if(user > AI)
		{
			winner = "You won the game by " + (user - AI) + " points.";
		}
		else if(user < AI)
		{
			winner = "You lost the game " + (AI - user) + " points.";
		}
		else
		{
			winner = "It was tie game. What a waste of time...";
		}
		
		return winner;
	}
}