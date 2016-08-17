package factoryMethod.demo2;

public class Cat implements Pet {
	@Override
	public Pet giveBirth() {
		return new Cat();
	}

	@Override
	public String talk() {
		return "Mew Mew";
	}
}
