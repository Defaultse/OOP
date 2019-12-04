package lab5;

import java.util.Vector;

import problem3.Clonable;

public class Manager extends Employee implements Comparable,Clonable{
	private Vector<Employee> employees = new Vector<Employee>();
	private double bonus;

	public Manager(String name, double bonus) {
		super(name);
		this.bonus = bonus;
	}

	/*
	 * public Object clone() throws CloneNotSupportedException{ return
	 * (Manager)super.clone(); }
	 */
	
	/*
	 * public int compareTo(Object o) { Manager m = (Manager) o; if
	 * (super.compareTo(o) == 0) { if (this.bonus == m.bonus) { return 0; } else if
	 * (this.bonus < m.bonus) { return -1; } else { return 1; } } return
	 * super.compareTo(o); }
	 */

	public Manager clone() throws CloneNotSupportedException{
		Manager clone = (Manager)super.clone();
		// vector - reference type. it also need deep cloning
		return clone;
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
