package probem5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Choose model:");
		Scanner input = new Scanner(System.in);
		String model = input.nextLine();
		input.close();
		Iphone phone1 = new Iphone(model, "SPACEGREY");
		System.out.println(phone1.getModel());
		if (model.equals("")) {
			phone1.checking();
		} else
			phone1.checking(model);
		
		Iphone i1 = new Iphone();
		

	}

}
