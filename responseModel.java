package lostAndFound;

public class responseModel {
	private UserController user;
	private String answer;
	
	public responseModel() {
		user = null;
		answer = "";
	}
	public responseModel(UserController user, String answer) {
		this.user = user;
		this.answer = answer;
	}
	public void setUser(UserController user) {
		this.user = user;
	}
	public UserController getUser() {
		return user;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getAnswer() {
		return answer;
	}
}
