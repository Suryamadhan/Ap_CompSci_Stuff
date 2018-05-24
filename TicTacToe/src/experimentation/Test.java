package experimentation;

public class Test 
{
	public static String[][] fullBoard = new String[11][21];
	
	public static String[][] board1 = new String[3][3];
	public static String[][] board2 = new String[3][3];
	public static String[][] board3 = new String[3][3];
	public static String[][] board4 = new String[3][3];
	public static String[][] board5 = new String[3][3];
	public static String[][] board6 = new String[3][3];
	public static String[][] board7 = new String[3][3];
	public static String[][] board8 = new String[3][3];
	public static String[][] board9 = new String[3][3];
	
	public static void main(String[]args)
	{

		fillArray(board1);
		fillArray(board2);
		fillArray(board3);
		fillArray(board4);
		fillArray(board5);
		fillArray(board6);
		fillArray(board7);
		fillArray(board8);
		fillArray(board9);
		
		fillBoard();
		
		printArray(fullBoard);
		
		
		
//		System.out.println("X - -   X - -   X - -");
//		System.out.println("- X -   X - -   X - -");
//		System.out.println("- - X   X - -   X - -");
//		
//		System.out.println("");
//		
//		System.out.println("X - -   X - -   X - -");
//		System.out.println("- X -   X - -   X - -");
//		System.out.println("- - X   X - -   X - -");
//		
//		System.out.println("");
//		
//		System.out.println("X - -   X - -   X - -");
//		System.out.println("- X -   X - -   X - -");
//		System.out.println("- - X   X - -   X - -");
	}
	
