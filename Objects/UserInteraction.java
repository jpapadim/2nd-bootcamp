import java.io.Console;

public class UserInteraction {
	private char userCharA;
	private char userCharB;
	private int row = 0;
	private int column = 0;
	private boolean valSelect;

	public char getUserA() {
		return userCharA;
	}

	public char getUserB() {
		return userCharB;
	}

	public int getRow() {
		return this.row;
	}

	public int getColumn() {
		return this.column;
	}

	public boolean getValSelect() {
		return this.valSelect;
	}

	public void selectUser() {
		valSelect = true;
		Console input = System.console();
		if (input == null) {
			System.out.println("No console to interact");
			System.exit(0);
		}

		System.out.println("Select symbol 'X' or 'O'.");
		String userSelection = input.readLine().toUpperCase();

		if (userSelection.equals("X")) {
			userCharA = userSelection.charAt(0);
			userCharB = 'O';
		} else if (userSelection.equals("O")) {
			userCharA = userSelection.charAt(0);
			userCharB = 'X';
		} else {
			System.out.println("Not a valid input");
			valSelect = false;
		}

	}

	public void playerInput() {

		Console intInput = System.console();
		if (intInput == null) {
			System.out.println("No console to interact");
			System.exit(0);
		}
		System.out.println("Play on Row (1,2 or 3): ");
		row = Integer.parseInt(intInput.readLine());

		System.out.println("Play on Column (1,2 or 3): ");
		column = Integer.parseInt(intInput.readLine());
	}

}
