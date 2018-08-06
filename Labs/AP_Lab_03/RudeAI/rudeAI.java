import java.util.Scanner;
public class rudeAI
{
	public static void main(String[]args)
	{
		Scanner dataScanner = new Scanner(System.in);
		
		String name, age, funActivity, numberOfSiblings, dreamJob, favMusic;
		System.out.println("Hello there, my name is Rude AI.");
		System.out.println("I hope you are having a bad day.");
		
		System.out.println("What is your name?");
		name = dataScanner.nextLine();
		
		System.out.println(name + " sounds like a terrible name, but we're having a nice talk here.");
		System.out.println("You look pretty old. How old are you?");
		age = dataScanner.nextLine();
		
		System.out.println(age + "??? That sounds like the grade you got in AP Comp Sci");
		System.out.println("What do you in your free time?");
		funActivity = dataScanner.nextLine();
		
		System.out.println(funActivity + ".... I'm just going to say you are wasting your time...");
		System.out.println("What kind of music do you like listening to?");
		favMusic = dataScanner.nextLine();
		
		System.out.println("You listen to " + favMusic + "?! No wonder you are living a terrible life.");
		System.out.println("Well... To make things a bit better, let's talk about your family.");
		System.out.println("How many siblings do you have?");
		numberOfSiblings =  dataScanner.nextLine();
		
		System.out.println(numberOfSiblings + "? Nice I guess... I just hope the best for them that they don't end up like you...");
		System.out.println("What do you want to be when you grow up?");
		dreamJob = dataScanner.nextLine();
		
		System.out.println("So your name is " + name + ".");
		System.out.println("You are " + age + " years old...");
		System.out.println("You waste your time by " + funActivity + ".");
		System.out.println("Out of all types of music you like " + favMusic + ".");
		System.out.println("And you want to become a " + dreamJob + "???");
		System.out.println("Have fun dreaming...");
		
	}
}