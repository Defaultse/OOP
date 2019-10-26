package problem1;

import java.io.*;

import Analyzer.Analyzer;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
		Analyzer analyzer = new Analyzer();
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:/Users/acer/Desktop/OOP/scores.txt"));
			String line = br.readLine();
			while (line != null) {
				//manager.Tokenize(line);
				analyzer.Tokenize(line);
				line = br.readLine();
			}
			br.close();
			//manager.Write();
		 analyzer.Write();
		} catch (FileNotFoundException fe) {
			System.out.println("File not found");
		} catch (IOException ioe) {
			System.out.println("Can not read from file");
		}
//	   manager.CheckPrint();
//		manager.setMaxMark();
	}

}
