import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * 
 * @author hudson.leon
 * This is the class where the user can create their own album via the GUI
 * Each album must have 10 songs on it 
 * Once the album is complete, the user can click the button to return to the main hub!
 *
 *
 *Hudson Leon
 *
 *April 2018
 */
public class AC {
	//Fields - Attributes
		//GUI RELATED
	private JFrame frame = new JFrame("Album Creator");
	private JTextField[] fields = new JTextField[10];
	public static String[] fieldstr = new String[10];
	private JLabel[] fieldlabel = new JLabel[10];
	private GridBagConstraints[] fieldconstraints = new GridBagConstraints[10];
	private GridBagConstraints[] fieldlabelconstraints = new GridBagConstraints[10];
	private JButton submitbutton = new JButton("Complete Album and Return to Main Hub!");
	public static int counter = 2;
	public static boolean state2 = false;

	
	
	private ActionListener action1 = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//SETS THE BEHAVIOUR FOR THE SUBMIT BUTTON AND RETURN TO MAIN HUB
			counter = counter + 1;
			state2 = true;
			System.out.println(counter);
			
			
			//SETS ALL THE TEXTFIELDS (SONGS) TO AN ELEMENT IN THE "fieldstr" LIST. 
			for(int i = 0; i < fields.length; i = i + 1) {
				fieldstr[i] = fields[i].getText();
				fieldstr[i].toUpperCase();
				
				
				
				
			}
			
			//OPENS THE OTHER WINDOW TO RETURN TO MAIN HUB
			Game22_HL2 game = new Game22_HL2();
			frame.dispose();
			
			
			
		}
		
	};

	
	//Constructors
	public AC() {
		//SETS THE LAYOUT OF THE FRAME
		frame.setLocation(100,100);
		frame.setSize(1000, 1000);
		frame.setLayout(new GridBagLayout());
		
		
		//Each textfield element in the list is created as a blank textfield
		for(int i = 0; i < fields.length; i = i + 1) {
			fields[i] = new JTextField("");
			//fields[i].addActionListener(action1);
		}
		
		
		//for(int i = 0; i < fieldstr.length; i = i + 1) {
		//	fieldstr[i] = new String("Track " + i);
		//}
		
		//Creates all the labels and constraints for both the textfields and labels
		for(int i = 0; i < fieldlabel.length; i = i + 1) {
			fieldlabel[i] = new JLabel("Track " + (i + 1));
			fieldlabelconstraints[i] = new GridBagConstraints();
			fieldconstraints[i] = new GridBagConstraints();
				
		}
		//Sets the y location of the labels and textfields
		for(int i = 0; i < fieldlabel.length-fieldlabel.length+1; i = i + 1) { 
			fieldlabelconstraints[i].gridy = i;	
			fieldconstraints[i].gridy = i;
		}
		//Sets the x location of some of the labels 
		for(int i = 0; i < fieldlabel.length; i = i + 2) { 
			fieldlabelconstraints[i].gridx = 0;
		}
		//Sets the x location of some of the textfields 
		for(int i = 0; i < fields.length; i = i + 2) { 
			fieldconstraints[i].gridx = 1;
		}
		//Sets the x location of some of the textfields
		for(int i = 1; i < fields.length; i = i + 2) { 
			fieldconstraints[i].gridx = 3;
		}
		//Sets the x location of some of the labels 
		
		for(int i = 1; i < fieldlabel.length; i = i + 2) { 
			fieldlabelconstraints[i].gridx = 2;
		}
		//Adds the constraints to the frame for the labels and the textfields
		for(int i = 0; i < fieldlabel.length; i = i + 1) { 
			fields[i].setColumns(15);
			frame.add(fieldlabel[i],fieldlabelconstraints[i]);
			frame.add(fields[i],fieldconstraints[i]);
		}
		
		
		//Constraints for the button
		GridBagConstraints c0 = new GridBagConstraints();
		c0.gridx = 1;  
		c0.gridy = 6;
		submitbutton.addActionListener(action1);
		
		//Add button to frame
		frame.add(submitbutton,c0);
		
		
		
		//Finalizes frame layout
		frame.pack(); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Methods - Behaviours
		AC game = new AC();
	
	}
	
	

}
