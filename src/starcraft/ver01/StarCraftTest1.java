package starcraft.ver01;

public class StarCraftTest1 {

	public static void main(String[] args) {

		// 질럿 (Zealot) 2 마리 생성
		// 마린 (Marine) 2 마리 생성
		// 저글링 (Zergling) 2 마리 생성

		Zealot zearlot1 = new Zealot("zealot1");
		Zealot zearlot2 = new Zealot("zealot2");

		Marine marine1 = new Marine("Marine1");
		Marine marine2 = new Marine("Marine2");

		Zergling zergling1 = new Zergling("Zergling1");
		Zergling zergling2 = new Zergling("Zergling2");

		for (int i = 0; i < 15; i++) {
			zearlot1.attackMarine(marine2);
		}
		marine2.showInfo();

	}

}
