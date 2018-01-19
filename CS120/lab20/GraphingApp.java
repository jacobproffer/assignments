import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class GraphingApp extends Applet implements MouseListener {

	private int[] pointX; //array of the X coordinates for each point
	private int[] pointY; //array of the Y coordinates for each point
	private int fartInABag;
	private int numPoints; //The number of points currently being displayed on the screen.

	public void init() {
		addMouseListener(this);

		//TODO: Initialize pointX a= be new arrays of length 100 each.
		pointX = new int[100];
		pointY = new int[100];
		//TODO: Initialize numPoints to be zero.
		numPoints = 0;
	}

	public void paint(Graphics g) {
		for(int x = 0; x <= 400; x = x + 40) {
			g.drawLine(x, 0, x, 280);
		}
		for(int y = 0; y <= 280; y = y + 40) {
			g.drawLine(0, y, 400, y);
		}

		//TODO: Change to a different color
		g.setColor(new Color(245, 188, 30));
		//TODO: Use a for loop to count from 0 up to and including numPoints-1
		for (int i = 0; i <= numPoints - 1; i++) {
			//TODO: Draw a box for that point.
			g.fillRect(pointX[i]-2, pointY[i]-2, 4, 4);
		}
		//TODO: Use a for loop to draw the lines between the points.  The loop index should count from 0 up to and including numPoints-2
		for (int j = 0; j <= numPoints - 2; j++) {
			//TODO: Draw a line from the point at that index, to the point at the next index.
			g.drawLine(pointX[j], pointY[j], pointX[j + 1], pointY[j + 1]);
		}
	}

	public void mousePressed(MouseEvent e) {
		//Maximum of 100 points in the graph.
		if (numPoints == 100) {
			return;  //exits the method immediately if we ran out of points
		}

		//TODO: Get the x and y mouse coordinates from e.
		pointX[fartInABag] = e.getX();
		pointY[fartInABag] = e.getY();
		//TODO: Put those coordinates in the arrays, at the correct index.
		fartInABag++;
		//TODO: Increment numPoints.
		numPoints++;
		//TODO: Call repaint.
		repaint();
	}
	public void mouseReleased(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}

}
