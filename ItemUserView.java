package lostAndFound;

import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ItemUserView extends JFrame{
	private JLabel labelOwnerName, labelOwnerEmail, labelOwnerPhoneNumber, labelName, labelDescription, labelPlace, image;
	private JTextField textFieldOwnerName, textFieldOwnerEmail, textFieldOwnerPhoneNumber, textFieldName, textFieldDescription, textFieldPlace;
	private JButton buttonMine;
	private ItemModel model;
	
	public ItemUserView(ItemModel model) {
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
		
		labelOwnerPhoneNumber = new JLabel("Phone Number: ");
		panel.add(labelOwnerPhoneNumber);
		textFieldOwnerPhoneNumber = new JTextField();
		textFieldOwnerPhoneNumber.setPreferredSize(new Dimension(200, 20));
		textFieldOwnerPhoneNumber.setEditable(false);
		textFieldOwnerPhoneNumber.setText(model.getOwner().getPhoneNumber());
		panel.add(textFieldOwnerPhoneNumber);
		
		labelOwnerEmail = new JLabel("Owner Email: ");
		panel.add(labelOwnerEmail);
		textFieldOwnerEmail = new JTextField();
		textFieldOwnerEmail.setPreferredSize(new Dimension(200, 20));
		textFieldOwnerEmail.setEditable(false);
		textFieldOwnerEmail.setText(model.getOwner().getEmail());
		panel.add(textFieldOwnerEmail);
		
		labelName = new JLabel("name: ");
		panel.add(labelName);
		textFieldName = new JTextField();
		textFieldName.setPreferredSize(new Dimension(200, 20));
		textFieldName.setEditable(false);
		textFieldName.setText(model.getName());
		panel.add(textFieldName);
		
		labelDescription = new JLabel("description: ");
		panel.add(labelDescription);
		textFieldDescription = new JTextField();
		textFieldDescription.setPreferredSize(new Dimension(200, 20));
		textFieldDescription.setEditable(false);
		textFieldDescription.setText(model.getDescription());
		panel.add(textFieldDescription);
		
		labelPlace = new JLabel("place: ");
		panel.add(labelPlace);
		textFieldPlace = new JTextField();
		textFieldPlace.setPreferredSize(new Dimension(200, 20));
		textFieldPlace.setEditable(false);
		textFieldPlace.setText(model.getPlace());
		panel.add(textFieldPlace);
		
		buttonMine = new JButton("Mine");
		panel.add(buttonMine);
		
		setTitle("Item Data");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		pack();
	}
	public void addMineListener(ActionListener mineListener) {
		buttonMine.addActionListener(mineListener);
	}
}
