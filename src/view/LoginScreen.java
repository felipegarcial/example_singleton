package view;

import java.util.ArrayList;
import model.User;
import processing.core.PApplet;

public class LoginScreen extends Screen{
	
	private PApplet app;
	
	
	public LoginScreen(PApplet app) {
		this.app = app;
	}
	
	public void draw() {
		ArrayList<User> listUsers = controller.getUsers(); 
		/*for (User user : listUsers) {
			if(user.isLoggedIn()) {
				app.fill(0,255,0);
			}else {
				app.fill(255,255,255);
			}
			app.ellipse(app.random(100,300), 200, 100, 100);
		}*/
		
	}
	
	private void drawButton() {
		app.rect(200,200,100,50);
	}
	
	public void login(String email, String password) {
		controller.login(email,password);
	}

}
