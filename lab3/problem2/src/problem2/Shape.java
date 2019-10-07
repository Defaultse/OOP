package problem2;

public abstract class Shape {
	abstract public void volume();
    abstract public void surfaceArea();
	void text() {
		System.out.println("Calculated:");
	}
	protected abstract void display();

}
