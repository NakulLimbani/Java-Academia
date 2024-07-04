import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.*;
import java.sql.*;


public class StudentRegistrationFormDB {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JLabel regNoLabel = new JLabel("Registration No:");
        JTextField regNoField = new JTextField();

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel deptLabel = new JLabel("Department:");
        JTextField deptField = new JTextField();

        JButton submitButton = new JButton("Submit");

        panel.add(regNoLabel);
        panel.add(regNoField);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(deptLabel);
        panel.add(deptField);
        panel.add(new JLabel()); // Empty label for spacing
        panel.add(submitButton);

        frame.add(panel);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int regno = Integer.parseInt(regNoField.getText());
                String name = nameField.getText();
                String branch = deptField.getText();

                // Insert data into the database
                try {

                    //Class.forName("com.mysql.jdbc.Driver");
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "NakulLimbani");
                    String insertQuery = "INSERT INTO student (regno, name, branch) VALUES (?, ?, ?)";
                    PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
                    preparedStatement.setInt(1, regno);
                    preparedStatement.setString(2, name);
                    preparedStatement.setString(3, branch);
                    preparedStatement.executeUpdate();
                    JOptionPane.showMessageDialog(frame, "Student record inserted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);

                    
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }

                // Clear input fields after submission
                regNoField.setText("");
                nameField.setText("");
                deptField.setText("");
            }
        });

        frame.setVisible(true);
    }
}

