package builderPattern.demo1;

import java.util.GregorianCalendar;
import builderPattern.demo1.Book.Genre;

public class Builder {
	public String title;
	public String author;
	public Genre genre = Genre.FICTION;
    public GregorianCalendar publishDate = new GregorianCalendar(1900,1,1);
    public String ISBN = "000000000";
	
	public Builder(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	public Builder title(String title){
		this.title = title;
		return this;
	}
	
	public Builder author(String author){
		this.author = author;
		return this;
	}
	
	public Builder genre(Genre genre){
		this.genre = genre;
		return this;
	}
	
	public Builder publishDate(GregorianCalendar publishDate){
		this.publishDate = publishDate;
		return this;
	}
	
	public Builder ISBN(String ISBN){
		this.ISBN = ISBN;
		return this;
	}
	
	public Book build(){
		return new Book(this);
	}
}
