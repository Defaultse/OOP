package problem1;

public class Resistor extends Circuit{ 
    double resistance;
    double potentialDiff;
	public Resistor(double d) {
	resistance = d;
    potentialDiff = 0;
	}

	public Resistor(double d, double potentialDiff) {
		resistance = d;
		this.potentialDiff = potentialDiff;
	}
	
	@Override
	public double getResistance() {
		return resistance;
	}

	@Override
	public double getPotentialDiff() {
		return potentialDiff;
	}

	@Override
	public void applyPotentialDiff(double v) {
		potentialDiff = v;
	}

}
