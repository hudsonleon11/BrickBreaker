import java.util.Arrays;
import java.util.Scanner;

/**
 * This is my tools class, where I will put test corrections and demonstrate various skills learned in this
 * course.
 * 
 * @author hudson.leon
 *
 */

public class $HSL {
	/**
	 * this is our tester method, it is simply used to test things in this class.
	 * largely, we will be accessing the methods in a different class.
	 * @param args
	 */
	
	
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
	 * @param delay is how long the code sleeps for in milliseconds 
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
		//Fourth Test question
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
	
		
		/**
		 * Draws a box using "*"
		 * @param w is how wide the box is
		 * @param h is how high the box is
		 */
		
		public static void drawBox(int w, int h) {
		for(int j = 0; j < h; j = j + 1) {
			for(int i = 0; i < w; i = i + 1) {
				System.out.print("*");
		
			}
			System.out.println("");
		}
	
	}
	
	/**
	 * In this problem, the user inputs a string and the character they want to find and
	 * an integer of how many times the character occurs in the string is returned
	 * @param str is a string 
	 * @param c is a character
	 * @return is how many times a character occurs in an array
	 */
		
	
	public static int findLetter(String str, char c) {
		
		int count = 0;
		boolean state = true;
		
		str.toLowerCase();
		char[] arr = str.toCharArray(); 
		
		for(int i = 0; i < str.length(); i = i + 1) {
			if(arr[i] == c) {
				count = count + 1;
			}
				
		}
	
	System.out.println(count);	
	return count;
	
	}
	
	/**
	 * Finds the final term in the arithmetic sequence
	 * @param n - return the nth term
	 * @param u1 - First term in the sequence
	 * @param d - common difference in the sequence
	 * @return is the final term in the sequence
	 */
	
	public static int arseqfindun(int n, int u1, int d) {
		
		int un = 0;
		
		un = u1 + (n-1)*d;
		
		
		System.out.println(un);
		return un;
		
		
	}
	/**
	 * 
	 * @param n is the number of terms in the sequence
	 * @param un is the final term in the sequence
	 * @param d is the common difference
	 * @return is the first term in the sequence
	 */
	//Find the first term in the arithmetic sequence
	public static int arseqfindu1(int n, int un, int d) {
		
		int u1 = 0;
		
		u1 = un - (d*n) + d;
		
		System.out.println(u1);
		return u1;
		
		
	}
	
	/**
	 * Finds the number of terms in an arithmetic sequence
	 * @param d is the common difference
	 * @param u1 is the first term
	 * @param un is the final term
	 * @return is the number of terms in the sequence
	 */
	
	public static int arseqfindn(int d, int u1, int un) {
		
		int n = 0;
		
		n = (un  - u1 + d)/d;
		
		System.out.println(n);
		return n;
		
		
	}
	
	
	
	/**
	 * Asks for input and uses a try and catch to to tell if it is an integer or not.
	 * @param prompt is a string
	 * @return is the integer x
	 */
	public static int takeInteger(String prompt) {
		boolean found = false;
		
		while(true) {
			
	
		try {
			Scanner s = new Scanner(System.in);
			System.out.print(prompt);
			int x = s.nextInt();
			return x;
		}
		catch(Exception e) {
			System.out.println("DUDE THATS NOT AN INTEGER");
		}
		;
	}
		
	}
	
	/**
	 * Finds how many times a smaller string occurs in a bigger string.
	 * @param small is a string
	 * @param big is a string
	 * @return
	 */
	
	
	public static int findOccur(String small, String big) {
		int count = 0;
		
		if(big.length() > small.length()) {
			for(int i = 0; i < big.length() - small.length() + 1; i = i + 1) {
				if(big.substring(i, small.length() + i).equals(small)) {
					count = count + 1;
				}
			}
		}
		
		else {
			for(int i = 0; i < small.length() - big.length() + 1; i = i + 1) {
				if(small.substring(i, big.length() + i).equals(big)) {
					count = count + 1;
				}
			}
		}
		
		System.out.println(count);
		return count;
	}
	
