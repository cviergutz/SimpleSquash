package de.openhpi.capstone1.counter.controller;

import java.util.Random;

public class RandomizedStrategy implements Strategy {

	private Random random = new Random();
	
	@Override
	public int operate(int value) {
		return random.nextInt(250);
	}

}
