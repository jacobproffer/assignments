//Name: Jacob Proffer
//Time Invested: 64 minutes
//References: None

public class TakeFour {
	public static void main(String[] args) {
		int player1;
		int player2;
		//Greeting message
		ConsoleIO.printLine("Welcome to the game of Take Four.");
		//Ask for player names - Utility class
		String one = Utility.playerOne();
		String two = Utility.playerTwo();
		//Ask for number of stones - Utility class
		int stones = Utility.numberOfStones();
		while (stones > 0) {
			//Player 1's turn
			ConsoleIO.printLine(one + ", how many stones will you take (1-4)?");
			player1 = ConsoleIO.readInt();
			while (player1 < 1 || player1 > 4 || player1 > stones) {
				ConsoleIO.printLine("I'm sorry, how many stones will you really take (1-4)?");
				player1 = ConsoleIO.readInt();
			}
			//Return how many stones are left after player 1's turn
			stones = stones - player1;
			if (stones == 1) {
				ConsoleIO.printLine("There is " + stones + " stone left.");
			}
			else if (stones == 0) {
				ConsoleIO.printLine(one + " took the last stone. " + two + " wins.");
				return;
			}
			else {
				ConsoleIO.printLine("There are " + stones + " stones left.");
			}
			//Player 2's turn
			ConsoleIO.printLine(two + ", how many stones will you take (1-4)?");
			player2 = ConsoleIO.readInt();
			while (player2 < 1 || player2 > 4 || player2 > stones) {
				ConsoleIO.printLine("I'm sorry, how many stones will you really take (1-4)?");
				player2 = ConsoleIO.readInt();
			}
			//Return how many stones are left after player 2's turn
			stones = stones - player2;
			if (stones == 1) {
				ConsoleIO.printLine("There is " + stones + " stone left.");
			}
			else if (stones == 0) {
				ConsoleIO.printLine(two + " took the last stone. " + one + " wins.");
				return;
			}
			else {
				ConsoleIO.printLine("There are " + stones + " stones left.");
			}
		}
	}
}