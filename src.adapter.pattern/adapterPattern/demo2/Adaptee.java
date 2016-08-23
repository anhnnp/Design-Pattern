package adapterPattern.demo2;

public class Adaptee {
	public void specificRequest(String url, String header){
		System.out.println(url + "<br>" + header);
	}
}
