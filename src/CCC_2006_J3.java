import java.util.Scanner;

public class CCC_2006_J3 {
	static int time = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String input = "";
		
		
		
		System.out.println("What text would you like write?");
		input = s.nextLine();
		
		
		char[] text = new char[input.length()];
		
		for(int i = 0; i < text.length; i = i + 1) {
			text[i] = input.charAt(i);
			
		}
		for(int i = 0; i < text.length-1; i = i + 1) {
		
			time = findSeconds(text[i]);
			
			if(text[i] == text[i+1]) {
				time = time + 2;
			}
		
		}
		System.out.println("It takes " + time + " seconds to type this.");
	}
	
	public static int findSeconds(char c) {
		if(c == 'a' || c == 'd' || c == 'g' || c == 'j'|| c == 'm' || c == 'p' || c == 't' || c == 'w') {
			time = time + 1;
		}
		else if(c == 'b' || c == 'e' || c == 'h'|| c == 'k' || c == 'n' || c == 'q' || c == 'u' || c == 'x') {
			time = time + 2;
		}
		else if(c == 'c' || c == 'f' || c == 'i' || c == 'l' || c == 'o' || c == 'r' || c == 'v' || c == 'y' ) {
			time = time + 3;
		}
		else {
			time = time + 1;
		}
			
		
			return time;
		
	}

}
