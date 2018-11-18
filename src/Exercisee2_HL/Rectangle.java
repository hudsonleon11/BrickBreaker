package Exercisee2_HL;
/**
 * September 29, 2017
 * @author hudson.leon
 *Rectangle Class
 */
public class Rectangle {
	private int x;
	private int y;
	private double l; // length
	private double w; // width
// Get  SET METHODSS

	public void setX(int xpos) {
		x = xpos;
	}
	
	public int getX() {
		return x;
	}
	public void setY(int ypos) {
		y = ypos;
	}
	public int getY() {
		return y;
	}
	public double getArea() {
		return l*w;
	}
	public double getPerimiter() {
		return l + w + l + w; 
	}
}
