package basic.ch22;

public class Turtle implements RaceParticiant {
	
	private final int speed = 2;
	
	@Override
	public String getname() {
		return "깡총깡총 거북이";
	}
	
	@Override
	public int getSpeed() {
		return speed;
	}

}
