import java.util.Scanner;
public class Strings
{
  public static Scanner dS = new Scanner(System.in);
  
  public static void main(String[]args)
  {
    String [][] words = new String [4][4];
    
    for(int i = 0; i < words.length; i++)
    {
      for(int j = 0; j < words[i].length; j++)
      {
        System.out.println("What is your word: ");
        words[i][j] = dS.nextLine();
      }
    }
    
    for(int i = 0; i < words.length; i++)
    {
      for(int j = 0; j < words[i].length; j++)
      {
        System.out.print(words[i][j] + " ");
      }
      System.out.println();
    }
    
  }
}