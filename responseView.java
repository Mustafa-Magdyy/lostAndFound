package lostAndFound;

import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

// may be change from extend JPanel instead of JFrame after that we can create another window which will view
// a list of responses for specific item but i am not sure if that will work

public class responseView extends JPanel {
	private JTextArea textAreaAnswer;
	private JButton buttonViewUser;
	private responseModel model;
	
	public responseView(responseModel model) {
		this.model = model;
		
		textAreaAnswer = new JTextArea();
		textAreaAnswer.setLineWrap(true);
		textAreaAnswer.setWrapStyleWord(true);
		textAreaAnswer.setEditable(false);
		textAreaAnswer.setText(model.getAnswer());
		
		JScrollPane scroll = new JScrollPane(textAreaAnswer);
		scroll.setPreferredSize(new Dimension(350, 90));
		add(scroll);
		
		buttonViewUser = new JButton("View User");
		add(buttonViewUser);
	}
	public void addViewListener(ActionListener viewListener) {
		buttonViewUser.addActionListener(viewListener);
	}
	
}
