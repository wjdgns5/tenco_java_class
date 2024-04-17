package basic.ch09;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money;

	// 생성자
	public Subway(int line) {
		lineNumber = line;
	} // end of Subway()

	// 지하철도 승객을 태우다. (리턴없는 함수)
	public void take(int pay) {
		money += pay;
		passengerCount++;
	} // end of take()

	public void showInfo() { // (리턴없는 함수)
		System.out.println("지하철 번호 : " + lineNumber);
		System.out.println("지하철 승객 수 : " + passengerCount);
		System.out.println("지하철 수익금 : " + money);
	} // end of showInfo();

}
