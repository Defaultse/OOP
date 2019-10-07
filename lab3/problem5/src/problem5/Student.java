package problem5;

public class Student extends Person {
	private String program;
	private int year;
	private double fee;

	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public double getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String toString() {
		return "Staff: " + super.toString() + ',' + "Program: " + program + ',' + "Year: " + year + ',' + "Fee: " + fee;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student p = (Student) obj;
		return p.program.equals(this.program) && p.fee == this.fee && p.year == this.year;
	}
}
