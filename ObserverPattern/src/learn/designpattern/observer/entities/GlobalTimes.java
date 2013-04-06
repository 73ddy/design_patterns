package learn.designpattern.observer.entities;

import java.util.ArrayList;
import java.util.List;

import learn.designpatterns.observer.interfaces.Newspaper;
import learn.designpatterns.observer.interfaces.Observer;

// Singleton implementation of Newspaper
public class GlobalTimes implements Newspaper {

	private List<Observer> readers = new ArrayList<Observer>();
	private static final GlobalTimes instance = new GlobalTimes();
	private final List<News> allNews = new ArrayList<News>();

	private GlobalTimes() {

	}

	public static GlobalTimes getInstance() {
		return instance;
	}

	@Override
	public boolean subscribeObserver(Observer observer) {
		return readers.add(observer);
	}

	@Override
	public boolean unsubscribeObserver(Observer observer) {
		boolean removed = false;
		if (readers.contains(observer)) {
			removed = readers.remove(observer);
		}
		return removed;
	}

	@Override
	public void updateAll() {
		if (allNews.size() > 0) {
			for (Observer observer : readers) {
				observer.update(allNews.get(allNews.size() - 1));
			}
		}
	}

	@Override
	public void clearObservers() {
		readers.clear();
	}

	@Override
	public void updateObserver(Observer observer) {
		if (allNews.size() > 1) {
			observer.update(allNews.get(allNews.size() - 1));
		}
	}

	@Override
	public void addNews(News news) {
		allNews.add(news);
		updateAll();
	}
}
