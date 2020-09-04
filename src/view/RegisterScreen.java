package view;

import java.util.ArrayList;

import model.User;
import processing.core.PApplet;

public class RegisterScreen extends Screen {

	private PApplet app;

	public RegisterScreen(PApplet app) {
		this.app = app;
	}

	public void register(String fullName, String email, String password,int posX, int posY) {
		controller.register(fullName, email, password,posX,posY);
	}

	public void draw() {
		ArrayList<User> listUsers = controller.getUsers();
		for (User user : listUsers) {
			if (user.getLoggedIn()) {
				app.fill(0, 255, 0);
			} else {
				app.fill(255, 255, 255);
			}
			app.ellipse(user.getPosX(), user.getPosY(), 100, 100);
			
		}

	}
	
	public void login(String email, String password) {
		controller.login(email,password);
	}

}
