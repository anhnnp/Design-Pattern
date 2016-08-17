package factoryMethod.demo2;

public class Dog implements Pet {
	@Override
	public Pet giveBirth() {
		return new Dog();
	}

	@Override
	public String talk() {
		return "Wolf Wolf";
	}
}
