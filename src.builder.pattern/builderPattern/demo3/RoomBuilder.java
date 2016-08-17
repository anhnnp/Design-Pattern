package builderPattern.demo3;

/**
 * @title: Abstract Builder
 * @desc: Lớp xây dựng cha có các method chung cho các lớp con
 * Phòng có các thành phần chung như: 
 * -bao nhiêu cửa sổ (window) 
 * -bao nhiêu bóng đèn (bulb)
 * -màu sơn tư�?ng (wall color)
 * Và method build() để xây dựng tạo ra Room sau khi đã thiết lập xong thành phần con
 */

abstract class RoomBuilder {
	public abstract RoomBuilder hasWindow(int window);
	public abstract RoomBuilder hasBulb(int bulb);
	public abstract RoomBuilder wallColor(String color);
}
