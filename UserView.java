package lostAndFound;

import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserView extends JFrame {
	private JLabel labelName, labelUserName, labelEmail, labelPassword, labelAge;
	private JTextField textFieldName, textFieldUserName, textFieldEmail, textFieldPassword, textFieldAge;
	private JButton buttonSave;
	
	public UserView(){
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		labelName = new JLabel("Name: ");
		panel.add(labelName);
		textFieldName = new JTextField();
		textFieldName.setPreferredSize(new Dimension(200, 20));
		panel.add(textFieldName);
		
		labelUserName = new JLabel("User Name: ");
		panel.add(labelUserName);
		textFieldUserName = new JTextField();
		textFieldUserName.setPreferredSize(new Dimension(200, 20));
		panel.add(textFieldUserName);
		
		labelEmail = new JLabel("Email: ");
		panel.add(labelEmail);
		textFieldEmail = new JTextField();
		textFieldEmail.setPreferredSize(new Dimension(200, 20));
		panel.add(textFieldEmail);
		
		labelPassword = new JLabel("Password: ");
		panel.add(labelPassword);
		textFieldPassword = new JTextField();
		textFieldPassword.setPreferredSize(new Dimension(200, 20));
		panel.add(textFieldPassword);
		
		labelAge = new JLabel("Age: ");
		panel.add(labelAge);
		textFieldAge = new JTextField();
		textFieldAge.setPreferredSize(new Dimension(200, 20));
		panel.add(textFieldAge);
		
		buttonSave = new JButton("Save");
		panel.add(buttonSave);
		
		setTitle("Login");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		pack();
	}
	public String getName() {
		return textFieldName.getText();
	}
	public String getUserName() {
		return textFieldUserName.getText();
	}
	public String getEmail() {
		return textFieldEmail.getText();
	}
	public String getPassword() {
		return textFieldPassword.getText();
	}
	public int getAge() {
		return Integer.parseInt(textFieldAge.getText());
	}
	public void addSaveListener(ActionListener saveListener) {
		buttonSave.addActionListener(saveListener);
	}
}
