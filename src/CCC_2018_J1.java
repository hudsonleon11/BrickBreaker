import java.util.Scanner;

public class CCC_2018_J1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[4];
		int input = 0;
		Scanner s = new Scanner(System.in);
		boolean state1 = false;
		boolean state2 = false;
		boolean state3 = false;
		
		for(int i = 0; i < 4; i = i + 1) {
			input = s.nextInt();
			nums[i] = input;
		}
		
		if(nums[0] == 9 || nums[0] == 8) {
			state1 = true;
		}
		
		if(nums[1] == nums[2]) {
			state2 = true;
			}
		
		if(nums[3] == 9 || nums[3] == 8) {
			state3 = true;
			}
		
		
		//System.out.println(state1);
		
		if(state1 == true && state2 == true && state3 == true) {
			System.out.print("ignore");
		}
		
		else {
			System.out.print("answer");
		}
	}
	

}
