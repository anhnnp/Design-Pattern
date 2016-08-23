package adapterPattern.demo2;

public class Target extends AbstractTarget {
	@Override
	public void request(String url) {
		System.out.println(url);
	}
}
