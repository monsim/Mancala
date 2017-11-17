import java.awt.*;
import java.awt.geom.*;
import java.util.*;

/**
 * A Mancala stone class to hold each stone's graphics properties.
 * 
 * @author Vincent Stowbunenko
 *
 */
public class MancalaStoneGraphics {

	private double x;
	private double y;
	private Color color;
	private int pit;

	// For animation
	private boolean isAnimating;
	private double randX;
	private double randY;
	private double diffX;
	private double diffY;
	private double segmentX;
	private double segmentY;
	private double nextX;
	private double nextY;

	// Constructors

	// /**
	// * If nothing is specified, point starts at (0,0) and give it a random color
	// */
	// public MancalaStoneGraphics() {
	// x = 0;
	// y = 0;
	// Random rand = new Random();
	// color = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
	// }

	/**
	 * Specify color and pit number for this stone
	 * 
	 * @param color
	 * @param pit
	 */
	public MancalaStoneGraphics(Color color, int pit) {
		x = 0;
		y = 0;
		this.color = color;
		this.pit = pit;
		isAnimating = false;
	}

	// /**
	// * If only point is specified, give it a random color
	// *
	// * @param x
	// * @param y
	// */
	// public MancalaStoneGraphics(double x, double y) {
	// this.x = x;
	// this.y = y;
	// Random rand = new Random();
	// color = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
	// }

	// Getters and setters
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getPit() {
		return pit;
	}

	public void setPit(int pit) {
		this.pit = pit;
	}

	public boolean getIsAnimating() {
		return isAnimating;
	}

	public void setIsAnimating(boolean isAnimating) {
		this.isAnimating = isAnimating;
	}

	public double getNextX() {
		return nextX;
	}

	public void setNextX(double nextX) {
		this.nextX = nextX;
	}

	public double getNextY() {
		return nextY;
	}

	public void setNextY(double nextY) {
		this.nextY = nextY;
	}

	public double getDiffX() {
		return diffX;
	}

	public void setDiffX(double diffX) {
		this.diffX = diffX;
	}

	public double getDiffY() {
		return diffY;
	}

	public void setDiffY(double diffY) {
		this.diffY = diffY;
	}

	public double getSegmentX() {
		return segmentX;
	}

	public void setSegmentX(double segmentX) {
		this.segmentX = segmentX;
	}

	public double getSegmentY() {
		return segmentY;
	}

	public void setSegmentY(double segmentY) {
		this.segmentY = segmentY;
	}

	public double getRandX() {
		return randX;
	}

	public void setRandX(double randX) {
		this.randX = randX;
	}

	public double getRandY() {
		return randY;
	}

	public void setRandY(double randY) {
		this.randY = randY;
	}

	/**
	 * Do calculations to animate the translating the stone to the randomized (x, y)
	 * position
	 * 
	 * @param randX
	 *            the final x position to translate to
	 * @param randY
	 *            the final y position to translate to
	 */
	public void startAnimating(double randX, double randY) {

		this.randX = randX;
		this.randY = randY;

		// Get the lengths
		diffX = randX - x;
		diffY = randY - y;

		// Break up the x and y components of the translate path into segments
		double divisor = 25;
		segmentX = diffX / divisor;
		segmentY = diffY / divisor;

		// Translate the stones
		nextX = x + segmentX;
		nextY = y + segmentY;

		// Turn on the animation flag
		isAnimating = true;

	}

}
