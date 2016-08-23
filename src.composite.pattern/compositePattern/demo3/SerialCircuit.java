package compositePattern.demo3;

public class SerialCircuit extends Circuit {

	public SerialCircuit(String name) {
		super(name);
	}
	
	public SerialCircuit() {
		super("Serial Circuit");
	}

	@Override
	public double getResistance() {
		double temp = 0;
		for(Equipment e : super.list){
			temp += e.getResistance();
		}
		return temp;
	}

}
