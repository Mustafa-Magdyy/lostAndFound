package lostAndFound;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserController {
	private UserView view;
	private UserModel model;
	
	public UserController(UserView view, UserModel model) {
		this.view = view;
		this.model = model;
		
		view.addSaveListener(new saveListener());
	}
	
	public class saveListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			// save changes to user model and save changes to database
			System.out.println(view.getName() + "\n" + view.getUserName() + "\n" + view.getEmail());
		}
	}
}
