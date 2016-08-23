package compositePattern.demo3;

public class Light extends Equipment {

	public Light(String name, double resistance) {
		super.name = name;
		super.resistance = resistance;
	}
	
	public Light() {
		super.name = "The Light";
		super.resistance = 10;
	}

	@Override
	public double getResistance() {
		return super.resistance;
	}

}
