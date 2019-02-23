import static org.junit.Assert.*;

import org.junit.Test;

public class CheckLeftToRightDiagonalWinnerTest {

	@Test
	public void leftRightDiagonal1() {
		String[][] board = {
				{"X", null,   null},
				{"O", "X",    "O"},
				{null, null,  "X"}
		};
		assertEquals("X", TicTacToe.checkLeftToRightDiagonalWinner(board));
	}
	@Test
	public void leftRightDiagonal2() {
		String[][] board = {
				{"O",    "X", null},
				{null,   "O", "O"},
				{null,   "X", "O"}
		};
		assertEquals("O", TicTacToe.checkLeftToRightDiagonalWinner(board));
	}
	@Test
	public void leftRightDiagonal3() {
		String[][] board = {
				{"O", "X", "O"},
				{"X", "X", "O"},
				{"X", null,"O"}
		};
		assertEquals(null, TicTacToe.checkLeftToRightDiagonalWinner(board));
	}
	@Test
	public void leftRightDiagonal4() {
		String[][] board = {
				{null, "X",   "O"},
				{"X", null,   "O"},
				{"X", null,   "O"}
		};
		assertEquals(null, TicTacToe.checkLeftToRightDiagonalWinner(board));
	}
	@Test
	public void leftRightDiagonal5() {
		String[][] board = {
				{"X", "X", "O"},
				{"X", "O", "O"},
				{"X", "X", "O"},
		};
		assertEquals(null, TicTacToe.checkLeftToRightDiagonalWinner(board));
	}
	
	@Test
	public void leftRightDiagonalSmall() {
		String[][] board = {
				{"X", "X"},
				{"X", "O"},
		};
		assertEquals(null, TicTacToe.checkLeftToRightDiagonalWinner(board));
		board[0][0] = "O";
		assertEquals( "O", TicTacToe.checkLeftToRightDiagonalWinner(board));
	}
	
	@Test
	public void leftRightDiagonalLarge() {
		String[][] board = {
				{"X", "X", "O", null},
				{null, "X", "O", "O"},
				{"X", null, "X", "O"},
				{"X", null, "X", "X"},
		};
		assertEquals("X", TicTacToe.checkLeftToRightDiagonalWinner(board));
		board[2][2] = null;
		assertEquals(null, TicTacToe.checkLeftToRightDiagonalWinner(board));
	}
}
