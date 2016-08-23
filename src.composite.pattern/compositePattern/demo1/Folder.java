package compositePattern.demo1;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IFile {
	protected List<IFile> files = new ArrayList<IFile>();
	protected String name;
	protected float size;
	
	public Folder(String name) {
		this.name = name;
		this.size = 0;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public float getSize() {		
		for(IFile file : this.files){
			this.size += file.getSize();
		}
		return this.size;
	}
	
	public void addFile(IFile file){
		files.add(file);
	}
	
	public void removeFile(IFile file){
		files.remove(file);
	}
}
