package Chess;

public abstract class Pawn{
	Board board;
	Coordinates position;

	Pawn(Coordinates coor){
		/**
		* Tworzy nowego pionka, ustawia na planszy, pionek dostaje swoja pozycje
		*/
		this.board.setPawn(this);
		this.position = coor;
	}

	void move(Coordinates coor){
		/**
		* Przesuwa pionek na wskazane pole
		* Jeżeli pole jest zajęte, usuwa pionek wcześniej tam stojący
		*/
		this.position = coor;
		if(board.getPawn(coor) != null){
			board.getPawn(coor).remove();
		}
	}
	Coordinates getPosition(){
		return this.position;
	}
	abstract void colorPossibbleMoves{
		/**
		* Koloruje możliwe ruchy dla pionka za pomocą metody wywoływanej na planszy
		*/
		//board.colorSquare(coor);
		//coor.next();
	}
	void remove(){
		/**
		* Usuwa pionka, to chyba jest źle
		*/
		this = null;
	}
	abstract boolean isMoveValid(){
		
	}
}