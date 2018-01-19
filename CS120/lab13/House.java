import java.applet.*; //so we can extend the Applet class
import java.awt.*; //so we can use graphics commands

public class House extends Applet {
	public void paint(Graphics g) {
		//Draw background
		g.setColor(new Color(245, 188, 30));
		g.fillRect(0, 0, 10000, 100000);
		//Draw roof
		g.setColor(new Color(243, 122, 32));
		g.fillRect(175, 240, 450, 10);
		//Draw siding
		g.drawLine(200, 375, 350, 375);
		g.drawLine(450, 375, 600, 375);
		//Draw windows
		g.fillRect(250, 275, 50, 75);
		g.fillRect(500, 275, 50, 75);
		//Draw door
		g.drawRect(350, 275, 100, 125);
		//Draw house
		g.setColor(new Color(243, 122, 32));
		g.drawRect(200, 250, 400, 150);
		//Draw baseline
		g.drawLine(100, 400, 700, 400);
	}
}