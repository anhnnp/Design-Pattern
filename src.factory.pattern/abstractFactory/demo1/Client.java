package abstractFactory.demo1;

public class Client {
	public AbstractProductA abstractProductA;
	public AbstractProductB abstractProductB;
	
	public Client(AbstractFactory factory){
		abstractProductA = factory.getProductA();
		abstractProductB = factory.getProductB();
	}
	
	public void run(){
		abstractProductB.interact(abstractProductA);
	}
}
