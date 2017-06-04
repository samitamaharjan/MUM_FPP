package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogInFrame {
	public void display() {
		JButton button = new JButton("Click me");
		JLabel username = new JLabel("Username");
		JLabel password = new JLabel("password");
		JTextField textField = new JTextField(10);
		JPasswordField passwordField = new JPasswordField(10);
		
		JFrame jFrame = new JFrame();
		jFrame.setLayout(new FlowLayout());
		jFrame.add(username);
		jFrame.add(textField);
		jFrame.add(password);
		jFrame.add(passwordField);
		jFrame.add(button);
		
		jFrame.setSize(250, 150);
		jFrame.setTitle("My swing application");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setResizable(false);
		jFrame.setVisible(true);
	}
	
	public static void main(String[] args) {
		LogInFrame mySwing = new LogInFrame();
		mySwing.display();
	}
}
