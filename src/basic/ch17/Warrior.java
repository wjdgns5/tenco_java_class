package basic.ch17;

public class Warrior extends Hero {

	public Warrior(String name, int hp) {
		super(name, hp); // 생성자 만들고 super()사용
	}
	
	// 오버라이드 
	@Override
	void attack() {
		System.out.println("전사가 기본 공력을 합니다");
	}
	
	void vomboAttack() {
		System.out.println("전사가 2단 공격을 합니다.");
	}

}
