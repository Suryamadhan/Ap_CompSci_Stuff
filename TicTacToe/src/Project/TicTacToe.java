package Project;

public class TicTacToe extends Functions
{
	public void runGame()
	{
		for(int i = 0; i < boards.length; i++)
		{
			fillWithNull(boards[i]);
		}
		
		fillBoard();
		printArray(fullBoard, false);
		
		selectedBoard = 4;
		System.out.println();
		
		fillGame("X", 1, 1);
		fillBoard();
		printArray(fullBoard, false);
		
		
	}
}
