import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.JLabel;


public class arcadeGUI extends JFrame {

	private JPanel contentPane;
	private JTextArea txtOutput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					arcadeGUI frame = new arcadeGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public arcadeGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		initGUI();	
	}
		
	ActionListener buttonListener = new ActionListener(){
    	public void actionPerformed(ActionEvent e) {
    		if (e.getActionCommand().equalsIgnoreCase("B")) {
    			//*****person presses blue and gets to main menu page
    		}
    	}
    };	
	private void initGUI(){
		initBottom();
		initCenterPane();
		initTop();
		initBorder();	
	}
		
	private void initBottom(){

		JPanel panelBottom = new JPanel();
		panelBottom.setBackground(Color.BLUE);
		contentPane.add(panelBottom, BorderLayout.SOUTH);
		panelBottom.setLayout(new GridLayout(1, 0, 0, 0));
		
		URL redimgURL = getClass().getResource("/red.png");
		ImageIcon redButton = new ImageIcon (redimgURL);
		JButton A = new JButton(redButton);
		A.setBorderPainted(false);
		A.setBorder(null);
		A.setMargin(new Insets(0, 0, 0, 0));
		A.setContentAreaFilled(false);	
		A.setForeground(new Color(0, 191, 255));
		A.setBackground(new Color(0, 191, 255));
		panelBottom.add(A);
		
		URL blueimgURL = getClass().getResource("/blue.png");
		ImageIcon blueButton = new ImageIcon (blueimgURL);
		JButton B = new JButton(blueButton);
		B.setBorderPainted(false);
		B.setBorder(null);
		B.setMargin(new Insets(0, 0, 0, 0));
		B.setContentAreaFilled(false);
		B.setForeground(new Color(0, 191, 255));
		B.setBackground(new Color(0, 191, 255));
		B.addActionListener(buttonListener);
		panelBottom.add(B);
		
		JPanel Stick = new JPanel();
		Stick.setBackground(Color.BLUE);
		panelBottom.add(Stick);
		Stick.setLayout(new GridLayout(0, 1, 0, 0));
		
		URL upimgURL = getClass().getResource("/upArrow.png");
		ImageIcon upButton = new ImageIcon (upimgURL);
		JButton Up = new JButton(upButton);
		Up.setBorderPainted(false);
		Up.setBorder(null);
		Up.setMargin(new Insets(0, 0, 0, 0));
		Up.setContentAreaFilled(false);	
		Up.setForeground(new Color(0, 191, 255));
		Up.setBackground(new Color(0, 191, 255));
		Stick.add(Up);
		
		URL downimgURL = getClass().getResource("/downArrow.png");
		ImageIcon downButton = new ImageIcon (downimgURL);
		JButton Down = new JButton(downButton);
		Down.setBorderPainted(false);
		Down.setBorder(null);
		Down.setMargin(new Insets(0, 0, 0, 0));
		Down.setContentAreaFilled(false);	
		Down.setForeground(new Color(0, 191, 255));
		Down.setBackground(new Color(0, 191, 255));
		Stick.add(Down);	
	}
	
	private class ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//Get button pressed
			JButton pressed=(JButton)(e.getSource());
			
			//Get text of button
			String text=pressed.getText();
			
			//If B pressed.**************HELP**********
			if(text.equals("B"))
			{
				
			}
		}
	}
	
	private void initCenterPane(){
		centerPanel centerPanel = new centerPanel();
		centerPanel.setBackground(Color.BLACK);
		centerPanel.setForeground(Color.BLACK);
		centerPanel.setBorder(null);
		contentPane.add(centerPanel, BorderLayout.CENTER);
	}
	
	private void initTop(){
		JPanel panelTop = new JPanel();
		panelTop.setBackground(Color.BLUE);
		contentPane.add(panelTop, BorderLayout.NORTH);
		
		URL imgURL = getClass().getResource("/arcade.jpg");
		ImageIcon arcadeIcon = new ImageIcon (imgURL);
		JLabel labelTop = new JLabel();
		labelTop.setIcon(arcadeIcon);
		panelTop.add(labelTop);		
	}
	
	private void initBorder(){
		JPanel panelLeft = new JPanel();
		panelLeft.setBackground(Color.BLUE);
		contentPane.add(panelLeft, BorderLayout.WEST);
	
		JPanel panelRight = new JPanel();
		panelRight.setBackground(Color.BLUE);
		contentPane.add(panelRight, BorderLayout.EAST);	
	}

	
}
