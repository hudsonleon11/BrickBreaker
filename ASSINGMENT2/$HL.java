/**
 * This is my tools class, where I will put test corrections and demonstrate various skills learned in this
 * course.
 * 
 * @author hudson.leon
 *
 */

public class $HL {
	/**
	 * this is our tester method, it is simply used to test things in this class.
	 * largely, we will be accessing the methods in a different class.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("Hello");
		print("hi");
	}//main
	/**
	 * This is the method that prints the past string to this console.
	 * @param s
	 */
	public static void print(String s) {
		System.out.print(s);

	}//end print
	/**
	 * This method prints the past string on a new line
	 * @param s
	 */
	public static void println(String s) {
		System.out.println(s);
	}
	
	/**
	 * This pauses the code for a set amount of time
	 * @param delay
	 */
	public static void pause(int delay) {
		try {
			Thread.sleep(delay);
			
		}
		catch(Exception e) {
			
			
		}
	
	}
	//First Test Solution
		public static String front3(String str) {
			if(str.length()> 2) {
				String up3 = str.substring(0, 3);
				return up3 + up3 + up3; 
			}else if(str.length() > 0) {
				return str + str + str;
			}else {
				return "";
			}
		}
		//Second Test Solution
		public static String delDel(String str) {
			if(str.length() > 3 && str.substring(1,4).equals("del")) {
				return str.substring(0,1) + str.substring(4,str.length());
			}else {
				return str;
			}
		}
		//Third Test Solution
		public static String[] biggerTwo(String[] a, String[] b) {
			int anums = a[0].length() + a[1].length();
			int bnums = b[0].length() + b[1].length();
			if(bnums > anums) {
				return b;
			}else {
				return a;
			}
		}
		//Fourth Test
		public static int[] middleWay(int[] a, int[] b) {
			if(a.length > 0) {
				int asums = a[a.length / 2];
				int bsums = b[b.length / 2];
				int[] waym = {asums,bsums};
				return waym; 
				
			}else { 
				int[] ways = {a[0],b[0]};
				return ways; 
			}
		}
	public static void drawBox(int w, int h) {
		for(int j = 0; j < h; j = j + 1) {
			for(int i = 0; i < w; i = i + 1) {
				System.out.print("*");
		
			}
			System.out.println("");
		}
	
	}
	
	//public static void Isprime()
}
