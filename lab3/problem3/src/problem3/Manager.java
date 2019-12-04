package problem3;
import java.util.Vector;
public class Manager extends Employee{
	private Vector<Employee> employees=new Vector<Employee>();
	private double bonus;
	
	public Manager(String name, double bonus){
		super(name);
        this.bonus = bonus;
	}
	
	@Override
	public String toString() {
        return toString() + " " + bonus;
    }

    @Override
    public boolean equals(Object obj) {
        boolean ok = super.equals(obj);
        if (!ok) {
            return false;
        }
        if (!(obj instanceof Manager)) return false;
        Manager m = (Manager) obj;
        return this.bonus == m.bonus && this.employees.equals(m.employees);
	}
}
