package problem4;

public class Pawn extends Piece{
public Pawn(int x1, int y2) {
	super(x1,y2);
}
@Override
public boolean isLegalMove(int x2, int y2) {
	if(y1==2) {
		return x1==x2 && (y2-y1) >=1 && (y2-y1)<=2;
	}
	else {
		return x1==x2&& (y2-y1)==1;
	}
}
}
