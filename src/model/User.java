package model;

public class User {

	private String fullName;
	private String email;
	private String password;
	private boolean isLoggedIn;
	private int posX,posY;
	
	public User(String fullName, String email, String password, int posX, int posY) {
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.posX = posX;
		this.posY = posY;
		isLoggedIn = false;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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

	public boolean getLoggedIn() {
		return isLoggedIn;
	}

	public void setLoggedIn(boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

}
