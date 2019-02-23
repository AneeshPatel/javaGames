import static org.junit.Assert.*;

import org.junit.Test;

public class GameOverTest {

	@Test
	public void columns1() {
		String[][] board = {{"X", null, null},
				            {"X", "null", "null"}, 
				            {"X", null,"X"}};
		assertEquals(true, TicTacToe.gameOver(board));
	}
	@Test
	public void columns2() {
		String[][] board = {
				{"O", "X", null},
				{"O", "X", "O"},
				{"X", "X", null}
		};
		assertEquals(true, TicTacToe.gameOver(board));
	}
	@Test
	public void columns3() {
		String[][] board = {
				{"O", "O", "O"},
				{"X", "X", null},
				{null,   null,   "X"}
		};
		assertEquals(true, TicTacToe.gameOver(board) );
	}
	@Test
	public void columns4() {
		String[][] board = {
				{"X", "X", "O"},
				{"X", "O", "O"},
				{null,   null,   "O"}
		};
		assertEquals(true, TicTacToe.gameOver(board));
	}
	@Test
	public void columns5() {
		String[][] board = {
				{"X", "X", "O"},
				{"X", "O", null},
				{"O",   null,   null}
		};
		assertEquals(true, TicTacToe.gameOver(board));
	}
	
	@Test
	public void test6() {
		String[][] board = {
				{"O", "X", "O"},
				{"X", "X", "O"},
				{"O", "O", "X"}
		};
		assertEquals(true, TicTacToe.gameOver(board));
	}

	@Test
	public void testColumnsLarge() {
		String board[][] = {{"X", null, "X", null}, 
				            {"+", null, "+", null}, 
				            {"X", null, "X", null}, 
				            {"+", null, "+", null}};
		
		assertEquals(false, TicTacToe.gameOver(board));
		
		String board2[][] = {{"+", "+", "X", "+"}, 
				             {"X", "X", "X", "+"}, 
				             {"X", "+", "X", "+"}, 
				             {"+", "+", "X", "X"}};

		assertEquals(true, TicTacToe.gameOver(board2));
		
		board2[1][2] = "+";
		assertEquals(true, TicTacToe.gameOver(board2));
		
	}
	

	@Test
	public void testColumnsSmall() {
		String board[][] = {{"X", null}, 
				            {"+", null}};
		
		assertEquals(false, TicTacToe.gameOver(board));
		
		board[0][1] = "+";

		assertEquals(true, TicTacToe.gameOver(board));
		
		board[0][1] = null;
		board[1][1] = "+";

		assertEquals(true, TicTacToe.gameOver(board));
		
	}

}
