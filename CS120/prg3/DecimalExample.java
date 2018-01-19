import java.text.*;   //Need this line in order to use the DecimalFormat class.
import java.math.*;   //Need this line in order to use the RoundingMode class.

public class DecimalExample {
	public static void main(String[] args) {
		DecimalFormat myFormatter;  //Declares an (empty) variable of type DecimalFormat.
		myFormatter = new DecimalFormat("0.00"); //Fills in our variable with a new DecimalFormat object.

		myFormatter.setRoundingMode(RoundingMode.HALF_UP); //Tells it to do rounding the same way you learned in elementary school.

		double d = 1.0 / 3.0;  //A variable with some number that you want to format.

		String s; //Declares a variable capable of holding text.
		s = myFormatter.format(d); //This makes 's' contain a nicely formatted version of 'd'.

		ConsoleIO.printLine("Your amount is $" + s); //Prints out the nicely formatted version.

		//To format other numbers, you can just call the myFormatter.format() method again with something other than d.
		//You don't need to make another DecimalFormat object once you have that set up in your program.
	}
}