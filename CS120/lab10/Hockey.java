//Name: Jacob Proffer
//Time Invested: 45 minutes
//References: None

public class Hockey {
	public static void main(String[] args) {
		//Initialize home team goalie
		Goalie goalieOne;
		goalieOne = new Goalie();
		goalieOne.attempts = 0;
		goalieOne.saves = 0;
		//Initialize opposing team goalie
		Goalie goalieTwo;
		goalieTwo = new Goalie();
		goalieTwo.attempts = 0;
		goalieTwo.saves = 0;
		//Names of goalies
		ConsoleIO.printLine("Name of the home team goalie?");
		goalieOne.name = ConsoleIO.readLine();
		ConsoleIO.printLine("Name of the visitor team goalie?");
		goalieTwo.name = ConsoleIO.readLine();
		//Commands while loop
		int again = 1;
		while (again == 1) {
			ConsoleIO.printLine("Enter a command");
			ConsoleIO.printLine("===============");
			ConsoleIO.printLine("0) Exit");
			ConsoleIO.printLine("1) Record a goal against " + goalieOne.name);
			ConsoleIO.printLine("2) Record a goal against " + goalieTwo.name);
			ConsoleIO.printLine("3) Record a save made by " + goalieOne.name);
			ConsoleIO.printLine("4) Record a save made by " + goalieTwo.name);
			ConsoleIO.printLine("5) Print current stats");
			
			int command = ConsoleIO.readInt();
			
			while (command > 5) {
				ConsoleIO.printLine("Enter a command");
				ConsoleIO.printLine("===============");
				ConsoleIO.printLine("0) Exit");
				ConsoleIO.printLine("1) Record a goal against " + goalieOne.name);
				ConsoleIO.printLine("2) Record a goal against " + goalieTwo.name);
				ConsoleIO.printLine("3) Record a save made by " + goalieOne.name);
				ConsoleIO.printLine("4) Record a save made by " + goalieTwo.name);
				ConsoleIO.printLine("5) Print current stats");
				command = ConsoleIO.readInt();
			}
			
			if (command == 0) {
				again = 0;
			}
			else if (command == 1) {
				goalieOne.attempts = goalieOne.attempts + 1;
			}
			else if (command == 2) {
				goalieTwo.attempts = goalieTwo.attempts + 1;
			}
			else if (command == 3) {
				goalieOne.saves = goalieOne.saves + 1;
				goalieOne.attempts = goalieOne.attempts + 1;
			}
			else if (command == 4) {
				goalieTwo.saves = goalieTwo.saves + 1;
				goalieTwo.attempts = goalieTwo.attempts + 1;
			}
			else if (command == 5) {
				double onePercentage = 1.0 * goalieOne.saves / goalieOne.attempts * 100;
				double twoPercentage = 1.0 * goalieTwo.saves / goalieTwo.attempts * 100;
				ConsoleIO.printLine(goalieOne.name + " has made " + goalieOne.saves + " save(s) out of " + goalieOne.attempts + " attempt(s).");
				ConsoleIO.printLine("This gives " + goalieOne.name + " a save percentage of " + onePercentage);
				ConsoleIO.printLine(goalieTwo.name + " has made " + goalieTwo.saves + " save(s) out of " + goalieTwo.attempts + " attempt(s).");
				ConsoleIO.printLine("This gives " + goalieTwo.name + " a save percentage of " + twoPercentage);
			}
		}
	}
}