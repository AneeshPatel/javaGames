import static org.junit.Assert.*;

import org.junit.Test;

public class CheckRowForWinnerTest {

	@Test
	public void row2() {
		String[] row = {"X", "X"};
		assertEquals("X", TicTacToe.checkRowForWinner(row));
	}
	
	@Test
	public void row3() {
		String[] row = {"X", "X", "X"};
		assertEquals("X", TicTacToe.checkRowForWinner(row));
	}
	
	@Test
	public void row4() {
		String[] row = {"X", "X", "X", "X"};
		assertEquals("X", TicTacToe.checkRowForWinner(row));
	}
	
	@Test
	public void row5() {
		String[] row = {"X", "O", "X"};
		assertEquals(null, TicTacToe.checkRowForWinner(row));
	}

	@Test
	public void row6() {
		String[] row = {"X", "X", "O"};
		assertEquals(null, TicTacToe.checkRowForWinner(row));
	}
	
	@Test
	public void row7() {
		String[] row = {"X", null, "X"};
		assertEquals(null, TicTacToe.checkRowForWinner(row));
	}
	
	@Test
	public void row8() {
		String[] row = {null, "O", "O"};
		assertEquals(null, TicTacToe.checkRowForWinner(row));
	}
	
	@Test
	public void row9() {
		String[] row = {null, null, null};
		assertEquals(null, TicTacToe.checkRowForWinner(row));
	}

}