	/**
	 * Method that asks the user to input elements for an array of length n
	 * @param n is the length of the array
	 * @return is the array
	 */
	
	
	public static String[] makeList(int n) {
		Scanner s = new Scanner(System.in);
		
		String[] arr = new String[n];
		
		for(int i = 0; i < arr.length; i = i + 1) {
			arr[i] = s.nextLine();
		}
		
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	
	/**
	 * Method that Shifts all the elements in an array over by one to the right
	 * 
	 */
	
	
	public static void reversep1() {
		
		int mid = 0;
		int[] nums = {1,2,4};
		
		for(int i = 0; i < nums.length/2; i = i + 1) {
			mid = nums[i];
			nums[i] = nums[nums.length -i -1];
			nums[nums.length -i -1] = mid;
		}
	
		System.out.println(Arrays.toString(nums));
	}
	
	
	/**
	 * Counts how many words there are in a sentence
	 * @param str is a string (should be a sentence)
	 * @return is how many words are in the sentence
	 */
	public static int wordcounter(String str) {
		int count = 0;
		char[] arr = str.toCharArray(); 
		if(arr[arr.length-1] != ' ') {
			count = count + 1;
		}
		
		for(int i = 0; i < arr.length-1; i = i +1) {
			if(arr[i] == ' ' && arr[i+1] != ' ') {
				count = count + 1;
			}
			
		}
		System.out.println(count);
		return count;
		
	}
	

	
	
	/**
	 * This method determines who should be in first class on a flight through a random double.
	 * @param a is a string (should be a name)
	 * @param b is a string (should be a name)
	 * @param c is a string (should be a name)
	 * @return is either one of the 3 string parameters
	 */
	public static String randflightman(String a, String b, String c) {
		
		double fclass = Math.floor(Math.random() * 4.0) + 1.0;  
		
		if(fclass >= 1.0 && fclass < 2.0) {
			System.out.println(a);
			return a;
		}
		else if(fclass >= 2.0 && fclass < 3.0) {
			System.out.println(b);
			return b;
		}
		
		else {
			System.out.println(c);
			return c;
		}
		
		
	}
	
	/**
	 * Swap Value Method
	 * Method that will swap the values of two integers
	 * @param x is an integer
	 * @param y i an integer
	 */
	
	
	public static void swapvalues(int x, int y) {
		
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println(x);
		System.out.println(y);
		
		
	}
	
	/**
	 * Method that determines if an integer is prime
	 * @param x is the integer the user inputs
	 * @return is either true or false. 
	 * False if it is not prime
	 * True if it is prime
	 */
	
	
	public static boolean isPrime(int x) {
		boolean state = true;
		
		for(int i = 2; i < x; i = i +1) {
			if(x%i == 0) {
				state = false;
			}
		}
		
		System.out.println(state);
		return state;
	}
	
	/**
	 *Linear Search Method
	 *This method will look at all items in an array until the desired element is found.
	 */
	
	public static void lSearch() {
		int [] arr = {10, 20, 30, 40, 50, 60};

		for(int i = 0; i < arr.length; i = i +1) {
			if(arr[i] == 20) {
				System.out.println(i);
				
				
			}
			
		}
	}
	
	
	/**Bubble Sort Method
	This function will re-arrange an array of integers in order of smallest to biggest.
	 * 
	 */
	
	public static void bubbleSort() {
		int fine = 0;
		int [] nums = {60, 20, 40, 30, 50, 10};
		
		for(int k = 0; k < nums.length-1; k = k + 1) {
			for(int i = 0; i < nums.length-1; i = i + 1) {
				if(nums[i] > nums[i+1]) {
					fine = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = fine;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("Hello");
		print("hi");
		int age = takeInteger("What is your age?");
		int num = findLetter("hello", 'l');
		int num1 = findOccur("poopoo", "poo");
		String[] nums = makeList(5);
		reversep1();
		int numee = arseqfindun(9, 5, 3);
		int numef = arseqfindu1(9, 29, 3);
		int numen = arseqfindn(3, 5, 29);
		int mcount = wordcounter("Hello Sir How Are You");
		String rfm = randflightman("A", "B", "C");
		swapvalues(10,5);
		boolean boom = isPrime(20);
		lSearch();
		bubbleSort();
		

	
	}
	
	
	
	
}
