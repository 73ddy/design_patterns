package learn.designpattern.observer.entities;

import java.util.Date;

public class News {
	private String heading;
	private String news;
	private Author author;
	private Date timestamp;

	public News(String heading, String news) {
		this.heading = heading;
		this.news = news;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String toString() {
		return heading + " (" + timestamp.toString() + ") -" + news + "\n-"
				+ author;
	}
}
