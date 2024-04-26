package starcraft.ver05;

/*
 * 접근 제어 지시자
 * 
 * public
 * protected -- 상속관계 설정할 수 있다.
 * default
 * private
 */
public class Unit {

	protected String name;
	protected int power;
	protected int hp;

	public Unit(String name) {
		this.name = name;
	} // 생성자

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	 

	// 자신이 공격을 당합니다.
	public void beAttacked(int power) {
//				hp = hp - power;
		// 방어적 코드 작성
		// 80 -- 72 == 5
		// 5 - 75 == -70
		if (hp <= 0) {
			System.out.println("[" + this.name + "]" + "이미 사망하였습니다.");
			hp = 0; // 체력이 0 밑으로 출력되는 것을 막기위해 0 으로 지정함
			return; // 함수 종료
		}
		hp -= power;
	}

	// 질럿을 공격한다.
	public void attack(Unit z) {
		System.out.println(this.name + " 이 " + z.getName() + " 을 공격합니다.");
		z.beAttacked(power);
	}

	public void showInfo() {
		System.out.println("==== 상태창 ====");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("생명력 : " + this.hp);
	}

}
