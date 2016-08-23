package compositePattern.demo1;

public class File implements IFile {
	private String name;
	private float size;
	
	public File(String name, float size) {
		this.name = name;
		this.size = size;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public float getSize() {
		return this.size;
	}

}
