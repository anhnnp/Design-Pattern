package adapterPattern.demo2;

public class Adapter extends AbstractTarget {
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee){
		this.adaptee  = adaptee;
	}
	
	@Override
	public void request(String url){
		adaptee.specificRequest(url, "<application:JSON>");
	}
}
