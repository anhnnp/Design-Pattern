package prototypePattern.demo2;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException{
		Developer dev = new Developer();
		dev.setName("Nguyen Ngoc Anh");
		dev.setRole("Software Enginer");
		dev.setPreferredLanguage("Java");
		
		Developer devCopy = (Developer)dev.clone();
		devCopy.setName("Nguyen Hai Phong");
		devCopy.setPreferredLanguage("PHP");
		
		dev.getDetail();
		devCopy.getDetail();
		
		/** OUTPUT
		 * Name: Nguyen Ngoc Anh - Role: Software Enginer - PreferredLanguage: Java
		 * Name: Nguyen Hai Phong - Role: Software Enginer - PreferredLanguage: PHP
		 */
		
		Typist typ = new Typist();
		typ.setName("Nguyen Thao My");
		typ.setRole("Typist");
		typ.setWordsPerMinute(250);
		
		Typist typCopy = (Typist)typ.clone();
		typCopy.setName("Ha Ngoc Bao");
		typCopy.setWordsPerMinute(300);
		
		typ.getDetail();
		typCopy.getDetail();
		
		/** OUTPUT
		 * Name: Nguyen Thao My - Role: Typist - WordsPerMinute: 250wpm
		 * Name: Ha Ngoc Bao - Role: Typist - WordsPerMinute: 300wpm
		 */
	}
}
