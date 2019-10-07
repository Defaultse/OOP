package problem5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HashSet<Person> people = new HashSet<Person>();

		Scanner scanner = new Scanner(System.in);
		while (!scanner.nextLine().equals("exit")) {
			System.out.println("Add or info:");
			if (scanner.nextLine().equals("Add")) {
				System.out.println("Student or Staff");
				if (scanner.nextLine().equals("Student")) {
					System.out.println("Enter name:");
					String name = scanner.nextLine();
					System.out.println("Enter address:");
					String address = scanner.nextLine();
					System.out.println("Enter program:");
					String program = scanner.nextLine();
					System.out.println("Enter year:");
					int year = scanner.nextInt();
					System.out.println("Enter fee:");
					double fee = scanner.nextDouble();
					Person a = new Student(name, address, program, year, fee);
					people.add(a);
				} else if (scanner.nextLine().equals("Staff")) {
					System.out.println("Enter name:");
					String name = scanner.nextLine();
					System.out.println("Enter address:");
					String address = scanner.nextLine();
					System.out.println("Enter school:");
					String school = scanner.nextLine();
					System.out.println("Enter pay:");
					double pay = scanner.nextDouble();
					Person b = new Staff(name, address, school, pay);
					people.add(b);
				}
			}

			else if (scanner.nextLine().equals("info")) {
				Person p;
				Iterator<Person> iterator = people.iterator();
				while (iterator.hasNext());
				p = iterator.next();
				System.out.println(p);
			}
		}
	}

}
