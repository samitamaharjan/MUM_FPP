package swing;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class JButtonListenerExample {
    static JFrame frame;

    public static void main(String[] args) {
        frame = new JFrame("Our JButton listener example");
        JButton showDialogButton = new JButton("Click Me");

        showDialogButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JDialog d = new JDialog(frame, "Hello", true);
                d.setLocationRelativeTo(frame);
                d.setVisible(true);
            }
        });

        frame.getContentPane().setLayout(new FlowLayout());
        frame.add(showDialogButton);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(300, 200));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}