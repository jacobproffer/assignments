//Name: Jacob Proffer
//Time Invested: TODO write in later
//References:

public class Boxcars2 {
	public static void main(String[] args) {
	
		//Keep rolling dice until we get the highest possible roll.
		int counter = 0;
		int dice1;
		int dice2;
		
		//Print out the number of tries it took.
		do {
			counter = counter + 1;
			ConsoleIO.printLine("Rolling dice! Attempts No. " + counter + ".");
			dice1 = (int)(Math.random() * 6) + 1;
        	dice2 = (int)(Math.random() * 6) + 1;  
        	ConsoleIO.printLine("Dice 1 =  " + dice1 + " & Dice 2 = " + dice2 + "" );
		} while (dice2 != 6 || dice2 != 6);
		ConsoleIO.printLine("Dice 1 =  " + dice1 + " & Dice 2 = " + dice2 + "" );
		ConsoleIO.printLine("\nTotal Rolls to get double 6: " + counter + "");
		
	}
}