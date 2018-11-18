import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TicTacToe {

	//Attributes - Fields (Variables)
	private JFrame  frame;
	private JButton[] buttons = new JButton[9];
	
	
	private boolean win = false; 
	private int ctr = 0; // keep track of who's turn it is
	ActionListener action1 = new ActionListener() {

		@Override 
		public void actionPerformed(ActionEvent e) {
			System.out.println("BUTTON RUNNING");
		
			/*
			 * Tricky part: The parameter is an action event This is a general item
			 * for any object that can have actionListener attached to it. The problem here is even though I 
			 * know that e is a button
			 */
			
			JButton tempJ = ((JButton)e.getSource());
			
			String text = "";
			
			if(ctr%2 == 0) {
				text = "X";
				
			
			
			}
			else {
				text = "O";
			}
			
			tempJ.setEnabled(false);
			tempJ.setText(text);
			
			//Write Logic Here!
			if(buttons[0].getText().equals(buttons[1].getText()) && buttons[1].getText().equals(buttons[2].getText())) {
				System.out.println(text + " WINS");
				win = true;
			}
			if(buttons[3].getText().equals(buttons[4].getText()) && buttons[4].getText().equals(buttons[5].getText())) {
				System.out.println(text + " WINS");
				win = true;
			}
		
			if(buttons[6].getText().equals(buttons[7].getText()) && buttons[7].getText().equals(buttons[8].getText())) {
				System.out.println(text + " WINS");
				win = true;
			}
			if(buttons[0].getText().equals(buttons[3].getText()) && buttons[3].getText().equals(buttons[6].getText())) {
				System.out.println(text + " WINS");
				win = true;
			}
			
			
			
			//Clear board logic
			
			if(win == true) {
				for(int i = 0; i < 500; i = i + 1) {
					buttons[i].setEnabled(true);
					buttons[i].setText(text);
				}
			}
			
			System.out.println(text);
			ctr = ctr + 1 ; 
			
		}
		
		
	};
	
	//Constructors - Special Methods used once
	public TicTacToe() {
		
		frame = new JFrame("Tic Tac Toe");
		frame.setLocation(100,100);
		frame.setSize(500, 500);
		frame.setResizable(false);
		
		GridLayout g = new GridLayout(3,3,5,5);
		frame.setLayout(g);
		
		
		for(int i = 0; i < buttons.length; i = i +1) {
			
			//Construct each button
			buttons[i] = new JButton("" + i);
			buttons[i].addActionListener(action1);
			frame.add(buttons[i]);
		}
	
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
	}
	
	
	//Behaviours - methods
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//Reference Type = Object Type
		TicTacToe game = new TicTacToe();

	}

}
