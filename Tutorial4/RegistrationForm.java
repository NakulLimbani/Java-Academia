import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame implements ActionListener {
    private JTextField usernameField, emailField;
    private JPasswordField passwordField, confirmPasswordField;
    private JLabel usernameLabel, emailLabel, passwordLabel, confirmPasswordLabel;
    private JButton registerButton;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();

        emailLabel = new JLabel("Email:");
        emailField = new JTextField();

        passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordField = new JPasswordField();

        registerButton = new JButton("Register");
        registerButton.addActionListener(this);

        add(usernameLabel);
        add(usernameField);
        add(emailLabel);
        add(emailField);
        add(passwordLabel);
        add(passwordField);
        add(confirmPasswordLabel);
        add(confirmPasswordField);
        add(new JLabel()); // Empty label for spacing
        add(registerButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            // Perform registration logic here
            String username = usernameField.getText();
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            String confirmPassword = new String(confirmPasswordField.getPassword());

            // Validate and process the registration data (e.g., store in a database)

            // For this example, we'll just display the input in a message dialog
            String message = "Registration successful!\n\nUsername: " + username + "\nEmail: " + email;
            JOptionPane.showMessageDialog(this, message, "Registration Success", JOptionPane.INFORMATION_MESSAGE);

            // Clear the form fields after registration
            usernameField.setText("");
            emailField.setText("");
            passwordField.setText("");
            confirmPasswordField.setText("");
        }
    }

    public static void main(String[] args) {
        
            RegistrationForm registrationForm = new RegistrationForm();
            registrationForm.setVisible(true);
        
    }
}