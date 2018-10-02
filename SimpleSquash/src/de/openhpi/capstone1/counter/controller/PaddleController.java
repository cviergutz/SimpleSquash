package de.openhpi.capstone1.counter.controller;

import de.openhpi.capstone1.counter.model.Paddle;

public class PaddleController {

	private Paddle paddle;
	
	public PaddleController(Paddle p) {
		paddle = p;
	}
	
	public void handleEvent(Direction dir) {
		paddle.move(dir);
	}
	
}
