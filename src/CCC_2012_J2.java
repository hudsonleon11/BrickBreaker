import java.util.Scanner;

public class CCC_2012_J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] nums = new int[4];
	int input = 0;
	
	Scanner s = new Scanner(System.in);

	for(int i = 0; i < 4; i = i + 1) {
		input = s.nextInt(); 
		nums[i] = input;
		
	}
	
	if(nums[0] > nums[1] && nums[1] > nums[2] && nums[2] > nums[3]) {
		System.out.print("Fish Diving");
	}
	else if(nums[0] < nums[1] && nums[1] < nums[2] && nums[2] < nums[3]) {
		System.out.print("Fish Rising");
	}
	else if(nums[0] == nums[1] && nums[1] == nums[2] && nums[2] == nums[3]) {
		System.out.print("Constant Depth");
	
	}
	else {
		System.out.print("No Fish");
	}
	
	}
	
	public static void solutions() {
		
	}
	
}
