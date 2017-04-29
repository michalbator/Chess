package Chess;
public class Board{
	int boardRes = 8;
	int boardSize;
	Pawn boardTab[];
	
	Board(){
		this.boardSize = boardRes*boardRes;
		int x = 10;
		boardTab = new Pawn[boardSize];
		for(int i = 0; i < 64; i++){
			boardTab[i] = new Pawn(x + i);
		}
	}
	Pawn getPawn(Coordinates coor){
		return boardTab[retrive(coor)];
	}
	private int retrive(Coordinates coor){
		return coor.x + boardRes*coor.y;
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
		return this;
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
	public int x;
}