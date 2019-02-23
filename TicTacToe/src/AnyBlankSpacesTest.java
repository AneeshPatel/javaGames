import org.junit.Test;
import static org.junit.Assert.*;

public class AnyBlankSpacesTest {
	@Test
	public void testNoBlankSpaces() {
		String board[][] = {
				{"X", "X", "O"},
				{"O", "O", "X"},
				{"X", "O", "X"},
		};
		assertEquals(false, TicTacToe.anyBlankSpaces(board));
	}
	@Test
	public void testBlankSpacesBottom() {
		String board1[][] = {
				{"X", "X", "O"},
				{"O", "O", "X"},
				{null,   "O", "X"},
		};
		assertEquals(true, TicTacToe.anyBlankSpaces(board1));
		String board2[][] = {
				{"X", "X", "O"},
				{"O", "O", "X"},
				{"X", null,   "X"},
		};
		assertEquals(true, TicTacToe.anyBlankSpaces(board2));
		String board3[][] = {
				{"X", "X", "O"},
				{"O", "O", "X"},
				{"X", "O", null},
		};
		assertEquals(true, TicTacToe.anyBlankSpaces(board3));
	}
	@Test
	public void testBlankSpacesMiddle() {
		String board1[][] = {
				{"X", "X", "O"},
				{null,   "O", "X"},
				{"X", "O", "X"},
		};
		assertEquals(true, TicTacToe.anyBlankSpaces(board1));
		String board2[][] = {
				{"X", "X", "O"},
				{"O", null,   "X"},
				{"X", "O", "X"},
		};
		assertEquals(true, TicTacToe.anyBlankSpaces(board2));
		String board3[][] = {
				{"X", "X", "O"},
				{"O", "O", null},
				{"X", "O", "X"},
		};
		assertEquals(true, TicTacToe.anyBlankSpaces(board3));
	}
	@Test
	public void testBlankSpacesTop() {
		String board1[][] = {
				{null,   "X", "O"},
				{"O", "O", "X"},
				{"X", "O", "X"},
		};
		assertEquals(true, TicTacToe.anyBlankSpaces(board1));
		String board2[][] = {
				{"X", null,   "O"},
				{"O", "O", "X"},
				{"X", "O", "X"},
		};
		assertEquals(true, TicTacToe.anyBlankSpaces(board2));
		String board3[][] = {
				{"X", "X", null},
				{"O", "O", "X"},
				{"X", "O", "X"},
		};
		assertEquals(true, TicTacToe.anyBlankSpaces(board3));
	}
	
	@Test
	public void testBlankSpacesSmall() {
		String board[][] = {{"X", null}, {"+", null}};
		
		assertEquals(true, TicTacToe.anyBlankSpaces(board));
		
		board[0][1] = "+";
		board[1][1] = "X";

		assertEquals(false, TicTacToe.anyBlankSpaces(board));
		
	}
	
	@Test
	public void testBlankSpacesLarge() {
		String board[][] = {{"X", null, "X", null}, {"+", null, "+", null}, {"X", null, "X", null}, {"+", null, "+", null}};
		
		assertEquals(true, TicTacToe.anyBlankSpaces(board));
		
		String board2[][] = {{"X", "+", "X", "+"}, {"X", "+", "X", "+"}, {"X", "+", "X", "+"}, {"X", "+", "X", "+"}};

		assertEquals(false, TicTacToe.anyBlankSpaces(board2));
		
	}
	
	
	@Test
	public void testBlankSpacesMany() {
		String board1[][] = {
				{null,   "X", "O"},
				{null,   "O", "X"},
				{null,   "O", "X"},
		};
		assertEquals(true, TicTacToe.anyBlankSpaces(board1));
		String board2[][] = {
				{null,   null,   null},
				{"O", "O", "X"},
				{"X", "O", "X"},
		};
		assertEquals(true, TicTacToe.anyBlankSpaces(board2));
		String board3[][] = {
				{"X", "X", null},
				{"O", null,   "X"},
				{null,   "O", "X"},
		};
		assertEquals(true, TicTacToe.anyBlankSpaces(board3));
	}



}