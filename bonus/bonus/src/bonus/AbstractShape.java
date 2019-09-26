package bonus;

public abstract class AbstractShape extends Point {
	private Color color;
	private int x;

	void Shape(Color color, int x) {
		this.x = x;
	}

	public abstract String draw();

}
