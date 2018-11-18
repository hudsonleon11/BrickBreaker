import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.StandardWatchEventKinds;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 * 
 * 
 * @author hudson.leon
 * 
 * 
 * Thank you for taking an interest in Rapper Central.
 * This is the main frame where most of the game runs.
 * If you want to run the whole game, please run it through SW.java
 * as this will only run part of the game.
 * 
 * Hudson Leon - April 2018
 *
 *
 */


public class Game2_HL extends JFrame  {

	
	
	//Fields - Attributes
	//GUI RELATED

	private JFrame frame = new JFrame("Rapper Central by Hudson Leon");
	private BufferedImage image;
	private JTextArea display = new JTextArea();
	private JTextArea textArea = new JTextArea();
	private JTextArea textArea2 = new JTextArea();
	private JTextField submitField = new JTextField();
	private JTextField submitField1 = new JTextField();
	private JButton submitButton = new JButton("Submit");
	private JButton music = new JButton("Music");
	private JButton messages = new JButton("Messages");
	private JButton banking = new JButton("Banking");
	private JButton contacts = new JButton("Contacts and Info");
	private JButton album = new JButton("Create Album");
	private JLabel label1 = new JLabel();
	private String input = "";
	private JPanel p1 = new JPanel();
	private String gender = SW.gender;
	private String name = SW.name;
	private String age = SW.age;
	private JScrollPane scrollpanel;
	public static double bank = 5000.0;
	private int count = 0;
	private int mescount = 0;
	private int muscount = 0;
	private String[] album11 = AC.fieldstr; 
	private int counter = AC.counter;
	private boolean state2 = AC.state2;
	public static String addy1 = "";
	public static String studio = "";
	
	
	
	private JPanel panel = new JPanel() {
	
	
		
			
		 @Override
		 public void paint(Graphics g) {
			
			super.paintComponent(g);
	      
			int width = panel.getWidth();
			int height = panel.getHeight();
			
			
		}
	};
	
	//***** In this function we are able display an error message to the user if the input is invalid
	public static JTextArea errmes(JTextArea b) {
		b.append("Please input a valid option"+ "\n");
		return b;
	}
	//***** In this function we are able to set the value of the bank field.
	public static double setbank(double x) {
		bank = x;
		return x;
	}
	
