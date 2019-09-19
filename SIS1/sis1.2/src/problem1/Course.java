package problem1;

public class Course {
private String name;
private String description;
private int credits;
public Course(String name, int credits) {
	this.name=name;
	this.description = "This course is too hard";
	this.credits = credits;
}

public String toString() {
	return this.name;
}

}
