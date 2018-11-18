import java.util.Scanner;

public class CCC_Problem {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int xstart = 0;
		int xfinish = 0;
		int ystart = 0;
		int yfinish = 0;
		int elec = 0;
		int total = 0;
		
		xstart = s.nextInt();
		ystart = s.nextInt();
		xfinish = s.nextInt();
		yfinish = s.nextInt();
		elec = s.nextInt();
		
		total = Math.abs(xstart - xfinish) + Math.abs(ystart - yfinish);
		if (total <= elec && elec - total % 2 != 0) {
			System.out.println("Y");
		}
		else {
			System.out.println("N");
		}
		
	}
}
