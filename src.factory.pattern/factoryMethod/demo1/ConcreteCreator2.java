package factoryMethod.demo1;

/**
 * @title Người chuyên tạo ra đồ chơi con mèo
 * @desc Người này chỉ tạo ra đồ chơi con mèo
 */
public class ConcreteCreator2 extends Creator {

	@Override
	public Product factoryMethod() {
		return new ConcreteProduct2();
	}
	
}
