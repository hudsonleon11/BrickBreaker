import java.util.Scanner;

public class CCC_2016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	char input = ' ';
	char[] nums = new char[5];
	int ctr = 0;
	
	Scanner s = new Scanner(System.in);

	for(int i = 0; i < 5; i = i + 1) {
		input = s.nextLine().charAt(0);
		nums[i] = input;
		
	}
	
	for(int i = 0; i < 6; i = i + 1) {
		 if(nums[i] == 'W'){
			ctr = ctr + 1;
		}
	}
	
	if(ctr > 4 ) {
		System.out.print("3");
	}
	else if(ctr > 2) {
		System.out.print("2");
	}
	else if(ctr > 0) {
		System.out.print("1");
	}
	else {
		System.out.print("-1");
	}
	}

}
