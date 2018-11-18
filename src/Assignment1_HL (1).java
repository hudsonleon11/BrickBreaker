import java.util.Arrays;
import java.util.Scanner;

/*
 * HUDSON LEON - DECEMBER 2017 - MR. MISKEW
 * TITLE OF GAME: RAP SUPERSTAR
 * BACKGROUND: 
 * In this game, one is a hip hop artist and one must make the correct decisions in order to thrive in the 
 * hip hop world
 * 
 * GOALS.
 * - I want to set up your basic template
 * - I want to set you up so you can take inputs of string and numeric types
 * - I want to get you out of the main
 * 
 */



public class Assignment1_HL {

	public static void game() { 
		//Variables - game method. They only exist in the game method
		Scanner wordsIn = new Scanner(System.in);
		Scanner numsIn = new Scanner(System.in);
		//Question: When I create a class how do I name it?
		//	A: Start with an Uppercase
		//Question: When I name a constant how do I name it?
		//	A: Use a Capital letter.
		//This sets the duration of the pause
		int p = 500;
		//Stores the input value for a number
		int numinput = 0;
		//Stores the input value for a string
		String input = "";
		//Stores the users name as a string
		String name = "";
		//Stores the gender of the user (either male or female)
		String gender = "";
		//Stores the amount of money the user has
		Double bank = 5000.0 ;
		//Stores first address option
		String addy1 = "537 Lambo Lane";
		//Stores second address option
		String addy2 = "8 Belper Court";
		//Stores third address option
		String addy3 = "30 Ridge Drive";
		//Stores the price of the user chosen address
		Double addyprice = 0.0;
		//Stores price of first address option
		Double addy1price = 4000.0;
		//Stores price of second address option
		Double addy2price = 3000.0;
		//Stores price of third address option
		Double addy3price = 2000.0;
		//Stores the user chosen address(one of the three above)
		String addy = "";
		//Stores recording equipment price of cheap option
		Double eqt1price = 500.0;
		//Stores recording equipment price of expensive option
		Double eqt2price = 1000.0;
		//Stores name of cheap recording equipment 
		String eqt1 = "JB50";
		//Stores name of expensive recording equipment
		String eqt2 = "10YU";
		//Stores user chosen name of recording equipment
		String rsetup = "";
		//Stores the variable that decides the path of the the character in the game
		int num = 0;
		//Stores the user chosen album name
		String albumname = "";
		//Stores the user chosen length of album
		int albumnum = 0;
		
		//From the $HL class, the function pause which sets a delay before the text is printed, is used here
		$HL.pause(p);
		System.out.println(".");
		$HL.pause(p);
		System.out.println(".");
		$HL.pause(p);
		System.out.println(".");
		$HL.pause(p);
		System.out.println(".");
		$HL.pause(p);
		//Start of on screen text with pauses
		System.out.println("Hello and welcome to Rap Superstar!");
		
		System.out.println("My name is Dave and I will be your manager/guide to success in the game.");
		
		System.out.println("In this game you take on the role of a hip hop artist.");

		System.out.println("The goal of the game is to try and make one of your albums go platinum.");
	
		System.out.println("You must do this by working your way to the top of the music industry.");
		
		System.out.println("This can be done by creating relationships, improving skills and taking risks.");
		
		System.out.println("You have your choice of gender.");

		System.out.println("The options are: Male or Female.");
	
		System.out.println("Please input your desired gender.");
		//Problem: If the user types in anything other than yes the program cakes
		//When taking inputs conditional loops are perfect. Conditional loops
		//Are used when we don't know how many times something should run
		//Two types of conditional loops:
		//1. While loop		This is an if statement but we switch the word
		//					if with while.
		//2. do while loop: This is like a while loop. IT WILL ALWAYS RUN ONCE.
		
		//Do while loop used to check user input for desired gender
		do { 
			System.out.print("Input: ");
			input = wordsIn.nextLine();
			input = input.toUpperCase();
			gender = input;
			
		} while (gender.equals("MALE") == false && gender.equals("FEMALE") == false);
		
		//We want to analyze what the user inputs.
		//Trick: With strings you can check more combination if you convert the string to upper or lower case
		// Loop breaks if the user enters either male or female
		// If user chooses to be a male
		if (gender.equals("MALE")) {
			
			//Prompts user for a name
			System.out.println("Okay you have chosen to be a male.");
			System.out.println("What do you want your name to be?");
			
			//No do while loop here because choice of input does not matter
			System.out.println("Input: ");
			input = wordsIn.nextLine();
			input = input.toUpperCase();
			name = input;
			
			// String manipulation to repeat chosen name
			
			System.out.println("Hello " + name + ", thank you for choosing a name!");
			
			// Telling the user how much money they have (bank variable)
			// Uses the class $HL and the function println to print text to console on a new line
			$HL.println("Okay " + name + ", you currently have " + bank + " dollars in your bank.");
			
			$HL.println("You must first choose an apartment to rent.");
			
			$HL.println("***NOTE****");
			
			$HL.println("Helpful tip: You must choose wisely where you live.");
			
			
			
			$HL.println("By renting a more expensive place, you will save money on fuel and will be able to meet producers and managers much more frequently");
			
			$HL.println("but, you will have less money to spend on recording equipment which will hurt your chances of being discovered..");
			
		
			
			$HL.println("By renting a cheaper place, you lose more monney on fuel and are unable to meet producers/managers more frequently");
			
			$HL.println("but you are able to spend more on recording equipment");
			
			//More String manipulation and outlining math operators
			$HL.println("Property one: ** Address: " + addy1 + " ** Rental Price: " + addy1price);
			
			//Prompts user for input and breaks loop only if user enters yes or no
			$HL.println("Would you like to purchase this house?(Yes/No)");
		
			do {
				System.out.println("Input: ");
				input = wordsIn.nextLine();
				input = input.toUpperCase();
			
			}while(input.equals("YES") == false && input.equals("NO")== false);
			
			//Conditional statements (if/else)
			//If user answers yes, do not prompt again to re think choice
			if(input.equals("YES")) {
				//Sets variables to user selected choices
				addy = addy1;
				addyprice = addy1price;
				bank = bank - addyprice;
				//Prints the name and the new address chosen by user
				$HL.println("Okay " + name + " You now live at " + addy + ".");
			}
			//else statement, start of nested loop
			else {
				//Allows user to re-think choice
				$HL.println("Are you sure? ? (If you type no then you will get the first property)");	
				//Prompts user for input and breaks loop only if user enters yes or no
				do {
					System.out.println("Input: ");
					input = wordsIn.nextLine();
					input = input.toUpperCase();
				}while(input.equals("YES") == false && input.equals("NO")== false);
			
				// checks user input to determine outcome, in this case input = no, then the previous address is the new address
				if(input.equals("NO")) {
					//Stores user chosen outcomes in variables
					addy = addy1;
					addyprice = addy1price;
					//Changes the money left in bank account
					bank = bank - addyprice;
					$HL.println("Okay " + name + " You now live at " + addy + ".");
				}
			
				//If user outcome is yes, then the new address is shown
				else if(input.equals("YES")) {
				
					$HL.println("Property two: ** Address: " + addy2 + " ** Rental Price: " + addy2price);	
					$HL.println("Is this your desired property? (yes or no)");
					//Prompts user for input and breaks loop only if user enters yes or no
					do {
						System.out.println("Input: ");
						input = wordsIn.nextLine();
						input = input.toUpperCase();
					}while(input.equals("YES") == false && input.equals("NO")== false);
					//If user answers yes, do not prompt again to re think choice
					if(input.equals("YES")) {
						//Stores user chosen outcomes in variables
						addy = addy2;
						addyprice = addy2price;
						//Changes the money left in bank account
						bank = bank - addyprice;
						$HL.println("Okay " + name + " You now live at " + addy + ".");
					
					//If user answers no, then prompt again to make sure that their decision is correct
					}else if(input.equals("NO")){
						$HL.println("Are you sure? ? (If you type no then you will get the first property)");
						//Prompts user for input and breaks loop only if user enters yes or no
						do {
							System.out.println("Input: ");
							input = wordsIn.nextLine();
							input = input.toUpperCase();
						}while(input.equals("YES") == false && input.equals("NO") == false);
							
							//If user answers no, user chooses to have the previous address.
							if(input.equals("NO")) {
								//Stores user chosen outcomes in variables
								addy = addy2;
								addyprice = addy2price;
								//Changes the money left in bank account
								bank = bank - addyprice;
								$HL.println("Okay " + name + " You now live at " + addy + ".");
							
								//If user chooses yes, then list new property for user to choose from.
							}else if(input.equals("YES")) {
								$HL.println("Property three: ** Address: " + addy3 + " ** Rental Price: " + addy3price); 
								$HL.println("Is this your desired property? (yes because you said no to all other properties)");
								//Prompts user for input and breaks loop only if user enters yes 
								do {
									System.out.println("Input: ");
									input = wordsIn.nextLine();
									input = input.toUpperCase();
								}while(input.equals("YES") == false);
								//Stores user chosen outcomes in variables
								addy = addy3;
								addyprice = addy3price;
								//Changes the money left in bank account
								bank = bank - addyprice;
								$HL.println("Okay " + name + " You now live at " + addy +".");
							}
						}
				}
			
			}
								
			//Prints text to set more game context
			$HL.println("Okay " + name + ", I would like to introduce you to your smartphone.");
			$HL.println("The smartphone can only be activated when at home.");
			$HL.println("Using the smartphone, one can check music downloads, banking expenses and messages.");
			$HL.println("With this smartphone, one is also able to set up meetings with producers and purchase recording equipment.");
			$HL.println("The first thing you should do is buy some recording equipment. Use the smartphone to do this!");	
			$HL.println("Plese type in shopnow to view recording equipment.");
			//Imports the function sphone() from the class Smartphone_Assignment
			Smartphone_Assignment.sphone(); 
			//Prompts user for input and breaks loop only if user enters shopnow
			do {
				System.out.println("Input: ");
				input = wordsIn.nextLine();
				input = input.toUpperCase();
			}while(input.equals("SHOPNOW") == false);
			
			// Prints out information regarding recording equipment
			$HL.println("The JB50 recording equipment costs " + eqt1price + " dollars.");
			$HL.println("The 10YU recoridng equipment costs " + eqt2price + " dollars." );
			$HL.println("Which one would you like to purchase? (A for JB50/ B FOR 10YU)");
			//Prompts user for input and breaks loop only if user enters A or B
			do {
				System.out.println("Input: ");
				input = wordsIn.nextLine();
				input = input.toUpperCase();
			}while(input.equals("A") == false && input.equals("B") == false);
			//Checks if user input is A
			if(input.equals("A")) {
				//Edits the variable bank to showcase amount left in variable
				bank = bank - eqt1price;
				//stores the user chosen recording setup in variable
				rsetup = eqt2;
				//Prints out edited variables
				$HL.println("Your now have the " + rsetup + " recording setup.");
				$HL.println("You now have " + bank + "dollars in your bank account.");
			//Checks if user input is B
			}else if(input.equals("B")) {
				//Edits the variable bank to showcase amount left in variable
				bank = bank - eqt2price;
				//stores the user chosen recording setup in variable
				rsetup = eqt2;
				//Prints out edited variables
				$HL.println("Your now have the " + rsetup + " recording setup.");
				$HL.println("You now have " + bank + " dollars in your bank account.");
				// the num variable decides the users path in the game
				num = 1;
				} 
			
			//Prints text to console to advance plot
			$HL.println("So you have now bought your recording equipment.");
			$HL.println("Its now time to make your first album. The goal of this album is to allow producers and other artists hear your work");
			$HL.println("so they could potentially sign you or include you on a feature.");
			$HL.println("What would you like to call this album?");
			
			//Prompts user for String input 
			System.out.println("Input: ");
			input = wordsIn.nextLine();
			input = input.toUpperCase();
			//Stores user name of album to variable
			albumname = input;
			
			$HL.println("Okay so the title of your album is: " + albumname + ".");
			
			$HL.println("How many songs would you like on your album? (Please enter an integer)");
			
			$HL.println("Input: ");
			
			//Integer user input 
			numinput = numsIn.nextInt();
			
			//Sets the length of album to previous integer input
			albumnum = numinput;
			
			//Creates array to determine names of songs on the album
			String[] albumnums = new String[albumnum];
			
			$HL.println("Please enter the title of each song you would like on the album: ");
			
			//Counted loop based on the length of previous created array
			for(int i = 0; i < albumnums.length; i = i + 1) {
				//Prompts user for input certain number of times for a string
				//The Strings that the user inputs will be the names of songs on album
				$HL.println("Input:");
				albumnums[i] = wordsIn.nextLine();
						
			}
			
			$HL.println("Here are all of your songs on the album: ");
			//Uses the toString method to print the songs listed on the albumnums array
			$HL.println(Arrays.toString(albumnums));
			
			$HL.println("I have just sent your album to every producer in town. Waiting for a call back.");
			
			$HL.println(".");
			//Using pauses for dramatic effect
			$HL.pause(p);
			
			$HL.println(".");
			
			$HL.pause(p);
			
			$HL.println(".");
			
			$HL.pause(p);
			
			$HL.println(".");
			
			$HL.pause(p);
			
			$HL.println(".");
			
			$HL.pause(p);
			
			$HL.println("RING RING");
			
			$HL.pause(p);
			
			$HL.println("RING RING"); 
			//Using num variable to determine users fate
			//If num does not = 1, the user gets a different outcome
			if(num != 1) {
				$HL.println("Hello " + name + " this is Lil Pump calling, I heard your album " + albumname + ".");
			
				$HL.println("It was fire!");
			
				$HL.println("I was wondering if you would want to do a collab with me and Drake?");
			
				$HL.println("What do you say?(yes/no)");
				//Prompts user for input and breaks loop only if user enters yes or no
				do {
					System.out.println("Input: ");
					input = wordsIn.nextLine();
					input = input.toUpperCase();
				}while(input.equals("YES") == false && input.equals("NO") == false);
				
				//Checks to see if user inputs yes
				if(input.equals("YES")) {
					$HL.println("Alright sweet. 'Bout to be litty.");
					$HL.println("**Congrats, you have a chance to make it as an artist!**");
				//check to see if the user inputs no 
				}else {
					$HL.println("Thats too bad man. Maybe next time");
					$HL.println("**Hangs up phone**");
					
					
					$HL.println("Sorry " + name + ", I will look for more offers.");
					
					$HL.println("**After three months you get no offers and your manager leaves you**");
			
				}
			
			//checks if num = 1 to determine outome of user
			}else {
				
				$HL.println("Hi " + name + ", this is Lance Fletcher from Atlantic Records.");
				$HL.println("Heard your album yesterday and it was blessed");
				$HL.println("I would like to offer you a record deal with us.");
				$HL.println("We believe that you could be the next big star here.");
				$HL.println("The offer comes with a 50,000.0 dollar signing bonus.");
				$HL.println("Do you accept?(yes/no)");
				//Prompts user for input and breaks loop only if user enters yes or no
				do {
					System.out.println("Input: ");
					input = wordsIn.nextLine();
					input = input.toUpperCase();
				}while(input.equals("YES") == false && input.equals("NO") == false);
				//check to see if the user inputs yes
				if(input.equals("YES")) {
					$HL.println("Okay thank you. I will send over the paperwork shortly.");
					$HL.println("**Congrats, you have made it as an artist!**");
				
				}else {
					$HL.println("Well that is truly a shame. Have a good day.");
					
					$HL.println("**Hangs up phone**");
					
					$HL.println("Sorry " + name + ", I will look for more offers.");
					
					$HL.println("**After three months you get no offers and your manager leaves you.**");
					
				}
					
			}	
				
		}
			
			
			
			/**
			 * NOTE:
			 * FOR THIS SECTION OF THE CODE, THE STRUCTURE AND FORMAT IS THE SAME AS ABOVE EXCEPT FOR THE WORD FEMALE
			 * THIS IS WHY THERE ARE NOT COMMENTS BELOW
			 * PLEASE REFER TO COMMENTS ABOVE ABOUT THE CODE STRUCTURE
			 */
			
		 else {
			
			System.out.println("Okay so you have chosen to be a female");
			System.out.println("What do you want your name to be?");
		
			System.out.println("Input: ");
			input = wordsIn.nextLine();
			input = input.toUpperCase();
			name = input;
			
		
			
			System.out.println("Hello " + name + ", thank you for choosing a name!");
			
			$HL.println("Okay " + name + ", you currently have " + bank + " dollars in your bank.");
			
			$HL.println("You must first choose a an apartment to rent.");
			
			$HL.println("***NOTE****");
			
			$HL.println("Helpful tip: You must choose wisely where you live.");
			
			
			
			$HL.println("By renting a more expensive place, you will save money on fuel and will be able to meet producers and managers much more frequently.");
			
			$HL.println("but, you will have less money to spend on recording equipment which will hurt your chances of being discovered..");
			
		
			
			$HL.println("By renting a cheaper place, you lose more monney on fuel and are unable to meet producers/managers more frequently.");
			
			$HL.println("But you are able to spend much more on recording equipment.");
			
			$HL.println("Property one: ** Address: " + addy1 + " ** Rental Price: " + addy1price);
			
			$HL.println("Is this your desired property? (yes or no)");
			
			do {
				System.out.println("Input: ");
				input = wordsIn.nextLine();
				input = input.toUpperCase();
			
			}while(input.equals("YES") == false && input.equals("NO")== false);
			
			if(input.equals("YES")) {
				addy = addy1;
				addyprice = addy1price;
				$HL.println("Okay " + name + " You now live at " + addy + ".");
			}
			else if(input.equals("NO")) {
				
				$HL.println("Are you sure? ? (If you type no then you will get the first property)");	
				do {
					System.out.println("Input: ");
					input = wordsIn.nextLine();
					input = input.toUpperCase();
				}while(input.equals("YES") == false && input.equals("NO")== false);
			
			
				if(input.equals("NO")) {
					addy = addy1;
					addyprice = addy1price;
					$HL.println("Okay " + name + " You now live at " + addy + ".");
				}
			
				else if(input.equals("YES")) {
				
					$HL.println("Property two: ** Address: " + addy2 + " ** Rental Price: " + addy2price);	
					$HL.println("Is this your desired property? (yes or no)");
					
					do {
						System.out.println("Input: ");
						input = wordsIn.nextLine();
						input = input.toUpperCase();
					}while(input.equals("YES") == false && input.equals("NO")== false);

					if(input.equals("YES")) {
						addy = addy2;
						addyprice = addy2price;
						$HL.println("Okay " + name + " You now live at " + addy + ".");
					
					}else if(input.equals("NO")){
						$HL.println("Are you sure? ? (If you type no then you will get the first property)");
						do {
							System.out.println("Input: ");
							input = wordsIn.nextLine();
							input = input.toUpperCase();
						}while(input.equals("YES") == false && input.equals("NO") == false);
				
							if(input.equals("NO")) {
								addy = addy2;
								addyprice = addy2price;
								$HL.println("Okay " + name + " You now live at " + addy + ".");
				
							}else if(input.equals("YES")) {
								$HL.println("Property three: ** Address: " + addy3 + " ** Rental Price: " + addy3price); 
								$HL.println("Is this your desired property? (yes or no)");
								do {
									System.out.println("Input: ");
									input = wordsIn.nextLine();
									input = input.toUpperCase();
								}while(input.equals("YES") == false);
					
								addy = addy3;
								addyprice = addy3price;
								$HL.println("Okay " + name + " You now live at " + addy + ".");
							}
						}
				}
			
			}
								
			$HL.println("Okay " + name + ", I would like to introduce you to your smartphone.");
			$HL.println("The smartphone can only be activated when at home.");
			$HL.println("Using the smartphone, one can check music downloads, banking expenses and messages.");
			$HL.println("With this smartphone, one is also able to set up meetings with producers and purchase recording equipment.");
			$HL.println("The first thing you should do is buy some recording equipment. Use the smartphone to do this!");	
			$HL.println("Plese type in shopnow to view recording equipment.");
			
			Smartphone_Assignment.sphone();
			
			do {
				System.out.println("Input: ");
				input = wordsIn.nextLine();
				input = input.toUpperCase();
			}while(input.equals("SHOPNOW") == false);
			
		
			if(input.equals("SHOPNOW")) {
				$HL.print("The JB50 recording equipment costs " + eqt1price + " dollars.");
				$HL.println("The 10YU recoridng equipment costs " + eqt2price + " dollars." );
				$HL.println("Which one would you like to purchase? (A for JB50/ B FOR 10YU)");
				do {
					System.out.println("Input: ");
					input = wordsIn.nextLine();
					input = input.toUpperCase();
				}while(input.equals("A") == false && input.equals("B") == false);
				if(input.equals("A")) {
					bank = bank - eqt1price;
					rsetup = eqt2;
					$HL.println("Your now have the " + rsetup + " recording setup.");
					$HL.println("You now have " + bank + " dollars in your bank account.");
				}else if(input.equals("B")) {
					bank = bank - eqt2price;
					rsetup = eqt2;
					$HL.println("Your now have the " + rsetup + " recording setup.");
					$HL.println("You now have " + bank + " dollars in your bank account.");
					num = 1;
				} 
			
			}
			
			$HL.println("So you have now bought your recording equipment.");
			$HL.println("Its now time to make your first album. The goal of this album is to allow producers and other artists hear your work");
			$HL.println("so they could potentially sign you or include you on a feature.");
			$HL.println("What would you like to call this album?");
			
			System.out.println("Input: ");
			input = wordsIn.nextLine();
			input = input.toUpperCase();
			albumname = input;
			
			$HL.println("Okay so the title of your album is: " + albumname + ".");
			
			$HL.println("How many songs would you like on your album. (Please enter an integer)");
			
			$HL.println("Input: ");
			
			numinput = numsIn.nextInt();
			
			albumnum = numinput;
			
			String[] albumnums = new String[albumnum];
			
			$HL.println("Please enter the title of each song you would like on the album: ");
			
			for(int i = 0; i < albumnum; i = i + 1) {
				$HL.println("Input:");
				//input = wordsIn.nextLine();
				albumnums[i] = wordsIn.nextLine();
						
			}
			
			$HL.println("Here are all of your songs on the album: ");
			$HL.println(Arrays.toString(albumnums));
			
			$HL.println("I have just sent your album to every producer in town. Waiting for a call back.");
			
			$HL.println(".");
			
			$HL.pause(p);
			
			$HL.println(".");
			
			$HL.pause(p);
			
			$HL.println(".");
			
			$HL.pause(p);
			
			$HL.println(".");
			
			$HL.pause(p);
			
			$HL.println(".");
			
			$HL.pause(p);
			
			$HL.println("RING RING");
			
			$HL.pause(p);
			
			$HL.println("RING RING"); 
			
			$HL.pause(p);
			
			
			if(num != 1) {
				$HL.println("Hello " + name + " this is Lil Pump calling, I heard your album " + albumname + ".");
			
				$HL.println("It was fire!");
			
				$HL.println("I was wondering if you want to do a collab with me and Drake");
			
				$HL.println("What do you say?(yes/no)");
				do {
					System.out.println("Input: ");
					input = wordsIn.nextLine();
					input = input.toUpperCase();
				}while(input.equals("YES") == false && input.equals("NO") == false);
				if(input.equals("YES")) {
					$HL.println("Alright sweet. 'Bout to be litty.");
					$HL.println("**Congrats, you have a chance to make it as an artist!**");
				}else if(input.equals("NO")) {
					$HL.println("Thats too bad man. Maybe next time.");
					$HL.println("**Hangs up phone**");
					
					
					$HL.println("Sorry " + name + ", I will look for more offers.");
					
					$HL.println("**After three months you get no offers and your manager leaves you**");
				}
				
			}else {
				
				$HL.println("Hi " + name + ", this is Lance Fletcher from Atlantic Recors.");
				$HL.println("Heard your album yesterday and it was blessed!");
				$HL.println("I would like to offer you a record deal with us.");
				$HL.println("We believe that you could be the next big star here.");
				$HL.println("The offer comes with a 50,000.0 dollar signing bonus.");
				$HL.println("Do you accept?(yes/no)");
				do {
					System.out.println("Input: ");
					input = wordsIn.nextLine();
					input = input.toUpperCase();
				}while(input.equals("YES") == false && input.equals("NO") == false);
				if(input.equals("YES")) {
					$HL.println("Okay thank you. I will send over the paperwork shortly.");
					$HL.println("**Congrats, you have made it as an artist!**");
				}else if(input.equals("NO")) {
					$HL.println("Well that is truly a shame. Have a good day.");
					
					$HL.println("**Hangs up phone**");
					
					$HL.println("Sorry " + name + ", I will look for more offers.");
					
					$HL.println("**After three months you get no offers and your manager leaves you**");
					
				}
					
		}	
		
	}
			
			
			
		
		
		System.out.println("GAME OVER");
			
			return;
		
		
		
	
	}// end game

	public static void main(String[] args) {
		
		Scanner wordsIn = new Scanner(System.in);
		System.out.println("Start Main");
		String input = "";
	
		do {	
			game();
			System.out.println("Play again? (YES/NO)");
			System.out.println("Input: ");
		
			input = wordsIn.nextLine();
			input = input.toUpperCase();
		
		} while (input.equals("YES"));
			
		System.out.println("End Main");
	}	

}
