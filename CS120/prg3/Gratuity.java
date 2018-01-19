//Name: Jacob Proffer
//Time Invested: 72 minutes
//References: 
//	[1] http://euclid.nmu.edu/~mkowalcz/cs120/hwk3/DecimalExample.java
//	[2] http://euclid.nmu.edu/~mkowalcz/cs120/Example.java

import java.text.*;
import java.math.*;

public class Gratuity {
	public static void main(String[] args) {
		//Decimal Formatter - written by [1]
		DecimalFormat myFormatter; 
		myFormatter = new DecimalFormat("0.00");
		
		myFormatter.setRoundingMode(RoundingMode.HALF_UP);
		
		//Service Question
		ConsoleIO.printLine("Welcome to the Recommended Tip Calculator");
		ConsoleIO.printLine("Who has serviced you today?");
		
		ConsoleIO.printLine("1) Barber");
		ConsoleIO.printLine("2) Bartender");
		ConsoleIO.printLine("3) Waiter");
		ConsoleIO.printLine("4) Exit");
		
		int service;
		service = ConsoleIO.readInt();
		
		//Barber
		if (service == 1) {
			ConsoleIO.printLine("How much was your bill?");
			
			double barber;
			barber = ConsoleIO.readDouble();
			
			double barberTip;
			barberTip = .15 * barber;
			
			//Total
			double barberTotal;
			barberTotal = barber + barberTip;
			
			String a; // Written by [1]
			a = myFormatter.format(barberTip);
			
			String aa; // Written by [1]
			aa = myFormatter.format(barberTotal);
		
			ConsoleIO.printLine("You should tip 15% or $" + a);
			ConsoleIO.printLine("Your total amount is $" + aa);
		}
		//Bartender
		else if (service == 2) {
			ConsoleIO.printLine("How much was your bill?");
			
			double bartender;
			bartender = ConsoleIO.readDouble();
			
			double bartenderTip;
			bartenderTip = .20 * bartender;
			
			//Total
			double bartenderTotal;
			bartenderTotal = bartender + bartenderTip;
			
			String bt; // Written by [1]
			bt = myFormatter.format(bartenderTip);
			
			String b; // Written by [1]
			b = myFormatter.format(bartenderTotal);
			
			ConsoleIO.printLine("You should tip 20% or $" + bt);
			ConsoleIO.printLine("Your total amount is $" + b);
		}
		//Waiter
		else if (service == 3) {
			ConsoleIO.printLine("How much was your bill?");
			
			double waiter;
			waiter = ConsoleIO.readDouble();
			
			double waiterTip;
			waiterTip = .15 * waiter;
			
			//Total
			double waiterTotal;
			waiterTotal = waiter + waiterTip;
			
			String t; // Written by [1]
			t = myFormatter.format(waiterTip);
			
			String w; // Written by [1]
			w = myFormatter.format(waiterTotal);
			
			ConsoleIO.printLine("You should tip 15% or $" + t);
			ConsoleIO.printLine("Your total amount is $" + w);
			return;
		}
		//Exit
		else if (service == 4) {
			ConsoleIO.printLine("Have a nice day");
			return;
		}
		//Error
		else if (service >= 5) {
			ConsoleIO.printLine("I'm sorry, I do not know that command");
			return;
		}
	}
}