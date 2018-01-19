public class Orchard {
	private int trees;
	//A method that adds trees
	public void addTrees(int treesToAdd) {
		trees = treesToAdd; 
	}
	//A method that subtracts trees
	public void chopTree(int treesToChop) {
		trees = trees - treesToChop;
	}
	public double calcAppleSales (double applesToSell) {
		double t = trees * 200 * applesToSell;
		return t;
	}
	public double calcCiderSales (double ciderToSell) {
		double u = trees * 15 * ciderToSell;
		return u;
	}
}