import java.util.Scanner;

public class TicTacToe {
	/**
	 * Checks if the (row,column) is a legal space and available. 
	 * If so assign the playerMark to the space
	 * @param board - the 2-D array holding the current state of the game
	 * @param row - the row of the users put marker
	 * @param col - the column of the users put marker
	 * @param playerMark  - the current user's token (usually either "x" or "o")
	 * @return true if the space is legal and available, false if not
	 */
	public static boolean addMove (String[][] board, int row, int col, String playerMark)
	{
		// if row is not valid index  (Don't hardcode a value like 3. 
		//    It has to work for boards with different size.)
		// OR if col is not  a valid index  (Don't hardcode a value. 
		//    It has to work for boards with different size.)
		// OR if the value at (row, col) is not equal to null
		// 		 return false  (the space is already occupied.)
		// otherwise
		//		 set the value at (row, col) to be playerMark
		//       return true

		return false;  // delete this line when you implement correctly!
	}

	/**
	 * Checks the grid to see if any space is not used yet (i.e.value is null) 
	 * returns true if any (null) space exists.
	 * @param row
	 * @return true if any space in the board is null
	 */
	public static boolean anyBlankSpaces (String[][] board)
	{
		// loop through all the rows
		//		loop through all the columns in a row
		//			if any value is null return true
		//      end loop
		// end loop
		// outside the loop (we didn't find any null) return false
		
		return false;
	}

	/**
	 * Checks to see if a row is a ticTacToe winner
	 *
	 * @param board the 2-D array holding the current state of the game 
	 * @return the winning marker("x" or "o") if it is a winner, null if no winner
	 */
	public static String checkRowForWinner (String[] row)
	{
		// save the first value in row
		// if it is null, return null because the row can't be a winner if the first value is null

		// loop through the row (use forEach loop!)
		//      if any value is different from the first value, 
		//         it is not a winner, return null
		// end loop

		// Outside the loop (if we made it here none of the values were different)
		// return the first value
		return null;  // delete this line when you have implemented correctly!
	}

	/**
	 * Checks each row of the board to see if any winner exists.
	 *
	 * @param board the 2-D array holding the current state of the game 
	 * @return the winning marker if it is a winner, null if no winner
	 */
	public static String checkAllRowsForWinner(String[][] board)
	{
		// loop through the rows (use forEach!), call checkRowForWinner for each row
		//      save the value of checkRowWinner 
		//      if the value isn't null
		//           return the value (the winning marker)
		//      end if
		// end loop
		// Outside the loop (we didn't find any) return null
		return null;
	}

	/**
	 * Checks to see if the column depicted by columnIndex is a winner
	 *
	 * @param board the 2-D array holding the current state of the game 
	 * @return the winning marker("x" or "o") if it is a winner, null if no winner
	 */
	public static String checkColumnForWinner (String[][] board, int columnIndex)
	{
		// save the board value from the first row of the column at columnIndex
		// if it is null, return null because the column can't be a winner if it is null
		// loop through each row (user forEach)
		//      grab the value at columnIndex of that row
		//      if any value is different from the first value, 
		//				return null (not a winner)
		//		 end if
		// end loop
		// Outside the loop (we didn't find any differences) return the saved winner value
		return null;  // delete this line when you have implemented correctly!
	}


	/**
	 * Checks each column of the board to see if any winner exists.
	 *
	 * @param board the 2-D array holding the current state of the game 
	 * @return the winning marker if it is a winner, null if no winner
	 */
	public static String checkAllColumnsForWinner(String[][] board)
	{
		// loop through all the column 
		//    call checkColumnForWinner with a column index and save the result
		//    if the result is not null, 
		//	    return the result (that is the winner).
		//	  end if
		// end loop
		// at the end (outside the loop) return null
		return null;
	}


	/**
	 * Checks to see if the diagonal from upper left (0,0) to lower 
	 * right (maxIndex, maxIndex) is a winner
	 *
	 * @param board the 2-D array holding the current state of the game 
	 * @return the winning marker if it is a winner, null if no winner
	 */
	public static String checkLeftToRightDiagonalWinner(String[][] board)
	{
		// Save the value in the upper left corner of the board  [0][0]
		// if it is null, return null because the diagonal can't be a winner if it is null
		// loop through the indexes 0 to the max row index 
		//     if the value at board[index][index] is not equal to the saved value 
		//       return null (not a win)
		//     end if
		// end loop
		// outside the loop (you didn't find any different values) return the first value
		return null;  // delete this line when you have implemented correctly!
	}

	/**
	 * Checks to see if the diagonal from upper right (0, maxIndex) 
	 * to lower left (maxIndex, 0) is a winner
	 *
	 * @param board the 2-D array holding the current state of the game 
	 * @return the winning marker if it is a winner, null if no winner
	 */
	public static String checkRightToLeftDiagonalWinner(String[][] board)
	{
		// Save the value in the upper right corner: board[0][max_index]
		// if it is null, return null
		// loop through the indexes 0 to the max row index
		//    if the value of board[index][max_index - index] is not equal 
		//    to the saved value 
		//        return null (not a win)
		//    end if
		// end loop
		// outside the loop (you didn't find any different values) return the first value
		return null;  // delete this line when you have implemented correctly!
	}

