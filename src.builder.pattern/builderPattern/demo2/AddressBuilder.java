package builderPattern.demo2;

public abstract class AddressBuilder {
	public abstract void buildStreet(String street);
	public abstract void buildCity(String city);
	public abstract void builRegion(String region);
}
