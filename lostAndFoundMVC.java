package lostAndFound;

import javax.swing.SwingUtilities;

public class lostAndFoundMVC {
	public static UserController curUser;
	public static void main(String[] args) {
		UserModel owner = new UserModel("Mustafa", "Mustafa_Magdy", "+201061393805", "dar41997@gamil.com", "180613059", 22);
		UserView ownerView = new UserView(owner);
		UserController ownerController = new UserController(ownerView, owner);
		
		ItemModel im = new ItemModel(ownerController, "mobile", "samsung Note 3", "Giza", "what is the phone password ??", null);
		ItemOwnerView iov = new ItemOwnerView(im);
		ItemUserView iuv = new ItemUserView(im);
		ItemSecurityView isv = new ItemSecurityView(im);
		ItemResponseView irv = new ItemResponseView(im);
		ItemController ic = new ItemController(iov, iuv, isv, irv, im);
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				irv.setVisible(true);
			}
		});
	}
}
