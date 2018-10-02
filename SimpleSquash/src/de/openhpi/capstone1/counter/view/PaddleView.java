package de.openhpi.capstone1.counter.view;

import de.openhpi.capstone1.counter.model.Paddle;
import de.openhpi.capstone1.counter.model.Subject;
import processing.core.PApplet;

public class PaddleView extends Observer {

	Paddle paddle = null;

	public PaddleView(PApplet display, Subject subject) {
		super(display, subject);
		this.paddle = (Paddle) subject;
		update(0);
	}

	@Override
	public void update(Object value) {
		display.background(220);
		display.fill(255, 255, 0);
		display.rect(paddle.getxPos(), paddle.getyPos(), paddle.getWidth(), paddle.getHeight());
		display.redraw();
	}

}
