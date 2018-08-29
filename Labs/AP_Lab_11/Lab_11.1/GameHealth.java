import java.util.Scanner;

public class GameHealth
{
  static String[] health;
  static int healthLoad = 6;
  static int healthCount; 
  
  static Scanner dS = new Scanner(System.in);
  
  public static void main(String[]args)
  {
    String turn = "";
    int damage, amount = 0;
    healthCount = 6;
    health = new String[healthLoad];
    
    while(turn != "Q" && healthCount > 0)
    {
      System.out.println("Your turn! Hit enter when ready: ");
      turn = dS.next();
      damage = (int)(2 * Math.random() + 1);
      amount = (int)(6 * Math.random() + 1);
      System.out.println(takeDamage(damage, amount));
      printClip();
    }
    
    System.out.println("You died! RIP u");
  }
  
  public static String takeDamage(int dmg, int amt)
  {
    if(dmg == 1)
    {
      healthCount = healthCount - amt; 
      return "Taking: " + Integer.toString(amt) + " damage!";
    }
    else
    {
      if(healthCount + amt < healthLoad)
      {
        healthCount = amt + healthCount;
      }
      else 
      {
        healthCount = healthLoad;
      }
      
      return "Power Up: " + Integer.toString(amt) + "!";
    }
  }
  
  public static void printClip()
  {
    String output = "Health: ";
    for(int i = 0; i < healthLoad; i++)
    {
      if(i < healthCount)
      {
        health[i] = " @ ";
      }
      else
      {
        health[i] = "[]";
      }
      
      output = output + health[i];
    }
    
    System.out.println(output);
  }
}