package problem1;

public class Cat extends Animal{
	
	public Cat() {
		super();
	}
	
	public Cat(String name,String wantsToDo) {
		super(name, wantsToDo);
	}
	
	//@Override
	public void show() {
		//super.show();
		System.out.println("Makes a sound: Meows");
	}

}
