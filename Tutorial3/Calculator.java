import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.getContentPane().setBackground(new Color(242, 242, 242)); // Background color
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(new Color(255, 255, 255)); // Panel background color

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel label1 = new JLabel("Enter First Number:");
        JTextField number1Field = new JTextField(10);
        JLabel label2 = new JLabel("Enter Second Number:");
        JTextField number2Field = new JTextField(10);

        JLabel resultLabel = new JLabel(); // Add resultLabel here

        JButton calculateButton = new JButton("Calculate");
        JButton exitButton = new JButton("Exit");

        // Button styling
        calculateButton.setBackground(new Color(65, 105, 225));
        calculateButton.setForeground(Color.WHITE);
        exitButton.setBackground(new Color(178, 34, 34));
        exitButton.setForeground(Color.WHITE);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(label1, gbc);

        gbc.gridy = 1;
        panel.add(label2, gbc);

        gbc.gridy = 2;
        panel.add(calculateButton, gbc);

        gbc.gridy = 3;
        panel.add(exitButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(number1Field, gbc);

        gbc.gridy = 1;
        panel.add(number2Field, gbc);

        // Add resultLabel to panel
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        panel.add(resultLabel, gbc);

        frame.add(panel, BorderLayout.CENTER);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1, num2;
                try {
                    num1 = Double.parseDouble(number1Field.getText());
                    num2 = Double.parseDouble(number2Field.getText());
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input. Please enter valid numbers.");
                    return;
                }

                String choice = JOptionPane.showInputDialog("MENU\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit\n\nEnter the Choice (1/2/3/4/5):");
                if (choice != null) {
                    switch (choice) {
                        case "1":
                            resultLabel.setText("Addition of two Numbers: " + (num1 + num2));
                            break;
                        case "2":
                            resultLabel.setText("Subtraction of two Numbers: " + (num1 - num2));
                            break;
                        case "3":
                            resultLabel.setText("Multiplication of two Numbers: " + (num1 * num2));
                            break;
                        case "4":
                            if (num2 != 0) {
                                resultLabel.setText("Division of two Numbers: " + (num1 / num2));
                            } else {
                                resultLabel.setText("Division by zero is not allowed.");
                            }
                            break;
                        case "5":
                            System.exit(0);
                            break;
                        default:
                            resultLabel.setText("Invalid choice. Please enter a valid option.");
                            break;
                    }

                    // Ask if the user wants to continue
                    int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Continue?", JOptionPane.YES_NO_OPTION);
                    if (response != JOptionPane.YES_OPTION) {
                        System.exit(0); // Exit if the user chooses not to continue
                    } else {
                        number1Field.setText(""); // Clear the input fields for the next calculation
                        number2Field.setText("");
                        resultLabel.setText("");
                    }
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








/* 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator 
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Arithmetic Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel label1 = new JLabel("Enter Number 1:");
        JTextField number1Field = new JTextField();
        JLabel label2 = new JLabel("Enter Number 2:");
        JTextField number2Field = new JTextField();
        JLabel resultLabel = new JLabel("");
        JButton calculateButton = new JButton("Calculate");
        JButton exitButton = new JButton("Exit");

        panel.add(label1);
        panel.add(number1Field);
        panel.add(label2);
        panel.add(number2Field);
        panel.add(calculateButton);
        panel.add(resultLabel);
        panel.add(exitButton);

        frame.add(panel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(number1Field.getText());
                double num2 = Double.parseDouble(number2Field.getText());
                String choice = JOptionPane.showInputDialog("MENU\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit\n\nEnter the Choice (1/2/3/4/5):");
                if (choice != null) {
                    switch (choice) {
                        case "1":
                            resultLabel.setText("Addition of two Numbers: " + (num1 + num2));
                            break;
                        case "2":
                            resultLabel.setText("Subtraction of two Numbers: " + (num1 - num2));
                            break;
                        case "3":
                            resultLabel.setText("Multiplication of two Numbers: " + (num1 * num2));
                            break;
                        case "4":
                            if (num2 != 0) {
                                resultLabel.setText("Division of two Numbers: " + (num1 / num2));
                            } else {
                                resultLabel.setText("Division by zero is not allowed.");
                            }
                            break;
                        case "5":
                            System.exit(0);
                            break;
                        default:
                            resultLabel.setText("Invalid choice. Please enter a valid option.");
                            break;
                    }

                    // Ask if the user wants to continue
                    int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Continue?", JOptionPane.YES_NO_OPTION);
                    if (response != JOptionPane.YES_OPTION) {
                        System.exit(0); // Exit if the user chooses not to continue
                    } else {
                        number1Field.setText(""); // Clear the input fields for the next calculation
                        number2Field.setText("");
                        resultLabel.setText("");
                    }
                }

            }
        });

        exitButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}

*/