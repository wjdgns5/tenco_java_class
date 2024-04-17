package basic.ch05;
public class WarriorMainTest {
	// 메인 함수(코드의 시작점) --> JVM Stack
	public static void main(String[] args) {
		
		// new -> 예약어, () <- 생성자
		Warrior warrior1 = new Warrior();
		// 메모리에 올라가면 객체라고 부른다. stack, heap(동적 메모리 영역)
		// 객체의 접근은 . 연산자를 통해서 접근할 수 있다.
		
		Warrior warrior2 = new Warrior();
		
		warrior1.name = "티모";
		warrior1.health = 100;
		warrior1.attackPower = 30;
		warrior1.defensePower = 1;
		
		warrior2.name = "야스오";
		warrior2.health = 120;
		warrior2.attackPower = 20;
		warrior2.defensePower = 2;
		
		System.out.println("================");
		
		System.out.println(warrior1.name);
		System.out.println(warrior1.health);
		System.out.println(warrior1.attackPower);
		System.out.println(warrior1.defensePower);
		
		System.out.println("================");
		
		System.out.println(warrior2.name);
		System.out.println(warrior2.health);
		System.out.println(warrior2.attackPower);
		System.out.println(warrior2.defensePower);	
	}
}
