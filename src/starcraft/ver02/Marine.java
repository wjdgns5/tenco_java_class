package starcraft.ver02;

public class Marine {

	// 멤버 변수
	private String name;
	private int power;
	private int hp;

	// 생성자  단축키 : ctrl + sapce + enter
	public Marine(String name) {
		this.name = name;
		this.power = 4; // 공격력 설정
		this.hp = 70; // 체력 설정
	} // end of Marine()

	// getter , setter 설정
	// 단축키 : alt + shif + s --> getter 누른다.

	// getter 메소드 MainTest 에서 보여주기 위해

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

	// 마린이 질럿을 공격합니다. attackZealot
	public void attack(Zealot z) {
		System.out.println(this.name + " 이 " + z.getName() + " 을 공격합니다.");
		z.beAttacked(this.power);
	}

	// 마린이 저글링을 공격합니다. attackZergling
	public void attack(Zergling z) {
		System.out.println(this.name + " 이 " + z.getName() + " 을 공격합니다.");
		z.beAttacked(this.power);
	}

	// 자신이 공격을 당합니다. beAttacked
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

	public void showInfo() {
		System.out.println("==== 상태창 ====");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("생명력 : " + this.hp);
	}

}
