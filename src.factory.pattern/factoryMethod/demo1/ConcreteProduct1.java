package factoryMethod.demo1;

/**
 * @title Sản phẩm cụ thể kiểu 1: (Con chó)
 * @desc Sản phẩm cụ thể có tên là Product 1
 */

public class ConcreteProduct1 implements Product {
	private String name = "Product 1";
	public String getName(){
		return name;
	}
	@Override
	public String toString() {
		return name;
	}
}
