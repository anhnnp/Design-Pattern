package compositePattern.demo3;

public class Fan extends Equipment {
	
	public Fan(String name, double resistance) {
		super.name = name;
		super.resistance = resistance;
	}
	
	public Fan() {
		super.name = "The Fan";
		super.resistance = 20;
	}

	@Override
	public double getResistance() {
		return this.resistance;
	}

}
