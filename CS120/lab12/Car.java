public class Car {
	private double speed;
	private int wheelPosition;
	public void turnMoreLeft() {
		wheelPosition = wheelPosition - 1;
		if (wheelPosition < -10) {
			wheelPosition = -10;
		}
	}
	public void turnMoreRight() {
		wheelPosition = wheelPosition + 1;
		if (wheelPosition > 10) {
			wheelPosition = 10;
		}
	}
	public void accelerate (double amount) {
		speed = speed + amount;
		if (speed > 100) {
			speed = 100;
		}
		else if (speed < 0) {
			speed = 0;
		}
	}
	public double getSpeed() {
		return speed;
	}
	public int getWheelPosition() {
		return wheelPosition;
	}
}