package builderPattern.demo3;

/**
 * @title: Phòng ngủ
 * @desc: Ngoài các thành phần cơ bản cửa sổ, màu sơn, bóng đèn còn có giư�?ng ngủ và bàn ghế
 */
public class BedRoom implements Room {
	// Có bao nhiêu cửa sổ?
	private int hasWindow;
	// Có bao nhiêu bóng đèn?
	private int hasBulb;
	// Màu sơn tư�?ng là gì?
	private String wallColor;
	// Có giư�?ng ngủ không?
	private boolean hasBerth;
	// Có bàn ghế không?
	private boolean hasTable;

	public BedRoom(){}
	
	public boolean hasTable() {
		return this.hasTable;
	}

	public void hasTable(boolean table) {
		this.hasTable = table;
	}
	
	public boolean hasBerth() {
		return this.hasBerth;
	}

	public void hasBerth(boolean berth) {
		this.hasBerth = berth;
	}

	@Override
	public int hasBulb() {
		return this.hasBulb;
	}

	@Override
	public void hasBulb(int bulb) {
		this.hasBulb = bulb;
	}

	@Override
	public int hasWindow() {
		return this.hasWindow;
	}

	@Override
	public void hasWindow(int window) {
		this.hasWindow = window;
	}

	@Override
	public String wallColor() {
		return this.wallColor;
	}

	@Override
	public void wallColor(String color) {
		this.wallColor = color;
	}
}
