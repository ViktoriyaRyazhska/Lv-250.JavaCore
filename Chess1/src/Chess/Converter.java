package Chess;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Converter {

	private static Pattern validMove = Pattern.compile("([a-hA-H][1-8])([-])([a-hA-H][1-8])", Pattern.CASE_INSENSITIVE);
	private BoardPointer pointer;

	public Converter() {
		pointer = new BoardPointer();
	}

	private Coord parse(String val) {
		int x = pointer.point(val.charAt(0));
		int y = pointer.point(Integer.parseInt(String.valueOf(val.charAt(1))));

		return new Coord(x, y);

	}

	public Coord getFrom(String val) {
		Matcher matcher = validMove.matcher(val);
		matcher.matches();
		String coords = matcher.group(1);

		return parse(coords);
	}

	public Coord getTo(String val) {
		Matcher matcher = validMove.matcher(val);
		matcher.matches();
		String coords = matcher.group(3);

		return parse(coords);
	}

	public boolean isValid(String val) {
		Matcher matcher = validMove.matcher(val);

		return matcher.matches();
	}
}
