package lostAndFound;

import javax.swing.SwingUtilities;
import java.util.ArrayList;

public class lostAndFoundMVC {
	public static ArrayList<UserModel> users = new ArrayList<>();
	public static UserController curUser;
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				StartView start = new StartView();
				StartController startcon = new StartController(start);
				start.setVisible(true);
			}
		});

		UserModel owner = new UserModel("Mustafa", "Mustafa_Magdy", "+201061393805", "dar41997@gamil.com", "180613059");
		UserView ownerView = new UserView(owner);
		UserItemEnteringView uiev = new UserItemEnteringView(owner);
		UserController ownerController = new UserController(owner, ownerView, uiev);
		curUser = ownerController;
		
		ItemModel im = new ItemModel(ownerController, "mobile", "samsung Note 3", "Giza", "what is the phone password ??");
		ItemOwnerView iov = new ItemOwnerView(im);
		ItemUserView iuv = new ItemUserView(im);
		ItemSecurityView isv = new ItemSecurityView(im);
		ItemResponseView irv = new ItemResponseView(im);
		ItemController ic = new ItemController(im, iov, iuv, isv, irv);
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				uiev.setVisible(true);
			}
		});
	}
}
