package basic.ch09;

public class Student {
	
	String name; // 이름
	int money; // 소지금
	
	// 강제성 부여 (생성자 만들기)
	public Student(String Myname, int myMoney) {
		name = Myname;
		money = myMoney;
	} // end of Student()
	
	
	// 학생이 버스를 탄다. 
	public void takeBus(Bus bus) {
		// 어떻게 코드를 만들어야 할까?
		bus.take(1500);
		money = money - 1500;
	} // end of takeBus()
	
	// 학생이 지하철을 탄다.
	public void takeSubway(Subway subway) {
		subway.take(1100);
		money = money - 1100;
	} // end of takeSubway()
	
	// 상태창을 보여 준다.
	// 현재 상황을 보여주는 기능을 만들어 보자
	public void showInfo() { // (리턴없는 함수)
		System.out.println("학생 이름 : " +name);
		System.out.println("학생 소지금 : " +money);
	} // end of showInfo();

}
