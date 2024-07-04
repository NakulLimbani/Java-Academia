// Sample code for a Swing application with button click events
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickEventDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Click Event Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        JButton button = new JButton("Click Me");

        button.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
}
