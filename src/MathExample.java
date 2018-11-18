/**
 * Java header. Every class you make should have this. Always in blue
 * @author hudson.leon
 *Headers for methods will be in blue as well
 */
public class MathExample {
/**
 * This is my main method. This is where the program starts running. Every 
 * programming language needs a starting point. Python for example starts 
 * at the first non indented line
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Math Example - Begins");
		// with java you have to specify variable type;
		int num = 9;
		double numd = 6.7;
		String nume = "hello";
		
		// Java supports bedmas
		num = 5 + 2 *(1+3);
		
		num = 5%2;
				
		num = 10/3;
		
		System.out.println(num);
		
		int y = Math.max(10, 20);
		
		System.out.println(y);
		
		System.out.println("Math Example - Ends");
	}

}
