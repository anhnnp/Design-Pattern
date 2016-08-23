package adapterPattern.demo1;

public class Adapter extends Adaptee implements ITarget {

	@Override
	public double areaSquare(double a) {
		return multi(a, a);
	}

}
