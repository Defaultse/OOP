import java.util.*;

public class DragonLaunch {
	Vector<Person> people = new Vector<Person>();

	public void kidnap(Person p) {
		people.add(p);
		
	}

	public boolean DragonEatOrNot() {
		Stack<Person> stack = new Stack<Person>();
		for (int i = 0; i < people.size(); i++) {
			if (!stack.isEmpty() && stack.peek().equals(new Person('B')) && people.elementAt(i).equals(new Person('G'))) {
				stack.pop();
			} else {
				stack.push(people.elementAt(i));
			}
		}
		return !stack.isEmpty();
	}

}
