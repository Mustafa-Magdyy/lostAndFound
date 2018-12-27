package lostAndFound;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static lostAndFound.lostAndFoundMVC.curUser;

public class HomeController {
    private HomeView view;

    public HomeController(HomeView view) {
        this.view = view;
        view.addProfileListener(new ProfileListener());
        view.addLogoutListener(new LogoutListener());
    }

    public class ProfileListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent click) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    UserView user = curUser.getView();
                    user.setVisible(true);
                }
            });
        }
    }

    public class LogoutListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent click) {
            // Logout
        }
    }
}
