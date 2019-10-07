package problem4;

public class Main {

	public static void main(String[] args) {
		Piece piece1 = new King(2,2);
		if(piece1.isLegalMove(4, 3))
			System.out.println("Yes");
		else System.out.println("No");
		

	}

}
