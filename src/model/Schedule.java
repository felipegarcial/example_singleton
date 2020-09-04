package model;

import java.util.ArrayList;

public class Schedule {

	private ArrayList<User> listUsers;

	
	public Schedule() {
		listUsers = new ArrayList<User>();
	}
	
	public void login(String email, String password) {
		for (int i = 0; i < listUsers.size(); i++) {
			if (listUsers.get(i).getEmail().equalsIgnoreCase(email)
					&& listUsers.get(i).getPassword().equalsIgnoreCase(password)) {
				listUsers.get(i).setLoggedIn(true);

			}
		}
	}

	public void registerUser(String fullName, String email, String password, int posX, int posY) {
		listUsers.add(new User(fullName, email, password, posX, posY));
	}

	public ArrayList<User> getListUsers() {
		return listUsers;
	}
}
