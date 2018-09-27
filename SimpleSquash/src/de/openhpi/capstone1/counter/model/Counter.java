package de.openhpi.capstone1.counter.model;

import java.util.ArrayList;
import java.util.List;

import de.openhpi.capstone1.counter.controller.ContinousStrategy;
import de.openhpi.capstone1.counter.controller.ExponentialStrategy;
import de.openhpi.capstone1.counter.controller.Strategy;
import de.openhpi.capstone1.counter.view.Observer;

public class Counter implements Subject {

	private int count = 0;
	private List<Observer> observers = new ArrayList<Observer>();
	private Strategy strategy = new ExponentialStrategy();

	public int getCount() {
		return count;
	}
	
	public void updateCount() {
		count = strategy.operate(count);
		notifyAllObservers();
	}
	
	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	@Override
	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update(count);
		}
	}
}
