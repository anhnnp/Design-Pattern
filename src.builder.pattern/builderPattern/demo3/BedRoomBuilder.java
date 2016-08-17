package builderPattern.demo3;

/**
 * @title: Lớp builder cụ thể triển khai
 * @desc: Xây dựng phòng ngủ kế thừa từ lớp cha có màu sơn tư�?ng, cửa sổ, bóng đèn và có thêm giư�?ng ngủ, bàn ghế 
 * Mặc định tạo ra phòng ngủ có sơn màu trắng, có 1 bóng đèn, có giư�?ng và ko có bàn ghế (mô tả trong contructor)
 */

public class BedRoomBuilder extends RoomBuilder {
	private int hasWindow;
	private int hasBulb;
	private String wallColor;
	private boolean hasBerth;
	private boolean hasTable;

	public BedRoomBuilder() {
		setDefaultBuilder();
	}

	public void setDefaultBuilder() {
		this.hasBulb = 1;
		this.wallColor = "Trắng";
		this.hasBerth = true;
		this.hasTable = false;
	}

	public BedRoom build() {
		BedRoom bedRoom = new BedRoom();
		bedRoom.hasWindow(this.hasWindow);
		bedRoom.hasBulb(this.hasBulb);
		bedRoom.hasBerth(this.hasBerth);
		bedRoom.hasTable(this.hasTable);
		bedRoom.wallColor(this.wallColor);
		setDefaultBuilder();
		return bedRoom;
	}

	@Override
	public BedRoomBuilder hasWindow(int window) {
		this.hasWindow = window;
		return this;
	}

	@Override
	public BedRoomBuilder hasBulb(int bulb) {
		this.hasBulb = bulb;
		return this;
	}

	@Override
	public BedRoomBuilder wallColor(String color) {
		this.wallColor = color;
		return this;
	}

	public BedRoomBuilder hasBerth(boolean berth) {
		this.hasBerth = berth;
		return this;
	}

	public BedRoomBuilder hasTable(boolean table) {
		this.hasTable = table;
		return this;
	}
}
