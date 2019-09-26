package bonus;

public enum Color {
	RED("red"), BLACK("black");

	private String value;

	private Color() {
	}

	private Color(String i) {
		this.value = i;
	}

	public void printValue() {
		System.out.println(this.value);
	}

}