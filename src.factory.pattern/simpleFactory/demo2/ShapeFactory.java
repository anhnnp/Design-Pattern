package simpleFactory.demo2;

public class ShapeFactory {
	public static IShape getShape(String shape){ 
		switch (shape.toUpperCase()){
		case "SQUARE": 
			return new Square();
		case "RECTANGLE": 
			return new Rectangle();
		case "OVAL": 
			return new Circle();
		default: return null;
		}
	}
}
