package basic.ch01;

public class Variable2 {
	// 코드의 시작점(main) 함수
	public static void main(String[] args) {

		// 변수의 이름을 만들 때 규칙이 있다.
		
		// 1. 대소문자를 명확히 구분하며 길이에 제한이 없다.
		// 값을 넣다 --> "초기화 하다" 라는 말과 같다.

		int age = 10;
		int AGE = 20;
		int aGe = 30; // 변수에 선언과 동시에 초기화(값을 넣다.)
		// int aGe;

		// 2. 자바에서 사용하는 예약어는 사용할 수 없다.
		// int, double, if, for <-- 예약어는 변수로 선언할 수 없다.
		// int if; <-- 오류 발생

		// 3. 변수는 숫자로 시작할 수 없다.
		// int 30age; <-- 오류 발생
		// int 20Man;

		// 4. 특수 문자는 _(언더바), $(달러) 표기만 사용 가능 하다.
		int _count;
		int $_tel;
		int $count_test;
		// int *count; <-- 오류 발생

		// 권장 사항 - 변수를 선언할 때 "소문자 부터" 시작하자.
		int GIVE; // 가능한 변수는 "소문자로" 시작하자.

		// 변수 선언과 동시에 초기화 가능하다.
		int score = 10;
		int score1, score2, score3; // 사용은 가능하지만 권장사항(x)

	} // end of main

} // end of class
