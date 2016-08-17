package factoryMethod.demo1;

/**
 * @title Sản phẩm cụ thể kiểu 2 (Con mèo)
 * @desc Sản phẩm cụ thể có tên là Product 2
 */

public class ConcreteProduct2 implements Product {
	private String name = "Product 2";
	public String getName(){
		return name;
	}
	@Override
	public String toString() {
		return name;
	}
}
