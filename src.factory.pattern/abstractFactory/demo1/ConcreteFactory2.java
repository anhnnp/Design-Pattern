package abstractFactory.demo1;

public class ConcreteFactory2 extends AbstractFactory {
	@Override
	public AbstractProductA getProductA() {
		return new ProductA2();
	}

	@Override
	public AbstractProductB getProductB() {
		return new ProductB2();
	}
}
