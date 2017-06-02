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
	Random rand = new Random();
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
		
		gridPanel.add(creditDisplay);
		creditDisplay.setText(""+ credits);
		
		gridPanel.add(betDisplay);
		betDisplay.setText(""+bet);
		
		gridPanel.add(displayPaid);
		displayPaid.setText(""+paid);
		
		gridPanel.add(reset);
		reset.addActionListener(null);
		reset.setText("Reset");
		
		gridPanel.add(betOne);
		betOne.addActionListener(null);
		betOne.setText("Bet 1");
		
		gridPanel.add(spin);
		spin.addActionListener(null);
		spin.setText("SPIN");
		
	}

	public void paintComponent(Graphics g) {
		real.draw(g);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == spin) {

			int random = rand.nextInt(3);
			System.out.println(random);

		}

	}

}
