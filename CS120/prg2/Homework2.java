//Name: Jacob Proffer
//Time invested: 30 minutes
//References cited: Art.java, TimeStuff.java, ifStatements.java

public class Homework2 {
	public static void main(String[] args) {
		//Art
		Art.printCat();
		Art.printCat();
		Art.printBooks();
		Art.printClock();
		Art.printClock();
		Art.printSquare(6);
		Art.printRectangle(22, 4);
		Art.printFilledSquare(10, "#");
		Art.printFilledRectangle(10, 5, "A");
		Art.printSign("Eat at Joe's", 2);
		//Part of Day
		String d;
		d = TimeStuff.getCurrentPartOfDay();
		ConsoleIO.printLine(d);
		//Current Year
		int a;
		a = TimeStuff.getCurrentYear();
		ConsoleIO.printLine(a);
		//Current Month
		String m;
		m = TimeStuff.getNameOfMonth(1);
		ConsoleIO.printLine(m);
		//Interaction
		int c;
		ConsoleIO.printLine("Type the number 1 for a cat.");
		c = ConsoleIO.readInt();
		
		if (c == 1) {
			Art.printCat();
		}
		else {
			ConsoleIO.printLine("You did not follow the directions.");
		}
		//Interaction 2
		int h;
		ConsoleIO.printLine("Type the number 6 or 7.");
		h = ConsoleIO.readInt();
		
		if (h == 6) {
			Art.printSquare(6);
		}
		else if (h == 7) {
			Art.printSquare(7);
		}
		else {
			ConsoleIO.printLine("You did not follow the directions.");
		}
	}
}