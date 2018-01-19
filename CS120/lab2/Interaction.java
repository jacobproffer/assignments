//Name: Jacob Proffer
//Time Invested: 10 minutes
//References: none

public class Interaction {
	public static void main(String[] args) {
		//Get a decimal number from the user.
		ConsoleIO.printLine("What decimal to do you want to find the square root of?");
		double x;
		x = ConsoleIO.readDouble();
		//Get an integer from the user.
		ConsoleIO.printLine("Enter an integer that you want to make bigger.");
		int y;
		y = ConsoleIO.readInt();
		//Find the square root of the decimal number entered, and print it out.
		double z;
		z = Math.sqrt(x);
		ConsoleIO.printLine("Your answer is " + z);
		//Print out a number 1 larger than the integer entered.
		int a;
		a = y + 1;
		ConsoleIO.printLine(a);
	}
}