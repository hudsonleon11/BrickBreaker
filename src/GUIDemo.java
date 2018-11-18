import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUIDemo {

	
	//Attributes - Fields (Instance Variables)
	private JFrame frame; 
	private JTextArea displayArea;
	private JTextField submitField;
	private JButton submitButton; 
	
	//Game Variables
	private String input = "";
	
	
	
	private ActionListener action1 = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("BUTTON PRESSED");
			input = submitField.getText();
			submitField.setText("");
			displayArea.append(input+ "\n");
			
			System.out.println(input);
			
		}
		
		
		
	};
	
	//Constructors
	public GUIDemo() {
		System.out.println("Running Constructor");
		
		frame = new JFrame();
		frame.setLocation(100, 100);
		//frame.setSize(500, 500);
		frame.setLayout(new GridBagLayout());
		frame.setResizable(false);
		
		
		
		
		//build frame
		displayArea = new JTextArea();
		submitField = new JTextField();
		submitButton = new JButton("Submit");
		
		//Step 1: Setup and add JTextArea
		GridBagConstraints c1 = new GridBagConstraints();
		c1.gridx = 0; 
		c1.gridy = 0;
		c1.gridwidth = 2;
		
		frame.add(new JScrollPane(displayArea), c1);
		
		displayArea.setRows(16);
		displayArea.setColumns(50);
		displayArea.setEditable(true);
		
		//frame.add(displayArea,c1);
		
		//Step 2: Setup and add button
		GridBagConstraints c2 = new GridBagConstraints();
		c2.gridx = 0; 
		c2.gridy = 1;
		c2.anchor = GridBagConstraints.WEST;
		
		submitButton.addActionListener(action1);
		frame.add(submitButton,c2);
		
		//Step 2: submit field
		GridBagConstraints c3 = new GridBagConstraints();
		c3.gridx = 1; 
		c3.gridy = 1;
		
		submitField.setColumns(30);
		frame.add(submitField,c3);
		
		
		//display frame
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	
		//end constructor
		
		
	}
	
	//Behaviours - Methods
	
	//************MAIN METHOD IS SIMPLY FOR TESTING
	
	
	public static void main(String[] args) {
		
		System.out.println("Program Starting");
		System.out.println("Program Ending");
		GUIDemo demoObject = new GUIDemo();


	
	
	
	}

}
