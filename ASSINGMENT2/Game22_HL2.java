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
import java.lang.reflect.Array;
import java.nio.file.StandardWatchEventKinds;
import java.util.Arrays;

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
 * This class is the SECOND PART of the main hub
 * This class was created as the only way where I could implement the user created album into the game
 * This has all of the same features that the old hub has and
 * has kept all of the data that was previously inputed
 * i.e. banking, address etc..
 * 
 * Hudson Leon - April 2018
 *
 *
 */


public class Game22_HL2 extends JFrame  {

	
	
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
	private JScrollPane scrollpanel2;
	public static double bank = Game2_HL.setbank(Game2_HL.bank);
	private int count = 0;
	private int mescount = 0;
	private int muscount = 0;
	private String[] album11 = AC.fieldstr; 
	private int counter = AC.counter;
	private boolean state2 = AC.state2;
	private String addy1 = Game2_HL.addy1;
	private String studio = Game2_HL.studio;
	private int randonum = (int)(Math.random()*10);
	private int randonum2 = (int)(Math.random()*10);
	private String randosong = album11[randonum];
	private String randosong2 = album11[randonum2];
	private boolean mstate = false;
	private int mcount = 0;
	
	
	
	private JPanel panel = new JPanel() {
	
	
		
			
		 @Override
		 public void paint(Graphics g) {
			
			super.paintComponent(g);
	      
			int width = panel.getWidth();
			int height = panel.getHeight();
			
			
		}
	};
	
	//***** In this function we are able to set the text area to have nothing in it.
	public static JTextArea resettextarea(JTextArea b) {
		b.setText("");
		return b;
	}
	//***** In this function we are able to set the text field to have nothing in it.
	public static JTextField resettextfield(JTextField b) {
		b.setText("");
		return b;
	}
	
	
	private ActionListener action1 = new ActionListener() {
		//SETS THE BEHAVIOUR FOR SUBMIT BUTTON AND SUBMIT FIELD
		public void actionPerformed(ActionEvent e) {
			$HL.println("BUTTON PRESSED");
			input = submitField.getText();
			resettextfield(submitField);
			textArea.append(input + "\n");
			input.toUpperCase();
			
			//--------------------OPTION 1 AND RESULT----------------------
			if(input.equals("1") && count == 0) {
				
				mcount = mcount + 1;
				count =  count + 1;
				textArea.append("Okay I will add Trippie to the song." + "\n");
				textArea.append(" " + "\n");
				textArea.append(" " + "\n");
				textArea.append("I have just released the song with his part added."+ "\n");
				textArea.append(" " + "\n");
				textArea.append("In 3 days I will let you now how the song is doing." + "\n");
				textArea.append(" " + "\n");
				textArea.append(" " + "\n");
				textArea.append(" " + "\n");
				textArea.append(" " + "\n");
				textArea.append("***Three Days Later****" + "\n");
				textArea.append(" " + "\n");
				textArea.append(" " + "\n");
				textArea.append("After letting the song sit for a bit, the numbers came back." + "\n");
				textArea.append(" " + "\n");
				textArea.append(" " + "\n");
				textArea.append("Your song is currently number 3 on the charts!"+ "\n");
				textArea.append(" " + "\n");
				textArea.append("Not bad..." + "\n");
				textArea.append(" " + "\n");
				textArea.append("GAME OVER");
			
			}	
			//--------------------OPTION 2 AND RESULT----------------------
			else if(input.equals("2") && count == 0) {
				
				count = count + 1;
				mcount = mcount + 1;
				mstate = true;
				textArea.append("Okay I will add Top5 to the song." + "\n");
				textArea.append(" " + "\n");
				textArea.append(" " + "\n");
				textArea.append("I have just released the song with his part added."+ "\n");
				textArea.append(" " + "\n");
				textArea.append("In 3 days I will let you now how the song is doing." + "\n");
				//$HL.pause(3000);
				textArea.append(" " + "\n");
				textArea.append(" " + "\n");
				textArea.append(" " + "\n");
				textArea.append(" " + "\n");
				textArea.append("***Three Days Later****" + "\n");
				textArea.append(" " + "\n");
				textArea.append(" " + "\n");
				textArea.append("After letting the song sit for a bit, the numbers came back." + "\n");
				textArea.append(" " + "\n");
				textArea.append(" " + "\n");
				textArea.append("Your song is currently number 1 on the charts!"+ "\n");
				textArea.append(" " + "\n");
				textArea.append("THATS AWESOME!!!!" + "\n");
				textArea.append(" " + "\n");
				textArea.append("GAME OVER");	
			}
			//--------------------DEFAULT----------------------
			else {
				textArea.append("Please enter a valid input." + "\n");
				textArea.append(" " + "\n");
			}
		
		}
	};
	
