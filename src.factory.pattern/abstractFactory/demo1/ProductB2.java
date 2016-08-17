package abstractFactory.demo1;

public class ProductB2 extends AbstractProductB {
@Override
void interact(AbstractProductA a) {	
	System.out.println(this.getClass().getName() + " interacts with " + a.getClass().getName());
}
}
