package problem3;

import java.util.Scanner;

public class Analyzer extends Data {
	private Data data;

	public Analyzer() {
		this.data = new Data();
	}

	void Analyze() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number (Q to quit):");

		while (input.hasNextInt()) {
			int number = input.nextInt();
			this.data.add(number);
			System.out.print("Enter number (Q to quit):");
		}
		// input.close();
		System.out.println("Average=" + data.getAverage());
		System.out.print("Maximum=" + data.getMax());

	}

}
