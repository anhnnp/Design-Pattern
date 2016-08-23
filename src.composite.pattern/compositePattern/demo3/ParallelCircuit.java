package compositePattern.demo3;

public class ParallelCircuit extends Circuit {

	public ParallelCircuit(String name) {
		super(name);
	}
	
	public ParallelCircuit() {
		super("Parallel Circuit");
	}

	@Override
	public double getResistance() {
		double temp = 0;
		for(Equipment e : super.list){
			temp += 1/e.getResistance();
		}
		return 1/temp;
	}

}
