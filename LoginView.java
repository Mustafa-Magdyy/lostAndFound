package lostAndFound;

import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends JFrame{
	private JLabel labelUserName, labelPassword;
	private JTextField textFieldUserName;
	private JPasswordField PasswordField;
	private JButton buttonLogin;
	
	public LoginView(){
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		labelUserName = new JLabel();
		labelUserName.setText("User Name: ");
		panel.add(labelUserName);
		
		textFieldUserName = new JTextField();
		textFieldUserName.setPreferredSize(new Dimension(200, 20));
		panel.add(textFieldUserName);
		
		labelPassword = new JLabel();
		labelPassword.setText("Password: ");
		panel.add(labelPassword);
		
		PasswordField = new JPasswordField();
		PasswordField.setPreferredSize(new Dimension(200, 20));
		PasswordField.setEchoChar('*');
		panel.add(PasswordField);
		
		buttonLogin = new JButton("Login");
		panel.add(buttonLogin);
		
		setTitle("Login");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		pack();
	}
	public void addLoginListener(ActionListener login) {
		buttonLogin.addActionListener(login);
	}
}
