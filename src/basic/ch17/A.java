package basic.ch17;

// 상상력 추가
// A 라는 클래스를 선임이 작성한 코드라고 과정

public class A {

	String name;
	int height;
	int weight;
	int age;
	// 코드를 추가해 달라고 요청
	// 1. 잘 돌아가고 있는 코드를 바로 수정 ...
	// 2. ctrl + v 하는 방법
}
	// 단. 하나의 자바 파일안에 여러개의 클래스를 작성할 수 있다.
	// 단. public 클래스는 오직 하나만 정의 가능하다.

	// 복사 붙여 넣기도 가능
	class B {
		// public 클래스는 오직 하나만 정의 가능하다.
		// public 없이 class 만 있으면 패키지 ch17 안에서만 접근 가능하다.
		String name;
		int height;
		int weight;
		int age;
		
		int level;
		String nickName;
}
	
	// 상속이라는 문법을 배운 개발자라면
	
	class C extends A {
		// 클래스 C가 A를 상속하겠다.
		int level;
		int nickName;
		int phone;
	}