import java.util.Scanner;

public class ReadingInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int input1 = 0;
		int input2 = 0;
		int count = 0;
		String values = "";
		
		do {
			input1 = s.nextInt();
			input2 = s.nextInt();
			count = count + 2;
			values = values + input1 + " " + input2 + " ";		
		
		}while (input1 != 0 && input2 != 0);
		
		
		int[] data = new int[count];
		//the hard part is pulling the the things out of the string
		//1. converting a string to an integer
		//Step 1: I use the indexOf function to find the first index
		// of the space
		for(int i = 0; i < count; i = i + 1) {
			int loc1 = 0;
			int loc2 = values.indexOf(" "); // this finds the first space
			String temp = values.substring(loc1,loc2);//pulls out the first number as a string
			int num = Integer.parseInt(temp);
			values.substring(2);
			values = values.substring(loc2 + 1);
			data[i] = num;
		}
		for(int i = 0; i < data.length; i = i + 1) {
			System.out.println(data[i] + " ");
		}
		
		System.out.println("END PROGRAM");
	}

}
