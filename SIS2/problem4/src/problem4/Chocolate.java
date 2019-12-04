package problem4;

public class Chocolate implements Comparable<Object> {
	private double weight;
	private String name;

	public String toString() {
		return name + " " + weight;
	}

	@Override
	public int compareTo(Object o) {
		Chocolate c = (Chocolate) o;
		if (c.weight == this.weight)
			return 0;
		if (c.weight > this.weight)
			return -1;
		else
			return 1;
	}

}