	private ActionListener bank1  = new ActionListener() {
		//LOGIC FOR BANKING BUTTON
		public void actionPerformed(ActionEvent e) {
			textArea2.setText("");
			System.out.println("BUTTON PRESSED");
			textArea2.append("Welcome to your account!" + "\n");
			textArea2.append("" + "\n");
			textArea2.append("" + "\n");
			textArea2.append("" + "\n");
			textArea2.append("" + "\n");
			textArea2.append("You currently have $" + bank  + "\n");
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
			resettextarea(textArea2);
			textArea2.append("You have " + mescount + " new messages." + "\n");
			
			textArea2.append("" + "\n");
				
				textArea2.append("FIRST NEW MESSGAE: " + "\n");
				textArea2.append("Hey " + name + "\n");
				textArea2.append("It's the hottest"  + "\n");
				textArea2.append("rapper in Toronto," + "\n");
				textArea2.append("Top5." + "\n" );
				textArea2.append("Just took a listen to your first album. "+ "\n");
				textArea2.append(" " + "\n");
				textArea2.append("That was straight heat."+ "\n");
				textArea2.append("I want to be featured on "+ "\n");
				textArea2.append(randosong2 + "\n");
				textArea2.append("I'll send Dave the details. " + "\n");
				textArea2.append(" " + "\n");
				textArea2.append(" " + "\n");
				textArea2.append(" " + "\n");
				textArea2.append(" " + "\n");
				textArea2.append(" " + "\n");
				textArea2.append("SECOND NEW MESSGAE: " + "\n");
				textArea2.append("Yo " + name + ", this is Trippie Redd" + "\n");
				textArea2.append("I thought that your album was hype!");
				textArea2.append("I want to be featured on "+ "\n");
				textArea2.append(randosong2 + "\n");
				textArea2.append("I'll send Dave the details. " + "\n");
				
		
			
		}
	
	};
	
	//LOGIC FOR MUSIC BUTTON
	private ActionListener music1 = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			resettextarea(textArea2);
			textArea2.append("You have made " + muscount + " songs" + "\n");
			textArea2.append("" + "\n");
			textArea2.append("" + "\n");
			textArea2.append("SONG CHARTS " + "\n");
			textArea2.append("Bap Bap Bap by Top5" + "\n");
			textArea2.append("Hall of Fame by Top." + "\n");
			textArea2.append("Up by Nav"+ "\n");
			textArea2.append("Reminder by The Weekend"+ "\n");
			textArea2.append(randosong + " by " + name + "\n");
			
