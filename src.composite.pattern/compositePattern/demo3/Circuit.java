package compositePattern.demo3;

import java.util.ArrayList;

public abstract class Circuit extends Equipment {
	protected ArrayList<Equipment> list = new ArrayList<Equipment>();
	
	public Circuit(String name) {
		super.name = name;
	}
	
	public void addEquipment(Equipment equipment){
		if(list != null){
			list.add(equipment);
		}
	}
}
