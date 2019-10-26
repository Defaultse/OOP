package Serialization;
import java.io.*;
public class Deserializing {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ObjectInputStream oin = new ObjectInputStream(new FileInputStream("C:/Users/acer/Desktop/Java/Object.txt");
		Book b = (Book) oin.readObject();
		System.out.println(b);
	}
}
