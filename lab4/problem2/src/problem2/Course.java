package problem2;

import java.io.*;
import java.util.*;

public class Course implements Serializable {
	private String courseTitle;
	private Instructor instructor;//экземпл€р обьекта другого класса
	private Textbook textbook;//экземпл€р обьекта другого класса

	Course() {
		this.courseTitle = "None";
	}

	public Course(String courseTitle1, Textbook textbook, Instructor instructor) {
		this.courseTitle = courseTitle1;
		this.textbook = textbook;
		this.instructor = instructor;
	}
	
	public void setCourse(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public void setCourse(String courseTitle1, Textbook textbook, Instructor instructor) {
		this.courseTitle = courseTitle1;
		this.textbook = textbook;
		this.instructor = instructor;
	}

	public void setCourse(Textbook textbook) {
		this.textbook = textbook;
	}

	public void setCourse(Instructor instructor) {
		this.instructor = instructor;
	}

	public void Serialize() throws IOException {
		FileOutputStream fos = new FileOutputStream("data.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Course b = new Course(courseTitle, textbook, instructor); //сериализует string, object, object
		oos.writeObject(b);
		oos.flush();
		oos.close();
	}

	public void Deserialize() throws ClassNotFoundException, IOException {
		ObjectInputStream oin = new ObjectInputStream(new FileInputStream("data.txt"));
		Course b = (Course) oin.readObject();
		System.out.println(b);
	}

	public String getCourseTitle() {//getter
		return courseTitle;
	}

	public String toString() {
		return this.courseTitle;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (o == null || o.getClass() != this.getClass())
			return false;
		Course p = (Course) o;
		return courseTitle.equals(p.courseTitle);
	}
}
