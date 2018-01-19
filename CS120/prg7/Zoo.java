//Name: Jacob Proffer
//Time Invested: 124 minutes
//References:
	//	[1] http://euclid.nmu.edu/~mkowalcz/cs120/hwk3/DecimalExample.java
	
import java.text.*;
import java.math.*;

public class Zoo	{
	public static void main(String[] args)	{
	
	
		//Decimal Formatter - written by [1]
		DecimalFormat myFormatter; 
		myFormatter = new DecimalFormat("0.00");
		myFormatter.setRoundingMode(RoundingMode.HALF_UP);
		
		
		//Welcome message
		ConsoleIO.printLine("Welcome to the CS-120 Zoo!");
		ConsoleIO.printLine("Adults: $12.50");
		ConsoleIO.printLine("Children (age 5 to 18): $7.25 each for the first 3 children; any additional children are free!");
		ConsoleIO.printLine("Kids (age 4 or under): Free");
		
		//Define variables
		int adults;
		int children;
		int kids;
		int total;
		double tender;
		double money;
		double change;
		
		
		//Adult question
		ConsoleIO.printLine("How many adults are with your group today?");
		adults = ConsoleIO.readInt();
		while (adults < 0)	{
			//Repeat question if number entered is less than 0
			ConsoleIO.printLine("How many adults are with your group today?");
			adults = ConsoleIO.readInt();
		}
		double adultTotal = adults * 12.50;
		String a; // Written by [1]
		a = myFormatter.format(adultTotal);
		
		
		//Children question
		ConsoleIO.printLine("...and how many children (age 5 to 18) are in your group?");
		children = ConsoleIO.readInt();
		while (children < 0)	{
			//Repeat question if number entered is less than 0
			ConsoleIO.printLine("...and how many children (age 5 to 18) are in your group?");
			children = ConsoleIO.readInt();
		}
		double childrenTotal = children * 7.25;
		if (children >=1 && children <= 3)	{
			childrenTotal = children * 7.25;
		}
		else if (children > 3)	{
			childrenTotal = 3 * 7.25;
		}
		String b; // Written by [1]
		b = myFormatter.format(childrenTotal);
		
		
		//Kid question
		ConsoleIO.printLine("...and how many kids (age 4 or under) are in your group?");
		kids = ConsoleIO.readInt();
		while (kids < 0)	{
			//Repeat question if number entered is less than 0
			ConsoleIO.printLine("...and how many kids (age 4 or under) are in your group?");
			kids = ConsoleIO.readInt();
		}
		
		
		//Define total
		total = adults + children + kids;
		money = adultTotal + childrenTotal;
		String c; //Written by [1]
		c = myFormatter.format(money);
		
		
		//Total message
		ConsoleIO.printLine("Ok. So there are " + total + " people in your group, and the total comes to $" + c);
		
		
		//Get money
		ConsoleIO.printLine("Please pay the teller now. We will dispense your change and tickets afterwards.");
		tender = ConsoleIO.readDouble();
		while (tender < money)	{
			//Repeat message if user inputs a double that is lower than the amount required
			ConsoleIO.printLine("I'm sorry. Please pay the correct amount.");
			tender = ConsoleIO.readDouble();
		}
		
		
		//Change subtracts the amount the user enters as tender by the bill amount
		change = tender - money;
		String d; //Written by [1]
		d = myFormatter.format(change);
		
		ConsoleIO.printLine("Thank you for your business. You receive $" + d + " in change.");
		
		
		//Print Tickets
		ConsoleIO.printLine("Here are your tickets. Have a wonderful day at the CS-120 Zoo!");
		int counter = 0;
		while (counter < total)	{
			Utility.printTicket();
			counter = counter + 1;
		}
		
		
	}
}