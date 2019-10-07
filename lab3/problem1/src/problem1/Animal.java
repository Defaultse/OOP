package problem1;

public class Animal {
	private String wantsToDo;
	private String name;

	public Animal() {
		wantsToDo = "eat";
	}

	public Animal(String name, String wantsToDo) {
		this.name = name;
		this.wantsToDo = wantsToDo;
	}

	public void show() {
		System.out.print("Makes a sound:");
	}

	public String toString() {
		return name + " wants to " + wantsToDo;
	}

}
