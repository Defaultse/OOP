package streams_io;
import java.io.*;
public class BufferedReaderAndPrintWriterExample {
	public static void main (String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out),true);
			PrintWriter pwFile = new PrintWriter(new FileWriter("a.out"));
			String line = br.readLine();
			while (!line.equals("q")) {
				pw.println("Read a line:");    
				pw.println(line);   
				pwFile.println(line);
				line = br.readLine();
			}
			br.close();
			pw.close();
			pwFile.close();
		} catch(IOException ioe) {
			System.out.println("Can�t read!");
		}
	}
}
