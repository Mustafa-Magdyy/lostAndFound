package lostAndFound;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpController {
    private SignUpView view;

    public SignUpController(SignUpView view) {
        this.view = view;

        view.addLoginListener(new SignUpListener());
    }

    public class SignUpListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent click) {
            // access data base here
            System.out.println("successful SignUp");
        }
    }
}
