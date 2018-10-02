package de.openhpi.capstone1.counter.starter;

import de.openhpi.capstone1.counter.controller.CounterController;
import de.openhpi.capstone1.counter.controller.Direction;
import de.openhpi.capstone1.counter.controller.PaddleController;
import de.openhpi.capstone1.counter.model.Counter;
import de.openhpi.capstone1.counter.model.Paddle;
import de.openhpi.capstone1.counter.view.CircleView;
import de.openhpi.capstone1.counter.view.CounterView;
import de.openhpi.capstone1.counter.view.Observer;
import de.openhpi.capstone1.counter.view.PaddleView;
import processing.core.PApplet;
import processing.core.PConstants;

public class TheApp extends PApplet {

	private Observer counterView, circleView;
	private CounterController counterController;
	private Counter counter;

	private Paddle paddle;
	private PaddleController paddleController;
	private PaddleView paddleView;

	@Override
	public void settings() {
		size(500, 500);
	}

	@Override
	public void setup() { // setup() runs once
		frameRate(30);
		counter = new Counter();
		counterController = new CounterController(counter);

		counterView = new CounterView(this, counter);
		circleView = new CircleView(this, counter);

		paddle = new Paddle(10, 150, 40, 20);
		paddleController = new PaddleController(paddle);
		paddleView = new PaddleView(this, paddle);

	}

	@Override
	public void draw() {
	} // draw() loops forever, until stopped

	@Override
	public void mouseClicked() {
//		counterController.handleEvent();

		switch (mouseButton) {
		case PConstants.LEFT:
			paddleController.handleEvent(Direction.LEFT);
			break;

		case PConstants.RIGHT:
			paddleController.handleEvent(Direction.RIGHT);
			break;
		}

	}

	@Override
	public void keyPressed() {
		// counterController.handleEvent();

		switch (keyCode) {
		case PConstants.LEFT:
			paddleController.handleEvent(Direction.LEFT);
			break;

		case PConstants.RIGHT:
			paddleController.handleEvent(Direction.RIGHT);
			break;
		}

	}

}
