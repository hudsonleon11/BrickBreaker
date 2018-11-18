
public class LoopDemo {

	public static void main(String[] args) {
		/*
		 * What is a loop structure: 
		 * 
		 * A loop structure is a structure that repeats a section of code. All programming languages have them in
		 * some form.
		 * 
		 * There two classifications of loops you want to know
		 * 
		 * COUNTED LOOP: 
		 * 
		 * 	A counted loop is typically used when you know in advance how many times the loop should run.
		 * 
		 * 	for(<count>; <check>; <changes>)
		 * 
		 * 	//LOOP CODE
		 * 
		 * 1. declare and initialize count
		 * i= 0
		 * 
		 * 2. check count i < 5 --> 0 < 5
		 * 
		 * 3. If true we enter the loop otherwise we skip
		 * 
		 * 4. (true) run loop code
		 * 
		 * 5. At bottom of loop apply change and check again
		 */
		//for (int i = 50; i > -51; i = i - 1) {
			//System.out.println("i = " +i);
	
		int count = 0;
		int[] arr = {12,14,67,2,-11,56,99};
		for(int i = 0; i < arr.length; i = i + 1) {
			if(arr[i] < 0) {
				count = count + 1;
			}
	
		}
		System.out.println("Count: "+count);
	
	}
}
