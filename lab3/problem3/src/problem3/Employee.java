package problem3;

public class Employee extends Person {
	private int salary;
	private int year;
	private String insuranceNumber;
	
	public Employee(String name) {
		super(name);
	}
    
	public Employee(String name, int salary, int year, String insuranceNumber) {
		super(name);
		this.salary=salary;
		this.year=year;
		this.insuranceNumber=insuranceNumber;
	}

	@Override
	public String toString() {
		return super.toString() + "; " + "Started working:" + year + "Salary:" + salary + "; "
				+ "Insurance Number:" + insuranceNumber;
	}

	@Override
	 public boolean equals(Object obj) {
        boolean ok = super.equals(obj);
        if (ok) {
            if (!(obj instanceof Employee)) return false;
            Employee e = (Employee) obj;
            return this.salary == e.salary && this.year == e.year;
        }
        return false;
    }


}
