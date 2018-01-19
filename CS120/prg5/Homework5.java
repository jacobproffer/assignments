//Name: Jacob Proffer
//Time Invested: 50 Minutes
//  References: 
//	[1]http://euclid.nmu.edu/~mkowalcz/cs120/hwk4/

public class Homework5 {
	public static void main(String[] args) {
		//Laundry - Written by [1]
		Greetings.printLaundryMenu();
		//Hot Dog - Written by [1]
		Greetings.printHotDogStand();
		//Aliens Grenade
		Greetings.printAliensGrenade();
		Greetings.printAliensGrenade();
		//Get Name - Written by [1]
		String theName;
		theName = FancyIO.getName();
		ConsoleIO.printLine("Your name is: " + theName);
		//Rating
		double r;
		r = FancyIO.getProductRating();
		ConsoleIO.printLine("You've given this product a rating of " + r);
		//Positive Int
		int pos;
		pos = FancyIO.getPositiveInteger();
		ConsoleIO.printLine(pos);
		//Data to Main Program - Written by [1]
		int amount = FancyIO.getInt("How many cords of wood?");
		ConsoleIO.printLine("You want " + amount + " cords");
	}
}
