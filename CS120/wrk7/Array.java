public class Array {
	public static void main(String[] args) {
		//Array of ints
		int[] numbers = new int[3];
		numbers[0] = 35;
		numbers[1] = 77;
		numbers[2] = 89;
		ConsoleIO.printLine(numbers[2]);
		//Array of doubles with 10 elements
		double[] myDoubles = new double[100];
		myDoubles[0] = 5.0;
		ConsoleIO.printLine(myDoubles[0]);
		//Array of booleans
		boolean[] myBoolean = new boolean[3];
		myBoolean[0] = true;
		myBoolean[1] = false;
		myBoolean[2] = true;
		ConsoleIO.printLine(myBoolean[2]);
		
	}
}