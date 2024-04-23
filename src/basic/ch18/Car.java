package basic.ch18;

public class Car {
	
	String name; // 자동차 이름
	int price; // 자동차 가격
	Engine engine; // 포함관계 , Composition
	
	public Car() {
		//Engine engine = new Engine();
		
		// 포함관계 - Composition
		// 객체안에 필요 객체를 직접 생성할 경우 Composition 관계라고 한다.
		 engine = new Engine();
		// Car 라는 객체가 생성이 될 때
		// Engine 객체도 함께 생성이 된다.
	}
	
	public void strtCar() {
		engine.start(); // 엔진 시작
		System.out.println("자동차가 출발 합니다.");
	} // 메서드 생성
	
	public void stopCar() {
		engine.stop(); // 엔진 정지
		System.out.println("자동차가 멈춥니다.");
	} // 메서드 생성
	
} // end of class
