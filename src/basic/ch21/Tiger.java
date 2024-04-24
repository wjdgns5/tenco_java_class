package basic.ch21;

public class Tiger extends Animal {

	// 재 정의 - 구현 메서드
	@Override
	public void hunt() {
		System.out.println("호랑이가 앞발로 사냥을 합니다.");
	}
	
	@Override
	public void move() {
		System.out.println("살금 살금 이동합니다.");
		super.move();
	}
}
