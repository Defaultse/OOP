import java.util.*;
import problem1.Student;

public class GradeBookTest {

	public static void main(String[] args) {
		int cnt = 0;
		GradeBook start = new GradeBook();
       
		start.displayMessage();
		Scanner input = new Scanner(System.in);
		do {
			int data = input.nextInt();
			start.settingData(data);      
			cnt++;
		} while (cnt < 10);
		input.close();
		System.out.println("Highest grade :"+start.determineHighestGrade());
		System.out.println("Average grade of class is:"+start.determineClassAverage());
		start.displayGradeReport();
	    start.outputBarChart();
	}
	
	}

