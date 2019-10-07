package problem2;

public class Cylinder extends Shape {
	private double r;
	private double h;
	private double V;
	private double A;

	public Cylinder(double r, double h) {
		this.r = r;
		this.h = h;
	}

	@Override
	public void volume() {
		// v= p*r*r*h
		double volume;
		volume = Math.PI * r * r * h;
		this.A = volume;
	}

	public void surfaceArea() {
		double A;
		A = 2 * Math.PI * r * r + h*(2 * Math.PI * r);
		this.A = A;
	}

	public void display() {
		volume();
		surfaceArea();
		System.out.println("The area of Cylinder is: " + A);
		System.out.println("The volume of Cylinder is: " + V);
	}
}
