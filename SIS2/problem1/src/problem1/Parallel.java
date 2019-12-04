package problem1;

public class Parallel extends Circuit{
	double resistance;
	double potentialDiff;
	public Parallel(Circuit c, Circuit d) {
		resistance = (c.getResistance()*d.getResistance())/ (c.getResistance() + d.getResistance());
		potentialDiff = c.getPotentialDiff();
	}
	
	@Override
	public double getResistance() {
		return resistance;
	}

	@Override
	public double getPotentialDiff() {
		return potentialDiff; //check 
		
	}

	@Override
	public void applyPotentialDiff(double v) {
		potentialDiff = v;		
	}

}
