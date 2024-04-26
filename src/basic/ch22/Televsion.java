package basic.ch22;

public class Televsion extends HomeAppliances implements RemoteController {
	
	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
	}
}
