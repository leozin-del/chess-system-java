package boardgame;

public class piece {
	
	protected Position position;
	private Board board;
	
	public piece(Board board) {
		this.board = board;
		position = null;
	}

	public Board getBoard() {
		return board;
	}

}
