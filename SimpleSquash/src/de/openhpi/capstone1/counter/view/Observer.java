package de.openhpi.capstone1.counter.view;

import de.openhpi.capstone1.counter.model.Subject;
import processing.core.PApplet;

public abstract class Observer {
	protected PApplet display;	
	
	public Observer(PApplet display, Subject subject) {
		this.display = display;
		subject.attach(this);
	}
	
	public abstract void update(Object value);
}
