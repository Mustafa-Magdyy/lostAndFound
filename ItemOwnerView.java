package lostAndFound;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// don't forget to add security question to owner view 

public class ItemOwnerView extends JFrame{
	private JLabel labelOwnerName, labelOwnerEmail, labelPhoneNumber, labelName, labelDescription, labelPlace, image;
	private JTextField textFieldOwnerName, textFieldOwnerEmail, textFieldPhoneNumber, textFieldName, textFieldDescription;
	private JComboBox<String> comboBoxPlace;
	private JButton buttonSave, buttonViewResponse;
	private ItemModel model;
	
	public ItemOwnerView(ItemModel model){
		this.model = model;
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		labelOwnerName = new JLabel("Owner Name: ");
		panel.add(labelOwnerName);
		textFieldOwnerName = new JTextField();
		textFieldOwnerName.setPreferredSize(new Dimension(200, 20));
		textFieldOwnerName.setEditable(false);
		textFieldOwnerName.setText(model.getOwner().getName());
		panel.add(textFieldOwnerName);
		
		labelOwnerEmail = new JLabel("Owner Email: ");
		panel.add(labelOwnerEmail);
		textFieldOwnerEmail = new JTextField();
		textFieldOwnerEmail.setPreferredSize(new Dimension(200, 20));
		textFieldOwnerEmail.setEditable(false);
		textFieldOwnerEmail.setText(model.getOwner().getEmail());
		panel.add(textFieldOwnerEmail);
		
		labelPhoneNumber = new JLabel("Phone Number: ");
		panel.add(labelPhoneNumber);
		textFieldPhoneNumber = new JTextField();
		textFieldPhoneNumber.setPreferredSize(new Dimension(200, 20));
		textFieldPhoneNumber.setEditable(false);
		textFieldPhoneNumber.setText(model.getOwner().getPhoneNumber());
		panel.add(textFieldPhoneNumber);
		
		labelName = new JLabel("name: ");
		panel.add(labelName);
		textFieldName = new JTextField();
		textFieldName.setPreferredSize(new Dimension(200, 20));
		textFieldName.setText(model.getName());
		panel.add(textFieldName);
		
		labelDescription = new JLabel("description: ");
		panel.add(labelDescription);
		textFieldDescription = new JTextField();
		textFieldDescription.setPreferredSize(new Dimension(200, 20));
		textFieldDescription.setText(model.getDescription());
		panel.add(textFieldDescription);
		
		labelPlace = new JLabel("place: ");
		panel.add(labelPlace);
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
		
		buttonSave = new JButton("Save");
		panel.add(buttonSave);
		
		buttonViewResponse = new JButton("View Response");
		panel.add(buttonViewResponse);
		
		setTitle("Item Data");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		pack();
	}
	public String getName() {
		return textFieldName.getText();
	}
	public String getDescription() {
		return textFieldDescription.getText();
	}
	public String getPlace() {
		return comboBoxPlace.getSelectedItem().toString();
	}
	public void addSaveListener(ActionListener saveListener) {
		buttonSave.addActionListener(saveListener);
	}
	public void addViewListener(ActionListener viewListener) {
		buttonViewResponse.addActionListener(viewListener);
	}
}
