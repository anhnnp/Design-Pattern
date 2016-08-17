package builderPattern.demo1;

import java.util.GregorianCalendar;

public class Client {
	public static void main(String[] args){
		Book book = new Builder("Effective Java", "Joshua Bloch")
				.publishDate(new GregorianCalendar(2008,05, 28))
				.build();
		
		System.out.println(book);
	}
}
