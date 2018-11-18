import java.util.Scanner;

public class CCC_2018_J3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		Scanner s = new Scanner(System.in);
		
		int x1 = 0;
		int x2 = 0;
		int x3 = 0;
		int x4 = 0;

		x1 = s.nextInt();
		x2 = s.nextInt(); 
		x3 = s.nextInt(); 
		x4 = s.nextInt(); 





		System.out.println((x1 - x1 + " ") + (x1 + " ") + (x1 + x2 + " ") + (x1 + x2 + x3 + " ") + (x1 + x2 + x3 + x4));
		
		System.out.println((x1 + " ") + (0 + " ") + (x2 + " ") + (x2 + x3 + " ") + (x2 + x3 + x4));

		System.out.println((x1 + x2 + " ") + (x2 + " ") + (0 + " ") + (x3 + " ") + (x3 + x4));

		System.out.println((x1 + x2 + x3 + " ") + (x2 + x3 + " ") + (x3 + " ") + (0 + " ") + (x4));

		System.out.println((x1 + x2 + x3 + x4 + " ") + (x2 + x3 + x4 + " ") + (x3 + x4 + " ") + (x4 + " ") + 0);
		
	}	

}
