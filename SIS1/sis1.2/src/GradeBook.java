import problem1.Student;
import java.util.*;

public class GradeBook {
    public Course course()
	HashMap<Student, Integer> registeredStudents

	public void displayMessage() {
		System.out.println("Welcome to the grade book for CS101 Object-oriented Programming and Design!");
		System.out.println("Please, input grades for students:");

	}

	public void settingData(String s) {
	  studentsData.add(s);
	}
	
	public void settingData(int data) {
		students.add(data);
		cnt++;
	}
   
	public static void displayGradeReport() {
		//calls 3 methods which analyzes scores
	}

	public void outputBarChart(){
	
	}

	public int determineHighestGrade() {
		List<Integer> sortedlist = new ArrayList<>(students);
		Collections.sort(sortedlist);
		return sortedlist.get(sortedlist.size() - 1);
		/*
		 * Integer max = Integer.MIN_VALUE; for (Integer i : students) { if (max < i) {
		 * max = i; } } return max;
		 */

	}

	public int determineLowestGrade() {
		List<Integer> sortedlist = new ArrayList<>(students);
	    Collections.sort(sortedlist);
		return sortedlist.get(0);
	}

	public double determineClassAverage() {
		double average = 0;
		for (Integer i : students) {
			average += i;
		}
		average = average / cnt;
		return average;
	}

}
