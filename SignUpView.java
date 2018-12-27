package lostAndFound;

import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignUpView extends JFrame{
    private JLabel labelName, labelPhoneNumber, labelEmail, labelUserName, labelPassword, labelReEnterPassword;
    private JTextField textFieldName, textFieldPhoneNumber, textFieldEmail, textFieldUserName;
    private JPasswordField PasswordField, ReEnterPasswordField;
    private JButton buttonSignUp;

    public SignUpView(){
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        labelName = new JLabel();
        labelName.setText("Full Name: ");
        panel.add(labelName);

        textFieldName = new JTextField();
        textFieldName.setPreferredSize(new Dimension(200, 20));
        panel.add(textFieldName);

        labelPhoneNumber = new JLabel();
        labelPhoneNumber.setText("Phone Number: ");
        panel.add(labelPhoneNumber);

        textFieldPhoneNumber = new JTextField();
        textFieldPhoneNumber.setPreferredSize(new Dimension(200, 20));
        panel.add(textFieldPhoneNumber);

        labelEmail = new JLabel();
        labelEmail.setText("Email: ");
        panel.add(labelEmail);

        textFieldEmail = new JTextField();
        textFieldEmail.setPreferredSize(new Dimension(200, 20));
        panel.add(textFieldEmail);

        labelUserName = new JLabel();
        labelUserName.setText("User Name: ");
        panel.add(labelUserName);

        textFieldUserName = new JTextField();
        textFieldUserName.setPreferredSize(new Dimension(200, 20));
        panel.add(textFieldUserName);

        labelPassword = new JLabel();
        labelPassword.setText("Enter Password: ");
        panel.add(labelPassword);

        PasswordField = new JPasswordField();
        PasswordField.setPreferredSize(new Dimension(200, 20));
        PasswordField.setEchoChar('*');
        panel.add(PasswordField);

        labelReEnterPassword = new JLabel();
        labelReEnterPassword.setText("Re-Enter Password: ");
        panel.add(labelReEnterPassword);

        ReEnterPasswordField = new JPasswordField();
        ReEnterPasswordField.setPreferredSize(new Dimension(200, 20));
        ReEnterPasswordField.setEchoChar('*');
        panel.add(ReEnterPasswordField);

        buttonSignUp = new JButton("SignUp");
        panel.add(buttonSignUp);

        setTitle("SignUp");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        pack();
    }

    public String getEmail() {
        return textFieldEmail.getText();
    }

    public String getName() {
        return textFieldName.getText();
    }

    public String getPhoneNumber() {
        return textFieldPhoneNumber.getText();
    }

    public String getUserName() {
        return textFieldUserName.getText();
    }

    public String getPassword() {
        return new String(PasswordField.getPassword());
    }

    public String getReEnterPassword() {
        return new String(ReEnterPasswordField.getPassword());
    }

    public void addSignUpListener(ActionListener SignUp) {
        buttonSignUp.addActionListener(SignUp);
    }
}
