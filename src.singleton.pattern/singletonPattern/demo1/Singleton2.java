package singletonPattern.demo1;

public class Singleton2 {
	private static class Instance {
		static final Singleton2  instance = new Singleton2(); 
	}
	
	private Singleton2(){}
	
	public static Singleton2 getInstance(){
		return Instance.instance;
	}
}
