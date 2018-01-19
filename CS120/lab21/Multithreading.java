import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Multithreading extends Applet implements Runnable, MouseListener {
	private int xCord = 0;
	private int yCord = (int)(Math.random()*200);
	private int userXCord;
	private int userYCord;
	private int speed = 2;
	private int rectState = 0;
	private int playerScore;
	String printPlayerScore;
	
	public void init() {
		Thread t = new Thread(this);
		t.start();
		addMouseListener(this); //registers this applet to receive mouse events
	}
	
	public void paint(Graphics g) {
		Image buffer = createImage(getSize().width, getSize().height);
		Graphics h = buffer.getGraphics();
		//Draw background
		h.setColor(new Color(245, 188, 30));
		h.fillRect(0, 0, 10000, 10000);
		//Draw target if rectState is equal to 0
		if (rectState == 0) {
			h.setColor(new Color(255, 255, 255));
			h.drawRect(xCord, yCord, 50, 50);
		}
		//Draw target if rectState is equal to 1
		else if (rectState == 1) {
			h.setColor(new Color(0, 0, 0));
			h.fillRect(xCord, yCord, 50, 50);
		}
		printPlayerScore = Integer.toString(playerScore);
		h.setColor(new Color(255, 255, 255));
		h.drawString("Player score = " + playerScore, 20, 250);
		g.drawImage(buffer, 0, 0, this);
	}
	
	public void update(Graphics g) {
     	paint(g);
	}
	
	public void run() {
		while(true) {
			//Pause 20 milliseconds
			try {Thread.sleep(20); } catch(Exception e) {}
			//TODO: change some instance variable(s) to make something move
			xCord = xCord + speed;
			if(xCord >= 400) {
				//If the xCord variable exceeds 400, xCord is reset to -1
				xCord = -1;
				yCord = (int)(Math.random()*200);
				if(rectState == 0) {
					playerScore = playerScore - 1;
					if (playerScore <= 0) {
						playerScore = 0;
					}
				}
				//If the xCord variable exceeds 400, rectState is reset to 0
				else {
					rectState = 0;
				}
			}
			//schedule the screen to be repainted (by the other thread)
			repaint();
		}
	}
	
	public void mousePressed(MouseEvent e) {
		userXCord = e.getX();
		userYCord = e.getY();
		repaint();
		if (userXCord > xCord && userXCord < xCord + 50 && userYCord > yCord && userYCord < yCord + 50) {
			//rectState will change to 1 if the user clicks the center of the rectangle
			rectState = 1;
			speed = speed + 2;
			if(speed >= 12) {
				speed = 12;
			}
			playerScore = playerScore + 1;
		}
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}
	
}