import java.util.Scanner;

public class Exercise1_HL {

	public static void main(String[] args) {
		
		//Variable declaration section
		//All variables are declared at the top of the program
		//scanner for side 1
		Scanner s = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		//Input of side 2
		double area = 0;
		double r = 9;
		
		// TODO Auto-generated method stub
		System.out.println("How to find the hypotenuse! NOTE: Please input the first side: ");
		double side1 = s.nextDouble(); // Taking the input
		System.out.println("How to find the hypotenuse! NOTE: Please input the second side: ");
		double side2 = b.nextDouble(); // Takes input
	// 
		double thirdside = Math.sqrt((side1 * side1) + (side2 * side2));
	
		System.out.println("The third side of your shape is: " + thirdside);
		
		System.out.println("How to calculate profit! Please input your revenue: ");
		double revenue = s.nextDouble();
		System.out.println("Please input your costs: ");
		double cost = s.nextDouble();
		
		double profit = revenue - cost;
		
		System.out.println("Your total profit is: " + profit + " Dollars!");
		
		
		System.out.println("How to find the volume of a cube! Please input a side length: ");
		
		double side = s.nextDouble(); 
		
		double volume = side * side * side;
		
		System.out.println("The volume of the cube is " + volume + " cubic units!" );
	}

}
