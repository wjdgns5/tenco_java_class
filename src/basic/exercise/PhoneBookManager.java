package basic.exercise;

import java.util.Scanner;

// import basic.ch15.Book;

public class PhoneBookManager {
	// 코드의 시작

	static int remember;

	public static void main(String[] args) {

		// 스캐너 사용
		// 배열 선언 100개
		// while()

		PhoneBook books[] = new PhoneBook[100];

		books[0] = new PhoneBook("하나1", "1111111");
		books[1] = new PhoneBook("하나2", "2222222");
		books[2] = new PhoneBook("하나3", "3333333");
		books[3] = new PhoneBook("하나4", "4444444");
		books[4] = new PhoneBook("하나5", "5555555");

		final String SAVE = "1"; // 저장
		final String SEARCH = "2"; // 검색
		final String UPDATE = "3"; // 수정
		final String DELETE = "4"; // 삭제
		final String SEARCH_PART = "5"; // 부분검색
		final String ZERO = "0"; // 종료

		remember = 0;

		boolean flag = true;

		Scanner sc = new Scanner(System.in);

		while (flag) {
			System.out.println("** 전화번호부 선택 ** ");
			System.out.println("1.저장 2.조회 3.수정 4.삭제, 5.부분검색 0.프로그램 종료");

			String selectedNumber = sc.nextLine();

			if (selectedNumber.equals(SAVE)) {
				System.out.println(">>> 전화번호 저장 <<<");
				save(sc, books);

			} else if (selectedNumber.equals(SEARCH)) {
				System.out.println(">>> 전화번호 검색 <<<");
				read(sc, books);

			} else if (selectedNumber.equals(UPDATE)) {
				System.out.println(">>> 전화번호 수정 <<<");
				update(sc, books);
				
			} else if (selectedNumber.equals(DELETE)) {
				System.out.println(">>> 전화번호 삭제 <<<");
				delete(sc, books);

			} else if (selectedNumber.equals(SEARCH_PART)) {
				System.out.println(">>> 전화번호 부분검색 <<<");
				search_part(sc, books);
				
			} else if (selectedNumber.equals(ZERO)) {
				System.out.println(">>> 종료합니다. <<<");
				flag = false;
			} // end of if
		} // end of while

	} // end of main

	// 조회하기
	public static void read(Scanner sc, PhoneBook[] books) {
		System.out.println("-----전체 조회하기-----");

		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				System.out.println(books[i].getName() + ", " + books[i].getNumber());
			}
		}
	} // end of read()

	// 선택 조회
	public static void search_part(Scanner sc, PhoneBook[] books) {
		System.out.println("--- 부분 조회하기 ---");
		System.out.println("--- 전화번호 입력해주세요.");
		String qq = sc.nextLine();
		boolean isFine = false;
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				if (qq.equals(books[i].getNumber())) {
					System.out.println(books[i].getName() + ", " + books[i].getNumber());
					isFine = true;
					break;

				}
			}
		}
		if (isFine == false) {
			System.out.println("해당 전화번호가 존재하지 않습니다");
		}
	}

	// 삭제하기
	public static void delete(Scanner sc, PhoneBook[] books) {

		System.out.println("----삭제 하기----");
		System.out.println("---- 전화번호 입력 ----");
		String number = sc.nextLine();

		boolean isFind = false;
		for (int i = 0; i < books.length; i++) {
			if (number.equals(books[i].getNumber())) {
				books[i] = null;
				System.out.println("삭제되었습니다.");
				isFind = true;
				break;
			}
		}
	} // end of delete()

	// 저장하기

	public static void save(Scanner sc, PhoneBook[] books) {

		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();

		System.out.println("전화번호 입력하세요.");
		String number = sc.nextLine();

		PhoneBook book = new PhoneBook(name, number);

		for (int i = 1; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = book;
				break;
			}
			System.out.println("저장 되었습니다");
		}
	} // end of save

	// 수정하기
	public static void update(Scanner sc, PhoneBook[] books) {
		
		System.out.println("전화번호를 입력해주세요.");
		String qq = sc.nextLine();
		
		System.out.println("수정할 전화번호를 입력하세요.");
		String qq1 = sc.nextLine();
		System.out.println("수정할 이름을 입력하세요.");
		String qq2 = sc.nextLine();
		
		for (int i = 0; i < books.length; i++) {
			
			if(books!= null && qq.equals(books[i].getNumber()) ) {
				books[i] = null;
				
				PhoneBook book1 = new PhoneBook(qq1, qq2);
				books[i] = book1;
				return;
			}
		}
	}

} // end of class
