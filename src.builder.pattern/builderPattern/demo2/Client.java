package builderPattern.demo2;

public class Client {
	public static void main(String[] args){
		AddressDirector director = new AddressDirector();
		VNAddressBuilder vnAddress =new VNAddressBuilder(); 
		director.Construct(vnAddress, "Pham Ngoc Thanh", "Hanoi", "Mien Bac");
		Address address = vnAddress.getAddress();	
		
		System.out.println(address);
	}
}
