package compositePattern.demo1;

public class Client {
	public static void main(String[] args){
	Folder sudoFolder = new Folder("sudo");
	sudoFolder.addFile(new File("sudo.D", 2));
	sudoFolder.addFile(new File("sudo.E", 1));
	sudoFolder.addFile(new File("sudo.F", 6));	
	
	Folder usrFolder = new Folder("usr");
	usrFolder.addFile(new File("user.sa", 5));
	usrFolder.addFile(new File("user.anhnnp", 12));
	usrFolder.addFile(sudoFolder);
	
	Folder rootFolder = new Folder("root");
	rootFolder.addFile(new File("imgboot.rc", 15));
	rootFolder.addFile(new File("boot.img", 3));
	rootFolder.addFile(usrFolder);
	
	System.out.println("Size root folder: " + rootFolder.getSize() + " Kb");
	}
}
