//Name: Jacob Proffer
//Time Invested: 64 minutes
//References: None

public class Boxcars	{
	
	//Keep rolling dice until we get the highest possible roll.

	public static void main(String[] args) {
	
		int count = 0;
		int dice1;
		int dice2;

		do {
			count++;
			ConsoleIO.printLine("\nRolling Dice! Attempt No. " + count + "." );
			dice1 = (int)(Math.random() * 6) + 1;
			dice2 = (int)(Math.random() * 6) + 1;  
			ConsoleIO.printLine("Dice 1 =  " + dice1 + " & Dice 2 = " + dice2 + "" );
		} while (dice1 != 6 || dice2 != 6);
		
		ConsoleIO.printLine("\nTotal Rolls to get double 6: " + count + "");
		
		//Bonus
		
		double prob;
		double a = (100.00/36.00);
		double b = (35.00/36.00);
		double c = count - 1;
		prob = a * (Math.pow (b, c));
		ConsoleIO.printLine("The probability is " + prob + "%");
		
	}
	
}