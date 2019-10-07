package week66;

import java.util.GregorianCalendar;

public class Person {
	String name;
	private GregorianCalendar bornDate;
	Gender gen;
	public Person(String name){
		this.name = name;
	}
	public Person(String name, GregorianCalendar bornDate){
		this(name);
		this.bornDate = bornDate;
	}
	
	public Person(String name, GregorianCalendar bornDate, Gender gen){
		this(name, bornDate);
		this.gen = gen;
	}
	public GregorianCalendar getBornDate() {
		return bornDate;
	}
	public void setBornDate(GregorianCalendar bornDate) {
		this.bornDate = bornDate;
	}
	public String toString(){
		String heOrShe = gen ==Gender.FEMALE?"She":"He";
		return "Name "+name+ " , "+heOrShe + " was  born "+bornDate.getTime().toString();
	}
	
	public boolean equals(Object o){
		if(o == this) return true;
		if(o==null || o.getClass()!=this.getClass()) return false;
		Person p = (Person)o;
		return name.equals(p.name);
	}
	
	//Bad equals ! 
	//public boolean equals(Person p){
		
	//	return name.equals(p.name);
	//}
	public int hashCode(){
		return 17+31*name.hashCode();
	}
}
