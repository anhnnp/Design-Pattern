package builderPattern.demo2;

public class AddressDirector {
	public void Construct(AddressBuilder builder, String street,String city, String region){
		builder.buildStreet(street);
		builder.buildCity(city);
		builder.builRegion(region);
	}
}
