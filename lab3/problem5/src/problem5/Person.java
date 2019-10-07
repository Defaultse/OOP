package problem5;

public class Person {
	private String name;
	private String address;

	Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String Address) {
		this.address = address;
	}

	public String toString() {
		return "Name: " + name + ',' + "Address: " + address;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Person))
			return false;
		Person p = (Person) obj;
		return p.name.equals(this.name) && p.address.equals(this.address);
	}

}
