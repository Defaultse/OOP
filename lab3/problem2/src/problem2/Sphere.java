package problem2;

public class Sphere extends Shape{
	private double r;
	private double A;
	private double V;
	public Sphere(double r) {
    	this.r=r;
    }
	public void volume() {
		double V = (4/3)*Math.PI*r*r*r;
		this.V=V;
	}

	public void surfaceArea() {
		double A = 4*Math.PI*r*r;
		this.A=A;
	}
	
	public void display() {
		volume();
		surfaceArea();
		System.out.println("The area of Sphere is: "+A);
		  System.out.println("The volume of Sphere is: "+V);
	}

}
