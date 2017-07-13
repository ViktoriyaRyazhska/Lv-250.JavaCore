package Chess;

public class Token {
	private final TokenColor color;
	private Move[] tokenMove;
	private Move[] tokenMoveonTake;
	private String icon;

	public Token(TokenColor color, String icon, Move[] tokenMove, Move[] tokenMoveonTake) {
		this.color = color;
		this.icon = icon;
		this.tokenMove = tokenMove;
		this.tokenMoveonTake = tokenMoveonTake;
	}

	public enum TokenColor {
		White, Black
	}

	public TokenColor getColor() {
		return color;
	}

	public Move[] getTokenMove() {
		return tokenMove;
	}

	public Move[] getTokenMoveonTake() {
		return tokenMoveonTake;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

}
