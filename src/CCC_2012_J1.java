import java.util.Scanner;

public class CCC_2012_J1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int fine = 0;
	int reclimit = 0;
	int slimit = 0;
	int input = 0;
	Scanner s = new Scanner(System.in);
	
	System.out.print("Enter the speed limit: ");
	
	input = s.nextInt();
	
	slimit = input;
	
	System.out.print("Enter the recorded speed of the car: ");
	
	input = s.nextInt();
	
	reclimit = input;
	
	if(reclimit - slimit > 0 && reclimit - slimit < 21) {
		
		fine = 100;
		System.out.println("You are speeding and your fine is $" + fine + ".");
	}
	else if(reclimit - slimit > 20 && reclimit - slimit <= 30) {
		fine = 270;
		System.out.println("You are speeding and your fine is $" + fine + ".");
	}
	else if(reclimit - slimit > 30) {
		fine = 500;
		System.out.println("You are speeding and your fine is $" + fine + ".");
	}
	else {
		fine = 0;
		System.out.println("Congratulations, you are within the speed limit!");
	}
	
	
		
	
		
	
	
	
	
	
	}//END MAIN

	public static void solutions() {
		
	}
}

