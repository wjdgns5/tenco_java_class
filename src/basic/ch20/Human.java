package basic.ch20;

public class Human extends Animal {
	
	@Override
	public void move() {
		// 재 정의
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	@Override
	public void eating() {
		// 재 정의
		System.out.println("밥을 먹습니다.");
	}
	
	public void readBooks() {
		System.out.println("책을 읽습니다.");
	}

}
