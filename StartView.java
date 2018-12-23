package lostAndFound;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StartView extends JFrame{

    private JButton buttonSignUp, buttonLogin;

    public StartView(){
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        buttonSignUp = new JButton("SignUp");
        panel.add(buttonSignUp);

        buttonLogin = new JButton("Login");
        panel.add(buttonLogin);

        setTitle("Start");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        pack();
    }
    public void addSignUpListener(ActionListener SignUp) {
        buttonSignUp.addActionListener(SignUp);
    }

    public void addLoginListener(ActionListener login) {
        buttonLogin.addActionListener(login);
    }

}
