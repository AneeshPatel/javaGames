import static org.junit.Assert.*;

import org.junit.Test;

public class CheckWinnerTest {
	@Test
	public void columns1() {
		String[][] board = {{"X", null, null},
				            {"X", "null", "null"}, 
				            {"X", null,"X"}};
		assertEquals("X", TicTacToe.checkWinner(board));
	}
	@Test
	public void columns2() {
		String[][] board = {
				{"O", "X", null},
				{"O", "X", "O"},
				{"X", "X", null}
		};
		assertEquals("X", TicTacToe.checkWinner(board));
	}
	@Test
	public void columns3() {
		String[][] board = {
				{"O", "O", "O"},
				{"X", "X", null},
				{null,   null,   "X"}
		};
		assertEquals("O", TicTacToe.checkWinner(board) );
	}
	@Test
	public void columns4() {
		String[][] board = {
				{"X", "X", "O"},
				{"X", "O", "O"},
				{null,   null,   "O"}
		};
		assertEquals("O", TicTacToe.checkWinner(board));
	}
	@Test
	public void columns5() {
		String[][] board = {
				{"X", "X", "O"},
				{"X", "O", null},
				{"O",   null,   null}
		};
		assertEquals("O", TicTacToe.checkWinner(board));
	}

	@Test
	public void testColumnsLarge() {
		String board[][] = {{"X", null, "X", null}, 
				            {"+", null, "+", null}, 
				            {"X", null, "X", null}, 
				            {"+", null, "+", null}};
		
		assertEquals(null, TicTacToe.checkWinner(board));
		
		String board2[][] = {{"X", "+", "X", "+"}, 
				             {"X", "X", "X", "+"}, 
				             {"X", "+", "X", "+"}, 
				             {"+", "+", "X", "X"}};

		assertEquals("X", TicTacToe.checkWinner(board2));
		
	}
	

	@Test
	public void testColumnsSmall() {
		String board[][] = {{"X", null}, 
				            {"+", null}};
		
		assertEquals(null, TicTacToe.checkWinner(board));
		
		board[0][1] = "+";

		assertEquals("+", TicTacToe.checkWinner(board));
		
		board[0][1] = null;
		board[1][1] = "+";

		assertEquals("+", TicTacToe.checkWinner(board));
		
	}
	
}
