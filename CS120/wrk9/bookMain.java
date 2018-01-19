public class bookMain {
	public static void main(String[] args) {
		Book a = new Book(200, "Mein Kampf", "Adolf Hitler");
		a.addPages(30);
		a.subtractPages(15);
		a.print();
	}
}