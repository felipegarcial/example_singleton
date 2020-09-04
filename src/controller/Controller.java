package controller;

import java.util.ArrayList;

import model.Schedule;
import model.User;

public class Controller {
	protected Schedule schedule;
	
	
	public Controller() {
		schedule = new Schedule();
	}
	
	public void register(String fullName, String email, String password,int posX,int posY) {
		schedule.registerUser(fullName,email,password,posX,posY);
	}
	
	public void login(String email, String password) {
		schedule.login(email,password);
	}     
	
	public ArrayList<User> getUsers() {
		return schedule.getListUsers();
	}
}
