public class Cartesian {
	public static double distance (double x1, double y1, double x2, double y2) {
		
		double x = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		return x;
		
	}
}