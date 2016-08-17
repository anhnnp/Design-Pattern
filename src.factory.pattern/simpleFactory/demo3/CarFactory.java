package simpleFactory.demo3;

public class CarFactory {
	public CarFactory() {
		// ... //
	}

	public static ICar build(String type) throws Exception {
		if (type == "") {
			throw new Exception("Invalid Car type");
		} else {
			try {
				String className = (CarFactory.class.getPackage() + ".Car" + type.toString()).replaceAll("(package )", "");
				Class<?> c = Class.forName(className);
				ICar car = (ICar) c.newInstance();
				return car;
			} catch (Exception ex) {
				ex.printStackTrace();
				return null;
			}
		}
	}

	public static void main(String[] args) {
		try {
			CarFactory.build("Luxury");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
