public class Game {
	public static void main(String[] args) {
		
		Player one = new Player();
		Player two = new Player();
		
		one.setName("Dr. Kow");
		two.setName("Jacob");
		
		one.raiseScore();
		two.raiseScore();
		two.raiseScore();
		
		one.printResult();
		two.printResult();
	}
}