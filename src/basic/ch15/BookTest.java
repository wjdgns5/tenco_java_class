package basic.ch15;

public class BookTest {
	// 코드의 시작
	public static void main(String[] args) {

		// 배열이란?
		// 연관된 데이터를 하나의 변수를 통으로 관리하고 싶다면 - 자료구조

		// 배열을 사용할 때 반드시 크기가 지정되어야 한다.
		Book books[] = new Book[10]; // 배열에 메모리 공간 선언
		// 배열의 길이 = 10
		// 배열의 인덱스 = 9;

		books[0] = new Book("플러터UI실전", "김근호");
		books[1] = new Book("플러터UI실전", "김근호");
		books[2] = new Book("흐르는강물처럼", "파울로코엘료");
		books[3] = new Book("리딩으로리드하라", "이지성");
		books[4] = new Book("사피엔스", "유발하라리");
		books[9] = new Book("홍길동전", "허균");

		// 배열은 반복문과 함께 많이 활용된다.
		// 배열에 크기와 요소에 크기는 동일한 것은 아니다.

		// books[3] --> Book
		// System.out.println(books[3].getTitle());
		// System.out.println(books[3].getAuthor());

		// System.out.println(books[5]); <-- 오류 발생 NullPointException

		// 배열의 길이와 요소의 길이는 다르다.
		for (int i = 0; i < books.length; i++) {
			// books[0].
			// books[1].
			// books[2].
			// books[3].
			// books[4].
			// books[5].

			// 방어적 코드를 작성해 주어야 한다.
			if (books[i] != null) { // books[i]에 객체가 있다면
				System.out.println(books[i].getTitle());
				System.out.println(books[i].getAuthor());
				System.out.println("-------------------");
			} // end of if
		} // end of for

	} // end of main

} // end of class
