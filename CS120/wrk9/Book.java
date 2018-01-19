public class Book {
	private int numberOfPages;
	private String title;
	private String author;
	
	//TODO: write a constructor which takes in parameters for both
	//the number of pages and the title.
	public Book(int page, String t, String a) {
		numberOfPages = page;
		title = t;
		author = a;
	}
	
	public void addPages(int pagesToAdd) {
		numberOfPages = numberOfPages + pagesToAdd;
	}
	
	public void subtractPages(int pagesToSubtract) {
		numberOfPages = numberOfPages - pagesToSubtract;
	}
	
	public int getNumberOfPages() {
		return numberOfPages;
	}
	
	public String getBookTitle() {
		return title;
	}
	
	public void print() {
		ConsoleIO.printLine(title + ", written by " + author + ", has a total of " + numberOfPages + " pages.");
	}
	
}