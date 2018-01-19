public class Player {
	private String name;
	private int pointScore;
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void printResult() {
		ConsoleIO.printLine(name + "'s score is " + pointScore);
	}
	public void raiseScore() {
		pointScore = pointScore + 5;
	}
	public int getPointScore() {
		return pointScore;
	}
}