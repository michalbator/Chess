package Chess;

public class Board{
	int boardSize;
	Pawn boardTab[boardSize];
	Board(){
		boardTab = new Pawn[boardTab];
	}
	Pawn getPawn(Compass c){

	}
}

class Coordinates{
	int x;
	int y;
	Coordinates(int x, int y){
		this.x = x;
		this.y = y;
	}
	Coordinates next(Compass c){
		this.x += c.x;
		this.y += c.y;
	}
}

enum Compass{
	N(1, 0),
	NW(1,-1),
	S(-1,0),
	W(0,-1),
	E(0,1),
	NE(1,1),
	SE(-1,1),
	SW(-1,-1);

	public int x;
	public int y;

	Compass(int x, int y){
		this.x = x;
		this.y = y;
	}
}
class Pawn{
	Pawn();
}