package basic.ch22;

public class Rabbit implements RaceParticiant {

	private final int speed = 10;
	@Override
	public String getname() {
		return "엄금엄금 토끼";
	}
	
	@Override
	public int getSpeed() {
		return speed;
	}
}
