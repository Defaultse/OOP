import java.util.*;

public class Main {

	public static void main(String[] args) {
		DragonLaunch launch = new DragonLaunch();
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		for (int i = 0; i < line.length(); i++) {
			Person p = new Person(line.charAt(i));
			launch.kidnap(p);
		}
		if(launch.DragonEatOrNot()==true) System.out.println("Om nom nom");
		else System.out.println("Nope, stay hungry");

	}

}
