package lostAndFound;

import javax.swing.SwingUtilities;

public class lostAndFoundMVC {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new LoginView().setVisible(true);
			}
		});
	}
}
