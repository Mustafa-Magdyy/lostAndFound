package lostAndFound;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

public class responseController {
	private responseModel model;
	private responseView view;
	
	public responseController(responseModel model, responseView view) {
		this.model = model;
		this.view = view;
		
		view.addViewListener(new viewListener());
	}
	public class viewListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					model.getUser().view();
				}
			});
		}
	}
	public responseModel getModel() {
		return model;
	}
	public responseView getView() {
		return view;
	}
}
