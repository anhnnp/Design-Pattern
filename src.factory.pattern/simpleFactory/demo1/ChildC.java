package simpleFactory.demo1;

public class ChildC implements Parent {
	@Override
	public void talk() {
		System.out.println("This talk is " + this.getClass().getName());		
	}

}
