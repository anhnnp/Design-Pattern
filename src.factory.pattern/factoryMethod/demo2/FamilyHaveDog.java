package factoryMethod.demo2;

public class FamilyHaveDog extends Family {
	@Override
	public Pet getMyPet() {
		return new Dog();
	}
}
