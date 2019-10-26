package Analyzer;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;
import problem1.Students;

public class Analyzer {
	HashMap<Students, Integer> grades;
	private int max;
	private int avg;
	private int min;

	public Analyzer() {
		grades = new HashMap<>();
	}

	public void setMaxMark() {
		this.max = (Collections.max(grades.values()));
		// System.out.print(max);
	}

	public void setMinMark() {
		this.min = (Collections.min(grades.values()));
		// System.out.print(min);
	}

	public void setAvgMark() {
		int sum = 0;
		int cnt = 0;
		for (Students name : grades.keySet()) {
			String key = name.toString();
			int value = Integer.parseInt(grades.get(name).toString());
			sum += value;
			cnt++;
		}
		avg = sum / cnt;
	}

	public void Tokenize(String line) {
		StringTokenizer st = new StringTokenizer(line, " ");
		String name = st.nextToken();
		String surname = st.nextToken();
		int mark = Integer.parseInt(st.nextToken());
		Students s = new Students(name, surname);
		grades.put(s, mark);
	}

	public void Write() throws IOException {
		setMaxMark();
		setMinMark();
		setAvgMark();
		File file = new File("C:\\Users\\acer\\Desktop\\OOP\\grades.txt");
		FileWriter writer = new FileWriter(file.getAbsoluteFile(), true);
		writer.write("\r\nAverage-" + avg + "\r\nMinimum-" + min + "\r\nMaximum-" + max);
		writer.flush();
		writer.close();
	}

}
