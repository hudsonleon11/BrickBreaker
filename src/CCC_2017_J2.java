import java.util.Scanner;

public class CCC_2017_J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int num1 = 0;
		int total = num1;
		int num2 = 0;
		
		num1 = s.nextInt();
		num2 = s.nextInt();
		
		
		for(int i = 0; i < num2 + 1; i = i + 1) {
			total = total + (int) (Math.pow(10,i) * num1);
		}
	
			
		
		
		System.out.print(total);
	
		
		
		
	
	
	}

}
