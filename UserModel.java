package lostAndFound;

import java.util.ArrayList;

public class UserModel {
	private String name, userName, phoneNumber, email, password;
	private ArrayList<ItemController> item;
	
	public UserModel() {}
	public UserModel(String name, String userName, String phoneNumber, String email, String password) {
		item = new ArrayList<ItemController>();
		this.name = name;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void addItem(ItemController ic) {
		item.add(ic);
	}
	public void getItem(int indx) {
		item.get(indx);
	}
	
}
