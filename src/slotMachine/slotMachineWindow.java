package slotMachine;

import javax.swing.JFrame;

public class SlotMachineWindow {

	JFrame frame = new JFrame();
	SlotMachinePanel panel = new SlotMachinePanel();

	int width = 800;
	int height = 600;

	SlotMachineWindow() {
		frame.setVisible(true);
		frame.setSize(width, height);
		frame.add(panel);
		frame.setTitle("Slot Machine");

	}

}
