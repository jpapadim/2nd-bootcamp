import java.util.Arrays;

//Wednesday 26/04/2017 Exercise 05
public class Ex_05-TicTacToe {

	private static char[][] boardArray = new char[3][3];

	public static void main(String[] args) {
		int turn = 0;

		// fill the array with spaces
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				boardArray[i][j] = ' ';
			}
		}
		drawTheBoard();

		UserInteraction user = new UserInteraction();

		/* return to user selection if input invalid */
		do
			user.selectUser();
		while (!user.getValSelect());

		System.out.println("User A selected " + user.getUserA());
		System.out.println("User B gets " + user.getUserB());

		while (!weHaveAWinner()) {
			if ((turn % 2) == 0) {
				System.out.println("-------------------");
				System.out.println("Player A select your move.");
				user.playerInput();
				int r = user.getRow();
				int c = user.getColumn();
				if (movementCheck(r, c)) {
					boardArray[r - 1][c - 1] = user.getUserA();
					turn++;
				}
			} else {
				System.out.println("-------------------");
				System.out.println("Player B select your move.");
				// Make loop until valid input
				inputLoop: do {
					user.playerInput();
					int r = user.getRow();
					int c = user.getColumn();
					if (movementCheck(r, c)) {
						System.out.println("-------------------");
						boardArray[r - 1][c - 1] = user.getUserB();
						turn++;
						break inputLoop;
					}
				} while (true);
			}

			drawTheBoard();
		}

	}

	private static boolean weHaveAWinner() {

		/*
		 * convert char to ASCII value to check the winning values 'O': 79 (x3) or
		 ** 'X': 88 (x3). check win conditions
		 */
		int[] array = new int[8];

		/* check all lines for matches */
		for (int i = 0; i < 3; i++) {
			array[0] += (int) boardArray[i][0];
			array[1] += (int) boardArray[i][1];
			array[2] += (int) boardArray[i][2];
			array[3] += (int) boardArray[0][i];
			array[4] += (int) boardArray[1][i];
			array[5] += (int) boardArray[2][i];
			array[6] += (int) boardArray[i][i];
			array[7] += (int) boardArray[i][2 - i];
		}
		if (Arrays.toString(array).contains("264") || Arrays.toString(array).contains("237")) {
			System.out.println("We have a winner!");
			return true;

		} else{
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (boardArray[i][j] == ' ') {
						return false; /* continue the game */

						/*
						 * If nothing from above nor empty cells it's a draw
						 */
					}

				}
			}
		}
	 System.out.println("GAME OVER!  It's a DRAW!");
	 return true; /* end game */

	}

	private static void drawTheBoard() {
		System.out.println();
		for (int i = 0; i < 3; i++) {
			System.out.print("   ");

			if (i != 0) {
				System.out.println("---------");
				System.out.print("   ");
			}

			for (int j = 0; j < 3; j++) {
				System.out.print(boardArray[i][j]);
				if (j != 2)
					System.out.print(" | ");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static boolean movementCheck(int row, int column) {

		if (row < 1 || row > 3) {
			System.out.println("Row value out of range!");
			return false;
		} else if (column < 1 || column > 3) {
			System.out.println("Column value out of range!");
			return false;
		} else if (boardArray[row - 1][column - 1] != ' ') {
			System.out.println("-------------------");
			System.out.println("This position is already played !");
			return false;
		} else
			return true;
	}

}
