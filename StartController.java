package lostAndFound;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartController {
    private StartView view;

    public StartController(StartView view) {
        this.view = view;

        view.addSignUpListener(new SignUpListener());
        view.addLoginListener(new LoginListener());
    }

    public class SignUpListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent click) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    SignUpView signup = new SignUpView();
                    SignUpController signupcon = new SignUpController(signup);
                    signup.setVisible(true);
                }
            });
        }
    }

    public class LoginListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent click) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    LoginView login = new LoginView();
                    LoginController logincon = new LoginController(login);
                    login.setVisible(true);
                }
            });
        }
    }
}
