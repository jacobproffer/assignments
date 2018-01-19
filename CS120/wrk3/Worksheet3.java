public class Worksheet3 {
	public static void main(String[] args) {
		//square root
		double r;
		r = Math.sqrt(5.5);
		ConsoleIO.printLine("The square root of 5.5 is " + r);
		//absolute value
		double a;
		a = Math.abs(-8.2);
		ConsoleIO.printLine("The absolute value of -8.2 is " + a);
		//current time
		long t;
		t = System.currentTimeMillis();
		ConsoleIO.printLine("The current time in milliseconds is " + t);
		//Convert
		String textToConvert;
		textToConvert = ConsoleIO.readLine();
		int theNumber;
		theNumber = Integer.parseInt(textToConvert);
		ConsoleIO.printLine(theNumber);
	}
}