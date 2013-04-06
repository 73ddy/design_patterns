package learn.designpattern.observer.simulator;

import learn.designpattern.observer.entities.Author;
import learn.designpattern.observer.entities.News;
import learn.designpattern.observer.entities.NewsReader;
import learn.designpattern.observer.entities.GlobalTimes;

/*
 * Read the code like a story
 */
public class NewspaparSimulator {
	// We have a renowned author/journalist, who works for GlobalTimes (fictitious newspaper)
	private static final Author author = new Author("Deepak", "Chaurasia", GlobalTimes.getInstance());

	// We also have 3 news reader who may or may not subscribe to GlobalTimes
	private static final NewsReader reader1 = new NewsReader("Reader1");
	private static final NewsReader reader2 = new NewsReader("Reader2");
	private static final NewsReader reader3 = new NewsReader("Reader3");

	private static News news = null;

	public static void main(String[] args) {
		// readers1 and 3 are interested in reading a specific newspaper
		reader1.subscribe(GlobalTimes.getInstance());
		reader3.subscribe(GlobalTimes.getInstance());
		
		// Suddenly something happens in this world, which must be published as a news.
		news = new News("News Headline for News1.", 
				"News Detail for News1.");
		
		// Our author publishes the news in GlobalTimes, with the intent of letting the readers know
		author.publishNews(news);
		
		/*-
		 * Reader 1 and 3 are updated with the news as they have subscribed GlobalTimes.
		 * While Reader 2 is never informed as the reader never subscribed to GlobalTimes.
		 */
	}
}
