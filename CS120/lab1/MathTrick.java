//Name: [Jacob]
//Time invested: 5 minutes
//References (books, websites, people): None

public class MathTrick {
    public static void main(String[] args) {
        //Get a positive integer
        int x;
        x = ConsoleIO.readInt();
        //Square it
        int y;
        y = x * x;
        ConsoleIO.printLine(y);
        //Add the original number
        y = y + x;
        ConsoleIO.printLine(y);
        //Divide by the original number
        y = y / x;
        ConsoleIO.printLine(y);
        //Add 17
        y = y + 17;
        ConsoleIO.printLine(y);
        //Subtract the original number
        y = y - x;
        ConsoleIO.printLine(y);
        //Divide by 6
        y = y / 6;
        
        //Print the result
        ConsoleIO.printLine("Here is the final result, which should be 3:");
        ConsoleIO.printLine(y); //This prints the current value of y
    }
}