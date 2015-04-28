import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;
import java.util.*;

import javax.swing.*;


public class centerPanel extends JPanel{
    ImageIcon icon;
    Image img;
    
    public centerPanel() 
    {
    	this.setBackground(Color.BLACK);
    	this.initCenterPanel();	
    }
  
    public void initCenterPanel(){
    	this.setLayout(new BorderLayout(0, 0));
    	URL imgURL = getClass().getResource("/kl0u0.gif");
		ImageIcon welcomeIcon = new ImageIcon (imgURL);
		JLabel labelWelcome = new JLabel();
		labelWelcome.setIcon(welcomeIcon);
		labelWelcome.setVerticalAlignment(SwingConstants.BOTTOM);
		labelWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(labelWelcome, BorderLayout.NORTH);
		
		JPanel leftCenterPanel = new JPanel();
		leftCenterPanel.setBackground(Color.BLACK);
		this.add(leftCenterPanel, BorderLayout.WEST);
		
		JPanel rightCenterPanel = new JPanel();
		rightCenterPanel.setBackground(Color.BLACK);
		this.add(rightCenterPanel, BorderLayout.EAST);
		
		JPanel centerMain = new JPanel();
		centerMain.setBackground(Color.BLACK);
		URL imgURLTwo = getClass().getResource("/arcadeHome.png");
		ImageIcon HomeIcon = new ImageIcon (imgURLTwo);
		JLabel labelHome = new JLabel();
		labelHome.setIcon(HomeIcon);
		centerMain.add(labelHome);
		this.add(centerMain,BorderLayout.CENTER);
		//****Starts Game*****
		//JPanel TTTGUI = new TTTGui();
		//this.add(TTTGUI);
		
		//Get Player Name*******************
		/*JButton button = new JButton();
		centerGame.setBackground(Color.BLACK);
		centerGame.setForeground(Color.YELLOW);
        button.setText("Click me to start playing!");
        centerGame.add(button);
        //centerGame.pack();
        centerGame.setVisible(true);

        button.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String name = JOptionPane.showInputDialog(getDropTarget().getComponent(),
                        "What is your name?", null);
            }
        });
		this.add(centerGame, BorderLayout.CENTER);
		*/
		
    }
    
    public void start(){
    	this.setBackground(Color.GREEN);
    }
}

