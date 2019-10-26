package problem1;

import java.io.*;
import java.util.*;

public class Manager {
	HashMap<Students, Integer> grades;
	private int maxMark;

	public Manager() {
		grades = new HashMap<>();
	}

	public void Tokenize(String line) {
		StringTokenizer st = new StringTokenizer(line, " ");
		String name = st.nextToken();
		String surname = st.nextToken();
		int mark = Integer.parseInt(st.nextToken());
		Students s = new Students(name, surname);
		grades.put(s, mark);
	}

	public char getMark(int value) {
		char grade = 0;
		/*
		 * for (Students name : grades.keySet()) { String key = name.toString(); int
		 * value = Integer.parseInt(grades.get(name).toString());
		 */
		if (maxMark - 10 <= value) {
			grade = 'A';
		} else if (maxMark - 20 <= value) {
			grade = 'B';
		} else if (maxMark - 30 <= value) {
			grade = 'C';
		} else if (maxMark - 40 <= value) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		return grade;
	}

	public void setMaxMark() {
		this.maxMark = (Collections.max(grades.values()));
		System.out.print(maxMark);
	}

	public void Write() throws IOException {
		try {
			setMaxMark();
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\acer\\Desktop\\OOP\\grades.txt"));
			for (Students name : grades.keySet()) {
				String key = name.toString();
				int value = Integer.parseInt(grades.get(name).toString());
				bw.write(key + '-' + '"' + getMark(value) + '"');
				// System.out.println(value);
				bw.newLine();
			}
			bw.close();
		} catch (FileNotFoundException fe) {
			System.out.println("File not found");
		}
	}

	public void CheckPrint() {
		for (Students name : grades.keySet()) {
			String key = name.toString();
			String value = grades.get(name).toString();
			System.out.println(key + " " + value);
		}
	}

}
