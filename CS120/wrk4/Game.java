public class Game {
	public static void main(String[] args) {
		Player playerOne;
		playerOne = new Player();
		playerOne.name = "Jacob";
		playerOne.pointScore = 880;
		playerOne.pointScore = playerOne.pointScore + 10;
		ConsoleIO.printLine(playerOne.name + " has a score of " + playerOne.pointScore);
	}
}