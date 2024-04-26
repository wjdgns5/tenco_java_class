package basic.ch22;

public class Refrigerator extends HomeAppliances implements RemoteController, SoundEffect {
	
	// 클래스 뒤에 abstract를 붙이거나 HomeAppliances의 메서드를 @Override 하던가
	
	@Override
	public void turnOn() {
		System.out.println("냉장고를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("냉장고를 끕니다.");
	}
	
	@Override
	public void soundOn() {
		System.out.println("띠리링 ~~~");
	}
	
	@Override
	public void soundOff() {
		System.out.println("띠리링");
	}
}
