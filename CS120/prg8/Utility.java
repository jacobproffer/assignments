public class Utility {
	public static String playerOne() {
		ConsoleIO.printLine("Player 1, what is your name?");
		String one = ConsoleIO.readLine();
		while (one.equals("")) {
			ConsoleIO.printLine("I'm sorry, what is your name again?");
			one = ConsoleIO.readLine();
		}
		return one;
	}
	public static String playerTwo() {
		ConsoleIO.printLine("Player 2, what is your name?");
		String two = ConsoleIO.readLine();
		while (two.equals("")) {
			ConsoleIO.printLine("I'm sorry, what is your name again?");
			two = ConsoleIO.readLine();
		}
		return two;
	}
	public static int numberOfStones() {
		ConsoleIO.printLine("Let's play Take Four - how many stones are in the pile to start with?");
		int stones = ConsoleIO.readInt();
		while (stones > 40) {
			//While loop if number of stones is greater than 40
			ConsoleIO.printLine("I don't have that many stones, jerk.");
			ConsoleIO.printLine("How many stones do you really want to begin with?");
			stones = ConsoleIO.readInt();
		}
		while (stones < 10) {
			ConsoleIO.printLine("I'm sorry, we need more stones than that.");
			ConsoleIO.printLine("How many stones do you really want to begin with?");
			stones = ConsoleIO.readInt();
		}
		ConsoleIO.printLine("There are " + stones + " stones left.");
		return stones;
	}
}