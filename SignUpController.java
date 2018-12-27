package lostAndFound;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static lostAndFound.lostAndFoundMVC.users;

public class SignUpController {
    private SignUpView view;

    public SignUpController(SignUpView view) {
        this.view = view;
        view.addSignUpListener(new SignUpListener());
    }

    private boolean verify() {
        for(int i = 0; i < users.size(); ++i) {
            if (users.get(i).getUserName().equals(view.getUserName()) || users.get(i).getEmail().equals(view.getEmail()) || users.get(i).getPhoneNumber().equals(view.getPhoneNumber())) {
                return false;
            }
        }
        return view.getPassword().equals(view.getReEnterPassword());
    }

    public class SignUpListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent click) {
            if (verify()) {
                users.add(new UserModel(view.getName(), view.getUserName(), view.getPhoneNumber(), view.getEmail(), view.getPassword()));
//                System.out.println("successful SignUp");
            } else {
                System.out.println("failed SignUp");

            }
        }
    }
}
