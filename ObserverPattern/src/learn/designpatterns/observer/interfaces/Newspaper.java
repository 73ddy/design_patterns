package learn.designpatterns.observer.interfaces;

import learn.designpattern.observer.entities.News;

public interface Newspaper extends Subject {
	public void addNews(News news);
}
