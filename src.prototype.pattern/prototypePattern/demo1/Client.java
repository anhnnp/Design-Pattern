package prototypePattern.demo1;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		ConcretePrototype1 p = new ConcretePrototype1(1000);

		for (int i = 0; i < 10; i++) {
			Prototype pclone = p.clone();
			pclone.setX(p.getX()*i);
			pclone.printX();
		}
	}
}
