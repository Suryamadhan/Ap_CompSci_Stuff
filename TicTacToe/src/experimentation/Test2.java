package experimentation;


public class Test2 
{
	public static String[][] board1 = new String[3][3];
	
	public static void main(String[]args)
	{
		fillArray(board1);
		printArray(board1);
		System.out.println(returnWinner(board1));
	}
	
	public static void printArray(String[][] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void fillArray(String[][] array)
	{
		array[0][0] = "X";
		array[0][1] = "O";
		array[0][2] = "X";
		array[1][0] = "-";
		array[1][1] = "-";
		array[1][2] = "-";
		array[2][0] = "X";
		array[2][1] = "X";
		array[2][2] = "O";
	}
	
	public static String returnWinner(String[][] array)
	{
		boolean condition1 = false, condition2 = false, condition3 = false;
		String returnCharacter = "";
		for(int i = 0; i< array.length && !condition1; i++)
		{
			if(array[i][0] == array[i][1] && array[i][1] == array[i][2] && array[i][1] != "-")
			{
				condition1 = true;
				returnCharacter = array[i][1];
			}
			else 
			{
				condition1 = false;
			}
		}
		
		for(int i = 0; i < array[i].length -1 && !condition2; i++)
		{
			if(array[0][i] == array[1][i] && array[1][i] == array[2][i]  && array[i][1] != "-")
			{
				condition2 = true;
				returnCharacter = array[i][1];
			}
			else 
			{
				condition2 = false;
			}
		}
		
		if(array[0][0] == array[1][1] && array[1][1] == array[2][2] && array[1][1] != "-")
		{
			condition3 = true;
			returnCharacter = array[1][1];
		}
		else if(array[0][2] == array[1][1] && array[1][1] == array[2][0]  && array[1][1] != null)
		{
			condition3 = true;
			returnCharacter = array[1][1];
		}
		else
		{
			condition3 = false;
		}
		
		if(condition1 || condition2 || condition3)
		{
			return returnCharacter;
		}
		else
		{
			return "Game not over";
		}
		
	}

}
