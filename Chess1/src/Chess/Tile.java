package Chess;

public class Tile {

	private Token token;
	private TileColor color;

	public enum TileColor {
		White, Black
	}

	public Tile(TileColor color) {
		this.color = color;
	}

	public Tile(TileColor color, Token token) {
		this.color = color;
		this.token = token;
	}

	public Token getToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
	}

	@Override
	public String toString() {
		if (token != null) {
			return "[" + token.getIcon() + "]";
		} else {
			return "[ ]";
		}
	}

	public boolean isEmpty() {
		return token == null;
	}

	public void empty() {
		token = null;
	}

	public TileColor getColor() {
		return color;
	}

}
