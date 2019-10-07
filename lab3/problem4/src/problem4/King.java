package problem4;

public class King extends Piece{
	King(int x1, int y1) {
        super(x1, y1);
    }

    @Override
    public boolean isLegalMove(int x2, int y2) {
        return (Math.abs(x2 - x1) + Math.abs(y2 - y1) <= 2);
    }
}
