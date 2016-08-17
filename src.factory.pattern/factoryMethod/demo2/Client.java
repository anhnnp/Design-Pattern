package factoryMethod.demo2;

public class Client {
	public static void main(String[] args){

		System.out.println("1. Gia đình bạn A nuôi con gì nào?");
		Family familyA = new FamilyHaveDog();
		familyA.getInfoMyPet();
		
		System.out.println("");
		System.out.println("2. Gia đình bạn B nuôi con gì nào?");
		Family familyB = new FamilyHaveCat();
		familyB.getInfoMyPet();
	}
}
