package problem2;

import java.util.Vector;

public class Manager extends Employee {
	private Vector<Employee> employees = new Vector<Employee>();
	private double bonus;

	public Manager(String name, double bonus) {
		super(name);
		this.bonus = bonus;
	}

	public int compareTo(Object o) {
		Manager m = (Manager) o;
		if (super.compareTo(o) == 0) {
			if (this.bonus == m.bonus) {
				return 0;
			} else if (this.bonus < m.bonus) {
				return -1;
			} else {
				return 1;
			}
		}
		return super.compareTo(o);
	}

	@Override
	public String toString() {
		return toString() + " " + bonus;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (o == null || o.getClass() != this.getClass())
			return false;
		Manager p = (Manager) o;
		return bonus == p.bonus && employees.equals(p.employees);
	}

}
