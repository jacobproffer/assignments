public class Sleep {
	public static int iqCalc (int hours, int norm) {
		norm = norm - hours;
		if (norm < 1) {
			norm = 0;
		}
		else if (norm == 1) {
			norm = 1;
		}
		else if (norm > 1 && norm <= 24) {
			norm = norm * 2 - 1;
		}
		return norm;
	}
	public static int iqQuestion () {
		int iq = -1;
		while (iq < 0 || iq > 228) {
			ConsoleIO.printLine("What is your IQ (when fully rested?)?");
			iq = ConsoleIO.readInt();
		}
		return iq;
	}
	public static int sleepNorm () {
		int norm = -1;
		while (norm < 0 || norm > 24) {
			ConsoleIO.printLine("How many hours of sleep do you normally get?");
			norm = ConsoleIO.readInt();
		}
		return norm;
	}
	public static int questions (int timer) {
		int hours = -1;
		if (timer == 1) {
			while (hours < 1 || hours > 24) {
				ConsoleIO.printLine("How many hours of sleep did you get last night?");
				hours = ConsoleIO.readInt();
			}
		}
		else if (timer == 2) {
			while (hours < 1 || hours > 24) {
				ConsoleIO.printLine("How many hours of sleep did you get the night before last?");
				hours = ConsoleIO.readInt();
			}
		}
		else {
			while (hours < 1 || hours > 24) {
				ConsoleIO.printLine("How many hours of sleep did you get two nights ago?");
				hours = ConsoleIO.readInt();
			}
		}
		return hours;
	}
}