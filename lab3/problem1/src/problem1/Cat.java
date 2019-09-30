package problem1;

public class Cat extends Animal {
	private String wantsToDo;
	public Cat() {
		super();
	}
	
	public Cat(String wantsToDo) {
		super(wantsToDo);
		this.wantsToDo = wantsToDo;
	}
	
	//@Override
	public void show() {
		//super.show();
		System.out.println("Meows");
	}
	
	public void setWantsToDo(String wantsToDo) {
		this.wantsToDo=wantsToDo;
	}
	
	public String getWantsToDo() {
		return wantsToDo;
	}
}
