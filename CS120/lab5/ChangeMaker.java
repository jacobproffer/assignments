//Name: Jacob Proffer
//Time Invested: 15 minutes
//References: None

public class ChangeMaker {
	public static void main(String[] args) {
		//Ask the user for the amount of change to give out (in cents)
		int c;
		ConsoleIO.printLine("How much change?");
		c = ConsoleIO.readInt();
		//Report the number of coins we will give out to make that change.
		int coins;
		coins = Coins.numberOfCoinsFor(c%100);
		ConsoleIO.printLine("You will receive " + coins + " coins.");
		//Dispense dollars until we must use coins to continue.
		while (c >= 100) {
			ConsoleIO.printLine("------------");
			ConsoleIO.printLine("|          |");
			ConsoleIO.printLine("|          |");
			ConsoleIO.printLine("|          |");
			ConsoleIO.printLine("|    $1    |");
			ConsoleIO.printLine("|          |");
			ConsoleIO.printLine("|          |");
			ConsoleIO.printLine("|          |");
			ConsoleIO.printLine("------------");
			c = c - 100;
		}
		//Dispense quarters until we must use a smaller coin to continue.
		while (c >= 25) {
			Coins.dispenseQuarter(true);
			c = c - 25;
		}
		//Dispense dimes until we must use a smaller coin to continue.
		while (c >= 10) {
			Coins.dispenseDime(true);
			c = c - 10;
		}
		//Dispense nickels until we must use a smaller coin to continue.
		while (c >= 5) {
			Coins.dispenseNickel(true);
			c = c - 5;
		}
		//Dispense pennies for whatever is left.
		while (c >= 1) {
			Coins.dispensePenny(true);
			c = c - 1;
		}
	}
}