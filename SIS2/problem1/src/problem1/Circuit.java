package problem1;

public abstract class Circuit {
public abstract double getResistance();
public abstract double getPotentialDiff();
public abstract void applyPotentialDiff(double v);

public double getPower() {
	return getPotentialDiff() * getPotentialDiff() / getResistance();
	
}

public double getCurrent() {
	return getPotentialDiff() / getResistance();
	
}

}
