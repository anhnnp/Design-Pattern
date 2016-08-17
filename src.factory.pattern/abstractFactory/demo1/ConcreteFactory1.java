package abstractFactory.demo1;

public class ConcreteFactory1 extends AbstractFactory {
	@Override
	public AbstractProductA getProductA() {
		return new ProductA1();
	}

	@Override
	public AbstractProductB getProductB() {
		return new ProductB1();
	}
}
