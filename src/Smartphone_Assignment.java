

/*
 * SMARTPHONE CLASS FOR ASSIGNMENT1
 * Author: Hudson Leon, December 2017
 * In this class, a smartphone will be created for the user to interact with it
 * The smartphone will consist of multiple little boxes around a big box to create a smartphone looking box
 * This class will be incorporated into the Assignment file
 */
public class Smartphone_Assignment {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

	//Prints a line of | characters 
	public static void lilbox1() {
		int width = 21;
		for(int i = 0; i < width; i = i + 1) {
			System.out.print("|");
			//System.out.println("|");
		}
	}
	// Prints the banking expenses line
	public static void bankbox2() {
		System.out.println("");
		System.out.println("| BankingExpenses   |");
		
	}	

	// Prints the messages line
	public static void messagesbox() {
		System.out.println("");
		System.out.println("|      Messages     |");
	}
	
	//Prints the hudtunes line
	public static void hudtunesbox() {
		System.out.println("");
		System.out.println("|      HudTunes     |");
	}
	
	//Prints shopnow line
	public static void shopnowbox() {
		System.out.println("");
		System.out.println("|      ShopNow      |");
	}
	//Prints all functions in correct order function
	//This function is used in assignment1
	public static void sphone() {
		lilbox1();
		bankbox2();
		lilbox1();
		messagesbox();
		lilbox1();
		hudtunesbox();
		lilbox1();
		shopnowbox();
		lilbox1();
		System.out.println("");
		
		
	

		}
}
