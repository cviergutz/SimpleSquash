package de.openhpi.capstone1.counter.starter;


import de.openhpi.capstone1.counter.controller.CounterController;
import de.openhpi.capstone1.counter.model.Counter;
import de.openhpi.capstone1.counter.view.CircleView;
import de.openhpi.capstone1.counter.view.CounterView;
import de.openhpi.capstone1.counter.view.Observer;
import processing.core.PApplet;

public class TheApp extends PApplet {

	private Observer counterView, circleView;
	private CounterController counterController;
	private Counter counter;

	@Override
	public void settings() {
		size(500, 500);
	}

	@Override
	public void setup() {  // setup() runs once
		frameRate(30);
		counter = new Counter();
		counterController = new CounterController(counter);
		
		counterView = new CounterView(this, counter);
		circleView = new CircleView(this, counter);
	}

	@Override
	public void draw() {
	}  // draw() loops forever, until stopped
	
	@Override
	public void mouseClicked() {
		counterController.handleEvent();
	}

	@Override
	public void keyPressed() {
		counterController.handleEvent();
	}
	
	
}
