//Name: Jacob Proffer
//Time Invested: 31 minutes
//References: 
	// [1]http://euclid.nmu.edu/~mkowalcz/cs120/labs/08/random.html

public class Guess	{
	public static void main(String[] args)	{
	
		int again = 1;
		int count = 0;
		while (again == 1)	{
			//Statement Message
			ConsoleIO.printLine("I've got a number 1 to 100.");
			//Determine the computer's secret number
			int number;
			number = (int)(Math.random() * 99 + 1); // [1] referenced
			//User guess
			int guess;
			//Loop as long as the user's guess doesn't match the secret number:
			do {
				//Ask for a guess
				count++;
				ConsoleIO.printLine("What's your guess?");
				guess = ConsoleIO.readInt();
				//Say whether to guess lower, higher, or if it was correct.
				if (guess == number)	{
					ConsoleIO.printLine("You got it!");
				}
				else if (guess > number)	{
					ConsoleIO.printLine("Guess lower, please.");
				}
				else if (guess < number)	{
					ConsoleIO.printLine("Guess higher, please.");
				}
			} while (guess != number);
	
			ConsoleIO.printLine("It took you " + count + " guesses.");
			
			//Again
			ConsoleIO.printLine("Would you like to guess again? Yes or no?");
			String reply = ConsoleIO.readLine();
			
			if (reply.equalsIgnoreCase("Yes"))	{
				again = 1;
			}
			else if (reply.equalsIgnoreCase("No"))	{
				again = 0;
			}
			else	{
				ConsoleIO.printLine("You're playing again.");
				again = 1;
			}
		}

	}
}