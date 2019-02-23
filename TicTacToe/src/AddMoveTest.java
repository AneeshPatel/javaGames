import static org.junit.Assert.*;

import org.junit.Test;

public class AddMoveTest {

	@Test
	public void testNoBlankSpaces() {
		String board[][] = {
				{"X", "X", "O"},
				{"O", "O", "X"},
				{"X", "O", "X"},
		};
		assertEquals(false, TicTacToe.addMove(board, -1, 1, "X"));				
		assertEquals(false, TicTacToe.addMove(board, 41, 1, "X"));				
		assertEquals(false, TicTacToe.addMove(board, 2, 11, "X"));				
		assertEquals(false, TicTacToe.addMove(board, 2, -5, "X"));				

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				assertEquals(false, TicTacToe.addMove(board, i, j, "X"));				
			}
		}
	}

	@Test
	public void test2By2Board() {
		String board[][] = {
				{null, "X"},
				{"O", null},
		};
		assertEquals(true,  TicTacToe.addMove(board, 0, 0, "+"));						
		assertEquals(false, TicTacToe.addMove(board, 0, 1, "+"));						
		assertEquals(false, TicTacToe.addMove(board, 0, 2, "+"));						
		assertEquals(false, TicTacToe.addMove(board, 1, 0, "+"));						
		assertEquals(true,  TicTacToe.addMove(board, 1, 1, "+"));
		assertEquals(false, TicTacToe.addMove(board, 1, 2, "+"));						
		assertEquals(false, TicTacToe.addMove(board, 2, 0, "+"));						
		assertEquals(false, TicTacToe.addMove(board, 2, 1, "+"));
		assertEquals(false, TicTacToe.addMove(board, 2, 2, "+"));	
	}
	
	
	@Test
	public void test4By4Board() {
		String board[][] = {
				{"O", "X", null, "X"},
				{"O", null, null, "O"},
				{null, "O", "X", null},
				{"X", null, "O", "X"},
		};
		assertEquals(false, TicTacToe.addMove(board, 0, 0, "+"));						
		assertEquals(false, TicTacToe.addMove(board, 0, 1, "+"));						
		assertEquals(true,  TicTacToe.addMove(board, 0, 2, "+"));						
		assertEquals(false, TicTacToe.addMove(board, 0, 3, "+"));						
		assertEquals(false, TicTacToe.addMove(board, 1, 0, "+"));						
		assertEquals(true,  TicTacToe.addMove(board, 1, 1, "+"));
		assertEquals(true,  TicTacToe.addMove(board, 1, 2, "+"));						
		assertEquals(false, TicTacToe.addMove(board, 1, 3, "+"));						
		assertEquals(true,  TicTacToe.addMove(board, 2, 0, "+"));						
		assertEquals(false, TicTacToe.addMove(board, 2, 1, "+"));
		assertEquals(false, TicTacToe.addMove(board, 2, 2, "+"));
		assertEquals(true,  TicTacToe.addMove(board, 2, 3, "+"));						
		assertEquals(false, TicTacToe.addMove(board, 3, 0, "+"));						
		assertEquals(true,  TicTacToe.addMove(board, 3, 1, "+"));
		assertEquals(false, TicTacToe.addMove(board, 3, 2, "+"));
		assertEquals(false, TicTacToe.addMove(board, 3, 3, "+"));						

	}
}
