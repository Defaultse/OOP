package week66;
import java.util.GregorianCalendar;
import java.util.HashSet;

import week1.Word;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Pakita", new GregorianCalendar(1989,05,27), Gender.FEMALE);
		//System.out.println(p);
		Person p2 = new Person("Pakita", new GregorianCalendar(1989,05,27), Gender.FEMALE);

		HashSet<Person> people = new HashSet<Person>();
		people.add(p);
		people.add(p2);
		
		//p2.name = "Alina";
		System.out.println(people);
		System.out.println(people.size());
		
	}

}
