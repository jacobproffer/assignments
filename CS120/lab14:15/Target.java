import java.applet.*; //This imports the Applet class.
import java.awt.*; //This imports graphics classes
import java.awt.event.*; //This imports the mouse event and key event classes.

public class Target extends Applet implements MouseListener, KeyListener {

	private int xCord;
	private int yCord;
	private int playerScore;
	String printXCord;
	String printYCord;
	String printPlayerScore;
	
	//init is called when the applet starts (much like a constructor)
	public void init() {
		addMouseListener(this); //registers this applet to receive mouse events
		addKeyListener(this); //registers this applet to receive key events
	}

	//Paint is called whenever the screen needs to be drawn again.
	public void paint(Graphics g) {
	
		//Draw background
		g.setColor(new Color(245, 188, 30));
		g.fillRect(0, 0, 10000, 10000);
		
		//Draw target
		g.setColor(new Color(255, 100, 30));
		g.fillOval(300, 200, 200, 200);
		g.setColor(new Color(255, 255, 255));
		g.fillOval(325, 225, 150, 150);
		g.setColor(new Color(117, 93, 0));
		g.fillOval(350, 250, 100, 100);
		g.setColor(new Color(194, 154, 0));
		g.fillOval(375, 275, 50, 50);
		
		//Draw arrow
		g.setColor(new Color(0, 0, 0));
		g.drawLine(xCord, yCord, xCord + 25, yCord);
		g.drawLine(xCord, yCord, xCord + 25, yCord + 25);
		g.drawLine(xCord, yCord, xCord, yCord + 25);
		
		printXCord = Integer.toString(xCord);
		g.drawString("X = " + printXCord, 40, 40);
		
		printYCord = Integer.toString(yCord);
		g.drawString("Y = " + printYCord, 40, 60);
		
		if (xCord > 380 && xCord < 422 && yCord > 280 && yCord < 320) {
			playerScore = playerScore + 1;
		}
		
		printPlayerScore = Integer.toString(playerScore);
		g.drawString("Player score = " + playerScore, 40, 80);
	
	}
	
	public int getXCord() {
		return xCord;
	}
	
	public int getYCord() {
		return yCord;
	}
	
	public int getScore() {
		return playerScore;
	}
	

	//The next 5 methods need to be there since we implement MouseListener
	//They get called whenever the respective events (press, release, etc.) occur.
	public void mousePressed(MouseEvent e) {
		xCord = e.getX();
		yCord = e.getY();
		repaint();
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}
	
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			xCord = xCord - 25;
			repaint();
		}
		else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			xCord = xCord + 25;
			repaint();
		}
		else if (e.getKeyCode() == KeyEvent.VK_UP) {
			yCord = yCord - 25;
			repaint();
		}
		else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			yCord = yCord + 25;
			repaint();
		}
		else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			xCord = 400;
			yCord = 300;
			repaint();
		}
		if (xCord < 0 || yCord < 0 || xCord > 800 || yCord > 600) {
			xCord = 0;
			yCord = 0;
			playerScore = playerScore - 1;
		}
	}
	
	public void keyReleased(KeyEvent e) {
	}
	
	public void keyTyped(KeyEvent e) {
	}

}