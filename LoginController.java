package lostAndFound;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static lostAndFound.lostAndFoundMVC.curUser;
import static lostAndFound.lostAndFoundMVC.users;

public class LoginController {
	private LoginView view;
	
	public LoginController(LoginView view) {
		this.view = view;
		view.addLoginListener(new LoginListener());
	}

	private int verify() {
		for (int i = 0; i < users.size(); ++i) {
			if (users.get(i).getUserName().equals(view.getUserName()) && users.get(i).getPassword().equals(view.getPassword())) {
				return i;
			}
		}
		return -1;
	}
	
	public class LoginListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent click) {
			int idx = verify();
			if (idx != -1) {
				UserView userView = new UserView(users.get(idx));
				UserItemEnteringView userItemEnteringView = new UserItemEnteringView(users.get(idx));
				curUser = new UserController(users.get(idx), userView, userItemEnteringView);

				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						HomeView home = new HomeView();
						HomeController homecon = new HomeController(home);
						home.setVisible(true);
					}
				});
//				System.out.println("successful login");
			} else {
				System.out.println("failed login");

			}
		}
	}
}
