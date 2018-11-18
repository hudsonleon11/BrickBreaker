

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Game2_JW {

	//Fields
	//GUI******************************************
	private JFrame frame = new JFrame("Game_NI");
	
	private JPanel panelMain = new JPanel() {
		
		public void paint(Graphics g) {
			
			int xloc = 0;
			int yloc = 0;
			for (int r = 0; r < mapData.length; r = r + 1) {
				for (int c = 0; c < mapData[r].length; c = c + 1) {
					if (mapData[r][c] == 'G') {
						g.setColor(Color.GREEN);
						g.fillRect(xloc, yloc, 10, 10);
					}
					if (mapData[r][c] == 'M') {
						g.setColor(Color.GRAY);
						g.fillRect(xloc, yloc, 10, 10);
					}
					if (mapData[r][c] == 'W') {
						g.setColor(Color.BLUE);
						g.fillRect(xloc, yloc, 10, 10);
					}
					xloc = xloc + 10;
				}
				xloc = 0;
				yloc = yloc + 10;
			}
		
		}

	};

	private JButton b1 = new JButton("Jab");
	private JButton b2 = new JButton("Swing");

	private JButton b3 = new JButton("Eat Cookie");
	private JButton b4 = new JButton("Drink Milk");
	
	private JTextArea textArea = new JTextArea();
	private JTextField textField = new JTextField();
	private JButton submit = new JButton ("submit");
	
	
	//Listeners************************************
	//NONE ADDED YET
	
	//Game Variable********************************
	//NO GAME TO SPEAK OF YET
	private char[][] mapData = new char[50][50];
	
	
	//Construtors:
	public Game2_JW() {
		
		//Setup Game Back End
		for (int r = 0; r < mapData.length; r = r + 1) {
			for (int c = 0; c <mapData[r].length; c = c + 1) {
				int rand = (int)(Math.random()*30);
				System.out.println(rand);
				if (rand < 25) {
					mapData[r][c] = 'G';
					
				}
				else if (rand == 26 || rand == 27) {
					mapData[r][c] = 'M';
				}
				else {
					mapData[r][c] = 'W';
				}
			}
		}
		
		//Second pass and evalue each square.  If it is water look all 8 directions and then possibly change to water 90
		
		//Setup Game Front End
		//sets frame location
		frame.setLocation(100, 100);
		
		//SetLayoutManager
		frame.setLayout(new GridBagLayout());
		
		//CODE TO ADD PANEL
		//special object that gives the GUI manager
		//instructions on how to add an object
		GridBagConstraints c1 = new GridBagConstraints();
		c1.gridx = 0;
		c1.gridy = 0;
		c1.gridwidth = 2;
		panelMain.setPreferredSize(new Dimension(500,500));
		
		frame.add(panelMain,c1);
		
		//CODE TO ADD BUTTON 1
		GridBagConstraints c2 = new GridBagConstraints();
		c2.gridx = 0;
		c2.gridy = 1;
		c2.weightx = 50;
		
		frame.add(b1,c2);
		
		//CODE TO ADD BUTTON 2
		GridBagConstraints c3 = new GridBagConstraints();
		c3.gridx = 1;
		c3.gridy = 1;
		c3.anchor = GridBagConstraints.CENTER;
		c3.weightx = 50;
		frame.add(b2,c3);

		//CODE TO ADD BUTTON 3
		GridBagConstraints c4 = new GridBagConstraints();
		c4.gridx = 0;
		c4.gridy = 2;
		c4.weightx = 1.0;
		
		frame.add(b3,c4);
		
		//CODE TO ADD BUTTON 4
		GridBagConstraints c5 = new GridBagConstraints();
		c5.gridx = 1;
		c5.gridy = 2;
		c5.anchor = GridBagConstraints.CENTER;
		c5.weightx = 1.0;
		frame.add(b4,c5);
		
		//CODE TO ADD TEXT AREA
		GridBagConstraints c6 = new GridBagConstraints();
		c6.gridx = 2;
		c6.gridy = 0;
		c6.anchor = GridBagConstraints.NORTH;
		c6.fill = GridBagConstraints.BOTH;
		
		textArea.setRows(30);
		textArea.setColumns(30);
			
		frame.add(textArea,c6);
	
		//CODE TO ADD SUBMIT BUTTON
		GridBagConstraints c7 = new GridBagConstraints();
		c7.gridx = 2;
		c7.gridy = 2;
		c7.gridwidth = 2;
		c7.fill = GridBagConstraints.BOTH;
		
		frame.add(submit, c7);
		
		//CODE TO ADD TEXTFIELD
		GridBagConstraints c8 = new GridBagConstraints();
		c8.gridx = 2;
		c8.gridy = 1;
		c8.gridwidth = 2;
		c8.fill = GridBagConstraints.BOTH;
	
		frame.add(textField, c8);
		
	
		//FINALIZE FRAME SETUP
		frame.setResizable(false);
		frame.pack(); //packs all the elements so it sets the size of the screen automatically
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		
		
		Game2_JW game = new Game2_JW();
		
		
	}

	
	
}
