package view;

import processing.core.PApplet;

public class Main extends PApplet {

	private LoginScreen loginScreen;
	private RegisterScreen registerScreen;
	private int screens;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}

	public void settings() {
		size(400, 400);
	}

	public void setup() {
		registerScreen = new RegisterScreen(this);
		screens = 0;
		rectMode(CENTER);
	}

	public void draw() {
		switch (screens) {
		case 0:
			background(255);
			break;
		case 1:
			background(0);
			registerScreen.draw();
			break;

		default:
			break;
		}
	}

	public void mousePressed() {
		switch (screens) {
		case 0:
			registerScreen.register("Felipe García", "pipegarlo@hotmail.com", "12345",100,200);
			registerScreen.register("Juan Pablo", "jp@hotmail.com", "12345",300,200);
			screens++;
			break;
		case 1:
			registerScreen.login("jp@hotmail.com", "12345");
			break;
		default:
			break;
		}

	}
}
