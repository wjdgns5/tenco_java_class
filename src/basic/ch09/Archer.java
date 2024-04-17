package basic.ch09;

public class Archer {

	String name; // Archer
	int healthPoint; // 90
	int attackSkill; // 9
	// 궁수의 이름, 체력, 공격기술 
	public Archer(String Name, int Hp, int AS) {
		name = Name;
		healthPoint = Hp;
		attackSkill = AS;

	} // end of Archer
	
	// 상태창 확인
	public void showInfo() {
		System.out.println("직업 : " + name);
		System.out.println("체력 : " + healthPoint);
		System.out.println("데미지 : " + attackSkill);
	} // end of showInfo

	// 궁수 공격 시
	public void attack(int attackSkill) {
		if(healthPoint == 0) {
			System.out.println("죽었습니다.");
			return;
		}
		healthPoint = healthPoint - attackSkill;
		
	} // end of attack();

}
