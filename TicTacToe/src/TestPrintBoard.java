
public class TestPrintBoard {

	public static void main(String[] args) {
		TicTacToe.printBoard(new String[][] {{null, "x", null}, 
            {"o", null, null}, 
            {"x", null, null}});
		TicTacToe.printBoard(new String[][] {{"x", null}, 
            {null, "o"}});
		TicTacToe.printBoard(new String[][] {{null, null, null, "x"}, 
            {"o", null, null, null}, 
            {null, null, null, null}, 
            {"x", null, null, "o"}});
		TicTacToe.printBoard(new String[10][10]);
	}

}
