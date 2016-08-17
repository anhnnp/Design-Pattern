package builderPattern.demo3;

/**
 * @title: Phòng khuôn mẫu cơ bản
 * @desc: Một phòng cơ bản gồm các thành phần cửa sổ, bóng đèn và màu sơn tư�?ng
 */

public interface Room {
	public void hasWindow(int window);
	public int hasWindow();
	
	public void hasBulb(int bulb);
	public int hasBulb();
	
	public void wallColor(String color);
	public String wallColor();
}
