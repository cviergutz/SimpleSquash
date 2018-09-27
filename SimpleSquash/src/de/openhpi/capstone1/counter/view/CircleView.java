package de.openhpi.capstone1.counter.view;

import de.openhpi.capstone1.counter.model.Subject;
import processing.core.PApplet;

public class CircleView extends Observer {

	public CircleView(PApplet display, Subject subject) {
		super(display, subject);
		update(1);
	}

	@Override
	public void update(Object value) {
		try {
			int v = (int) value;
			display.fill(255,0,0);
			display.ellipse(10+v, 10+v, 2*v, 2*v);
			display.redraw();
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}
	}

}
