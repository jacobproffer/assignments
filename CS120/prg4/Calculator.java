//Name: Jacob Proffer
//Time Invested: 61 minutes
//References: None

public class Calculator {
	public static void main(String[] args) {
		
		//Welcome message
		ConsoleIO.printLine("Welcome to Dr. Kow's cheapo calculator");
		int again = 1;
		while (again == 1) {
			//What is your first number?
			double firstNumber;
			ConsoleIO.printLine("What is your first number?");
			firstNumber = ConsoleIO.readDouble();
			//What is your second number?
			double secondNumber;
			ConsoleIO.printLine("What is your second number?");
			secondNumber = ConsoleIO.readDouble();
			//What are we doing with these numbers?
			ConsoleIO.printLine("What are we doing with these numbers?");
			//Add
			ConsoleIO.printLine("1) Add");
			double add;
			add = firstNumber + secondNumber;
			//Subtract
			ConsoleIO.printLine("2) Subtract");
			double subtract;
			subtract = firstNumber - secondNumber;
			//Multiply
			ConsoleIO.printLine("3) Multiply");
			double multiply;
			multiply = firstNumber * secondNumber;
			//Divide
			ConsoleIO.printLine("4) Divide");
			double divide;
			divide = firstNumber / secondNumber;
			//Remainder
			ConsoleIO.printLine("5) Remainder");
			double remainder;
			remainder = (firstNumber + secondNumber) / 2;
			//Choice
			int choice;
			choice = ConsoleIO.readInt();
			//While
			while (choice !=1 && choice !=2 && choice !=3 && choice !=4 && choice !=5) {
				ConsoleIO.printLine("I'm sorry, that is not a valid choice");
				ConsoleIO.printLine("What are we doing with these numbers?");
				ConsoleIO.printLine("1) Add");
				ConsoleIO.printLine("2) Subtract");
				ConsoleIO.printLine("3) Multiply");
				ConsoleIO.printLine("4) Divide");
				ConsoleIO.printLine("5) Remainder");
				choice = ConsoleIO.readInt();
			}
			//If add
			if (choice == 1) {
				ConsoleIO.printLine("Your answer is " + add);
			}
			//If subtract
			else if (choice == 2) {
				ConsoleIO.printLine("Your answer is " + subtract);
			}
			//If multiply
			else if (choice == 3) {
				ConsoleIO.printLine("Your answer is " + multiply);
			}
			//If divide
			else if (choice == 4) {
				ConsoleIO.printLine("Your answer is " + divide);
			}
			//If remainder
			else if (choice == 5) {
				ConsoleIO.printLine("Your answer is " + remainder);
			}
			ConsoleIO.printLine("Would you like to run another calculation?  1 = yes, 0 = no.");
			again = ConsoleIO.readInt();
		}
		
	}
}