// Sample code for a Swing application using JFrame, JPanel, and JDialog
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContainerDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        JButton openDialogButton = new JButton("Open Dialog");

        openDialogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = new JDialog(frame, "Dialog", true);
                dialog.setSize(200, 100);
                dialog.add(new JLabel("This is a dialog"));
                dialog.setVisible(true);
            }
        });

        panel.add(openDialogButton);
        frame.add(panel);
        frame.setVisible(true);
    }
}
