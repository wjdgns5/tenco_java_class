package basic.ch05;

public class StudentProgram {
	// 코드의 시작점(메인함수)
	public static void main(String[] args) {
		
		// 우리가 변수에 값을 초기화 하다.
		int grade = 10;
		String name = "홍길동";
		
		// 변수의 선언 - 데이터 타입이 대문자로 시작하고 있다.
		Student studentKim;
		
		studentKim = new Student(); // 변수를 초기화 하다.
		
		// 클래스를 메모리에 올렸다.
		// 클래스를 인스턴스화 했다.
		Student studentLee = new Student();
		
	} // end of main

} // end of class

