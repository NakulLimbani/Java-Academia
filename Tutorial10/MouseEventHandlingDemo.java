import javax.swing.*;
import java.awt.event.*;

public class MouseEventHandlingDemo {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Mouse Event Handling Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a label to display mouse events
        JLabel label = new JLabel("Mouse Events: ");
        frame.add(label);

        // Create a panel to hold the label
        JPanel panel = new JPanel();
        panel.add(label);
        frame.add(panel);

        // Add a mouse listener to the label
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked: (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
