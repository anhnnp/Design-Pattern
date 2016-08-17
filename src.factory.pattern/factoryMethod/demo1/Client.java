package factoryMethod.demo1;

public class Client {
	public static void main(String[] args){
		// Người tạo ra chó
		Creator c1 = new ConcreteCreator1();
		// Người tạo ra mèo
		Creator c2 = new ConcreteCreator2();
		
		// Lấy con chó của người tạo ra
		Product p1 = c1.factoryMethod();
		// Kiểm tra sản phẩm con chó này tên gì
		System.out.println(p1.getName());
		
		// Tương tự con mèo
		Product p2 = c2.factoryMethod();
		System.out.println(p2.getName());
	}
}
