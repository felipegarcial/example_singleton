package view;

import controller.Controller;

public abstract class Screen {
	
	protected Controller controller;
	
	public Screen() {
		controller = new Controller();
	}
	
	public abstract void draw();
	
	public void button() {
		
	}
}
