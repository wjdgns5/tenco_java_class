package basic.ch11;

public class PersonTest {
	// 코드의 시작
	public static void main(String[] args) {
		
		// 주석 사용
		Person person1 = new Person("홍길동", 100); // 힙 메모리에 객체 생성
		// 주석 사용
		Person personBox = person1;
		Person personBox2 = person1.getPerson();
		
		Person personLee = new Person("이순신", 101); // 힙 메모리에 객체 생성
		System.out.println("----------------------------------------------");
		
		//위 코드까지는 Heap 메모리 영역에 객체가 2개 생성된 상태 이다.
		// 지역변수인 person1, personBox, personBox2 는 같은 객체가 2개 생성된 상태 이다.
		
		// 연습 문제
		// setName 메서드 만들어 주세요
		// Person.java 에서 setter 실행
		System.out.println("person 1 : "+person1);
		System.out.println("personBox : "+personBox);
		System.out.println("personBox2 : "+personBox2);
		System.out.println("personLee : "+personLee);
		
		personBox2.setName("티모");
		person1.showInfo();
		
		

	} // end of main

} // end of class
