package lostAndFound;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserController {
	private UserView view;
	private UserItemEnteringView itemEnteringView;
	private UserModel model;
	
	public UserController(UserModel model, UserView view, UserItemEnteringView itemEnteringView) {
		this.view = view;
		this.model = model;
		this.itemEnteringView = itemEnteringView;
		
		view.addSaveListener(new saveListener());
		itemEnteringView.addSubmitListener(new submitListener());
	}
	public class saveListener implements ActionListener{	
		public void actionPerformed(ActionEvent click) {
			// save changes to user model and save changes to database
			System.out.println(view.getName() + "\n" + view.getUserName() + "\n" + view.getEmail());
		}
	}
	public class submitListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			ItemModel im = new ItemModel(lostAndFoundMVC.curUser, itemEnteringView.getName(), itemEnteringView.getDescription(), 
					itemEnteringView.getPlace(), itemEnteringView.getSecurityQuestion());
			ItemOwnerView iov = new ItemOwnerView(im);
			ItemUserView iuv = new ItemUserView(im);
			ItemSecurityView isv = new ItemSecurityView(im);	
			ItemResponseView irv = new ItemResponseView(im);
			ItemController ic = new ItemController(im, iov, iuv, isv, irv);
			model.addItem(ic);
			System.out.println("Done");
		}
		
	}
	public String getName() {
		return model.getName();
	}
	public void setName(String name) {
		model.setName(name);
	}
	public String getUserName() {
		return model.getUserName();
	}
	public void setUserName(String userName) {
		model.setUserName(userName);
	}
	public String getPhoneNumber() {
		return model.getPhoneNumber();
	}
	public void setPhoneNumber(String phoneNumber) {
		model.setPhoneNumber(phoneNumber);
	}
	public String getEmail() {
		return model.getEmail();
	}
	public void setEmail(String email) {
		model.setEmail(email);
	}
	public String getPassword() {
		return model.getPassword();
	}
	public void setPassword(String password) {
		model.setPassword(password);
	}
	public UserModel getModel() {
		return model;
	}
	public UserView getView() {
		return view;
	}

	public void view() {
		view.setVisible(true);
	}
}
