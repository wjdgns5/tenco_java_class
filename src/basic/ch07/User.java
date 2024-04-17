package basic.ch07;

import basic.MainTest;
import basic.practice.checkAdult;

public class User {
	
	String id;
	String password;
	String name;
	String gender;
	int age;
	
	// 패스워드 체크 기능 만들어 보기
	// 함수는 동사로 시작하는 것이 권장 사항
	public boolean checkPassword(String inputPwd) {
		
		// 만약 나의 멤버 변수에 들어가 있는
		// password 값과  외부에서 넣은 inputPwd 값이
		// 같다면 true 변환 아니면 false 반환 하라
		// == 주소값, 산술식 사용한다.
		// 문자열 비교는 equals 라는 메서드를 사용한다.
		if(password.equals(inputPwd)) {
			return true;
			// password == inputPwd 라면 true 반환
		}
		return false; // 아니면 false 반환
	}
		// 독립적인 함수로서 여기서 실행 시킬 수 있다.
		public static void main(String[] args) {
			// User 클래스를 인스턴스화 시켜 주세요
			User user1 = new User(); // 메모리에 올라간다. (heap)
			user1.password = "123";
			
			User user2 = new User(); // 메모리에 올라간다. (heap)
			user2.password = "555";
			
			System.out.println("----------------------");
			
			// usre1 pwd 를 확인 하고 싶다.
			// 1
			boolean user1Result = user1.checkPassword("333");
			System.out.println("user1 : " + user1Result);
			
			// 2
			boolean user1Result2 = user1.checkPassword("123");
			System.out.println("user1 두번째 결과 : " +user1Result2);
			
			System.out.println("---------------------");
			
			// 참조 변수 user2 기능인 checkPassword 호출해서 결과를 확인 해주세요.
			// -- False   (출력)  --1
			// -- True    (출력)  --2
			
			// 실행에 흐름을 만드는 방법 연습이다.    --3
			// if 구문을 활용해서 콘솔창에 비밀번호가 틀렸습니다. (출력)
			// if 구문을 활용해서 콘솔창에 비밀번호가 맞습니다. (출력)
			
			User user3 = new User(); // User 클래스 인스턴스의 이름 user3 생성
			
			user3.password = "1235"; // user3.password 비밀번호 "1235" 지정
			
			boolean user3Result = user3.checkPassword("1231");
			boolean user3Result1 = user3.checkPassword("1235");
			System.out.println("user3Result : "+user3Result);
			System.out.println("user3Result1 : " +user3Result1);
			
		}
} // end of class
