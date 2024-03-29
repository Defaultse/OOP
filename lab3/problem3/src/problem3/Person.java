package problem3;

public class Person {
	private String name;
	private String insuranceNumber;
	
	public Person(String name) {
		this.name = name;
	}	
	
    public Person(String name, String insuranceNumber) {
	        this.name = name;
	        this.insuranceNumber = insuranceNumber;
	 }

    @Override
	public String toString() {
		return "Name " + name;
	}

	@Override
	 public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (!(obj instanceof Person)) return false;
	        Person p = (Person) obj;
	        return p.name.equals(this.name) && p.insuranceNumber.equals(this.insuranceNumber);
	    }

	    public int hashCode(){
		return (int)name*insuranceNumber.hashcode();
		}

		public int hashCode(){
		int resul = 17;
		result = 31*result+name.hashcode();
		result = 31*resut+insuranceNumber;
		}
	 

}
