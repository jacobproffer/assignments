//Name: Jacob Proffer
//Time Invested: 68 minutes
//References: None

public class gpaFinder	{
	public static void main(String[] args)	{
		
		int again = 1;
		while (again == 1)	{
			//How many grades
			int count = 1;
			double total = 0;
			int divisor = 0;
			ConsoleIO.printLine("How many grades will you be entering?");
			count = ConsoleIO.readInt();
		
			//while
			while (count > 0)	{
				ConsoleIO.printLine("Enter a grade please.");
				double a = ConsoleIO.readDouble();
				total = total + a;
				count = count - 1;
				divisor = divisor + 1;
			}
		
			//Average
			if (count== 0) {
				total = total / divisor;
				ConsoleIO.printLine("Here is the average:");
				ConsoleIO.printLine(total);
			}
		
			//Grade
			if (total >= 90)	{
				ConsoleIO.printLine("This is an A.");
			}
			else if (total >= 80)	{
				ConsoleIO.printLine("This is a B.");
			}
			else if (total >= 70)	{
				ConsoleIO.printLine("This is a C.");
			}
			else if (total >= 60)	{
				ConsoleIO.printLine("This is a D.");
			}
			else	{
				ConsoleIO.printLine("This is an F.");
				ConsoleIO.printLine("Hit the books.");
			}
			
			//Again
			ConsoleIO.printLine("Would you like to run another calculation?  1 = yes, 0 = no.");
			again = ConsoleIO.readInt();
			
			//Again while loop
			while (again !=1 && again !=0)	{
				ConsoleIO.printLine("I'm sorry, I do not understand that command.");
				ConsoleIO.printLine("Would you like to run another calculation?  1 = yes, 0 = no.");
				again = ConsoleIO.readInt();
			}
		}
		
	}
}