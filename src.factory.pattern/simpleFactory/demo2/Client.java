package simpleFactory.demo2;

class Client {
	public static void main(String[] args){		
		ShapeFactory.getShape(IShape.SQUARE).draw();
	}
}
