//Name: Jacob
//Time Invested: 60 minutes
//References: None

public class Sandwich {
	public static void main(String[] args) {
	
		//Print the Hamburger Palace sign
		ConsoleIO.printLine("******************************");
		//while loop 1
		int line = 0;
		while(line < 5) {
			ConsoleIO.printLine("*                            *");
			line = line + 1;
		}
		
		//Dr. Kow's Hamburger Palace
		ConsoleIO.printLine("* Dr. Kow's Hamburger Palace *");
		//while loop 2
		int secondLine = 0;
		while(secondLine < 5) {
			ConsoleIO.printLine("*                            *");
			secondLine = secondLine + 1;
		}
		
		ConsoleIO.printLine("******************************");
		
		//How many tomatoes would the user like
		int tomatoe;
		ConsoleIO.printLine("How many tomatoes would you like");
		tomatoe = ConsoleIO.readInt();
		
		//Ask how much lettuce the user wants
		int lettuce;
		ConsoleIO.printLine("How many layers of lettuce do you want?");
		lettuce = ConsoleIO.readInt();
		
		//Print out the result to the screen
		ConsoleIO.printLine("Here's your sandwich:");
		ConsoleIO.printLine("(_________)");
		
		//while loop for tomatoes
		int counter2 = 0; // set counter variable to 0
		while (counter2 < tomatoe) {
			ConsoleIO.printLine("[_________]");
			counter2 = counter2 + 1;
		}
		//while loop for lettuce 
		int counter = 0; // set counter variable to 0
		while (counter < lettuce) {
   	 		ConsoleIO.printLine(" ~~~~~~~~~");
    		counter = counter + 1;  // increment counter by 1
		}
		
		ConsoleIO.printLine(" *********");
		ConsoleIO.printLine("(_________)");
	}
}

