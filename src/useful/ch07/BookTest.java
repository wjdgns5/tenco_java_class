package useful.ch07;

public class BookTest {

	public static void main(String[] args) {
		// 멤버 내부 클래스를 사용하는 설계 방식의 주요 이점
		// 캡슐화를 강화
		// - 내부적으로 어떤 기능이 있는지 숨길 수 있다
		// 로직의 응집도 향상
		// - 특정 기능이나 데이터를 사용하는 코드를 한 곳에 모으면,
		// 코드의 응집도가 향상됩니다.
		// 이는 코드를 이해하고 유지보수하기 쉽게 만들어 줍니다.
		Book book = new Book("홍길동", "허균", "허균@example");
		book.printBookDetails();
		
		// 외부에서 Book 안에 있는 내부클래스 Author에 쉽게 접근이 안됨 

	} // end of main

} // end of class
