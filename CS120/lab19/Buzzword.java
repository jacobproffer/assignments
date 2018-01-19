//Name: Jacob Proffer
//Time Invested: 1 hour
//References: None

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Buzzword extends Applet implements KeyListener {
	//A list of adjectives
	String[] adjectives;
	String[] noun;
	//indicate which element of the array is to be displayed
	int index;
	int secondIndex;
	public void init() {
		index = 0;
		secondIndex = 0;
		// allocates memory for 5 Strings
		adjectives = new String[5];
		// initialize first element
		adjectives[0] = "Functional";
		// initialize second element
		adjectives[1] = "Modern";
		// initialize third element
		adjectives[2] = "Tested";
		// initialize fourth element
		adjectives[3] = "Damaged";
		// initialize fifth element
		adjectives[4] = "Stereotyped";
		// allocates memory for 5 nouns
		noun = new String[6];
		// initialize first noun
		noun[0] = "computer";
		// initialize second noun
		noun[1] = "iPhone";
		// initialize third noun
		noun[2] = "server";
		// initialize fourth noun
		noun[3] = "MacBook";
		// initialize five noun
		noun[4] = "Thinkpad";
		// initialize six noun
		noun[5] = "iPad";
		// initialize key listener
		addKeyListener(this);
	}
	public void paint(Graphics g) {
		g.setColor(new Color(245, 188, 30));
		g.setFont(new Font("Helvetica", Font.PLAIN, 24));
		g.drawString(adjectives[index] + " " + noun[secondIndex], 300, 300);
		
	}
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_1) {
			index = index + 1;
			if (index == adjectives.length) {
				index = 0;
			}
			repaint();
		}
		else if (e.getKeyCode() == KeyEvent.VK_2) {
			secondIndex = secondIndex + 1;
			if (secondIndex == noun.length) {
				secondIndex = 0;
			}
			repaint();
		}
		else if (e.getKeyCode() == KeyEvent.VK_R) {
			index = (int)(Math.random() * 5);
			secondIndex = (int)(Math.random() * 6);
			repaint();
		}
	}
	public void keyReleased(KeyEvent e) {
	}
	public void keyTyped(KeyEvent e) {
	}
}