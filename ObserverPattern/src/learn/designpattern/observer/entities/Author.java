package learn.designpattern.observer.entities;

import java.util.Date;

import learn.designpatterns.observer.interfaces.Newspaper;

public class Author {
	private String firstName;
	private String lastName;
	private Newspaper newspaper;

	public Author(String fName, String lName, Newspaper newspaper) {
		this.firstName = fName;
		this.lastName = lName;
		this.newspaper = newspaper;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Newspaper getNewspaper() {
		return newspaper;
	}

	public void setNewspaper(Newspaper newspaper) {
		this.newspaper = newspaper;
	}

	public void publishNews(News news) {
		news.setAuthor(this);
		news.setTimestamp(new Date());
		newspaper.addNews(news);
	}

	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
}
