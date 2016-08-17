package simpleFactory.demo1;

public class ChildB implements Parent {
	@Override
	public void talk() {
		System.out.println("This talk is " + this.getClass().getName());
	}

}
