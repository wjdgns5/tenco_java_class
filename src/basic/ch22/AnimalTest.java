package basic.ch22;

public class AnimalTest {

	public static void main(String[] args) {
		
		// Animal animal = new Animal(); // 인터페이스는 기본적으로 new 할 수 없다.
		Animal dog = new Dog(); // 다형성, 업캐스팅 된 상태
		Animal bird = new Bird();
		
		dog.eat();
		dog.move();
		
		bird.eat();
		bird.move();
	}
}
