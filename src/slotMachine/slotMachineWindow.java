package slotMachine;

import javax.swing.JFrame;

public class slotMachineWindow {

	JFrame frame = new JFrame();
	slotMachinePanel panel = new slotMachinePanel();

	int width = 800;
	int height = 600;

	slotMachineWindow() {
		frame.setVisible(true);
		frame.setSize(width, height);
		frame.add(panel);
		frame.setTitle("Slot Machine");

	}

}
