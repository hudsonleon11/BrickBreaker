import java.util.Scanner;

public class CCC_2006_J1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 0;
		Scanner numsin = new Scanner(System.in);
		int total = 0;
		
		System.out.println("Welcome to Chip's Fast Food Emporium");
		System.out.println("Please enter a burger choice: ");
		input = numsin.nextInt();
		
		if(input == 1) {
			total = total + 461;
		}
		else if(input == 2) {
			total = total + 431;
		}
		else if(input == 3) {
			total = total + 420;
			
		}else {
			total = total + 0;
		}
		
		System.out.println("Please enter a side order choice: ");
		input = numsin.nextInt();
		
		if(input == 1) {
			total = total + 100;
		}
		else if(input == 2) {
			total = total + 57;
		}
		else if(input == 3) {
			total = total + 70;
			
		}else {
			total = total + 0;
		}
		
		System.out.println("Please enter a drink order choice: ");
		input = numsin.nextInt();
		
		if(input == 1) {
			total = total + 130;
		}
		else if(input == 2) {
			total = total + 160;
		}
		else if(input == 3) {
			total = total + 118;
			
		}else {
			total = total + 0;
		}	
		System.out.println("Please enter a dessert order choice: ");
		input = numsin.nextInt();
		
		if(input == 1) {
			total = total + 167;
		}
		else if(input == 2) {
			total = total + 266;
		}
		else if(input == 3) {
			total = total + 75;
			
		}else {
			total = total + 0;
		
		}	
		
		System.out.println("Your total Calorie count is " + total);


	}

}
