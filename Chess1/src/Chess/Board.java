package Chess;

import Chess.Token.TokenColor;
import Chess.Tile.TileColor;

public class Board {
	private Tile[][] board;
	private Token[] W = new Token[24];
	private Token[] B = new Token[24];

	public Board() {
		board = new Tile[8][8];
		initialize();
		fill();
	}

	public void initialize() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (i % 2 == 0) {
					if (j % 2 == 0)
						board[i][j] = new Tile(TileColor.Black);
					else
						board[i][j] = new Tile(TileColor.White);
				} else {
					if (j % 2 == 0)
						board[i][j] = new Tile(TileColor.White);
					else
						board[i][j] = new Tile(TileColor.Black);
				}
			}

		}
	}

	public void fill() {
		for (int i = 0; i < W.length; i++) {

			W[i] = new Token(TokenColor.White, "W", new Move[] { new Move(-1, -1), new Move(1, -1) },
					new Move[] { new Move(-2, -2), new Move(2, -2) });
			B[i] = new Token(TokenColor.Black, "B", new Move[] { new Move(-1, 1), new Move(1, 1) },
					new Move[] { new Move(-2, 2), new Move(2, 2) });
		}
		int n = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (board[i][j].getColor() == Tile.TileColor.Black && i < 3) {
					board[i][j].setToken(B[n++]);
				} else if ((board[i][j].getColor() == Tile.TileColor.Black) && (i > 4 && i < 8)) {
					board[i][j].setToken(W[n++]);
				} else {
					continue;
				}
			}
		}

	}

	public Tile[][] getBoardArray() {
		return board;
	}
}
