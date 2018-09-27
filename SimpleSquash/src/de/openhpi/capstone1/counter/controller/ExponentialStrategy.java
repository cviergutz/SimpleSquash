package de.openhpi.capstone1.counter.controller;

public class ExponentialStrategy implements Strategy {

	private boolean increase = true;
	private int factor = 2;

	@Override
	public int operate(int value) {
		if (value <= 0)
			return 1;

		if (value > 250)
			increase = false;
		else if (value <= 1)
			increase = true;
		
		return increase ? value * factor : value / factor;
	}

}
