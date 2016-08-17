package factoryMethod.demo1;

/**
 * @title Người tạo ra đồ chơi con vật
 * @desc Bạn hình dung đây là người tạo ra đồ chơi chung chung.
 * - Có người chuyên tạo ra đồ chơi hình con chó
 * - Có người chuyê tạo ra đồ chơi hình con mèo
 */

abstract class Creator {
	public abstract Product factoryMethod();
	
	// Các đồ chơi này đều có method chung như này
	public void anOperation(){
		System.out.println("This is an Operation with: " + factoryMethod().getName());
	}
}
