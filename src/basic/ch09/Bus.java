package basic.ch09;

public class Bus {
	
	int busNumber; // 버스 번호 // 기본값 : 0
	int passengerCount; // 승객 수 // 기본값 : 0
	int money; // 버스 수익 // 기본값 : 0
	
	// 강제성 부여
	
	// 강제성 부여 (생성자 만들기)
	
	public Bus(int number) {
		// 객체 생성 시 제일 먼저 실행되는 부분
		busNumber = number;
	}
	
	// 승객을 태운다. (기능) (함수 만들기)
	
	public void take(int pay) {
		// money = money + pay;
		money += pay; // 복합 대입 연산자 사용 하던가, 연산자 사용 하던가
		
		// passengerCount = passengerCount + 1;
		passengerCount++; // 증감 연산자	
		
	} // end of take()
	
	
	// 현재 상황을 보여주는 기능을 만들어 보자
	
	public void showInfo() {
		System.out.println("버스 번호 : " + busNumber);
		System.out.println("버스 승객 수 : " + passengerCount);
		System.out.println("버스 수익금 : " + money);
	} // end of showInfo();
	
	

}
