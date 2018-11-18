import java.util.ArrayList;
import java.util.Scanner;

public class ReadingInputsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int input1 = 0;
		int input2 = 0;
		
		do {
			input1 = s.nextInt();
			input2 = s.nextInt();
			list.add(input1);
			list.add(input2);
			
		}while(input1 != 0 && input2 != 0);
		
		
	}

}
