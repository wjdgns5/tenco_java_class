package basic.ch20;

public class Tiger extends Animal {
	
	@Override
	public void move() {
		// 재 정의
		System.out.println("호랑이가 네발로 걸어요");
	}
	
	@Override
	public void eating() {
		// 재 정의
		System.out.println("호랑이가 사냥을 합니다.");
	} // Animal 메서드 상속
}
