package Chess;

public class Test{
	public static void main(String args[]){
		Board board = new Board();
		Coordinates coor = new Coordinates(2, 2);
		Pawn pawn = board.getPawn(coor);
		System.out.println(pawn.x);
		coor.next(Compass.NE);
		pawn = board.getPawn(coor);
		System.out.println(pawn.x);
	}
}