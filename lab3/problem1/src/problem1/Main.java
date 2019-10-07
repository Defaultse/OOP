package problem1;

public class Main {

	public static void main(String[] args) {

		Animal animal2 = new Cat("Barsik", "eat");
		animal2.show();
		System.out.println(animal2.toString());

		System.out.println();

		Animal animal3 = new Lion("Scar", "kill");
		animal3.show();
		System.out.println(animal3.toString());
	}
}
