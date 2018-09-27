package de.openhpi.capstone1.counter.controller;

public class ContinousStrategy implements Strategy {

	@Override
	public int operate(int value) {
		return value+2;
	}

}
