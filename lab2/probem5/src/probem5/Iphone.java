package probem5;

public class Iphone {

	static String model;
	static String color;

	public enum Color {
		SPACEGREY(111), MATTEBLACK(222), ROSEGOLD(333), WHITE(444);

		private final int ID;

		private Color(int id) {
			this.ID = id;
		}

		public int getId() {
			return ID;
		}
	}
	
	{//initialization block
		
		System.out.println("Now im creating new iphone");
	}

	
	public Iphone() {
		
	}

	public Iphone(String model, String color) {
		this.model = model;
		this.color = color;
		Color check = Color.SPACEGREY;
		System.out.println("Id of color: " + check.getId());
	}

	public void checking() {
		System.out.println("not chosen");
	}

	public void checking(String name) {
		System.out.println("You chosed " + name);
	}

	public String getModel() {
		return model;
	}

}