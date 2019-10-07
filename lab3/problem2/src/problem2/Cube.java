package problem2;

public class Cube extends Shape{
	private double a;
    private double V;
    private double A;
    public Cube(double a) {
    	this.a=a;
    }
	public void volume() {
		double V;
		V = 6 * a * a;
		this.V=V;
	}

	public void surfaceArea() {
		double A;
		A = a * a * a;
	    this.A=A;
	}
    
	public void display() {
		volume();
		surfaceArea();
		System.out.println("The area of Cube is: "+A);
		  System.out.println("The volume of Cube is: "+V);
	}
}