	private ActionListener action1 = new ActionListener() {
		//SETS THE BEHAVIOUR FOR SUBMIT BUTTON AND SUBMIT FIELD
		public void actionPerformed(ActionEvent e) {
			System.out.println("BUTTON PRESSED");
			input = submitField.getText();
			Game22_HL2.resettextfield(submitField);
			textArea.append(input + "\n");
			input.toUpperCase();
			
			//LOGIC FOR SUBMIT FIELD/ SUBMIT BUTTON
			//--------------------HOUSE OPTION 1 AND RESULT----------------------
			if(input.equals("1") && count == 0) {
				setbank(bank-4000.0);
				//bank = bank - 4000.0;
				addy1 = addy1 + "14 Douglas Crescent";
				count = count + 1;
				textArea.append("Thank you for purchasing " + addy1 + "." + "\n");
				textArea.append("Now, it is time to invest in your music career!"+ "\n");
				textArea.append(" "+ "\n");
				textArea.append("There are many studios where you can produce music."+ "\n");
				textArea.append(" "+ "\n");
				textArea.append("There are three options:"+ "\n");
				textArea.append(" "+ "\n");
				textArea.append("1: Hudson's Flexing Studio (1000.0 for an album)"+ "\n");
				textArea.append(" "+ "\n");
				textArea.append("2: Mueez's MoneyMan Studio (750.0 for an album)"+ "\n");
				textArea.append(" "+ "\n");
				textArea.append("3: Noah's BrokeMan Studio (500.0 for an album)"+ "\n");
				textArea.append(" "+ "\n");
				textArea.append("Which option would you like? (1,2 or 3) "+ "\n");
				textArea.append(" " + "\n");
			
			
			
			
			}
			//--------------------HOUSE OPTION 2 AND RESULT----------------------
			else if(input.equals("2") && count  == 0) {
				setbank(bank - 3000.0);
				//bank = bank - 3000.0;
				addy1 = addy1 + "30 Ridge Drive";
				count = count + 1;
				textArea.append("Thank you for purchasing " + addy1 + "." + "\n");
				textArea.append(" "+ "\n");
				//QUESTION 2 LOGIC
				textArea.append("Now, it is time to invest in your music career!"+ "\n");
				textArea.append(" "+ "\n");
				textArea.append("There are many studios where you can produce music."+ "\n");
				textArea.append(" "+ "\n");
				textArea.append("There are three options:"+ "\n");
				textArea.append(" "+ "\n");
				textArea.append("1: Hudson's Flexing Studio (1000.0 for an album)"+ "\n");
				textArea.append(" "+ "\n");
				textArea.append("2: Mueez's MoneyMan Studio (750.0 for an album)"+ "\n");
				textArea.append(" "+ "\n");
				textArea.append("3: Noah's BrokeMan Studio (500.0 for an album)"+ "\n");
				textArea.append(" "+ "\n");
				textArea.append("Which option would you like? (1,2 or 3) "+ "\n");
				textArea.append(" " + "\n");
					
				
			}
			//--------------------HOUSE OPTION 3 AND RESULT----------------------
			else if(input.equals("3") && count  == 0) {
				//bank = bank - 2000.0;
				setbank(bank - 2000.0);
				addy1 = addy1 + "8 Belper Court";
				count = count + 1;
				textArea.append("Thank you for purchasing" + addy1 + "."  + "\n");
				textArea.append("Now, it is time to invest in your music career!"+ "\n");
				textArea.append(" "+ "\n");
				textArea.append("There are many studios where you can produce music."+ "\n");
				textArea.append(" "+ "\n");
				textArea.append("There are three options:"+ "\n");
				textArea.append(" "+ "\n");
				textArea.append("1: Hudson's Flexing Studio (1000.0 for an album)"+ "\n");
				textArea.append(" "+ "\n");
				textArea.append("2: Mueez's MoneyMan Studio (750.0 for an album)"+ "\n");
				textArea.append(" "+ "\n");
				textArea.append("3: Noah's BrokeMan Studio (500.0 for an album)"+ "\n");
				textArea.append(" "+ "\n");
				textArea.append("Which option would you like? (1,2 or 3) "+ "\n");
				textArea.append(" " + "\n");
			}
			
			
			//--------------------STUDIO OPTION 1 AND RESULT----------------------
			else if(input.equals("1") && count == 1) {
				//bank = bank - 1000.0;
				setbank(bank - 1000.0);
				studio = studio + "Hudson's Flexing Studio";
				count = count + 1;
				textArea.append("You will now be recording your first album at " + studio + "." + "\n");
				textArea.append("Please click the button below the submit button to record your first album!");
			
			
			}
			//--------------------STUDIO OPTION 2 AND RESULT----------------------
			else if(input.equals("2") && count == 1) {
				//bank = bank - 750.0;
				setbank(bank - 750.0);
				studio = studio + "Mueez's MoneyMan Studio";
				count = count + 1;
				textArea.append("You will now be recording your first album at " + studio + "." + "\n");
				textArea.append("Please click the button below the submit button to record your first album!");
				System.out.println(counter);
				
				
			}

			
			//--------------------STUDIO OPTION 3 AND RESULT----------------------
			else if(input.equals("3") && count == 1) {
				//bank = bank - 500.0;
				setbank(bank - 500.0);
				studio = studio + "Noah's BrokeBoy Studio";
				count = count + 1;
				textArea.append("You will now be recording your first album at " + studio + "." + "\n");
				textArea.append("Please click the button below the submit button to record your first album!");
				
			}
			//--------------------DEFAULT----------------------
			else {
				errmes(textArea);
			}
			
		
			//System.out.println(input);
			
		}	
		
	
	};
	
	private ActionListener bank1  = new ActionListener() {
		//LOGIC FOR BANKING BUTTON
		public void actionPerformed(ActionEvent e) {
			Game22_HL2.resettextarea(textArea2);
			System.out.println("BUTTON PRESSED");
			textArea2.append("Welcome to your account!" + "\n");
			textArea2.append("" + "\n");
			textArea2.append("" + "\n");
			textArea2.append("" + "\n");
			textArea2.append("" + "\n");
			textArea2.append("You currently have " + bank  + "$" + "\n");
			textArea2.append("" + "\n");
			textArea2.append("" + "\n");
			textArea2.append("" + "\n");
			textArea2.append("" + "\n");
			textArea2.append("This account is owned by" + "\n");
			textArea2.append(name + "\n");

			
			
		}
		
	};

