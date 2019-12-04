package problem2;
public class Employee extends Person implements Comparable{
	protected int salary;
	private String hireDate;
	private String insuranceNumber;
    
	public Employee(String name, int salary, String hireDate, String insuranceNumber) {
		super(name);
		this.salary=salary;
		this.insuranceNumber=insuranceNumber;
		this.hireDate=hireDate;
	}

	public Employee(String name) {
		super(name);
	}
	
//	public int compareTo(Object o) {
//		Employee e = (Employee) o;
//		if(this.getSalary() == e.getSalary()) {
//			return 0;
//		}
//		else if(this.getSalary() < e.getSalary()) {
//			return -1;
//		}else {
//			return 1;
//		}
//	}
	
	public int compareTo(Object o) {
    Employee e = (Employee) o;
	return this.name.compareTo(e.name);
	}//first char a nad b
	
	@Override
	public String toString() {
		return super.toString() + "; " + "Started working:" + hireDate + "Salary:" + getSalary() + "; "
				+ "Insurance Number:" + insuranceNumber;
	}

	@Override
	 public boolean equals(Object o){
		if(o == this) return true;
		if(o==null || o.getClass()!=this.getClass()) return false;
		Employee p = (Employee)o;
		return getSalary()==p.getSalary() && hireDate==p.hireDate && insuranceNumber.equals(p.insuranceNumber);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}



}
