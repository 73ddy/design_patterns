package learn.designpattern.observer.entities;

import learn.designpatterns.observer.interfaces.Observer;
import learn.designpatterns.observer.interfaces.Subject;

public class NewsReader implements Observer {
	private String name;

	public NewsReader(String name) {
		this.name = name;
	}

	@Override
	public void update(News news) {
		System.out.println(name + ", was informed about - News(" + news.getHeading() + ")");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void subscribe(Subject subject) {
		subject.subscribeObserver(this);
	}
}