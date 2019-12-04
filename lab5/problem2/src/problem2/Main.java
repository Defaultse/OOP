package problem2;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formattedDate = myDateObj.format(myFormatObj);
	    Vector<Person>employees = new Vector<Person>();
	    Person e = new Employee("Swift",100000,formattedDate,"192928");
	    Person e1 = new Employee("Acer",10000,formattedDate,"192908");
	    employees.add(e);
	    employees.add(e1);
	    System.out.println(employees);
}
