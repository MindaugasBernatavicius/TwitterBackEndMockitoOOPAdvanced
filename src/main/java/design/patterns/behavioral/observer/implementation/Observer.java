package design.patterns.behavioral.observer.implementation;

public abstract class Observer {
	protected Subject subject;
	abstract void update();
}
