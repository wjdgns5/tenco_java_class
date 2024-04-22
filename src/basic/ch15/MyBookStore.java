package basic.ch15;

import java.util.Scanner;

/**
 * author - 김근호 모든 프로그래밍의 기본은 C R U D 이다.
 */
public class MyBookStore {

	static int LAST_INDEX_NUMBER = 0;

	public static void main(String[] args) {

		// 준비물
		Scanner sc = new Scanner(System.in);
		// 배열 선언
		Book[] books = new Book[100];

		// 샘플 데이터 만들어 놓기
		books[0] = new Book("플러터UI실전", "김근호");
		books[1] = new Book("무궁화꽃이피었습니다", "김진명");
		books[2] = new Book("흐르는강물처럼", "파울로코엘료");
		books[3] = new Book("리딩으로리드하라", "이지성");
		books[4] = new Book("사피엔스", "유발하라리");
		LAST_INDEX_NUMBER = 5;

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_TITLE = "3";
		final String DELETE_ALL = "4";
		final String END = "0";
		boolean flag = true;

		while (flag) {
			System.out.println("** 메뉴 선택 ** ");
			System.out.println("1.저장 2.전체조회 3.선택조회 4.전체삭제 0.프로그램 종료");
			// 문자열 + 다음줄로 이동 처리
			String selectedNumber = sc.nextLine();
			if (selectedNumber.equals(SAVE)) {
				System.out.println(">> 저장 하기 << ");
				save(sc, books);

			} else if (selectedNumber.equals(SEARCH_ALL)) {
				System.out.println(">> 전체 조회 하기  << ");
				readAll(books);
			} else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
				System.out.println(">> 선택 조회 하기  << ");
				readByTitle(sc, books);
			} else if (selectedNumber.equals(DELETE_ALL)) {
				System.out.println(">> 전체 삭제 하기  << ");
				deleteAll(books);
			} else if (selectedNumber.equals(END)) {
				System.out.println(">> 프로그램 종료 << ");
				flag = false;
			} else {
				System.out.println(">> 잘못된 선택 입니다.  << ");

			}
		}

	} // end of main


	// 전체 조회 하기 
	public static void readAll(Book[] books) {
		System.out.println("-----전체 조회하기-----");
		for (int i = 0; i < books.length; i++) {
			// 방어적 코드 작성
			if (books[i] != null) {
				System.out.println(books[i].getTitle() + ", " + books[i].getAuthor());
			}
		}
	}

	// 전체 삭제하기
	public static void deleteAll(Book[] books) {
		System.out.println("-----전체 삭제하기-----");
		for (int i = 0; i < books.length; i++) {
			// Object --> null
			books[i] = null;
		}
	}

	// 저장하기(하나의 북 객체를 저장)
	public static void save(Scanner sc, Book[] books) {
		System.out.println("-----저장 하기 -----");
		System.out.println("책의 제목을 입력 하세요");
		String bookTitle = sc.nextLine();
		System.out.println("책의 저자를 입력 하세요");
		String bookAuthor = sc.nextLine();
		Book book = new Book(bookTitle, bookAuthor);

		if (LAST_INDEX_NUMBER >= books.length) {
			System.out.println("더이상 책을 저장할 공간이 없습니다.");
			return;
		}

		// [0] <--
		// [1] <--
		// [2] <--
		// [3] <-- null = new Book(bookTitle, bookAuthor)
		// [4] <-- null = new Book(bookTitle, bookAuthor)
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = book;
				LAST_INDEX_NUMBER++; // 요소의 갯수로 사용해 보자
				break;
			}
		}
		System.out.println("책이 저장 되었습니다");
	}
	
	// 선택 조회 
	public static void readByTitle(Scanner sc, Book[] books) {
		System.out.println("----- 선택 조회 하기 ----");
		System.out.println(">>> 책 제목을 입력해주세요 <<< ");
		String bookTitle = sc.nextLine();
		boolean isFind = false; 
		// 사용자가 입력한 책 제목 
		// books 전부 조사  books[0] --> 객체 --> 객체.getTitle()
		// 문자열 --> equals
		// books[0].getTitle().equals()  // 배열안에 객체가 없다면 --> null pointer --> 방어적 코드 
		for(int i = 0; i < books.length; i++) {
			// 방어적 코드 작성  
			if(books[i] != null) {
				if(books[i].getTitle().equals(bookTitle)) {
					System.out.println(books[i].getTitle() + ", " + books[i].getAuthor());
					isFind = true; 
					break;
				}
			}
		}
		
		if(isFind == false) {
			System.out.println("해당 제목에 책은 존재하지 않습니다");
		} 
	}

} // end of class
