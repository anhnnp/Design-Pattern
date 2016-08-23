package singletonPattern.demo1;

public class Client {
	
	public static void main(String[] args){
		SingletonExample theSingleton = SingletonExample.getInstance();
		theSingleton.printState(); //Output: initial state
		theSingleton.nextSate();
		theSingleton.printState(); //Output: second state
		
		SingletonExample anotherSingleton = SingletonExample.getInstance();
		anotherSingleton.printState(); //Output: second state
		theSingleton.printState(); //Output: second state
		anotherSingleton.nextSate();
		anotherSingleton.printState(); //Output: third state
		theSingleton.printState(); //Output: third state
	}
}
