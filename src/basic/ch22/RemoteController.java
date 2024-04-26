package basic.ch22;

public interface RemoteController {
	
	// 인터페이스 안에 모든 변수는 --> public static final 이 된다.
	// 인터페이스 안에 모든 메서드는 -> 추상 메서드 public abstract 가 된다.
	
	public abstract void turnOn();
	void turnOff(); // 축약 가능

}
