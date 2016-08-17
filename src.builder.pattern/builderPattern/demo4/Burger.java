package builderPattern.demo4;

public abstract class Burger implements Item {
	@Override
	public Packing packing() {
		return new Wrapper();
	}
}
