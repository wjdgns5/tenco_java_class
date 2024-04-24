package basic.ch20;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.move();
		animal.eating();
		System.out.println("-----------------------");
		
		Animal 주소2 = new Tiger(); // Tiger은 Animal 타입으로 바라볼 수 있다.
		주소2.move(); 
		주소2.eating();
		System.out.println("-----------------------");
		
		Animal 주소3 = new Human(); // 주소3 에는 Human() 주소가 들어간다.
		주소3.move();
		주소3.eating();
		// 컴파일 시점의 오류가 발생한다. -> Human() 메서드를 사용 할 수 없다.
		// 다운캐스팅 필요? **
		 // 주소3.readBooks();
		
		// 다운캐스팅 
		( (Human)주소3 ).readBooks();
		System.out.println("--------------------------");
		
	} // end of main

} // end of class
