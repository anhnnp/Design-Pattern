package builderPattern.demo1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Book {
	public enum Genre {FICTION, NONFICTION, TECHNOLOGY, SELFHELP, BUSINESS, SPORT};
	
	private String title;	
	private String author;
	private Genre genre;
	private GregorianCalendar publishDate;
	private String ISBN;
	
	public Book(Builder builder){
		this.title = builder.title;
		this.author = builder.author;
		this.genre = builder.genre;
		this.publishDate = builder.publishDate;
		this.ISBN = builder.ISBN;
	}
	
	@Override
	public String toString() {
		return "Title: " + this.title + ", author: " + this.author + ", genre: " + this.genre.toString() + ", publish year: " + this.publishDate.get(Calendar.YEAR) + ", ISBN: " + this.ISBN;
	}
}
