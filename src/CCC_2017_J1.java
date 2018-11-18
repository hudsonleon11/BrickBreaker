

import java.util.Scanner;

public class CCC_2017_J1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int input = 0;
		int num1 = 0; 
		int num2 = 0;
		
		input = s.nextInt();
		num1 = input;
		
		input = s.nextInt();
		
		num2 = input;
		
		if(num1 > 0 && num2 > 0) {
			System.out.print("1");
		}
		else if(num1 < 0 && num2 > 0) {
			System.out.print("2");
		}
		else if(num1 < 0 && num2 < 0) {
			System.out.print("3");
		}
		else {
			System.out.print("4");
		}
	}

}
