package basic.exercise;

import java.util.Scanner;

public class Exercise4 {
	// Code Start
	public static void main(String[] args) {

		// 사용자가 한테 값을 입력 받기
		Scanner sc = new Scanner(System.in);

		int choice;
		// \n --> 시작할 때 무조건 한줄 내린다.
		
//		System.out.println("\n메뉴 선택");
//		System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
//		System.out.print("선택 : ");
//		choice = sc.nextInt();

		// 만약 서용자가 1을 선택한다고 하면
//		System.out.println("등록 선택했습니다.");
// -------------------------------------------------------
		// \n --> 시작할 때 무조건 한줄 내린다.
		
		// 특정 조건을 만날때 반복문을 종료 해야 된다면
		// 깃발
		
		while (true) { // true : 무한루프
			System.out.println("\n 메뉴 선택");
			System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
			System.out.print("선택 : ");
			choice = sc.nextInt(); // 숫자 입력 

			if (choice == 1) {
				System.out.println("등록을 선택했습니다.");
			} else if (choice == 2) {
				System.out.println("조회를 선택했습니다.");
			} else if (choice == 3) {
				System.out.println("수정을 선택했습니다.");
			} else if (choice == 4) {
				System.out.println("삭제를 선택했습니다.");
			} else if (choice == 0) {
				System.out.println("프로그램을 종료합니다.");
				break; // while 문을 빠져나와 프로그램 종료
			} else {
				System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
			}
		}

	} // end of main

} // end of class
