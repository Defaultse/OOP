package problem2;

public class Cube extends Shape{
double a;

public double volume() {
	double A;
	A = 6*a*a;
	return A;
}

public double surfaceArea() {
	double V;
	V=a*a*a;
	return V;
}

}
