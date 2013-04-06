package learn.designpatterns.observer.interfaces;

import learn.designpattern.observer.entities.News;

public interface Observer {
	public void update(News news);
}
