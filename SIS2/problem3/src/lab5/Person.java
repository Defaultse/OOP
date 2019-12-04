package lab5;

import problem3.Clonable;

public class Person implements Clonable{
	protected String name;
	private String insuranceNumber;
	public Person(String name) {
		this.name = name;
	}	
	
    public Person(String name, String insuranceNumber) {
	        this.name = name;
	        this.insuranceNumber = insuranceNumber;
	 }
    
    public Person clone() throws CloneNotSupportedException{
	    Person clone = (Person)super.clone();
		return clone;
	}
	
    @Override
	public String toString() {
		return "Name " + name;
	}

	@Override
	 public boolean equals(Object o){
			if(o == this) return true;
			if(o==null || o.getClass()!=this.getClass()) return false;
			Person p = (Person)o;
			return p.name.equals(this.name) && p.insuranceNumber.equals(this.insuranceNumber);
		}
}
