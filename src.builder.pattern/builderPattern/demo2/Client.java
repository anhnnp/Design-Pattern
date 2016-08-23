package builderPattern.demo2;

public class Client {
	public static void main(String[] args){
		AddressDirector director = new AddressDirector();
		VNAddressBuilder addressBuilder =new VNAddressBuilder(); 
		director.Construct(addressBuilder, "Pham Ngoc Thanh", "Hanoi", "Mien Bac");
		Address address = addressBuilder.getAddress();	
		
		System.out.println(address);
	}
}
