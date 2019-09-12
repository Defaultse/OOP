package problem2;

public class StarTriangle {

	public int width;

	public StarTriangle(int numberOfStar) {
		width = numberOfStar;
	}

	@Override
	public String toString() {
		String empty = "";
		String star = "[*]";
		for (int i = 1; i <= this.width; i++) {
			for (int j = 1; j <= i; j++) {
				empty = empty + star;
			}
			empty = empty + '\n';
		}
		return empty;
	}

}
