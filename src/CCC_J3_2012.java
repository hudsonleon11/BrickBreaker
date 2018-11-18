import java.util.Scanner;

public class CCC_J3_2012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		
		int input = 0;
		String ex = "X";
		String star = "*";
		String blank = " ";
		int num = 0;
		
		input = s.nextInt();
		
		num = input;
		
		for(int i = 0; i < num; i = i + 1) {	
			for(int x = 0; x < num; x = x + 1) {
				System.out.print(star);
			}

			for(int y = 0; y < num; y = y + 1) {
				System.out.print(ex);
			}

			for(int z = 0; z < num; z = z + 1) {
				System.out.print(star);
			}
			System.out.println("");
		}
		
		for(int i = 0; i < num; i = i + 1) {	
			for(int x = 0; x < num; x = x + 1) {
				System.out.print(blank);
			}

			for(int y = 0; y < num; y = y + 1) {
				System.out.print(ex);
			}

			for(int z = 0; z < num; z = z + 1) {
				System.out.print(ex);
			}
			System.out.println("");
		}
		
		for(int i = 0; i < num; i = i + 1) {	
			for(int x = 0; x < num; x = x + 1) {
				System.out.print(star);
			}

			for(int y = 0; y < num; y = y + 1) {
				System.out.print(blank);
			}

			for(int z = 0; z < num; z = z + 1) {
				System.out.print(star);
			}
			System.out.println("");
		}
		
	
	}

	public static void solutions() {
		
		
		
		
		
	}

}
