public class FancyIO {

	public static String getName() {
		ConsoleIO.printLine("Enter your name, please:");
		String name;
		name = ConsoleIO.readLine();
		return name;
	}

	public static double getProductRating() {
		ConsoleIO.printLine("How many stars do you give the product (1-5):");
		double rating;
		rating = ConsoleIO.readDouble();
		if (rating < 1) {
			rating = 1;
		}
		else if (rating > 5) {
			rating = 5;
		}
		return rating;
	}
	
	public static int getPositiveInteger() {
		//Do a printLine to prompt the user to enter a positive number
		ConsoleIO.printLine("Please enter a positive integer.");
		//Use ConsoleIO to get that number into a variable
		int p;
		p = ConsoleIO.readInt();
		//Use an if statement to bump it up to 1 if they put in something less than 1
		if (p < 1) {
			p = 1;
		}
		//Use a return statement to return the value of your variable back to the main program (just like the other two methods above).
		return p;
	}
	
	public static int getInt(String prompt) {
		ConsoleIO.printLine(prompt);
		int i = ConsoleIO.readInt();
		return i;
	}

}