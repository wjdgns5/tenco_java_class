package basic.ch09;

public class Wizard {

	String name; // "Wizard"
	int healthPoint; // 80
	int attackSkill; // 11

	public Wizard(String Name, int Hp, int AS) {
		name = Name;
		healthPoint = Hp;
		attackSkill = AS;

	} // end of Wizard

	public void showInfo() {
		System.out.println("직업 : " + name);
		System.out.println("체력 : " + healthPoint);
		System.out.println("데미지 : " + attackSkill);
	} // end of showInfo

	public void attack(int attackSkill) {
		if(healthPoint == 0) {
			System.out.println("죽었습니다.");
			return;
		}
		healthPoint = healthPoint - attackSkill;
		
	} // end of attack();

}
