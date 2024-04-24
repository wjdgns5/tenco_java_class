package basic.ch21;

/*
 *  추상 클래스란?
 *  추상 메서드를 포함하고 있거나 
 *  abstract 키워드를 가지고 있는 클래스를 말한다.
 *  추상 클래스는 바로 new 키워드로 객체를 생성할 수 없다.
 */
public abstract class Animal {
	
	String name;
	
	public void move() {
		System.out.println("동물이 이동을 합니다.");
	}
	
	// 하나 이상의 추상 메서드가 있다면 ...
	
	// 추상 메서드는 -> 메서드의 선언부만 존재 + abstract 키워드 사용
	public  abstract void hunt();
	// 추상 메서드를 포함 하는 클래스는 반드시 추상 클래스가 되어야 한다.
	
	// 코드 테스트
	public static void main(String[] args) {
		
		Animal animal; // 데이터 타입으로 선언 가능
		
		// 추상 클래스는 기본적으로 new 할 수 없다.
		//animal = new Animal(); 
		
		
	} // end of main

}
