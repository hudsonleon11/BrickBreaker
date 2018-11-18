import java.awt.Color;

public class Ball {

	//Attributes
	private Color ballColor;
	private int xpos;
	private int ypos;
	private int r;
	
	public Ball(int x, int y, int radius) {
		xpos = x;
		ypos = y;
		r = radius;
	
	}
//get methods baby
	public int getR() {
		return r;
	}
	public int getxpos() {
		return xpos;
	}

	public int getypos() {
		return ypos;
	}
	
	
}
