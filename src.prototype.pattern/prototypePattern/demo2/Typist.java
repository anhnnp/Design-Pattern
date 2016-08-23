package prototypePattern.demo2;

public class Typist extends EmployeeAbstract {
	private int wordsPerMinute;
	
	public int getWordsPerMinute() {
		return wordsPerMinute;
	}

	public void setWordsPerMinute(int wordsPerMinute) {
		this.wordsPerMinute = wordsPerMinute;
	}

	@Override
	public String toString() {
		return ("Name: " + this.getName() + " - Role: " + this.getRole() + " - WordsPerMinute: " + this.getWordsPerMinute() + "wpm");
	}
}
