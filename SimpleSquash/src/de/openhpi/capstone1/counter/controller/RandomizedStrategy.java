package de.openhpi.capstone1.counter.controller;

import java.util.Random;

/**
 * A RandomizedStrategy will create a random integer value and return it via <code>operate</code> method.
 */
public class RandomizedStrategy implements Strategy {

	private Random random = new Random();

	@Override
	public int operate(int value) {
		return random.nextInt(250);
	}

}
