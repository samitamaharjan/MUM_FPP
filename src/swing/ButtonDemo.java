package swing;
//push button handle action events
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class ButtonDemo implements ActionListener {
	JLabel jlbl;

	ButtonDemo() {
		// create a jframe container
		JFrame jfrm = new JFrame("A Button Example");
		// Specify Flowlayout for the layout manager
		jfrm.setLayout(new FlowLayout());
		// give the frame an initial size
		jfrm.setSize(220, 90);
		// terminate the program when the user closes the application
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Make two buttons
		JButton jbtnUp = new JButton("UP");
		JButton jbtnDown = new JButton("Down");
		// add action listener
		jbtnUp.addActionListener(this);
		jbtnDown.addActionListener(this);

		// Add the buttons to the content pane
		jfrm.add(jbtnUp);
		jfrm.add(jbtnDown);
		// Create a label
		 jlbl = new JLabel("Press a Button");
		// Add the label to the frame
		jfrm.add(jlbl);
		// Display the frame
		jfrm.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if (ae.getActionCommand().equals("UP"))
			jlbl.setText("You pressed up");
		else
			jlbl.setText("You pressed down");

	}

	public static void main(String args[]) {
		// create the frame on the event dispatching thread
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ButtonDemo();
			}

		});
	}
}
