package basic.ch17;

public class Wizard extends Hero {

	public Wizard(String name, int hp) {
		super(name, hp); // 부모 생성자 호출 
	}
	
	@Override
	void attack() {
		System.out.println("마법사가 기본 공격을 합니다.");
	} // 부모 메서드 재지정 
	
	void freezing() {
		System.out.println("마법사가 얼음 공격을 합니다");
	}

}
