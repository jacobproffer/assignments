public class orchardMain {
	public static void main(String[] args) {
		//Declare a new Orchard object
		Orchard a;
		a = new Orchard();
		//Add 30 trees to your orchard (call the method for it).
		a.addTrees(30);
		//Ask the object how much apple sales you would get for 0.50 per pound
		double sales = a.calcAppleSales(.50);
		ConsoleIO.printLine("You will receive $" + sales + " for 30 trees worth of apples.");
		//Chop down two trees
		a.chopTree(2);
		//Ask the object how much cider sales you would get for 7.50 per gallon.
		double ciderSale = a.calcCiderSales(7.50);
		ConsoleIO.printLine("You will receive $" + ciderSale + " for 28 trees worth of cider.");
	}
}