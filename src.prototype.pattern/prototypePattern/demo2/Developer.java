package prototypePattern.demo2;

public class Developer extends EmployeeAbstract {
	private String preferredLanguage;
	
	public String getPreferredLanguage() {
		return preferredLanguage;
	}

	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}

	@Override
	public String toString() {
		return ("Name: " + this.getName() + " - Role: " + this.getRole() + " - PreferredLanguage: " + this.getPreferredLanguage() + "wpm");
	}		

}