	public static void printArray(String[][] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void fillArray(String[][] array)
	{
		array[0][0] = "-";
		array[0][1] = "-";
		array[0][2] = "-";
		array[1][0] = "-";
		array[1][1] = "-";
		array[1][2] = "-";
		array[2][0] = "-";
		array[2][1] = "-";
		array[2][2] = "-";
	}
	
	public static void fillBoard()
	{
		fullBoard[0][0] = board1[0][0];
		fullBoard[0][1] = " ";
		fullBoard[0][2] = board1[0][1];
		fullBoard[0][3] = " ";
		fullBoard[0][4] = board1[0][2];
		fullBoard[0][5] = " ";
		fullBoard[0][6] = " ";
		fullBoard[0][7] = " ";
		fullBoard[0][8] = board2[0][0];
		fullBoard[0][9] = " ";
		fullBoard[0][10] = board2[0][1];
		fullBoard[0][11] = " ";
		fullBoard[0][12] = board2[0][2];
		fullBoard[0][13] = " ";
		fullBoard[0][14] = " ";
		fullBoard[0][15] = " ";
		fullBoard[0][16] = board3[0][0];
		fullBoard[0][17] = " ";
		fullBoard[0][18] = board3[0][1];
		fullBoard[0][19] = " ";
		fullBoard[0][20] = board3[0][2];
		
		fullBoard[1][0] = board1[1][0];
		fullBoard[1][1] = " ";
		fullBoard[1][2] = board1[1][1];
		fullBoard[1][3] = " ";
		fullBoard[1][4] = board1[1][2];
		fullBoard[1][5] = " ";
		fullBoard[1][6] = " ";
		fullBoard[1][7] = " ";
		fullBoard[1][8] = board2[1][0];
		fullBoard[1][9] = " ";
		fullBoard[1][10] = board2[1][1];
		fullBoard[1][11] = " ";
		fullBoard[1][12] = board2[1][2];
		fullBoard[1][13] = " ";
		fullBoard[1][14] = " ";
		fullBoard[1][15] = " ";
		fullBoard[1][16] = board3[1][0];
		fullBoard[1][17] = " ";
		fullBoard[1][18] = board3[1][1];
		fullBoard[1][19] = " ";
		fullBoard[1][20] = board3[1][2];
		
		fullBoard[2][0] = board1[2][0];
		fullBoard[2][1] = " ";
		fullBoard[2][2] = board1[2][1];
		fullBoard[2][3] = " ";
		fullBoard[2][4] = board1[2][2];
		fullBoard[2][5] = " ";
		fullBoard[2][6] = " ";
		fullBoard[2][7] = " ";
		fullBoard[2][8] = board2[2][0];
		fullBoard[2][9] = " ";
		fullBoard[2][10] = board2[2][1];
		fullBoard[2][11] = " ";
		fullBoard[2][12] = board2[2][2];
		fullBoard[2][13] = " ";
		fullBoard[2][14] = " ";
		fullBoard[2][15] = " ";
		fullBoard[2][16] = board3[2][0];
		fullBoard[2][17] = " ";
		fullBoard[2][18] = board3[2][1];
		fullBoard[2][19] = " ";
		fullBoard[2][20] = board3[2][2];
		
		for(int i = 0; i < 21; i++)
		{
			fullBoard[3][i] = " ";
		}
		
		fullBoard[4][0] = board4[0][0];
		fullBoard[4][1] = " ";
		fullBoard[4][2] = board4[0][1];
		fullBoard[4][3] = " ";
		fullBoard[4][4] = board4[0][2];
		fullBoard[4][5] = " ";
		fullBoard[4][6] = " ";
		fullBoard[4][7] = " ";
		fullBoard[4][8] = board5[0][0];
		fullBoard[4][9] = " ";
		fullBoard[4][10] = board5[0][1];
		fullBoard[4][11] = " ";
		fullBoard[4][12] = board5[0][2];
		fullBoard[4][13] = " ";
		fullBoard[4][14] = " ";
		fullBoard[4][15] = " ";
		fullBoard[4][16] = board6[0][0];
		fullBoard[4][17] = " ";
		fullBoard[4][18] = board6[0][1];
		fullBoard[4][19] = " ";
		fullBoard[4][20] = board6[0][2];
		
		fullBoard[5][0] = board4[1][0];
		fullBoard[5][1] = " ";
		fullBoard[5][2] = board4[1][1];
		fullBoard[5][3] = " ";
		fullBoard[5][4] = board4[1][2];
		fullBoard[5][5] = " ";
		fullBoard[5][6] = " ";
		fullBoard[5][7] = " ";
		fullBoard[5][8] = board5[1][0];
		fullBoard[5][9] = " ";
		fullBoard[5][10] = board5[1][1];
		fullBoard[5][11] = " ";
		fullBoard[5][12] = board5[1][2];
		fullBoard[5][13] = " ";
		fullBoard[5][14] = " ";
		fullBoard[5][15] = " ";
		fullBoard[5][16] = board6[1][0];
		fullBoard[5][17] = " ";
		fullBoard[5][18] = board6[1][1];
		fullBoard[5][19] = " ";
		fullBoard[5][20] = board6[1][2];
		
		fullBoard[6][0] = board4[2][0];
		fullBoard[6][1] = " ";
		fullBoard[6][2] = board4[2][1];
		fullBoard[6][3] = " ";
		fullBoard[6][4] = board4[2][2];
		fullBoard[6][5] = " ";
		fullBoard[6][6] = " ";
		fullBoard[6][7] = " ";
		fullBoard[6][8] = board5[2][0];
		fullBoard[6][9] = " ";
		fullBoard[6][10] = board5[2][1];
		fullBoard[6][11] = " ";
		fullBoard[6][12] = board5[2][2];
		fullBoard[6][13] = " ";
		fullBoard[6][14] = " ";
		fullBoard[6][15] = " ";
		fullBoard[6][16] = board6[2][0];
		fullBoard[6][17] = " ";
		fullBoard[6][18] = board6[2][1];
		fullBoard[6][19] = " ";
		fullBoard[6][20] = board6[2][2];
		
		for(int i = 0; i < 21; i++)
		{
			fullBoard[7][i] = " ";
		}
		
		fullBoard[8][0] = board7[0][0];
		fullBoard[8][1] = " ";
		fullBoard[8][2] = board7[0][1];
		fullBoard[8][3] = " ";
		fullBoard[8][4] = board7[0][2];
		fullBoard[8][5] = " ";
		fullBoard[8][6] = " ";
		fullBoard[8][7] = " ";
		fullBoard[8][8] = board8[0][0];
		fullBoard[8][9] = " ";
		fullBoard[8][10] = board8[0][1];
		fullBoard[8][11] = " ";
		fullBoard[8][12] = board8[0][2];
		fullBoard[8][13] = " ";
		fullBoard[8][14] = " ";
		fullBoard[8][15] = " ";
		fullBoard[8][16] = board9[0][0];
		fullBoard[8][17] = " ";
		fullBoard[8][18] = board9[0][1];
		fullBoard[8][19] = " ";
		fullBoard[8][20] = board9[0][2];
		
		fullBoard[9][0] = board7[1][0];
		fullBoard[9][1] = " ";
		fullBoard[9][2] = board7[1][1];
		fullBoard[9][3] = " ";
		fullBoard[9][4] = board7[1][2];
		fullBoard[9][5] = " ";
		fullBoard[9][6] = " ";
		fullBoard[9][7] = " ";
		fullBoard[9][8] = board8[1][0];
		fullBoard[9][9] = " ";
		fullBoard[9][10] = board8[1][1];
		fullBoard[9][11] = " ";
		fullBoard[9][12] = board8[1][2];
		fullBoard[9][13] = " ";
		fullBoard[9][14] = " ";
		fullBoard[9][15] = " ";
		fullBoard[9][16] = board9[1][0];
		fullBoard[9][17] = " ";
		fullBoard[9][18] = board9[1][1];
		fullBoard[9][19] = " ";
		fullBoard[9][20] = board9[1][2];
		
		fullBoard[10][0] = board7[2][0];
		fullBoard[10][1] = " ";
		fullBoard[10][2] = board7[2][1];
		fullBoard[10][3] = " ";
		fullBoard[10][4] = board7[2][2];
		fullBoard[10][5] = " ";
		fullBoard[10][6] = " ";
		fullBoard[10][7] = " ";
		fullBoard[10][8] = board8[2][0];
		fullBoard[10][9] = " ";
		fullBoard[10][10] = board8[2][1];
		fullBoard[10][11] = " ";
		fullBoard[10][12] = board8[2][2];
		fullBoard[10][13] = " ";
		fullBoard[10][14] = " ";
		fullBoard[10][15] = " ";
		fullBoard[10][16] = board9[2][0];
		fullBoard[10][17] = " ";
		fullBoard[10][18] = board9[2][1];
		fullBoard[10][19] = " ";
		fullBoard[10][20] = board9[2][2];
		
	}

}

