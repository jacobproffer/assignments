//Name: Jacob Proffer
//Time Invested: 365 days
//References: Some jerk to my right
public class SleepCalc {
	public static void main(String[] args) {
		int timer = 1;
		//Ask for IQ of user
		int iq = Sleep.iqQuestion();
		//Ask how many hours of sleep does the user normally get
		int norm = Sleep.sleepNorm();
		//Ask how many hours of sleep the user got last night
		int sleep = Sleep.questions(timer);
		timer = timer + 1;
		int iqOne = Sleep.iqCalc(sleep, norm);
		//Ask how many hours of sleep the user got the night before last
		sleep = Sleep.questions(timer);
		timer = timer + 1;
		int iqTwo = Sleep.iqCalc(sleep, norm);
		//Ask how many hours of sleep the user got the night before the night before last
		sleep = Sleep.questions(timer);
		int iqThree = Sleep.iqCalc(sleep, norm);
		//Calculate iq loss
		int iqTotal = iqOne + iqTwo + iqThree;
		iq = iq - iqTotal;
		ConsoleIO.printLine("Your iq after loss of sleep is " + iq);
	}
}