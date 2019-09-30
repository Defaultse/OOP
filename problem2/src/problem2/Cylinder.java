package problem2;
import java.math.*;
public class Cylinder extends Shape{
	double r;
	double h;
	
	@Override
public double volume() {
		//v= p*r*r*h
	double volume;
	volume=Math.PI * r * r* h;
	return volume;
}
	
	public double surfaceArea() {
		double A;
		A = 2*Math.PI*r*r+h(2*Math.PI*r);
		return A;
	}
}
