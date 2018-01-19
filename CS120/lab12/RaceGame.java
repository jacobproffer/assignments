

//  DO NOT MAKE MODFICICATIONS TO THIS FILE.  IF IT DOESN'T COMPILE, THE ERROR IS IN Car.java



import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class RaceGame extends Applet implements KeyListener, Runnable, MouseListener {
	private static final int WIDTH = 1000;
	private static final int HEIGHT = 550;
	private static final int BORDER_WIDTH = 15;
	private static final int STRIPE_LENGTH = 250;
	private static final int STRIPE_WIDTH = 10;
	private static final int CAR_WIDTH = 148;
	private static final int CAR_LENGTH = 20+45+250+47 - 35; //-35 is an extra buffer - cars are not totally square. oh well.

	private boolean gameOver;  //whether or not the game is over (display a message if game is over)
	private String gameOverString; //message to display when game is over

	private Car player, opponent; //player and opponent cars.  opponent is null when not on the screen.
	private int playerX, opponentX; //x position of player and opponent.
	private double playerY, opponentY; //y position of player and opponent.
	private double distance; //distance traveled so far.
	private Image buffer; //a double-buffer for drawing to the screen smoothly.

	private Color opColor; //color of the opponent's car.

	private double accelerate; //amount of current acceleration, as indicated by keyboard input
	private int turn; //amount of change turn, as indicated by keyboard input

	/**
	 * Get things setup to run the applet.  Initialize all the variables.
	 */
	public void init() {
		gameOverString = "";
		gameOver = true;
		player = new Car();
		opponent = null;
		playerY = HEIGHT/2 - CAR_WIDTH/2;
		playerX = 20;
		accelerate = 0;
		turn = 0;
		buffer = createImage(WIDTH, HEIGHT);
		addKeyListener(this);
		addMouseListener(this);
	}

	/**
	 * If the game is over and the mouse is pressed, we start a new game.
	 * @param e the mouse event supplied by the press.
	 */
	public void mousePressed(MouseEvent e) {
		if (gameOver) {
			gameOver = false;
			player = new Car();
			opponent = null;
			distance = 0;
			playerY = HEIGHT/2 - CAR_WIDTH/2;
			playerX = 20;
			accelerate = 0;
			turn = 0;
			Thread t = new Thread(this);
			t.start();
		}
	}

	/**
	 * Called when the mouse is released.  Not used in this applet.
	 * @param e the mouse event supplied.
	 */
	public void mouseReleased(MouseEvent e) {
	}

	/**
	 * Called when the mouse is clicked without moving.  Not used in this applet.
	 * @param e the mouse event supplied.
	 */
	public void mouseClicked(MouseEvent e) {
	}

	/**
	 * Called when the mouse is exited from the applet area.  Not used in this applet.
	 * @param e the mouse event supplied.
	 */
	public void mouseExited(MouseEvent e) {
	}

	/**
	 * Called when the mouse is enters the applet area.  Not used in this applet.
	 * @param e the mouse event supplied.
	 */
	public void mouseEntered(MouseEvent e) {
	}

	/**
	 * Called when a key is pressed down.  The arrow keys change the speed and
	 * direction of the car: right is faster, left is slower, up is turn-left, and
	 * down is turn-right.
	 *
	 * @param e the key event supplied.
	 */
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			accelerate = -1;
		}
		else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			accelerate = 1;
		}
		else if (e.getKeyCode() == KeyEvent.VK_UP) {
			turn = -1;
		}
		else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			turn = 1;
		}
	}

	/**
	 * Takes user keyboard input and uses it to effect the game in play.
	 */
	public void readControls() {
		player.accelerate(accelerate);
		if (turn < 0) {
			player.turnMoreLeft();
		}
		else if (turn > 0) {
			player.turnMoreRight();
		}
		else if (player.getWheelPosition() < 0) { //straighten out if they let go
			player.turnMoreRight();
		}
		else if (player.getWheelPosition() > 0) { //straighten out if they let go
			player.turnMoreLeft();
		}
	}

	/**
	 * Called when a key is released.  Used to figure out when
	 * they stopped accelerating/turing/etc.
	 *
	 * @param e the key event supplied.
	 */
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			accelerate = 0;
		}
		else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			accelerate = 0;
		}
		else if (e.getKeyCode() == KeyEvent.VK_UP) {
			turn = 0;
		}
		else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			turn = 0;
		}
	}

	/**
	 * Called when a key is typed.  Not used in this applet.
	 * @param e the key event supplied.
	 */
	public void keyTyped(KeyEvent e) {
	}

	/**
	 * Main loop, used by our multithreaded applet.  The main thread loops taking care of user input commands,
	 * updating the state of the game, and calling repaint().
	 */
	public void run() {
		while(true) {
			readControls();
			if (player.getSpeed() > 40 && opponent == null) {
				if (Math.random() < .03) {
					opponent = new Car();

					Color[] c = {Color.red.darker(), Color.green.darker().darker().darker(), Color.white.darker(), Color.cyan.darker().darker().darker()};
					opColor = c[(int)(Math.random()*4)];
					opponent.accelerate(40);
					opponentX = WIDTH;
					opponentY = Math.random() * (HEIGHT - 2*BORDER_WIDTH - CAR_WIDTH) + BORDER_WIDTH;
				}
			}
			distance += player.getSpeed();
			playerY += player.getWheelPosition() * player.getSpeed() / 50;
			if (opponent != null) {
				opponentX -= player.getSpeed() - opponent.getSpeed();
				if (opponentX < -CAR_LENGTH) {
					opponent = null;
				}
			}
			if (playerY < BORDER_WIDTH) {
				gameOverString = "Collided with the wall!";
				break; //crashed
			}
			if (playerY > HEIGHT-BORDER_WIDTH-CAR_WIDTH) {
				gameOverString = "Collided with the wall!";
				break; //crashed
			}
			if (opponent != null) {
				if (playerX + CAR_LENGTH > opponentX && opponentX + CAR_LENGTH > playerX) { //overlap in X
					if (playerY + CAR_WIDTH > opponentY && opponentY + CAR_WIDTH > playerY) { //overlap in Y
						gameOverString = "Collided with another car!";
						break; //crashed
					}
				}
			}
			repaint();

			try {
				Thread.sleep(20); //set for at most 50 frames per second.
			}catch(Exception e) {
				System.out.println(e);
				break;
			}
		}
		gameOver = true;
		repaint();
	}

	/**
	 * Standard update method.  Has paint do all the work.
	 * @param g the graphics context.
	 */
	public void update(Graphics g) {
		paint(g);
	}

	/**
	 * Standard applet paint method.  Draws the game.
	 * @param g the graphics context.
	 */
	public void paint(Graphics g) {
		Graphics h = buffer.getGraphics();
		this.drawRoad(h);
		this.drawCar(h, playerX, (int)playerY, Color.blue.darker());
		if (opponent != null) {
			this.drawCar(h, opponentX, (int)opponentY, opColor);
		}
		if (gameOver) {
			h.setColor(Color.black);
			h.drawString("Race driving challenge", 21, 41);
			h.drawString("Click applet to start", 21, 61);
			h.drawString("Use arrow keys to control your car", 21, 81);
			h.drawString(gameOverString, WIDTH/2+1, HEIGHT/2+1);
			h.setColor(Color.white);
			h.drawString("Race driving challenge", 20, 40);
			h.drawString("Click applet to start", 20, 60);
			h.drawString("Use arrow keys to control your car", 20, 80);
			h.drawString(gameOverString, WIDTH/2, HEIGHT/2);
		}
		g.drawImage(buffer, 0, 0, null);
	}

	/**
	 * Draws the road on the given graphics context.
	 *
	 * @param g the graphics context.
	 */
	private void drawRoad(Graphics g) {
		g.setColor(new Color(60, 60, 60));
		g.fillRect(0, 0, WIDTH, HEIGHT);
		g.setColor(Color.gray);
		g.fillRect(0, 0, WIDTH, BORDER_WIDTH);
		g.fillRect(0, HEIGHT-BORDER_WIDTH, WIDTH, BORDER_WIDTH);
		g.setColor(Color.yellow);
		for(int i = (int)(-distance - STRIPE_LENGTH); i < WIDTH; i += 3*STRIPE_LENGTH) {
			g.fillRect(i, HEIGHT/2-STRIPE_WIDTH/2, STRIPE_LENGTH, STRIPE_WIDTH);
		}
	}
	
	String fast;

	/**
	 * Draws the a car on the given graphics context.
	 *
	 * @param g the graphics context to draw on.
	 * @param x the x position where to draw the car (in graphics coordinates).
	 * @param y the y position where to draw the car (in graphics coordinates).
	 * @param carColor the color of the car.
	 */
	public void drawCar(Graphics g, int x, int y, Color carColor) {
		g.setColor(carColor);
		int x0 = x; //back of back bumper
		int x1 = x + 20; //front of back bumper
		int x2 = x + 20+45; //front of the back taper
		int x3 = x + 20+45+250; //front part of the main body
		int x4 = x + 20+45+250+47; //front part of the front bumper

		int w1 = 132; //width of back end
		int w2 = 148; //width of main body

		//back bumper
		g.fillArc(x0, y + (w2-w1)/2, 2*(x1-x0), w1, 90, 180);

		//tapered part
		int[] px = {x1, x2, x2, x1};
		int[] py = {y + (w2-w1)/2, y, y + w2, y + w1 + (w2-w1)/2};
		g.fillPolygon(px, py, 4);

		//main body
		g.fillRect(x2, y, x3-x2, w2);
		g.drawRect(x2, y, x3-x2, w2);

		//front bumper
		g.fillArc(x3 - (x4-x3)/2, y, x4-x3, w2, 270, 180);

		//mirrors...150 pixels past the back of the main body
		px = new int[] {x2 + 150, x2 + 140, x2 + 150, x2 + 165};
		py = new int[] {y, y -20, y-20, y};
		g.fillPolygon(px, py, 4);
		py = new int[] {y+w2, y + w2+20, y + w2+20, y+w2};
		g.fillPolygon(px, py, 4);

		//windshield 140, 170, 17, 8
		g.setColor(Color.black);
		px = new int[] {x2+140, x2+170, x2+170, x2+140};
		py = new int[] {y+17, y+8, y+w2-8, y+w2-17};
		g.fillPolygon(px, py, 4);
		g.fillArc(x2+130, y+8, 80, w2-16, 270, 180);

		//side windows
		g.fillArc(x2 + 40 - 130, y+6-10, 260, 20, 270, 90);
		g.fillArc(x2 + 40 - 130, y+w2-16, 260, 20, 0, 90);

		//back window
		//x: 50 90    y: 45 40
		int b0 = 3*x1/4 + x2/4;
		int b1 = x1/2 + x2/2;
		int b2 = x2 + (x2-x1)/2;
		px = new int[] {b1, b2, b2, b1};
		py = new int[] {y+25, y+22, y+w2-22, y+w2-25};
		g.fillPolygon(px, py, 4);
		g.fillArc(b0, y+25, 2*(b1-b0), w2-50, 90, 180);
		
		//print speed
		double speed = player.getSpeed();
		fast = Double.toString(speed);
		g.drawString(fast, 40, 40);
	}
}
