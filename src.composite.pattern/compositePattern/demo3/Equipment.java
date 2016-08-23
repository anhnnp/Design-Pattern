package compositePattern.demo3;

public abstract class Equipment {
	protected String name;
	protected double resistance;
	
	public String getName(){
		return this.name;
	}
	public abstract double getResistance();
}
