import java.util.Scanner;

public class GameGun
{
  static int bulletCount; 
  static int clipSize = 16;
  static int shotsFired;
  static String[] clips;
  static Scanner dS = new Scanner(System.in);
  
  public static void main(String[]args)
  {
    bulletCount = 96;
    shotsFired = 0;
    clips = new String[clipSize];
   
    resetClip();
    reload();
    while(bulletCount > 0 || shotsFired > 0)
    {
      System.out.println("Action: ");
      String instruction = dS.next();
      if(instruction.equals("R"))
      {
        reload();
      }
      else if(instruction.equals("S"))
      {
        shoot();
      }
      
      printClip();
    }
  }
  
  public static void resetClip()
  {
    for(int i = 0; i < clips.length; i++)
    {
      clips[i] = "[]";
    }
  }
  
  public static void shoot()
  {
    if(shotsFired > 0)
    {
      clips[shotsFired - 1] = "[]";
      shotsFired--;
      System.out.println("Boom!");
    }
    else
    {
      System.out.println("Reload!");
    }
  }
  
  public static void reload()
  {
    if(bulletCount >= clipSize)
    {
      bulletCount = bulletCount - clipSize; 
      shotsFired = clipSize;
    }
    else
    {
      shotsFired = bulletCount; 
      bulletCount = 0;
    }
    resetClip();
    for(int i = 0; i < shotsFired; i++)
    {
      clips[i] = " * ";
    }
  }
  
  public static void printClip()
  {
    String output = " ";
    System.out.println("Bullets:" + bulletCount);
    System.out.print("Clip: ");
    for(int i = 0; i < clipSize; i++)
    {
      output = output + clips[i];
    }
    System.out.println(output);
  }
}