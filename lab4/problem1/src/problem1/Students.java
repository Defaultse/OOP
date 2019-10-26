package problem1;

public class Students extends Manager {
	private String surname;
	private String name;

	public Students(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String toString() {
		return surname + " " + name;
	}

}
