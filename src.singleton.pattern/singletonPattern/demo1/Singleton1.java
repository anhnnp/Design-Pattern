package singletonPattern.demo1;

public class Singleton1 {
	private static volatile Singleton1 instance;
	private Singleton1(){}
	
	public Singleton1 getInstance(){
		if(instance == null)
			synchronized (Singleton1.class){
				if(instance == null) instance = new Singleton1();
			}
		return instance;
	}
}
