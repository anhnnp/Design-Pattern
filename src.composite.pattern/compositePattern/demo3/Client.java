package compositePattern.demo3;

public class Client {
	public static void main(String[] args){
		/**
		 * So do mach duoc mach nhu sau:
		 * 		________Fan________
		 *	   |				   |
		 * $___|________Fan________|___Light____$
		 *     |				   |
		 * 	   |____Fan___Light____|
		 */
		SerialCircuit childOfChildCircuit = new SerialCircuit();
		childOfChildCircuit.addEquipment(new Light());
		childOfChildCircuit.addEquipment(new Fan());
		
		ParallelCircuit childCircuit = new ParallelCircuit();
		childCircuit.addEquipment(new Fan());
		childCircuit.addEquipment(new Fan());
		childCircuit.addEquipment(childOfChildCircuit);
		
		SerialCircuit rootCircuit = new SerialCircuit();
		rootCircuit.addEquipment(new Light());
		rootCircuit.addEquipment(childCircuit);
		
		System.out.println("Total resistance: " + rootCircuit.getResistance());
	}
}
