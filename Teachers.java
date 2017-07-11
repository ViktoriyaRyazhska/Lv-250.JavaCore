
public class Teachers extends Staff{
	final String TYPE_PERSON = "clever";
	

	public String print(){
		return ("I am a " + TYPE_PERSON);
	}


	@Override
	public String salary() {
		return "I am paid more than teachers";
	}
	
	

	}