	//LOGIC FOR MESSAGES BUTTON
	private ActionListener messages1 = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Game22_HL2.resettextarea(textArea2);
			if(mescount == 0) {
				textArea2.append("You have " + mescount + " new messages." + "\n");
			}
			
		}
	
	};
	
	//LOGIC FOR MUSIC BUTTON
	private ActionListener music1 = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Game22_HL2.resettextarea(textArea2);
			if(muscount == 0) {
				textArea2.append("You have made " + muscount + " songs" + "\n");
				textArea2.append("" + "\n");
				textArea2.append("" + "\n");
				textArea2.append("" + "\n");
				textArea2.append("" + "\n");
				textArea2.append("" + "\n");
				textArea2.append("" + "\n");
				textArea2.append("Currently, " + "\n");
				textArea2.append("The hottest song is: " + "\n");
				textArea2.append("Hall of Fame by Top5.");
			
			}
			
		}
	};
	
	//LOGIC FOR CONTACTS AND INFORMATION BUTTONS
	private ActionListener contact1 = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Game22_HL2.resettextarea(textArea2);
			textArea2.append("Contacts: " + "\n");
			textArea2.append("Name: Manger Dave"+ "\n");
			textArea2.append("Number: 221-257-8765"+ "\n");
			textArea2.append("" + "\n");
			textArea2.append("" + "\n");
			textArea2.append("" + "\n");
			textArea2.append("" + "\n");
			textArea2.append("" + "\n");
			textArea2.append("Information: " + "\n");
			textArea2.append("Name: " + name + "\n");
			textArea2.append("Age: " + age + "\n");
			textArea2.append("Gender: " + gender + "\n");
			
		}
	
	};
	
	private ActionListener album1 = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
	
			AC game = new AC(); 
			frame.dispose();
			
		
		
		
		
		}
		
	};
	
	
	//Constructors
	public Game2_HL() {
		
		
		//SETS THE LAYOUT OF THE FRAME
		scrollpanel = new JScrollPane(textArea);
		frame.setLocation(100,100);
		frame.setSize(1000, 1000);
		frame.setLayout(new GridBagLayout());
		
		
		
		//CODE FOR FIRST TEXT AREA
		GridBagConstraints c6 = new GridBagConstraints();
		c6.gridx = 1;
		c6.gridy = 0;
		c6.gridwidth = 2;		
		frame.add(scrollpanel,c6);
		textArea.setWrapStyleWord(true);
		textArea.setRows(30);
		textArea.setColumns(49);
		textArea.getPreferredScrollableViewportSize();
		textArea.setEditable(false);
		
		
		// CODE FOR IMAGE ON PANEL
		
		// MAKE SURE TO EDIT THE PATH OF THE IMAGE OR ELSE THE CODE WILL NOT RUN
		label1.setIcon(new ImageIcon("/Users/hudson.leon/Desktop/hud.jpeg"));
		
		
		GridBagConstraints c1 = new GridBagConstraints();
		c1.gridx = 0;  
		c1.gridy = 5;
		//ADDS IMAGE ON THE PANEL
		p1.add(label1);
		frame.add(p1,c1);
		
		
		//CODE FOR SUBMIT BUTTON
		
		GridBagConstraints c2 = new GridBagConstraints();
		c2.gridx = 1; 
		c2.gridy = 2;
		c2.gridwidth = 1;
	
		
		
		c2.fill = GridBagConstraints.BOTH;
		submitButton.addActionListener(action1);
		frame.add(submitButton,c2);
		
		
		
		//CODE FOR SUMBISSION FIELD
		GridBagConstraints c3 = new GridBagConstraints();
		c3.gridx = 1; 
		c3.gridy = 1;
		submitField.setColumns(50);
		
		frame.add(submitField,c3);
		

	
		//CODE FOR SECOND TEXTAREA (PHONE)
		GridBagConstraints c5 = new GridBagConstraints();
		c5.gridx = 0;
		c5.gridy = 0;
		c5.anchor = GridBagConstraints.EAST;
		c5.fill = GridBagConstraints.BOTH;
		textArea2.setRows(30);
		textArea2.setColumns(15);
		textArea2.setEditable(false);
		frame.add(textArea2,c5);
		
		//CODE FOR BUTTON 1: MUSIC
		GridBagConstraints c4 = new GridBagConstraints();
		c4.gridx = 0;
		c4.gridy = 4;
		music.addActionListener(music1);
		frame.add(music,c4);
		
		//CODE FOR BUTTON 2: Messages
		GridBagConstraints c7 = new GridBagConstraints();
		c7.gridx = 0;
		c7.gridy = 1;
		messages.addActionListener(messages1);
		frame.add(messages,c7);
		
		//CODE FOR BUTTON 3: Banking
		GridBagConstraints c8 = new GridBagConstraints();
		c8.gridx = 0;
		c8.gridy = 2;
		banking.addActionListener(bank1);
		frame.add(banking,c8);
	
		//CODE FOR BUTTON 4: Contacts and Info
		GridBagConstraints c9 = new GridBagConstraints();
		c9.gridx = 0;
		c9.gridy = 3;
		contacts.addActionListener(contact1);
		frame.add(contacts,c9);
		
		//CODE FOR CREATE ALBUM BUTTON
		GridBagConstraints c10 = new GridBagConstraints();
		c10.gridx = 1;
		c10.gridy = 3;
		c10.fill = GridBagConstraints.BOTH;
		album.addActionListener(album1);
		frame.add(album,c10);
		
		
	
		//FINALIZE FRAME SETUP
		frame.pack(); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		
		// ALL TEXT THAT IS ADDED TO TEXTAREAS 
	
		textArea.setText("Hello " + name + "\n");
		textArea.append(" " + "\n");
		textArea.append("My name is Dave and I will be your manager (picture of me in the bottom left corner) who will"  + "\n");
		textArea.append("help guide you to have a succesful rap career!" + "\n");
		textArea.append(" " + "\n");
		textArea.append("In this game you take on the role of a hip hop artist." + "\n");
		textArea.append(" " + "\n");
		textArea.append("The goal of the game is to try and make one of your" + "\n");
		textArea.append("albums go platinum." + "\n");
		textArea.append(" " + "\n");
		textArea.append("You must do this by working your way to the top" + "\n");
		textArea.append("of the music industry." + "\n");
		textArea.append(" " + "\n");
		textArea.append("This can be done by creating relationships," + "\n");
		textArea.append("improving skills and taking risks." + "\n");
		textArea.append(" " + "\n");
		textArea.append("I would like to thank you for accepting me as your manager" + "\n");
		textArea.append(" " + "\n");
		textArea.append("I will help you as best as I can in order to get you to the top!" + "\n");
		textArea.append(" " + "\n");
		textArea.append("On the right, we have your phone - This is your main hub of information. Look out for it." + "\n");
		textArea.append(" " + "\n");
		textArea.append("Music - Here you can check on if the public likes your albums." + "\n");
		textArea.append(" " + "\n");
		textArea.append("Banking - Here you can check out how much money you have or how much you owe."+ "\n");
		textArea.append(" " + "\n");
		textArea.append("Contacts and Info- Here you can see your contacts and some of your information"+ "\n");
		textArea.append(" " + "\n");
		textArea.append("Messages - Here you can check if anybody has sent you a message" + "\n");
		textArea.append(" " + "\n");
		textArea.append("Lucky for you, I have decided to loan you $5000.00 dollars." + "\n");
		textArea.append(" " + "\n");
		textArea.append("You must pay the first month's rent on a house. There are three options: " + "\n");
		textArea.append(" " + "\n");
		textArea.append("1. 14 Douglas Crescent - $4000 a month" + "\n" );
		textArea.append(" " + "\n");
		textArea.append("2. 30 Ridge Drive - $3000 a month"+ "\n");
		textArea.append(" " + "\n");
		textArea.append("3. 8 Belper Court - $2000 a month"+ "\n");
		textArea.append(" " + "\n");
		textArea.append("Which option would you like? (1,2 or 3) "+ "\n");
		textArea.append(" " + "\n");
		textArea2.append("Welcome to your phone!" + "\n");
		textArea2.append("Use the buttons below!" + "\n");
		
	
	}
	
	
	//Methods - Behaviours

	public static void main(String[] args) {
		System.out.println("Test");
		Game2_HL game = new Game2_HL();
	}
}
