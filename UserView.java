package lostAndFound;

import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserView extends JFrame {
	private JLabel labelName, labelUserName, labelPhoneNumber, labelEmail, labelPassword, labelAge;
	private JTextField textFieldName, textFieldUserName, textFieldPhoneNumber, textFieldEmail, textFieldPassword, textFieldAge;
	private JButton buttonSave;
	private UserModel model;
	
	public UserView(UserModel model){
		this.model = model;
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		labelName = new JLabel("Name: ");
		panel.add(labelName);
		textFieldName = new JTextField();
		textFieldName.setPreferredSize(new Dimension(200, 20));
		textFieldName.setText(model.getName());
		panel.add(textFieldName);
		
		labelUserName = new JLabel("User Name: ");
		panel.add(labelUserName);
		textFieldUserName = new JTextField();
		textFieldUserName.setPreferredSize(new Dimension(200, 20));
		textFieldUserName.setText(model.getUserName());
		panel.add(textFieldUserName);
		
		labelPhoneNumber = new JLabel("Phone Number: ");
		panel.add(labelPhoneNumber);
		textFieldPhoneNumber = new JTextField();
		textFieldPhoneNumber.setPreferredSize(new Dimension(200, 20));
		textFieldPhoneNumber.setText(model.getPhoneNumber());
		panel.add(textFieldPhoneNumber);
		
		labelEmail = new JLabel("Email: ");
		panel.add(labelEmail);
		textFieldEmail = new JTextField();
		textFieldEmail.setPreferredSize(new Dimension(200, 20));
		textFieldEmail.setText(model.getEmail());
		panel.add(textFieldEmail);
		
		labelPassword = new JLabel("Password: ");
		panel.add(labelPassword);
		textFieldPassword = new JTextField();
		textFieldPassword.setPreferredSize(new Dimension(200, 20));
		textFieldPassword.setText(model.getPassword());
		panel.add(textFieldPassword);
		
		labelAge = new JLabel("Age: ");
		panel.add(labelAge);
		textFieldAge = new JTextField();
		textFieldAge.setPreferredSize(new Dimension(200, 20));
		textFieldAge.setText(Integer.toString(model.getAge()));
		panel.add(textFieldAge);
		
		buttonSave = new JButton("Save");
		panel.add(buttonSave);
		
		setTitle("Profile");
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
	public String getPhoneNumber() {
		return textFieldPhoneNumber.getText();
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
