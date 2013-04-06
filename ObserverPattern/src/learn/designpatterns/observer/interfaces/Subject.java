package learn.designpatterns.observer.interfaces;

public interface Subject {
	boolean subscribeObserver(Observer observer);

	boolean unsubscribeObserver(Observer observer);

	void updateObserver(Observer observer);

	void updateAll();

	void clearObservers();
}
