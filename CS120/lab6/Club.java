//Name: Jacob Proffer
//Time Invested: 26 minutes
//References: None

public class Club {
	public static void main(String[] args) {
	
		//Print out the dance club name
		ConsoleIO.printLine("Dr. Kow's Dance Club");
		//Ask for the age (re-ask if less than zero)
		int age = 120;
		ConsoleIO.printLine("How old are you?");
		age = ConsoleIO.readInt();
		while (age < 1) {
			ConsoleIO.printLine("How old are you?");
			age = ConsoleIO.readInt();
		}
		//Ask for the coolness factor (re-ask if greater than 10)
		int coolness = 10;
		ConsoleIO.printLine("What is your coolness factor (at most 10)?");
		coolness = ConsoleIO.readInt();
		while (coolness > 10) {
			ConsoleIO.printLine("What is your coolness factor (at most 10)?");
			coolness = ConsoleIO.readInt();
		}
		//Tell them if they are welcome or not
		if (age < 18) {
			ConsoleIO.printLine("I'm sorry, people under the age of 18 are not welcome.");
		}
		else if (coolness <= 5) {
			ConsoleIO.printLine("Sorry - You must have a coolness factor of 6 or greater.");
		}
		else {
			ConsoleIO.printLine("Welcome to the club.");
			while (true) {
					ConsoleIO.printLine("░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
					ConsoleIO.printLine("███████████████");
					ConsoleIO.printLine("░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
					ConsoleIO.printLine("███████████████");
					ConsoleIO.printLine("░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
					ConsoleIO.printLine("███████████████");
					try {
						Thread.sleep(500);
					}
					catch (Exception e) {
					}
					ConsoleIO.printLine("^^^^^^^^^^^^^^^");
					ConsoleIO.printLine("               █████████████");
					ConsoleIO.printLine("^^^^^^^^^^^^^^^");
					ConsoleIO.printLine("               █████████████");
					ConsoleIO.printLine("^^^^^^^^^^^^^^^");
					ConsoleIO.printLine("               █████████████");
					try {
						Thread.sleep(500);
					}
					catch (Exception e) {
					}
			}
		}
	}
}