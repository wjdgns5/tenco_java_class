package basic.ch07;

public class carCarMainTest {
	// Code Start
	public static void main(String[] args) {
		// 참조 타입(주소값 들어간다)
		CarCar car1 = new CarCar();
		
		car1.carName = "제네시스";
		car1.carColor = "검은색";
		car1.carOil = 10;
		car1.carSpeed = 10;
		
		
		System.out.println(car1.carName);
		System.out.println(car1.carColor);
		System.out.println(car1.carOil +"Km");
		
		brush(12);
		breakTime(10);
		
		System.out.println("@@@@@@@@@@@@@@@@@@@");
		
		// 참조 타입(주소값 들어간다)
		CarCar car2 = new CarCar();
		
		car2.carName = "테슬라";
		car2.carColor = "흰색";
		car2.electric = 100;
		car2.carSpeed = 90;
		car2.carYear = 2023;
		
		System.out.println(car2.carName);
		System.out.println(car2.carColor);
		System.out.println(car2.electric);
		System.out.println(car2.carSpeed);
		System.out.println(car2.carYear);
		
		safe();

	} // end of main
	
	static int brush(int n1) {
		System.out.println("브러쉬 속도는 "+n1+" 입니다.");
		return n1;
	}
	
	static int breakTime(int n1) {
		System.out.println("브레이크 제동거리는 "+n1 +"입니다.");
		return n1;
	}
	
	static void safe() {
		System.out.println("안전운행 하세요.");
	}

} // end of class
