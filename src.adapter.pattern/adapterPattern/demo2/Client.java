package adapterPattern.demo2;

public class Client {
	public static void main(String[] args){
		//Su dung Adapter
		AbstractTarget abstractTarget = new Adapter(new Adaptee());
		abstractTarget.request("http://www.appstechviet.com");
		
		//Khong su dung Adapter ko su dung duoc class cu Adaptee
		AbstractTarget target = new Target();
		target.request("http://www.appstechviet.wordpress.com");
	}
}
