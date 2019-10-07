package problem3;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		Person p = new Employee("Genose",1000000,2019,"192928");
		Person p2 = new Employee("Saitama");
		System.out.println(p.toString());
		System.out.println();
		System.out.println(p2.toString());
        System.out.println(p.equals(p2));

        Person p4 = new Employee("Joseph");
        Person p3 = new Employee("Joseph");
        System.out.println(p4.equals(p2));
	}

}
