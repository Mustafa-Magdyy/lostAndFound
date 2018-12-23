package lostAndFound;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserController {
	private UserView view;
	private UserModel model;
	
	public UserController(UserView view, UserModel model) {
		this.view = view;
		this.model = model;
		
		view.addSaveListener(new saveListener());
	}
	public class saveListener implements ActionListener{	
		public void actionPerformed(ActionEvent click) {
			// save changes to user model and save changes to database
			System.out.println(view.getName() + "\n" + view.getUserName() + "\n" + view.getEmail());
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
	public int getAge() {
		return model.getAge();
	}
	public void setAge(int age) {
		model.setAge(age);
	}
	public void view() {
		view.setVisible(true);
	}
}
