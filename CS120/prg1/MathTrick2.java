//Name: Jacob Proffer
//Time invested: 20 minutes
//References: None

public class MathTrick2 {
	public static void main(String[] args) {
		//Enter area code of phone number
		ConsoleIO.printLine("Please enter the area code of your phone number");
		long x;
		x = ConsoleIO.readLong();
		//Multiply by 128
		ConsoleIO.printLine("Multiply the area code by 128");
		long y;
		y = x * 128;
		ConsoleIO.printLine(y);
		//Add 1
		ConsoleIO.printLine("Add 1");
		y = y + 1;
		ConsoleIO.printLine(y);
		//Multiply by 156250
		ConsoleIO.printLine("Multiply by 156250");
		y = y * 156250;
		ConsoleIO.printLine(y);
		//Add the last 7 digits of your phone number
		ConsoleIO.printLine("Now add the last 7 digits of your phone number");
		long z;
		z = ConsoleIO.readLong();
		y = y + z;
		ConsoleIO.printLine(y);
		//Add the last 7 digits of your phone number again
		ConsoleIO.printLine("Add the last 7 digits of your phone number again");
		y = y + z;
		ConsoleIO.printLine(y);
		//Subtract 156250
		ConsoleIO.printLine("Subtract that number by 156250");
		y = y - 156250;
		ConsoleIO.printLine(y);
		//Divide the number by 2
		ConsoleIO.printLine("Divide by 2");
		y = y / 2;
		//Equals
		ConsoleIO.printLine(y);
		//Final message to user
		ConsoleIO.printLine("Your phone number is " + y);
	}
}