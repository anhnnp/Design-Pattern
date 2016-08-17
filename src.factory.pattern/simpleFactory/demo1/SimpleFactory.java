package simpleFactory.demo1;

public class SimpleFactory {
	public enum ChildType {
		ChildA,
		ChildB,
		ChildC
	}
	
	public static Parent getChild(ChildType childType){
		switch (childType) {
		case ChildA : return new ChildA();
		case ChildB : return new ChildB();
		case ChildC : return new ChildC();
		default: return null;
		}
	}
}
