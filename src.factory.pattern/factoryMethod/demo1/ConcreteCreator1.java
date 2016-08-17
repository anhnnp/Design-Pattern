package factoryMethod.demo1;

/**
 * @title Người chuyên tạo ra đồ chơi con chó
 * @desc Người này chỉ tạo ra đồ chơi con chó
 */
public class ConcreteCreator1 extends Creator {

	@Override
	public Product factoryMethod() {
		return new ConcreteProduct1();
	}
	
}
