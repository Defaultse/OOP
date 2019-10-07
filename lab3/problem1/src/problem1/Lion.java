package problem1;

public class Lion extends Animal {
	private String wantsToDo;
	private String sound = "Roars";

	public Lion() {
		super();
	}

	public Lion(String name, String wantsToDo) {
		super(name, wantsToDo);
	}

	// @Override
	public void show() {
		// super.show();
		System.out.println("Makes a sound:" + this.sound);
	}
}