			if(mstate == false && mcount == 1) {
				resettextarea(textArea2);
				textArea2.append("You have made " + muscount + " songs" + "\n");
				textArea2.append("" + "\n");
				textArea2.append("" + "\n");
				textArea2.append("SONG CHARTS " + "\n");
				textArea2.append("Bap Bap Bap by Top5" + "\n");
				textArea2.append("Hall of Fame by Top5." + "\n");
				textArea2.append(randosong2 + "(feat. Top5) by " + name + "\n");
				textArea2.append("Up by Nav"+ "\n");
				textArea2.append(randosong + " by " + name + "\n");
				
			}
			else if(mstate == true && mcount == 1) {
				resettextarea(textArea2);
				textArea2.append("You have made " + muscount + " songs" + "\n");
				textArea2.append("" + "\n");
				textArea2.append("" + "\n");
				textArea2.append("SONG CHARTS " + "\n");
				textArea2.append(randosong2 + "(feat. Top5) by " + name + "\n");
				textArea2.append("Bap Bap Bap by Top5" + "\n");
				textArea2.append("Hall of Fame by Top." + "\n");
				textArea2.append("Up by Nav"+ "\n");
				textArea2.append(randosong + " by " + name + "\n");
				}
		
		
				
				
			
		}	
	};
	
	//LOGIC FOR CONTACTS AND INFORMATION BUTTONS
	private ActionListener contact1 = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			resettextarea(textArea2);
			textArea2.append("Contacts: " + "\n");
			textArea2.append("Name: Manger Dave"+ "\n");
			textArea2.append("Number: 221-257-8765"+ "\n");
			textArea2.append("" + "\n");
			textArea2.append("Name: Trippie Redd"+ "\n");
			textArea2.append("Number: 221-137-5114"+ "\n");
			textArea2.append("" + "\n");
			textArea2.append("Name: Top5"+ "\n");
			textArea2.append("Number: 221-483-2975"+ "\n");
			textArea2.append("" + "\n");
			
			
			textArea2.append("" + "\n");
			textArea2.append("" + "\n");
			
			
			textArea2.append("Your Infofrmation: " + "\n");
			textArea2.append("Name: " + name + "\n");
			textArea2.append("Age: " + age + "\n");
			textArea2.append("Gender: " + gender + "\n");
			
		}
	
	};
	

	
	
	//Constructors
	public Game22_HL2() {
		
		
		//SETS THE LAYOUT OF THE FRAME
		
		scrollpanel = new JScrollPane(textArea);
		scrollpanel2 = new JScrollPane(textArea2);
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
		frame.add(scrollpanel2,c5);
		
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
		
	
		
	
		//FINALIZE FRAME SETUP
		frame.pack(); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		
		// ----------------------ALL TEXT THAT IS ADDED TO TEXTAREAS --------------------------
		System.out.println(addy1);
		textArea2.append("Welcome to your phone!" + "\n");
		textArea2.append("Use the buttons below!" + "\n");
		textArea.append("Alright, your album has been created, here it is: " + "\n" );
		textArea.append("" + "\n" );

		for(int i = 0; i < album11.length; i = i + 1) {
			textArea.append(album11[i] + "\n");
		}
		
		//$HL.pause(1000);
		mescount = mescount + 2;
		muscount = muscount + 10;
		
		textArea.append(" " + "\n");
		textArea.append("Alright, I will be putting your album online." + "\n");
		textArea.append(" " + "\n");
		textArea.append("I will tell you how well we did in 7 days. " + "\n");
		textArea.append(" " + "\n");
		textArea.append(" " + "\n");
		textArea.append(" " + "\n");
		//$HL.pause(5000);
		
		textArea.append("***** 7 DAYS LATER ******" + "\n");
		textArea.append(" " + "\n");
		textArea.append(" " + "\n");
		textArea.append("Hey " + name + ", your song" + "\n");
		textArea.append(randosong + "\n");
		textArea.append(" is on fire!!" + "\n");
		textArea.append(" " + "\n");
		textArea.append("It's currently the 5th most popular song." + "\n");
		textArea.append("\n");
		textArea.append(" " + "\n");
		textArea.append("Watch out for your phone, I hear people are interested in you!" + "\n");
		textArea.append(" " + "\n");
		
		textArea2.setText("");
		textArea2.append("*******New Message" + "\n");
		textArea2.append("" + "\n" );
		
		
	//	$HL.pause(2000);
		textArea2.append("*******New Message" + "\n");
		textArea2.append("" + "\n" );
		//$HL.pause(10000);
		
		textArea.append("Okay " + name + ", You have two offers:  " + "\n");
		textArea.append(" " + "\n");
		textArea.append("Check your messages on your phone for more details." + "\n");
		textArea.append(" " + "\n");
		textArea.append("One from Trippie Redd (1) and one from Top5 (2)" + "\n");
		textArea.append(" " + "\n");
		textArea.append("You can only accept one offer." +"\n");
		textArea.append(" " + "\n");
		textArea.append("Please input either 1 (Trippie Redd) or 2 (Top5)" + "\n");
	
		
		
		
		
		
		
		
		
		
		
	}
	
	
	//Methods - Behaviours

	public static void main(String[] args) {
		Game22_HL2 game = new Game22_HL2();
		}
	}
