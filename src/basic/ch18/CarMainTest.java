package basic.ch18;

public class CarMainTest {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		car1.strtCar();
		car1.stopCar();
		
		// 엔진의 속성인 name 변수에 값을 초기화 해보자.
		
		car1.engine.name = "V8"; // 엔진의 이름
		car1.engine.price = 4000; // 엔진의 가격
		
		System.out.println(car1.engine.name);
		System.out.println(car1.engine.price);
	}
	
	// nullPoint 오류 - 주소 또는 참조값 확인

}
