package Chess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Chess.Token.TokenColor;

public class MainChess {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		TokenColor currentPlayer;
		Board board = new Board();
		Tile[][] b1 = board.getBoardArray();
		BoardPrinter.printB(board);
		Converter in = new Converter();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		currentPlayer = TokenColor.White;
		boolean Isendofgame = false;
		int c ;
		while (!Isendofgame) {

			System.out.println("Enter move (eg. A2-B3):");
			String move = br.readLine();

			Coord from = in.getFrom(move);
			Coord to = in.getTo(move);
			int moveX = to.X() - from.X();
			int moveY = to.Y() - from.Y();
			c = 0;
			if ((moveX == 1 || moveX == -1) && (moveY == 1 || moveY == -1)) {
				c = validMove.mtokenMove(from, to, moveX, moveY, currentPlayer, board, c);
			}

			else if ((moveX == 2 || moveX == -2) && (moveY == 2 || moveY == -2)) {
				c = validMove.mtokenMoveonTake(from, to, moveX, moveY, currentPlayer, board, c);
			} else {
				System.out.println("Invalid move");
				c = 1;
			}

			if (currentPlayer == TokenColor.White && c == 0) {
				currentPlayer = TokenColor.Black;
			} else if (currentPlayer == TokenColor.Black && c == 0) {
				currentPlayer = TokenColor.White;
			} else {
			}
			String left = "";
			int p = 0;
			for (int k = 0; k < b1.length; k++) {
				for (int j = 0; j < b1.length; j++) {
					if (!b1[k][j].isEmpty()) {
						p++;
						left = b1[k][j].getToken().getIcon();
					}
				}
			}

			if (p == 1) {
				Isendofgame = true;
				System.out.println("End of the game! ");
				System.out.println("The winner is " + left);
			}
			BoardPrinter.printB(board);
		}
	}

}
