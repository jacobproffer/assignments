//Name: Jacob Proffer
//Time Invested: 60 minutes
//References: None

public class Distance {
	public static void main(String[] args) {
	
		//What is the x coordinate of the first point?
		ConsoleIO.printLine("What is the x coordinate of the first point?");
		double x1 = ConsoleIO.readDouble();
		//What is the y coordinate of the first point?
		ConsoleIO.printLine("What is the y coordinate of the first point?");
		double y1 = ConsoleIO.readDouble();
		//What is the x coordinate of the second point?
		ConsoleIO.printLine("What is the x coordinate of the second point?");
		double x2 = ConsoleIO.readDouble();
		//What is the y coordinate of the second point?
		ConsoleIO.printLine("What is the y coordinate of the second point?");
		double y2 = ConsoleIO.readDouble();
		//The distance between is...
		double total = Cartesian.distance(x1, y1, x2, y2);
		ConsoleIO.printLine("The distance between (" + x1 + ", "+ y1 + ") and (" + x2 + ", " + y2 + ") is " + total + ".");
		
	}
}