package task1;

public class Swallow extends FlyingBird {
	
	public Swallow(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	
	@Override
	public String toString() {
		return "Swallow "  + super.toString();
	}
	
}
