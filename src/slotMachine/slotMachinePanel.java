package slotMachine;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class slotMachinePanel extends JPanel implements ActionListener {

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
	String restart = "";
	final int WINNING_MULTIPLIER = 7;

	slotMachinePanel() {

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

			spinAction();

		} else if (e.getSource() == betOne) {

			betOneAction();

		} else if (e.getSource() == reset) {

			resetAction();

		}
		updateDisplay();

	}

	private void makeButtons() {

		gridPanel.add(reset);
		reset.addActionListener(this);
		reset.setText("Reset Bet");

		gridPanel.add(betOne);
		betOne.addActionListener(this);
		betOne.setText("Bet 1");

		gridPanel.add(spin);
		spin.addActionListener(this);
		spin.setText("SPIN");

	}

	private void makeDisplays() {

		gridPanel.add(creditDisplay);
		creditDisplay.setText("Credits: " + credits);

		gridPanel.add(betDisplay);
		betDisplay.setText("Bet: " + bet);

		gridPanel.add(displayPaid);
		displayPaid.setText("Paid: " + paid);

	}

	private void updateWinnings() {

		paid = bet * WINNING_MULTIPLIER;

		credits += paid;

		creditDisplay.setForeground(new Color(50, 200, 50));
	}

	private void updateDisplay() {

		creditDisplay.setText("Credits: " + credits);

		betDisplay.setText("Bet: " + bet);

		displayPaid.setText("Paid: " + paid);

		repaint();
	}
	private void spinAction(){
		
		real.spin();
		credits -= bet;

		if (real.isWinner()) {

			updateWinnings();

		} else if (real.isWinner() == false) {

			paid = 0;

			creditDisplay.setForeground(Color.RED);

			if (credits <= 0) {
				updateDisplay();
				restart = JOptionPane.showInputDialog("Would you like to restart: ");

				if (restart.equalsIgnoreCase("Yes")) {

					credits = 50;
					bet = 0;
					paid = 0;

				} else{

					System.exit(0);

				}

			}
	
		
	}

}
	private void betOneAction(){
		
		if (credits == 0) {

			JOptionPane.showMessageDialog(null, "You don't have that much money!");

		} else {
			bet += 1;
			credits -= 1;
		}
		
	}
	private void resetAction(){
		
		credits += bet;

		bet = 0;
		
	}
	
}