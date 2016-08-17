package builderPattern.demo3;

public class Director {
	public static void main(String[] args) {
		// Khởi tạo đối tượng builder
		BedRoomBuilder roomBuilder = new BedRoomBuilder();

		// Phòng ngủ 1: 2 cửa sổ, 2 bóng đèn, màu sơn vàng, không giư�?ng, không bàn
		BedRoom bedRom1 = (BedRoom)roomBuilder.hasWindow(2).hasBulb(2).wallColor("Vàng").hasBerth(false).build();

		// Phòng ngủ 1: 1 cửa sổ, 3 bóng đèn, màu trắng, có giư�?ng, có bàn
		BedRoom bedRom2 = (BedRoom)roomBuilder.hasBulb(3).hasTable(true).build();
		
		System.out.println("Xem chi tiết phòng vừa tạo:");
		System.out.println("");
		System.out.println("Phòng ngủ 1:");
		System.out.println(" - Số cửa sổ: " + bedRom1.hasWindow());
		System.out.println(" - Số bóng đèn: " + bedRom1.hasBulb());
		System.out.println(" - Màu sơn tư�?ng: " + bedRom1.wallColor());
		System.out.println(" - Có giư�?ng ngủ không? -" + (bedRom1.hasBerth()?"Có":"Không"));
		System.out.println(" - Có bàn ghế không? -" + (bedRom1.hasTable()?"Có":"Không"));		
		System.out.println("");
		System.out.println(" Và ");
		System.out.println("");
		System.out.println("Phòng ngủ 2:");
		System.out.println(" - Số cửa sổ: " + bedRom2.hasWindow());
		System.out.println(" - Số bóng đèn: " + bedRom2.hasBulb());
		System.out.println(" - Màu sơn tư�?ng: " + bedRom2.wallColor());
		System.out.println(" - Có giư�?ng ngủ không? -" + (bedRom2.hasBerth()?"Có":"Không"));
		System.out.println(" - Có bàn ghế không? -" + (bedRom2.hasTable()?"Có":"Không"));
	}
}
