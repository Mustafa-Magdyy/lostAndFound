package lostAndFound;

import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserItemEnteringView extends JFrame{
	private JLabel labelPlease, labelName, labelDescription, labelPlace, labelSecurityQuestion;
	private JTextField textFieldName, textFieldDescription, textFieldSecurityQuestion;
	private JComboBox<String> comboBoxPlace;
	private JButton buttonSubmit;
	private UserModel model;
	
	public UserItemEnteringView(UserModel model) {
		this.model = model;
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		labelPlease = new JLabel("please Enter Item date: ");
		panel.add(labelPlease);
		
		labelName = new JLabel("Name: ");
		panel.add(labelName);
		textFieldName = new JTextField();
		textFieldName.setPreferredSize(new Dimension(200, 20));
		panel.add(textFieldName);
		
		labelDescription = new JLabel("Description: ");
		panel.add(labelDescription);
		textFieldDescription = new JTextField();
		textFieldDescription.setPreferredSize(new Dimension(200, 20));
		panel.add(textFieldDescription);
		
		labelPlace = new JLabel("Place: ");
		panel.add(labelPlace);
		comboBoxPlace = new JComboBox<String>();
		comboBoxPlace = new JComboBox<String>();
		comboBoxPlace.addItem("Cairo");
		comboBoxPlace.addItem("Alexandria");
		comboBoxPlace.addItem("Giza");
		comboBoxPlace.addItem("Shubra El Kheima");
		comboBoxPlace.addItem("Port Said");
		comboBoxPlace.addItem("Suez");
		comboBoxPlace.addItem("tanta");
		comboBoxPlace.addItem("El Mahalla el Kubra");
		comboBoxPlace.addItem("El Mansoura");
		comboBoxPlace.addItem("Asyut");
		comboBoxPlace.addItem("Fayoum");
		comboBoxPlace.addItem("Zagazig");
		panel.add(comboBoxPlace);
		
		labelSecurityQuestion = new JLabel("Security Question: ");
		panel.add(labelSecurityQuestion);
		textFieldSecurityQuestion = new JTextField();
		textFieldSecurityQuestion.setPreferredSize(new Dimension(250, 20));
		panel.add(textFieldSecurityQuestion);
		
		buttonSubmit = new JButton("Submit");
		panel.add(buttonSubmit);
		
		setTitle("Profile");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		pack();
	}
	public String getName() {
		return textFieldName.getText();
	}
	public void setName(String name) {
		textFieldName.setText(name);
	}
	public String getDescription() {
		return textFieldDescription.getText();
	}
	public void setDescription(String description) {
		textFieldDescription.setText(description);
	}
	public String getPlace() {
		return comboBoxPlace.getSelectedItem().toString();
	}
	public String getSecurityQuestion() {
		return textFieldSecurityQuestion.getText();
	}
	public void setSecurityQuestion(String securityQuestion) {
		textFieldSecurityQuestion.setText(securityQuestion);
	}
	public void addSubmitListener(ActionListener submitListener) {
		buttonSubmit.addActionListener(submitListener);
	}
	
}
