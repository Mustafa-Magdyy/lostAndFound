package lostAndFound;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class ItemModel {
	private String name, description, place, securityQuestion;
	private UserController owner;
	private ArrayList<responseController> response;
	
	public ItemModel() {name = ""; description = ""; place = ""; owner = null;}
	public ItemModel(UserController owner, String name, String description, String place, String securityQuestion) {
		this.owner = owner;
		this.name = name;
		this.description = description;
		this.place = place;
		this.securityQuestion = securityQuestion;
		response = new ArrayList<responseController>();
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getPlace() {
		return place;
	}
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	public String getSecurityQuestion() {
		return securityQuestion;
	}
	public void setOwner(UserController owner) {
		this.owner = owner;
	}
	public UserController getOwner() {
		return owner;
	}
	public void addResponse(responseController r) {
		response.add(r);
	}
	public responseController getResponse(int indx) {
		return response.get(indx);
	}
	public ArrayList<responseController> getAllResponses(){
		return response;
	}
}
