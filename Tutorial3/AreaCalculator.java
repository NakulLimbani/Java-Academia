import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AreaCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Area Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JLabel menuLabel = new JLabel("MENU");
        JLabel label1 = new JLabel("1- Area of Triangle");
        JLabel label2 = new JLabel("2- Area of Square");
        JLabel label3 = new JLabel("3- Area of Rectangle");
        JLabel label4 = new JLabel("4- Area of Circle");
        JLabel label5 = new JLabel("5- Exit");

        JTextField choiceField = new JTextField();
        JLabel resultLabel = new JLabel();

        JButton calculateButton = new JButton("Calculate");
        JButton exitButton = new JButton("Exit");

        panel.add(menuLabel);
        panel.add(new JLabel("")); // Empty label for spacing
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
        panel.add(choiceField);
        panel.add(calculateButton);
        panel.add(exitButton);
        panel.add(new JLabel("")); // Empty label for spacing
        panel.add(resultLabel);

        frame.add(panel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int choice = Integer.parseInt(choiceField.getText());
                switch (choice) {
                    case 1:
                        double base = Double.parseDouble(JOptionPane.showInputDialog("Enter base: "));
                        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height: "));
                        double triangleArea = 0.5 * base * height;
                        resultLabel.setText("Area of Triangle = " + triangleArea);
                        break;
                    case 2:
                        double side = Double.parseDouble(JOptionPane.showInputDialog("Enter side length: "));
                        double squareArea = side * side;
                        resultLabel.setText("Area of Square = " + squareArea);
                        break;
                    case 3:
                        double length = Double.parseDouble(JOptionPane.showInputDialog("Enter length: "));
                        double width = Double.parseDouble(JOptionPane.showInputDialog("Enter width: "));
                        double rectangleArea = length * width;
                        resultLabel.setText("Area of Rectangle = " + rectangleArea);
                        break;
                    case 4:
                        double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius: "));
                        double circleArea = Math.PI * radius * radius;
                        resultLabel.setText("Area of Circle = " + circleArea);
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        resultLabel.setText("Invalid choice. Please enter a valid option.");
                }

                // Ask if the user wants to continue
                int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Continue?", JOptionPane.YES_NO_OPTION);
                if (response != JOptionPane.YES_OPTION) {
                    System.exit(0); // Exit if the user chooses not to continue
                } else {
                    choiceField.setText("");
                    resultLabel.setText("");   
                }
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}
