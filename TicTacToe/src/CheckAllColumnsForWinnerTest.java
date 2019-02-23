import static org.junit.Assert.*;

import org.junit.Test;

public class CheckAllColumnsForWinnerTest {

	@Test
	public void columns1() {
		String[][] board = {{"X", null, null},{"X", "null", "null"}, {"X", null,"X"}};
		assertEquals("X", TicTacToe.checkAllColumnsForWinner(board));
	}
	@Test
	public void columns2() {
		String[][] board = {
				{"O", "X", null},
				{"O", "X", "O"},
				{"X", "X", null}
		};
		assertEquals("X", TicTacToe.checkAllColumnsForWinner(board));
	}
	@Test
	public void columns3() {
		String[][] board = {
				{"O", "O", "X"},
				{"O", "X", null},
				{null,   null,   "X"}
		};
		assertEquals(null, TicTacToe.checkAllColumnsForWinner(board) );
	}
	@Test
	public void columns4() {
		String[][] board = {
				{"X", "X", "O"},
				{"X", "O", "O"},
				{null,   null,   "O"}
		};
		assertEquals("O", TicTacToe.checkAllColumnsForWinner(board));
	}
	@Test
	public void columns5() {
		String[][] board = {
				{"X", "X", null},
				{"X", "X", null},
				{null,   null,   null}
		};
		assertEquals(null, TicTacToe.checkAllColumnsForWinner(board));
	}

	@Test
	public void testColumnsLarge() {
		String board[][] = {{"X", null, "X", null}, 
				            {"+", null, "+", null}, 
				            {"X", null, "X", null}, 
				            {"+", null, "+", null}};
		
		assertEquals(null, TicTacToe.checkAllColumnsForWinner(board));
		
		String board2[][] = {{"X", "+", "X", "+"}, 
				             {"X", "+", "X", "+"}, 
				             {"X", "+", "X", "+"}, 
				             {"+", "+", "X", "+"}};

		assertEquals("+", TicTacToe.checkAllColumnsForWinner(board2));
		
	}
	

	@Test
	public void testColumnsSmall() {
		String board[][] = {{"X", null}, 
				            {"+", null}};
		
		assertEquals(null, TicTacToe.checkAllColumnsForWinner(board));
		
		board[0][1] = "+";
		board[1][1] = "X";

		assertEquals(null, TicTacToe.checkAllColumnsForWinner(board));
		
		board[1][1] = "+";

		assertEquals("+", TicTacToe.checkAllColumnsForWinner(board));
		
	}
	

}
