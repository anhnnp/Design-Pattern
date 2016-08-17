package builderPattern.demo4;

import java.util.ArrayList;

public class Meal {
	private ArrayList<Item> items = new ArrayList<Item>();
	private float cost = 0.0f;

	public void addItem(Item item) {
		this.items.add(item);
		this.cost += item.price();
	}

	public float getCost() {
		return this.cost;
	}

	public void showItems() {
		for (Item item : items) {
			System.out.print("Item : " + item.name());
			System.out.print(", Packing : " + item.packing().pack());
			System.out.println(", Price : " + item.price());
		}
	}
}
