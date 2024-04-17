package basic.ch04;

public class IfTest {
	
	// 변수명을 작성할 때 -- 약속(권장사항) --> 코딩 컨벤션
	// int myScore; <-- 카멜(camel : 낙타) 표기법
	// 첫 시작에 단어를 대문자로 작성하고 연결에 단어도 대문자 표기 한다면
	// ---> 파스칼 케이스

	// 코드의 시작점 (메인 함수)
	public static void main(String[] args) {
		
		// 조건문 (제어문) if
		// 주어진 조건에 따라서 실행이 이루어 지도록 흐름을 만든다.
		// if .... -> 만약 ... 이라면 
		
		boolean flag = true;
		
		if (flag) {
			// 수행 구문
			
			System.out.println("너 출력됨 ^^ : " + flag);
			flag = false;
			
		} // end of if - 블록의 범위를 기억 하자
		// if문 단독은 수행 될 수도 있고 안될 수도 있다.
		
		System.out.println("코드가 여기까지 내려 옵니다. : " + flag);
		
	} // end of main

} // end of class
