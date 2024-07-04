// Sample code for a Swing program with JFrame, JButton, JTextArea, and JTable
import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;


public class SwingProgram {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel(new BorderLayout());

        JTextArea textArea = new JTextArea();
        JButton button = new JButton("Click Me");
        JTable table = new JTable();

        panel.add(textArea, BorderLayout.NORTH);
        panel.add(button, BorderLayout.CENTER);
        panel.add(new JScrollPane(table), BorderLayout.SOUTH);

        DefaultTableModel model1 = new DefaultTableModel();
        model1.addColumn("Name");
        model1.addColumn("Age");
        model1.addRow(new Object[]{"Alice",30});
        model1.addRow(new Object[]{"Ali",13});
        table.setModel(model1);

        frame.add(panel);
        frame.setVisible(true);
    }
}
