package problem5;

public class Staff extends Person {
	private String school;
	private double pay;

	public Staff(String name, String address, String school, Double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public String toString() {
		return "Staff: " + super.toString() + ',' + "School: " + school + ',' + "Pay: " + pay;
	}

	/*public boolean equals(Object obj) {
		boolean ok = super.equals(obj);
		if (ok) {
			if (!(obj instanceof Staff))
				return false;
			Staff e = (Staff) obj;
			return this.school.equals(employees) && this.school == e.school && this.pay == e.pay;
		}
		return false;
	}
*/
}
