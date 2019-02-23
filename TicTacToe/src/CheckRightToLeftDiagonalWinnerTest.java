import static org.junit.Assert.*;

import org.junit.Test;

public class CheckRightToLeftDiagonalWinnerTest {

	@Test
	public void rightLeftDiagonal1() {
		String[][] board = {
				{null, null,   "X"},
				{"O", "X",    "O"},
				{"X", null,  "X"}
		};
		assertEquals(TicTacToe.checkRightToLeftDiagonalWinner(board), "X");
	}
	@Test
	public void rightLeftDiagonal2() {
		String[][] board = {
				{null,    "X", "O"},
				{null,   "O", "O"},
				{"O",   "X", null}
		};
		assertEquals(TicTacToe.checkRightToLeftDiagonalWinner(board), "O");
	}
	@Test
	public void rightLeftDiagonal3() {
		String[][] board = {
				{"O", "X", "O"},
				{"X", "X", "O"},
				{"X", null,"O"}
		};
		assertEquals(TicTacToe.checkRightToLeftDiagonalWinner(board), null);
	}
	@Test
	public void rightLeftDiagonal4() {
		String[][] board = {
				{null, "X",   "O"},
				{"X", null,   "O"},
				{"X", null,   "O"}
		};
		assertEquals(TicTacToe.checkRightToLeftDiagonalWinner(board), null);
	}
	@Test
	public void rightLeftDiagonal5() {
		String[][] board = {
				{"X", "O", "X"},
				{"O", "X", "O"},
				{"X", "X", "O"},
		};
		assertEquals(TicTacToe.checkRightToLeftDiagonalWinner(board), "X");
	}
	
	@Test
	public void rightLeftDiagonalSmall() {
		String[][] board = {
				{"X", "X"},
				{"X", "O"},
		};
		assertEquals("X", TicTacToe.checkRightToLeftDiagonalWinner(board));
		board[1][0] = "O";
		assertEquals( null, TicTacToe.checkRightToLeftDiagonalWinner(board));
	}
	
	@Test
	public void rightLeftDiagonalLarge() {
		String[][] board = {
				{"X", "X", "O", null},
				{null, "X", "O", "O"},
				{"X", null, "X", "O"},
				{"X", null, "X", "X"},
		};
		assertEquals(null, TicTacToe.checkRightToLeftDiagonalWinner(board));
		board[2][1] = "O";
		assertEquals(null, TicTacToe.checkRightToLeftDiagonalWinner(board));
		board[3][0] = "O";
		assertEquals(null, TicTacToe.checkRightToLeftDiagonalWinner(board));
		board[0][3] = "O";
		assertEquals("O", TicTacToe.checkRightToLeftDiagonalWinner(board));
	}
}

