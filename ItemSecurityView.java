package lostAndFound;

import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ItemSecurityView extends JFrame{
	private JLabel labelIntro, labelQuestion;
	private JTextArea textAreaAnswer;
	private JButton buttonSubmit;
	private ItemModel model;
	
	public ItemSecurityView(ItemModel model) {
		this.model = model;
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		labelIntro = new JLabel("Please answer the following question: ");
		panel.add(labelIntro);
		
		labelQuestion = new JLabel(model.getSecurityQuestion());
		panel.add(labelQuestion);
		
		textAreaAnswer = new JTextArea();
		textAreaAnswer.setLineWrap(true);
		textAreaAnswer.setWrapStyleWord(true);
		JScrollPane scroll = new JScrollPane(textAreaAnswer);
		scroll.setPreferredSize(new Dimension(350, 90));
		panel.add(scroll);
		
		buttonSubmit = new JButton("Submit");
		panel.add(buttonSubmit);
		
		setTitle("Sequrity Question");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		pack();
	}
	public String getAnswer() {
		return textAreaAnswer.getText();
	}
	public void addSubmitListener(ActionListener submitListener) {
		buttonSubmit.addActionListener(submitListener);
	}
}
