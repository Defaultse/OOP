package problem1;

public class Student {
private String name;
private String id;
private int yearOfStudy;

public Student(String name1, String id1, int yearOfStudy1){
	name =name1;
	id=id1;
	yearOfStudy=yearOfStudy1;
	}

public Student() {
	
}


public void getName() {
	System.out.println(name);
}
public void getId() {
	System.out.println(id);
}
public void getYearOfStudy() {
	System.out.println(yearOfStudy);
}
public void incYearOfStudy() {
	yearOfStudy++;
}

}