package problem2;

public class Sphere extends Shape{
	private double r;
public double volume() {
	double V = (4/3)*Math.PI*r*r*r;
	return V;
}

public double surfaceArea() {
	double A = 4*Math.PI*r*r;
	return A;
}
}
