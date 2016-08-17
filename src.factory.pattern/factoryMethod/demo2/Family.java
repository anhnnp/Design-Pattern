package factoryMethod.demo2;

abstract class Family {
	public abstract Pet getMyPet();
	public void getInfoMyPet(){
		Pet myPet = getMyPet();
		System.out.println("Gia đình em nuôi con: " + myPet.getClass().getSimpleName());
		System.out.println("Nó kêu: " + myPet.talk());
		System.out.println("Nó vừa đẻ con rồi đó!!!");
		Pet child = myPet.giveBirth();
		System.out.println("Mấy con nhỏ kêu: " + child.talk());
	}
}
