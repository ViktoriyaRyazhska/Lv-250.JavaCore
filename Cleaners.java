
public class Cleaners extends Staff {
	final String TYPE_PERSON = "diligent";

	public String print() {
		return ("I am a " + TYPE_PERSON);

	}

	@Override
	public String salary() {
				return "I am paid less than teachers";
	}



}
