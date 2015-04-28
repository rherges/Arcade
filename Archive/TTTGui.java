import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Riley Herges
 * TTTGui.java
 * This program is a TicTacToe game in which a player can challenge the 
 * computer.
 */

public class TTTGui extends JPanel
{	
	private JLabel result;
	private JButton[] cells;
	private JButton exitButton;
	private JButton initButton;
	private CellButtonHandler[] cellHandlers;
	private ExitButtonHandler exitHandler;
	private InitButtonHandler initHandler;
	
	private boolean O;
	private boolean gameOver;
	
	public TTTGui()
	{
		//Get content pane
		
		this.setBackground(Color.YELLOW);
		
		//Set layout
		this.setLayout(new GridLayout(4,3));

		//Create cells and handlers
		cells=new JButton[9];
		cellHandlers=new CellButtonHandler[9];
		for(int i=0; i<9; i++)
		{
			char ch=(char)('0'+i+1);
			cells[i]=new JButton(""+ch);
			cellHandlers[i]=new CellButtonHandler();
			cells[i].addActionListener(cellHandlers[i]);
		}
		
		//Create init and exit buttons and handlers
		exitButton=new JButton("EXIT");
		exitHandler=new ExitButtonHandler();
		exitButton.addActionListener(exitHandler);
		initButton=new JButton("CLEAR");
		initHandler=new InitButtonHandler();
		initButton.addActionListener(initHandler);
		
		//Create result label
		ImageIcon XIcon = new ImageIcon("X_icon.png");
		result=new JLabel(XIcon, SwingConstants.CENTER);
		result.setForeground(Color.white);
		setVisible(true);
		
						
		//Add elements to the grid content pane
		for(int i=0; i<9; i++)
		{
			this.add(cells[i]);
		}
		this.add(initButton);
		this.add(result);
		this.add(exitButton);
		
		//Initialize
		init();
	}
	
	public void init()
	{
		//Initialize booleans
		O=true;
		gameOver=false;
		
		//Initialize text in buttons
		
		for(int i=0; i<9; i++)
		{
			char ch=(char)('0'+i+1);
			cells[i].setText("" + ch);
		}
		
		//Initialize result label
		result.setText("O");
		setVisible(true);
	}
	
	public boolean checkWinner()
	{
		if(cells[0].getText().equals(cells[1].getText()) && cells[1].getText().equals(cells[2].getText()))
		{
			return true;
		}
		else if(cells[3].getText().equals(cells[4].getText()) && cells[4].getText().equals(cells[5].getText()))
		{
			return true;
		}
		else if(cells[6].getText().equals(cells[7].getText()) && cells[7].getText().equals(cells[8].getText()))
		{
			return true;
		}
		else if(cells[0].getText().equals(cells[3].getText()) && cells[3].getText().equals(cells[6].getText()))
		{
			return true;
		}
		else if(cells[1].getText().equals(cells[4].getText()) && cells[4].getText().equals(cells[7].getText()))
		{
			return true;
		}
		else if(cells[2].getText().equals(cells[5].getText()) && cells[5].getText().equals(cells[8].getText()))
		{
			return true;
		}
		else if(cells[0].getText().equals(cells[4].getText()) && cells[4].getText().equals(cells[8].getText()))
		{
			return true;
		}
		else if(cells[2].getText().equals(cells[4].getText()) && cells[4].getText().equals(cells[6].getText()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args)
	{
		//Create TicTacToe object
		TTTGui gui=new TTTGui();
		
	}
	
	private class CellButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//If game over, ignore
			if(gameOver)
			{
				return;
			}
			
			//Get button pressed
			JButton pressed=(JButton)(e.getSource());
			
			//Get text of button
			String text=pressed.getText();
			
			//If O or crosses, ignore
			if(text.equals("O") || text.equals("X"))
			{
				return;
			}
			
			//Add nought or cross
			if(O)
			{
				pressed.setText("O");
			}
			else
			{
				pressed.setText("X");
			}
			
			//Check winner
			if(checkWinner())
			{
				//End of game
				gameOver=true;
				
				//Display winner message
				if(O)
				{
					result.setText("O win!!");
				}
				else
				{
					result.setText("Crosses win!");
				}
			}
			else
			{
				//Change player
				O=!O;

				//Display player message
				if(O)
				{
					result.setText("O");
				}
				else
				{
					result.setText("Crosses");
				}
			}
		}
	}
	
	private class ExitButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}

	private class InitButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			init();
		}
	}
}