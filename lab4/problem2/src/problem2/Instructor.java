package problem2;

public class Instructor extends Course{
	private String firstName;
	private String lastName;
	private String department;
	private String email;
	private Instructor instructor;
	public Instructor(String firstName, String lastName, String department, String email) {
		super();
		this.lastName = lastName;
		this.department = department;
		this.email = email;
	}
	
	public String toString() {
		return this.firstName+" "+this.lastName+" "+this.email+" "+this.department;
	}
	
	public boolean equals(Object o){
		if(o == this) return true;
		if(o==null || o.getClass()!=this.getClass()) return false;
		Instructor p = (Instructor)o;
		return firstName.equals(p.firstName) && lastName.equals(p.lastName) && department.equals(p.department) && email.contentEquals(p.email);
	}
}
