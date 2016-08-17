package builderPattern.demo2;

public class VNAddressBuilder extends AddressBuilder {
	private Address address;
	
	public VNAddressBuilder() {
		address = new Address();
	}
	
	@Override
	public void buildStreet(String street) {
		address.setStreet(street);
	}

	@Override
	public void buildCity(String city) {
		address.setCity(city);
	}

	@Override
	public void builRegion(String region) {
		address.setRegion(region);
	}
	
	public Address getAddress(){
		return address;
	}

}
