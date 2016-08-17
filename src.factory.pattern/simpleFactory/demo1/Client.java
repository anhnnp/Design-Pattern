package simpleFactory.demo1;

public class Client {
	public static void main(String[] args){
		// Create object ChildA inhert Parent object
		Parent parent = SimpleFactory.getChild(SimpleFactory.ChildType.ChildA);
		parent.talk();
		
		//TODO: Create object childB, C 
	}
}
