package adapterPattern.demo1;

public class Client {
	public static void main(String[] args){
		ITarget target = new Adapter();
		System.out.println("Dien tich hinh vuong la: " + target.areaSquare(5));
	}
}
