package lostAndFound;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController {
	private LoginView view;
	
	public LoginController(LoginView view) {
		this.view = view;
		
		view.addLoginListener(new LoginListener());
	}
	
	public class LoginListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent click) {
			System.out.println("successful login");
		}
	}
	
}
