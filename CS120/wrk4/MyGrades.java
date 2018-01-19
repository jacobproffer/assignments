public class MyGrades {
	public static void main(String[] args) {
	
		Student b; //Declares a variable (much like int a;)
		b = new Student(); //Puts a new Student object into b
		b.name = "Jake"; //Sets the object's name variable
		b.finalExamScore = 99.5; //Sets the object's finalExamScore
		
		ConsoleIO.printLine(b.name + " has a " + b.finalExamScore);
		
	}
}