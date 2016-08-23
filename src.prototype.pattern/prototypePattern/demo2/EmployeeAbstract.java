package prototypePattern.demo2;

public abstract class EmployeeAbstract implements Cloneable {
	private String name;
	private String role;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public void getDetail(){
		System.out.println(this.toString());
	}
	
	@Override
	protected EmployeeAbstract clone() throws CloneNotSupportedException {
		// Shallow Copy: only top-level objects are duplicated
		return (EmployeeAbstract)super.clone();
	}
}
