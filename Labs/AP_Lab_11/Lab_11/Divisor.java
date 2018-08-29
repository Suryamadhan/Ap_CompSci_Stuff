import java.util.Scanner;
public class Divisor
{
  public static Scanner dS = new Scanner(System.in);
  
  public static void main(String[]args)
  {
    int [][] nums = new int [4][4];
    
    for(int i = 0; i < nums.length; i++)
    {
      for(int j = 0; j < nums[i].length; j++)
      {
        nums[i][j] = (int)(100 * Math.random());
        System.out.print(nums[i][j] + " ");
      }
      System.out.println();
    }
    
    System.out.println("Please enter a number: ");
    int divisor = dS.nextInt();
    int count = 0;
    
    for(int i = 0; i < nums.length; i++)
    {
      for(int j = 0; j < nums[i].length; j++)
      {
        if(nums[i][j] % divisor == 0)
        {
          count ++;
        }
      }
    }
    
    System.out.println("There are "+ count+ " numbers divisible by "+divisor +" in the Array.");
  }
}