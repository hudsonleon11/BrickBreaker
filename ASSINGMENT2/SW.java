import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 * @author hudson.leon
 * 
 * Thank you for taking an interest in Rapper Central.
 * In this class, we create the initial window in which the user
 * deposits information about themselves.
 * Make sure to run the whole 
 * game from this class.
 *
 * Hudson Leon - April 2018 
 *
 * 
 */

public class SW {

	//Fields - Attributes
	//GUI RELATED
	private JFrame frame = new JFrame("Rapper Central by Hudson Leon");
	private JTextField genderField = new JTextField();
	private JTextField nameField = new JTextField();
	private JTextField ageField = new JTextField();
	private JTextField originField = new JTextField();
	private JButton submitEverything = new JButton("Start Game!");
	private JLabel submitAge1 = new JLabel("Please input your age here (number):");
	private JLabel submitGender1 = new JLabel("Please input your gender here:");
	private JLabel submitName1 = new JLabel("Please input your name here:");
	private String input = "";
	public static String gender = "";
	public static String age = "";
	public static String name = "";
	
	
	private JPanel panel = new JPanel() {
		
		
		
		
		 @Override
		 public void paint(Graphics g) {
			
			super.paintComponent(g);
	       
			//SETS THE GRAPHICS OF THE FRAME
			g.setFont(new Font("Arial", Font.BOLD, 20)); 
			g.drawString("Rapper Central", 0, 20);
			g.drawString("By Hudson Leon", 0, 45);
			g.drawString("Fill out the information", 0, 70);
			g.drawString("below before you start.", 0, 95);
					}
	};

	// LOGIC FOR SUBMIT BUTTON AND ALL DIFFERENT TEXT FIELDS
	private ActionListener action1 = new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			System.out.println("BUTTON PRESSED");
			
			age = ageField.getText();
			//age = age.toUpperCase();
			name = nameField.getText();
			name = name.toUpperCase();
			gender = genderField.getText();
			gender = gender.toUpperCase();
			
			//GETS RID OF THE INTIAL FRAME
			frame.dispose(); 
			
			//OPENS THE MAIN CLASS TO START (REFERENCE)
			Game2_HL game = new Game2_HL(); 
			
			
			//System.out.print(age);
			//System.out.print(gender);
			//System.out.print(name);
			
			
		}	
			
	};
	
	//CONSTRUCTORS
	public SW() {

		//SETS LAYOUT OF FRAME
		frame.getContentPane().setBackground(Color.GREEN);

		frame.setLocation(100,100);
		frame.setSize(1000, 1000);
		frame.setLayout(new GridBagLayout());
		
		
		// ADDS THE PANEL TO FRAME
		GridBagConstraints c0 = new GridBagConstraints();
		c0.gridx = 0;  
		c0.gridy = 0;
		c0.gridwidth = 2;
		panel.setPreferredSize(new Dimension(300,100));
		panel.setBackground(Color.GREEN);  
		frame.add(panel, c0);
		
		
		//ADDS THE NAME LABEL TO THE LAYOUT
		GridBagConstraints c1 = new GridBagConstraints();
		c1.gridx = 0;  
		c1.gridy = 1;
		frame.add(submitName1,c1);
		
		
		//ADDS THE TEXT FIELD FOR GETTING THE NAME TO FRAME
		GridBagConstraints c2 = new GridBagConstraints();
		c2.gridx = 1;  
		c2.gridy = 1;
		frame.add(nameField, c2);
		nameField.setColumns(30);
		
		
		//ADDS THE GENDER LABEL TO THE LAYOUT
		GridBagConstraints c3 = new GridBagConstraints();
		c3.gridx = 0;  
		c3.gridy = 2;
		frame.add(submitGender1,c3);
		
		
		// ADDS THE TEXT FIELD FOR GETTING THE GENDER TO FRAME
		GridBagConstraints c4 = new GridBagConstraints();
		c4.gridx = 1;  
		c4.gridy = 2;
		frame.add(genderField, c4);
		genderField.setColumns(30);
	
		//ADDS THE AGE LABEL TO THE LAYOUT
		GridBagConstraints c5 = new GridBagConstraints();
		c5.gridx = 0;  
		c5.gridy = 3;
		frame.add(submitAge1, c5);
		
		// ADDS THE TEXT FIELD FOR GETTING THE AGE TO FRAME
		GridBagConstraints c6 = new GridBagConstraints();
		c6.gridx = 1;  
		c6.gridy = 3;
		frame.add(ageField, c6);
		ageField.setColumns(30);
		
		// ADDS THE SUBMIT BUTTON
		GridBagConstraints c7 = new GridBagConstraints();
		c7.gridx = 0;  
		c7.gridy = 4;
		c7.gridwidth = 2;
		submitEverything.addActionListener(action1);
		frame.add(submitEverything, c7);
		
		
		
		//FINALIZE FRAME SETUP
		frame.pack(); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		
		
		
		
		
	}
	
	
	//Methods - Behaviours
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SW game = new SW();
	}
	
}
