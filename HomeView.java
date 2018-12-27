package lostAndFound;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HomeView extends JFrame{
    private JButton buttonProfile, buttonLogout;

    public HomeView(){
        JPanel panel = new JPanel();
        getContentPane().add(panel);


        buttonProfile = new JButton("Profile");
        panel.add(buttonProfile);

        buttonLogout = new JButton("Logout");
        panel.add(buttonLogout);



        setTitle("Home");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        pack();
    }

    public void addProfileListener(ActionListener profile) {
        buttonProfile.addActionListener(profile);
    }

    public void addLogoutListener(ActionListener logout) {
        buttonLogout.addActionListener(logout);
    }
}
