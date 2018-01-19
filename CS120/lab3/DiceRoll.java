//Name: Jacob Proffer
//Time Invested: 10 minutes
//References: None

public class DiceRoll {
	public static void main(String[] args) {
		//Get a random number
		double myNumber;
		myNumber = Math.random();
		//Use the random number to decide the outcome of a die roll
		int roll;
		if (myNumber < .25) {
			roll = 1;
		}
		else if (myNumber < .5) {
			roll = 2;
		}
		else if (myNumber < .75) {
			roll = 3;
		}
		else {
			roll = 4;
		}
		ConsoleIO.printLine("The first roll was: " + roll);
		//Get a second random number
		double mySecondNumber;
		mySecondNumber = Math.random();
		//Decide the outcome of a second die roll
		int secondRoll;
		if (mySecondNumber < .25) {
			secondRoll = 1;
		}
		else if (mySecondNumber < .5) {
			secondRoll = 2;
		}
		else if (mySecondNumber < .75) {
			secondRoll = 3;
		}
		else {
			secondRoll = 4;
		}
		ConsoleIO.printLine("The second roll was: " + secondRoll);
		//Print out which roll was higher
		if (myNumber > mySecondNumber) {
			ConsoleIO.printLine("The first roll was higher");
		}
		else if (myNumber >= mySecondNumber) {
			ConsoleIO.printLine("Both rolls were the same");
		}
		else if (myNumber < mySecondNumber) {
			ConsoleIO.printLine("The second roll was higher");
		}
		//Bonus - Maximum
		ConsoleIO.printLine("The maximum of the two rolls is " + Math.max(roll, secondRoll));
	}
}