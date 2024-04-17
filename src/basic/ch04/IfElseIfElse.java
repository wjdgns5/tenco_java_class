package basic.ch04;

public class IfElseIfElse {
	// 코드의 시작점
	public static void main(String[] args) {
		
		int age = 17;
		
		// if else if else 사용 시 조건식에 범위 점차 크게 설정해야 한다.
		if(age <= 7) {
			System.out.println("학교에 아직 다니지 않습니다.");
		} else if (age <= 13) {
			System.out.println("초등학교에 다니고 있습니다.");
		} else if(age <= 16) {
			System.out.println("중학교에 다니고 있습니다.");
		} else {
			System.out.println("고등학교 이상 다니거나 졸업을 했네요.");
		} // end of if

	} // end of main

} // end of class
