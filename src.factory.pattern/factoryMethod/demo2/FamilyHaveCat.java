package factoryMethod.demo2;

public class FamilyHaveCat extends Family {
	@Override
	public Pet getMyPet() {
		return new Cat();
	}
}
