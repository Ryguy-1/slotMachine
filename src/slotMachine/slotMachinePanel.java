package slotMachine;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;

public class slotMachinePanel extends JPanel implements ActionListener {

	JButton spin = new JButton();
	Random rand = new Random();

	slotMachinePanel() {
		add(spin);
		spin.addActionListener(this);
	}

	public void paintComponent(Graphics g) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == spin) {

			int random = rand.nextInt(3);
			System.out.println(random);

		}

	}

}
