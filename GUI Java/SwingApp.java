// Sample code for a Swing application with combo box, checkbox, and radio buttons
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Option 1", "Option 2", "Option 3"});
        JCheckBox checkBox = new JCheckBox("Check me");
        JRadioButton radioButton1 = new JRadioButton("Radio 1");
        JRadioButton radioButton2 = new JRadioButton("Radio 2");

        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);

        panel.add(comboBox);
        panel.add(checkBox);
        panel.add(radioButton1);
        panel.add(radioButton2);

        frame.add(panel);
        frame.setVisible(true);
    }
}
