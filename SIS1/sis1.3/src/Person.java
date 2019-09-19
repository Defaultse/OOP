public class Person extends DragonLaunch {
	private Gender gender;

	public Person(char s) {
		if (s == 'B')
			gender = Gender.BOY;
		else
			gender = Gender.GIRL;
	}
	
	//public String toString() {
	//}
	public boolean equals(Object obj) {
		if (this == obj) return true;
		
		if (!(obj instanceof Person)) return false;
		
		Person p = (Person) obj;
		
		return this.gender == p.gender;
		}
}

enum Gender {
	BOY, GIRL
}
