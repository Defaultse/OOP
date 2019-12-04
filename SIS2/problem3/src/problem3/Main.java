package problem3;

import java.util.*;


import lab5.Employee;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("B", 1000000, "14-11-2019", "123234b"));
		employees.add(new Employee("A", 500000, "16-11-2019", "123123a"));
		employees.add(new Employee("C", 200000, "17-11-2019", "123234bb"));

		Comparator<Employee> emp = new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return e1.getName().compareTo(e2.getName());
			}
		};

		Collections.sort(employees, emp);
		for (Employee e : employees) {
			System.out.println(e);
		}

		Comparator<Employee> date = new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return e1.getHireDate().compareTo(e2.getHireDate());
			}
		};

		Collections.sort(employees, date);
		for (Employee e : employees) {
			System.out.println(e);
		}

		Employee employee1 = new Employee("A", 500000, "16-11-2019", "123123a");
		Employee clone = employee1.clone();
		System.out.println(clone.toString());

	}

}
