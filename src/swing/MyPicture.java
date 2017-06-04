package swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MyPicture extends JFrame{
	public void display() throws IOException {
		// creating label and setting font
		JLabel label1 = new JLabel();
		label1.setHorizontalAlignment(JLabel.CENTER);
		Font font = new Font("TimesRoman", Font.BOLD+Font.ITALIC, 22);
		label1.setFont(font);
		
		// setting image in label
		Image image = ImageIO.read(getClass().getResource("SNice.png"));
		Image scaledImage = image.getScaledInstance(200, 200, 0);
		ImageIcon imageIcon = new ImageIcon(scaledImage);
		JLabel label2 = new JLabel(imageIcon);
		
		label2.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				label1.setText("Bye Samita!");				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				label1.setText("Hello Samita!");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		this.setLayout(new BorderLayout());
		this.add(label1, BorderLayout.NORTH);
		this.add(label2, BorderLayout.CENTER);
		
		this.setSize(300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) throws IOException {
		MyPicture picture = new MyPicture();
		picture.display();
	}
}

