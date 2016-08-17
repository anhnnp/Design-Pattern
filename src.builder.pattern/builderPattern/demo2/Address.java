package builderPattern.demo2;

public class Address {
	private String street;
	private String city;
	private String region;
	
	public Address(){}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	@Override
	public String toString() {
		return "Street: " + this.street + " - City: " + this.city + " - Region: " + this.region;
	}
}
