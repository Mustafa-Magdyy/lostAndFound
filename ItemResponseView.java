package lostAndFound;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ItemResponseView extends JFrame{
	private ItemModel model;
	
	public ItemResponseView(ItemModel model) {
		this.model = model;
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		ArrayList<responseController> response = model.getAllResponses();
		for(responseController rc : response) {
			panel.add(rc.getView());
		}
		
		setTitle("All Responses");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		pack();
	}
}