	/**
	 * Checks to see if the game has a winner
	 *
	 * @param board the 2-D array holding the current state of the game 
	 * @return the winning marker if it is a winner, null if no winner
	 */
	public static String checkWinner (String[][] board) 
	{
		// check checkAllRowsForWinner's value 
		// if the value is not null return the value
		// otherwise check checkAllColumnsForWinner's value
		// if the value is not null return the value
		// otherwise check checkLeftToRightDiagonalWinner value
		// if the value is not null return the value
		// otherwise check checkRightToLeftDiagonalWinner value
		// if the value is not null return the value
		// otherwise return null // no winners
		return null;
	}

	/**
	 * Checks the board to determine if there are any winners 
	 * or if the game is tied.
	 * If the game is over, prints the board and reports the result 
	 * (who is the winner or game is tied) 
	 * 
	 * @param board - the 2-D array holding the current state of the game 
	 * @return true if the game is won or tie, false if there are still 
	 *         spaces to put markers.
	 */
	public static boolean gameOver (String[][] board)
	{
		// Call checkWinner and save the return value
		// if the value is not null (has winner)
		//		call printBoard
		//		print out that the marker wins
		//		return true
		// else if anyBlankSpaces returns false(no more spaces left)
		//		call printBoard
		//		print out that the game is tied
		//		return true
		// else return false (game not over yet)

		return true;  // delete this line when you have implemented correctly!
	}


	/**
	 * Prints out the board frame and any non null values
	 * for example a 2 x 2  board with one x and one o might print
	 * 
	 *   x |   
	 *  --- --- 
	 *     | o 
	 *     
	 * A 4 x 4 board would look like
	 * 
	 *   x |   | o |   
	 *  --- --- --- --- 
	 *     | x | x |   
	 *  --- --- --- ---
	 *   o |   | o |   
	 *  --- --- --- ---
	 *     | o |   |   
	 *     
	 * A blank 3 x 3 board would look like
	 * 
	 *     |   |   
	 *  --- --- ---
	 *     |   |   
	 *  --- --- ---
	 *     |   |   
	 *     
	 * @param board - the 2-D array holding the current state of the game
	 */
	public static void printBoard (String[][] board)
	{
		// print out a blank line
		// loop through the rows
		//      if it's not the first row
		//		    loop for the # of times that there are columns
		//               print out "--- "
		//			end of loop
		//		end if
		//      print out a blank line
		//      for each column in the current row
		//		   if it's not the first column
		//				 print out "|"
		//         Save the value in the row/col space in a variable
		//		   if the saved value is null
		//	     	   print out three spaces, ie: "   "
		//		   otherwise
		//			   print out "space value space", such as " x " 
		//      end of loop
		//		print out a new line
		// end of loop
		// print out a new line

	}

	/**
	 * Let's the user know it's their turn and ask the user to 
	 * enter their move (row and column)
	 * Keep asking the user until they enter a valid move.
	 * 
	 * @param sc - a Scanner to ask for user input
	 * @param board  - the 2-D array holding the current state of the game
	 * @param marker - the marker that user will put (either "x" or "o")
	 */
	public static void getUserMove(Scanner sc, String[][] board, String marker)
	{
		// create a boolean variable to save if the move was valid 
		// print out a message that which marker will be put into board.
		// (usually "x" or "o" in turn)
		// start a while loop
		//      Print out a prompt to enter row and column
		//      use the passed in scanner to read in and save the row
		//      use the passed in scanner to read in and save the col
		//      call addMove and save the returned value 
		// 		if the returned value is not true, print out that the row 
		//      and col were not valid, and ask user to try again
		// continue while the returned value is not true
	}


	/**
	 * Play a single game of TicTacToe
	 */
	public static void playGame(Scanner sc)
	{
		int SIZE = 3; // Use this variable and its value for the size of 
		              // the 2D board array ONLY. The size information is 
		              // not specified anywhere else in the code
		//  create a two dimensional String array using the SIZE variable 
		//  for both rows and columns
		//
		//start a while loop
		//	  call printBoard with your 2D array
		//	  call getUserMove with scanner, 2D array and marker "x" 
		//	  call printBoard
		//	  if the gameOver methods does not return true
		//		  call getUserMove with scanner, 2D array and marker "o" 
		//    end if
		// keep going while gameOver doesn't return true
		
	}


	public static void main(String[] args) {
		// Create a scanner object
		// call method playGame, and pass in your scanner object
		// if you want a fancy game, 
		//   -- after each game, ask the user if they want to play more
		//   -- Keep calling playGame and asking user until the user says no!
		// close scanner
	}


}


