package de.openhpi.capstone1.counter.model;

import java.util.ArrayList;
import java.util.List;

import de.openhpi.capstone1.counter.controller.Direction;
import de.openhpi.capstone1.counter.view.Observer;

public class Paddle implements Subject {

	private int xPos, yPos, width, height;
	private List<Observer> observers = new ArrayList<Observer>();

	public Paddle(int xPos, int yPos, int width, int height) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = width;
		this.height = height;
	}

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void notifyAllObservers() {
		for (Observer o : observers) {
			o.update(xPos);
		}
	}

	public int getxPos() {
		return xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void move(Direction dir) {
		switch (dir) {
		case LEFT:
			this.xPos = (xPos <= 10) ? 10 : xPos - 2;
			break;

		case RIGHT:
			this.xPos = (xPos >= 200) ? 200 : xPos + 2;
			break;
		}
		notifyAllObservers();
	}
}
