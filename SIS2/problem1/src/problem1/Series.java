package problem1;

public class Series extends Circuit{
    double resistance;
    double potentialDiff;
	public Series(Circuit a, Circuit b) {
		resistance = a.getResistance() + b.getResistance();
		potentialDiff = a.getPotentialDiff() + b.getPotentialDiff();
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
