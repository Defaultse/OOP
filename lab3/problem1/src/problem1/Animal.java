package problem1;

public class Animal {
	private String wantsToDo;
	public Animal() {
		wantsToDo="eat";
	}
	
	public Animal(String wantsToDo) {
		this.wantsToDo=wantsToDo;
	}
	
	public void show() {
		System.out.println("Makes a sound");
	}
	
	public void setWantsToDo(String wantsToDo) {
		this.wantsToDo=wantsToDo;
	}
	
	public String getWantsToDo() {
		return wantsToDo;
	}
}
