package bonus;

public abstract class Piece {
		int x1, y1;
	    public Piece() {

	    }
	    public Piece(int x1, int y1) {
	        this.x1 = x1;
	        this.y1 = y1;
	    }

	    public boolean isLegalMove(int x2, int y2) {
	        return true;
	    }

}
