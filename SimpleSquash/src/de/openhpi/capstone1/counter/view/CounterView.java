package de.openhpi.capstone1.counter.view;

import de.openhpi.capstone1.counter.model.Counter;
import processing.core.PApplet;

public class CounterView extends Observer {


	public CounterView(PApplet display, Counter subject) {
		super(display, subject);
		update(1);
	}

	public void update(Object value) {
		try {
			int x = (int) value;
			display.background(220);
			display.fill(0, 255, 0);
			display.rect(2*x, 10, 10, 10);
			display.redraw();
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}
	}

}
