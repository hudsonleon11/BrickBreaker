import java.util.Arrays;
import java.util.Scanner;

public class TestPrep_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Make a program TestPrep1 which does the following:
		 * 
		 * 1. Takes int input n
		 * 2. Creates an array of doubles of length n
		 * 3. Takes inputs for each element such that all inputs are between 0 wand 100 inclusive
		 * 
		 */
		int nlength = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Please input the length of your desired array: ");
		nlength = s.nextInt();
		double[] nums = new double[nlength];
		for(int i = 0; i < nums.length; i = i + 1) {
			/*
			 * A do while is called a conditional loop. It runs as long as a condition is true.
			 * It will always run ONCE.
			 */
			do {
				System.out.println("Please enter the input you desire: ");
				nums[i] = s.nextDouble();	
			
				if(nums[i] < 0 || nums[i] > 100) {
				System.out.println("ERROR. PLEASE TYPE IN A DOUBLE LOWER THAN 100 OR GREATER THAN 0");
				}
			} while(nums[i] < 0 || nums[i] > 100);
			
		
		}
		System.out.println(Arrays.toString(nums));
	}

}
