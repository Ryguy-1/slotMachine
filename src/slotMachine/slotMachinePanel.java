package slotMachine;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachinePanel extends JPanel implements ActionListener {

	JButton spin = new JButton();
	DisplayReal real = new DisplayReal();
	JLabel creditDisplay = new JLabel("", JLabel.CENTER);
	int credits = 50;
	JLabel betDisplay = new JLabel("", JLabel.CENTER);
	int bet = 0;
	JLabel displayPaid = new JLabel("", JLabel.CENTER);
	int paid = 0;
	JPanel gridPanel = new JPanel();
	JButton reset = new JButton();
	JButton betOne = new JButton();
	
	
	
	
	SlotMachinePanel() {
		
		setLayout(null);
		
		add(gridPanel);
		gridPanel.setBounds(0, 350, 800, 250);
		gridPanel.setLayout(new GridLayout(2, 3));
		
		makeDisplays();
		
		makeButtons();
		
		
		
	}

	public void paintComponent(Graphics g) {
		real.draw(g);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == spin) {
			
			real.spin();
			repaint();
			
			if (real.isWinner()){
				
				updateWinnings();
				
			}
			
			
		}
		
	

	}
	private void makeButtons(){
		
	
	gridPanel.add(reset);
	reset.addActionListener(this);
	reset.setText("Reset");
	
	gridPanel.add(betOne);
	betOne.addActionListener(this);
	betOne.setText("Bet 1");
	
	gridPanel.add(spin);
	spin.addActionListener(this);
	spin.setText("SPIN");
	
	}
	
	private void makeDisplays(){
		
		gridPanel.add(creditDisplay);
		creditDisplay.setText("Credits: "+ credits);
		
		
		
		gridPanel.add(betDisplay);
		betDisplay.setText("Bet: "+bet);
		
		gridPanel.add(displayPaid);
		displayPaid.setText("Paid: "+paid);
		
	}
	
	private void updateWinnings (){
		
		//Update the display for the paid screen based on bet (Multiply by 5)
		
		
	}
	
	

}
