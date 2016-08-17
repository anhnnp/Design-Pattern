package abstractFactory.demo1;

public class ProductB1 extends AbstractProductB {
	@Override
	void interact(AbstractProductA a) {
		System.out.println(this.getClass().getName() + " interact with " + a.getClass().getName());
	}
}
