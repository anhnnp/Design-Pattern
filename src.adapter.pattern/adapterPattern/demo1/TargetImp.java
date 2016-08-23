package adapterPattern.demo1;

public class TargetImp implements ITarget {
	@Override
	public double areaSquare(double a) {
		return (a*a);
	}
}
